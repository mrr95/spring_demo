package com.marong.springdemoproject.Model;

import lombok.Data;

import java.util.Date;

@Data
public class Actor {

    public int actorId;
    public String firstName;
    public String lastName;
    public Boolean active;
    public Date lastUpdate;


}
