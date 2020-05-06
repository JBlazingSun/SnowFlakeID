package com.blazings.snowflakeid.Controller;

import com.blazings.snowflakeid.SnowFlakeID.SnowFlakeID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("get")
public class GenerateID {
    @GetMapping("id")
    public String GetID(){
        SnowFlakeID snowFlakeID = new SnowFlakeID(6, 8);
        return String.valueOf(snowFlakeID.nextId());
    }
}
