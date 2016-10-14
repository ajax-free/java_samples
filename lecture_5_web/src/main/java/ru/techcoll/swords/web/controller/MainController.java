package ru.techcoll.swords.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.techcoll.swords.domain.Player;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = GET)
    public ModelAndView index() {
        final Player player = new Player();
        player.setName("Player1");
        return new ModelAndView("main/index", "player", player);
    }

}
