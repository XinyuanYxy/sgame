package com.sgame.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chris Yang
 * @version 1.0
 */

@Controller
@RequestMapping("/pk/")
public class IndexController {
    @RequestMapping("index/")
    public String index() {
        return "/pk/index.html";
    }
}
