package com.mycompany.archers.controller;

import com.mycompany.archers.model.TypeUser;
import com.mycompany.archers.model.User;
import com.mycompany.archers.repository.TypeUsersRepository;
import com.mycompany.archers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    
//    @Autowired
//    TypeUsersRepository  typeUsersRepository;
//    
//    @Autowired
//    UserRepository userRepository ;

    public PageController() {
        System.out.println("create controller");

    }

    public static final String LOGIN_PAGE_PATH = "/login";
    public static final String MAIN_PAGE_PATH = "/main";
    public static final String GAME_PANEL_PAGE_PATH = "/game_panel";
    public static final String GAME_PAGE_PATH = "/game";

    @RequestMapping("/")
    public String getDefaultPage() {
        return "login";
    }

    @RequestMapping(LOGIN_PAGE_PATH)
    public String getLoginPage() {
//                TypeUser tu = new TypeUser();
//        tu.setName("USER");
//        tu  = typeUsersRepository.create(tu);
//        BCryptPasswordEncoder bpe =  new BCryptPasswordEncoder();
//        String kach = bpe.encode("password".subSequence(0, "password".length()));  
//        User user = new User();
//        user.setUsername("Alex");
//        user.setPassword(kach);
//        user.setIdtypeuser(tu);
//        userRepository.create(user);
        return "login";
    }

    @RequestMapping(MAIN_PAGE_PATH)
    public String getMainPage() {
        return "main";
    }

    @RequestMapping(GAME_PANEL_PAGE_PATH)
    public String getGamePanelPage() {
        return "game_panel";
    }

    @RequestMapping(GAME_PAGE_PATH)
    public String getGamePage() {
        return "game";
    }

}
