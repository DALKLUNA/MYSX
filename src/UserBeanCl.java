import java.sql.*;

public class UserBeanCl {

    private Connection ct = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    // 验证用户
    public boolean checkUser(String u, String p) {
        boolean b = false;
        try {
            // 得到连接
            ConnectDB cd = new ConnectDB();
            ct = cd.getConn();

            ps = ct.prepareStatement("select user_passwd from user where user_name='"
                    + u + "'");
            // ps.setString(1,u);
            rs = ps.executeQuery();
            System.out.println("进入验证");
            if (rs.next()) {
                System.out.println("有结果");
                String dbPasswd = rs.getString(1);
                if (dbPasswd.equals(p)) {
                    b = true;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            this.close();
        }
        return b;
    }

    // 插入用户
    public boolean insertUser(String u, String p){
        try {
            // 得到连接
            ConnectDB cd = new ConnectDB();
            ct = cd.getConn();

            ps = ct.prepareStatement("insert into user(user_name, user_passwd) values(" +
                    "'" + u + "','" + p + "')");

            int result = ps.executeUpdate();

            if (result > 0) return true;



        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            this.close();
        }

        return false;
    }

    // 关闭资源
    public void close() {
        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }
            if (ps != null) {
                ps.close();
                ps = null;
            }
            if (ct != null) {
                ct.close();
                ct = null;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
