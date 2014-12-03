import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tjibingnan on 2014/11/14.
 */
@WebServlet(name = "RegisterServlet",urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String re_user =  request.getParameter("re_username");
        String re_pwd =  request.getParameter("re_pwd");
        String re_pwd_c = request.getParameter("re_pwd_c");

        if(re_user.equals(null) || re_user.trim().isEmpty()){
            request.setAttribute("message", "用户名不能为空");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }

        if(re_pwd.equals(null) || re_pwd.trim().isEmpty()){
            request.setAttribute("message", "密码不能为空");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }

        if(!re_pwd.equals(re_pwd_c)){
            request.setAttribute("message", "密码输入不匹配");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }

        UserBeanCl ubc=new UserBeanCl();


        if ( ubc.insertUser(re_user,re_pwd) )
        {
            request.setAttribute("message", "注册成功");
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);
        }
        else
        {
            //如果失败则转入login.jsp页面
            request.setAttribute("message", "注册失败");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
