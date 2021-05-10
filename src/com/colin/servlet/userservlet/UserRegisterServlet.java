package com.colin.servlet.userservlet;

import com.colin.bean.User;
import com.colin.dao.UserDao;
import com.colin.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Huang JiaHang
 * @date 2021/5/9 20:02
 */
@WebServlet("/user/register")
public class UserRegisterServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String age = req.getParameter("age");
        String tel = req.getParameter("tel");
        User user = new User(name,username,password,tel,Integer.parseInt(sex),Integer.parseInt(age));
        UserDao userDao = new UserDaoImpl();
        int i = userDao.userRegister(user);
        req.setAttribute("judgeRegister",true);

    }
}
