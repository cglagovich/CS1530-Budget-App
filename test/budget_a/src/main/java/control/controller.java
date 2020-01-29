package control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import dao.UserMapper;
import entity.Users;

@Controller
public class controller {  
	private static final Logger log = LoggerFactory.getLogger(controller.class);

    @Autowired  
    private UserMapper userDao;  
   
    @RequestMapping(path = "/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {
        List<User> users = UserMapper.findByEmail(email);
        if (users == null) 
        {
            log.warn("attempting to log in with the non-existed account");
            return "not existed";
        } else {
            User user = users.get(0);
            if (user.getPassword().equals(password)) { 
                model.addAttribute("name", user.getName());
                log.warn(user.toString()+ " logged in");
            } else {
                model.addAttribute("name", "logging failed");
                log.warn(user.toString()+ " failed to log in");
            }
            return "/login.html";
        }  
    }
    
    @RequestMapping(path="/add") 
    public @ResponseBody String addNewUser (@RequestParam String password, @RequestParam String email, @RequestParam String name, Users user) 
    {
        user.setName(name);
        user.setEmail(email);
        user.setpassword(password);
        UserMapper.save(user);
        log.info(user.toString()+" saved to the repo");
        return "/success.html";
    }
    @RequestMapping(path="/")
    public String welcomePage(@RequestParam(name="name", required=false, defaultValue="World") String namel)
    {
            return "/login.html";
    }
  
}  