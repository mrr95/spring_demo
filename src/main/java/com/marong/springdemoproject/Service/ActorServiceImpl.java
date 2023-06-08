package com.marong.springdemoproject.Service;

import com.marong.springdemoproject.Mapper.ActorMapper;
import com.marong.springdemoproject.Model.Actor;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.marong.springdemoproject.Service.getBeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActorServiceImpl implements ActorService {

    private static ActorServiceImpl actorServiceImpl;

    private ActorMapper actorMapper1 = getBeanUtils.getBean(ActorMapper.class);

    @PostConstruct
    private void init() {
        actorServiceImpl = this;
        actorServiceImpl.actorMapper1 = this.actorMapper1;
    }


    @Override
    public List<Actor> getActorList() {

        try {

            List<Actor> actors = actorServiceImpl.actorMapper1.getActorList();
            return actors;

        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }

//    @Override
//    public Actor getActor(int uid) {
//        try {
//
//            Actor actor = actorMapper1.getActor(uid);
//            return actor;
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//            throw e;
//        }
//    }
}
