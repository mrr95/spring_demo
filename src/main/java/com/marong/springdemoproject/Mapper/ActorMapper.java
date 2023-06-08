package com.marong.springdemoproject.Mapper;

import com.marong.springdemoproject.Model.Actor;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

//@Mapper
//public interface actorMapper {
//    Actor getActor(int uid);
//
//    List<Actor> getActorList();
//}

@Component
public interface ActorMapper {
    //然后做一些数据库的对应操作，这次是查询操作
    @Select("select * from actor order by actor_id desc")
    List<Actor> getActorList();

}