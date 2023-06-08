package com.marong.springdemoproject.Model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Actor {

    public int userId;
    public String firstName;
    public String lastName;
    public Boolean active;
    public Date updateDate;


}
