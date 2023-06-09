package com.marong.springdemoproject.Service;

import com.marong.springdemoproject.Mapper.ActorMapper;
import com.marong.springdemoproject.Model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActorServiceImpl implements ActorService {

  //  private static ActorServiceImpl actorServiceImpl;
    @Autowired
    private ActorMapper actorMapper1;

//    @PostConstruct
//    private void init() {
//        actorServiceImpl = this;
//        actorServiceImpl.actorMapper1 = this.actorMapper1;
//    }


    @Override
    public List<Actor> getActorList() {

        try {

            List<Actor> actors = actorMapper1.getActorList();
            return actors;

        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Actor getActor(int uid) {
        try {

            Actor actor = actorMapper1.getActor(uid);
            return actor;

        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }
}
