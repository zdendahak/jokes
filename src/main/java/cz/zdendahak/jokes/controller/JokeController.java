package cz.zdendahak.jokes.controller;

import cz.zdendahak.jokes.service.GetJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private GetJokeService getJokeService;

    @Autowired
    public JokeController(GetJokeService getJokeService) {
        this.getJokeService = getJokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", getJokeService.getJoke());

        return "chucknorris";
    }


}
