package com.sgame.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chris Yang
 * @version 1.0
 */

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public String getBotInfo(){
        return "hahah";
    }
}
