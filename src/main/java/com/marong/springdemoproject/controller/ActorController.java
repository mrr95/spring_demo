package com.marong.springdemoproject.controller;

import com.marong.springdemoproject.Model.Actor;
import com.marong.springdemoproject.Service.ActorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ActorController {

    @Autowired
    private ActorServiceImpl actorService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "this is the ActorController says Hello.";
    }

    @RequestMapping("/actors")
    @ResponseBody
    public List<Actor> getActorList() {
        List<Actor> actorList = actorService.getActorList();
        return actorList;
    }

    @RequestMapping("/actor/{id}")
    @ResponseBody
    public Actor getActor(@PathVariable(name = "id") int id) {
        Actor actor = actorService.getActor(id);
        return actor;
    }
}
