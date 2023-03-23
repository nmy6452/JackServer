package nmy.Jack.test.ChatRoom;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/templates/chat")
public class ChatRoomController {
    private final ChatService chatService;

    // 채팅 리스트 화면
    @ApiOperation(value = "채팅 리스트 화면", notes = "체팅방 리스트 화면을 사용자에게 출력")
    @GetMapping("/room")
    public String rooms(Model model) {
        return "/templates/chat/room";
    }
    @ApiOperation(value = "모든 채팅방 목록 반환", notes = "모든 채팅방 목록을 Json으로 출력")
    @GetMapping("/rooms")
    @ResponseBody
    public List<ChatRoom> room() {
        return chatService.findAllRoom();
    }
    @ApiOperation(value = "채팅방 생성", notes = "렌덤한 ID로 체팅방 생성")
    @PostMapping("/room")
    @ResponseBody
    public ChatRoom createRoom(@RequestParam(value = "이름") String name) {
        return chatService.createRoom(name);
    }
    @ApiOperation(value = "채팅방 입장 화면", notes = "채팅방 입장시 화면")
    @GetMapping("/room/enter/{roomId}")
    public String roomDetail(Model model, @PathVariable String roomId) {
        model.addAttribute("roomId", roomId);
        return "/templates/chat/roomdetail";
    }
    @ApiOperation(value = "특정 채팅방 조회", notes = "채팅방 ID로 특정 조회")
    @GetMapping("/room/{roomId}")
    @ResponseBody
    public ChatRoom roomInfo(@PathVariable String roomId) {
        return chatService.findById(roomId);
    }
}