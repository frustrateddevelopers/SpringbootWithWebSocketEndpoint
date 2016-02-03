package com.example.websocket;

import org.springframework.context.annotation.Configuration;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 * Created by qasim on 4/2/16.
 */
@ServerEndpoint("/citysuburb")
public class CitySuburbEndpoint {

    @OnOpen
    public void openConnection(Session session){
        System.out.println("websocket connected with citysuburb");
    }

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
