import java.sql.*;
/**
 * Created by tjibingnan on 2014/11/13.
 */
public class ConnectDB {

    private Connection ct = null;

    public Connection getConn() {
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 得到连接
            ct = DriverManager.getConnection(
                    "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/ad_bbcbe5a87a59fc2", "bd86eb122035cc", "4e6343df");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ct;
    }

    public static void main(String[] args) throws Exception {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection ct = new ConnectDB().getConn();
        String u = "admin";
        String p = "12345";


        ps = ct.prepareStatement("select user_passwd from user where user_name='"
                + u + "'");

        rs = ps.executeQuery();
        System.out.println("进入验证");
        if (rs.next()) {
            System.out.println("有结果");
            String dbPasswd = rs.getString(1);
            if (dbPasswd.equals(p)) {
                System.out.println("验证成功");
            }
        }

    }
}
