package nmy.Jack.Handler;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.SocketHandler;

public class RoomHandler extends TextWebSocketHandler {

    private final List<WebSocketSession> webSocketSessions = new ArrayList<>();
    @Override
    public void afterConnectionEstablished(WebSocketSession session){
        System.out.println("세션 열림: "+ session.getId());
        webSocketSessions.add(session);
        for (WebSocketSession session2 : webSocketSessions){
            System.out.println("세션 열림: "+ session2);
        }
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception{
        System.out.println("메시지 날라옴: "+ message.toString());
        for (WebSocketSession webSocketSession : webSocketSessions){
            webSocketSession.sendMessage(message);
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception{
        webSocketSessions.remove(session);
    }

}
