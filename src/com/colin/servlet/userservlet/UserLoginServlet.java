package com.colin.servlet.userservlet;

import com.colin.bean.User;
import com.colin.dao.UserDao;
import com.colin.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Huang JiaHang
 * @date 2021/5/9 19:06
 */
@WebServlet(name = "userLogin",value = "/user/login")
public class UserLoginServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserDao userDao = new UserDaoImpl();
        User user = userDao.selectLoginUser(username, password);
        HttpSession session = req.getSession();
        if (user!=null&&user.getId()>0)
        {
            session.setAttribute("loginUser",user);
            req.getRequestDispatcher("/FirstPage.jsp").forward(req,resp);
        }else
        {
            req.setAttribute("judgeLogin",true);
            req.getRequestDispatcher("/LoginPage.jsp").forward(req,resp);
        }
    }
}
