package com.colin.servlet.essayservlet;

import com.alibaba.fastjson.JSON;
import com.colin.bean.User;
import com.colin.dao.EssayDao;
import com.colin.dao.impl.EssayDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Timestamp;

/**
 * @author Huang JiaHang
 * @date 2021/5/9 22:11
 */
@WebServlet("/loginUser/essayCount")
public class LoginUserEssayCountServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        HttpSession session = req.getSession();
        User loginUser = (User)session.getAttribute("loginUser");
        EssayDao essayDao = new EssayDaoImpl();
        Integer count = essayDao.loginUserEssayCount(loginUser);
        req.setAttribute("loginUserEssayCount",count);
        //前后端分离代码转成json对象
        String a = JSON.toJSONString(loginUser);
        resp.getWriter().write(a);
    }
}
