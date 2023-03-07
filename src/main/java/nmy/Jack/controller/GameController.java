package nmy.Jack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @RequestMapping("/game")
    public String gameStart()
    {
        return "게임시작";
    }
}
