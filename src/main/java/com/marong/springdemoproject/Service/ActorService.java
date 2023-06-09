package com.marong.springdemoproject.Service;

import com.marong.springdemoproject.Model.Actor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActorService {

    List<Actor> getActorList();

    Actor getActor(int uid);  //通过uid取得用户名称
}
