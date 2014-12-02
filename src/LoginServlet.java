import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tjibingnan on 2014/11/13.
 */
@WebServlet(name="LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String user =  request.getParameter("username");   //接收jsp页面传递过来的用户名和密码
        String pwd =  request.getParameter("pwd");
        UserBeanCl ubc=new UserBeanCl();

        if ( ubc.checkUser(user,pwd) )    //判断用户名和密码是否正确
        {
            //如果成功则转入scuess.jsp页面
            request.setAttribute("message", "登录成功");
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);
        }
        else
        {
            //如果失败则转入login.jsp页面
            request.setAttribute("message", "登录失败");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
