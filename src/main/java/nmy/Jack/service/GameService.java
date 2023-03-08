package nmy.Jack.service;

import lombok.extern.log4j.Log4j2;
import nmy.Jack.entity.Roomentitiy;
import nmy.Jack.entity.Userentitiy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GameService {
    Map<String, Object> roomentitiyMap;

    public Roomentitiy CreateRoom(Userentitiy userentitiy){
        Roomentitiy roomentitiy =  new Roomentitiy();
        roomentitiyMap.put(userentitiy.getId(),roomentitiy);
        return roomentitiy;
    }

    public Map<String ,Object> FindRoom(){
        return roomentitiyMap;
    }

    public Roomentitiy DeleteRoom(Roomentitiy roomentitiy){
        roomentitiyMap.remove(roomentitiy.getId());
        return roomentitiy;
    }
}
