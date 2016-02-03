package com.example.websocket;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

/**
 * Created by qasim on 3/2/16.
 */
@ServerEndpoint("/hello")
public class MyEndpoint {

    @OnMessage
    public String echoText(String name) {
        System.out.println("message arrived..."+name);
        return name;
    }

    @OnClose
    public void closeConnection(){
        System.out.println("closing connection");
    }
}
