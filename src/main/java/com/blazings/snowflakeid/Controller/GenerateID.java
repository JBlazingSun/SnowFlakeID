package com.blazings.snowflakeid.Controller;

import com.blazings.snowflakeid.SnowFlakeID.SnowFlakeID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("get")
public class GenerateID {
    private SnowFlakeID snowFlakeID;
    public GenerateID() {
        snowFlakeID = new SnowFlakeID(6, 8);
    }

    @GetMapping("id")
    public String GetID(){
        return String.valueOf(snowFlakeID.nextId()  + "test");
    }
}
