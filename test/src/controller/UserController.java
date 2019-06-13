package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import po.User;
import service.UserService;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String index() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session) {
        User user = userService.findUser(username, password);
        if (user != null) {
            session.setAttribute("USER", user);
            return "redirect:findAllStudent";
        }
        return "login";
    }
}
