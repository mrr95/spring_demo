package com.marong.springdemoproject.Mapper;

import com.marong.springdemoproject.Model.Actor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ActorMapper {
    Actor getActor(int uid);

    @Select("SELECT * FROM actor")
    List<Actor> getActorList();
}
