package nmy.Jack.config;

import nmy.Jack.Handler.RoomHandler;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

public class WebsocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(getRoomWebSocketHandler(),"/room").setAllowedOrigins("*");
    }

    private WebSocketHandler getRoomWebSocketHandler() {
        return new RoomHandler();
    }
}
