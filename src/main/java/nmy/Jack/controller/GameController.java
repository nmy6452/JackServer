package nmy.Jack.controller;

import nmy.Jack.entity.Roomentitiy;
import nmy.Jack.entity.Userentitiy;
import nmy.Jack.service.GameService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class GameController {
    GameService gameService;

    @RequestMapping(value = "/room", method = RequestMethod.GET)
    public Roomentitiy CreateRoom(@RequestParam(value = "user")Userentitiy userentitiy)
    {
        return gameService.CreateRoom(userentitiy);
    }


    @RequestMapping(value = "/room", method = RequestMethod.GET)
    public Map<String,Object> GetRoom()
    {
        return gameService.FindRoom();
    }

    @RequestMapping(value = "/room", method = RequestMethod.DELETE)
    public Roomentitiy CreateRoom(@RequestParam(value = "roomentitiy")Roomentitiy roomentitiy)
    {
        return gameService.DeleteRoom(roomentitiy);
    }
}
