package com.sgame.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Chris Yang
 * @version 1.0
 */

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public Map<String, String> getBotInfo(){

        Map<String, String> map = new HashMap<>();
        map.put("name", "yxy");
        map.put("rating", "300");

        return map;
    }
}
