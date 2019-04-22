package com.example.restful.web.page;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author simple
 * @version 1.0
 * @date 2018/7/5 10:46
 */
@Controller
@RequestMapping("pages/users")
public class PageUserController {
    private static String ip;

    @Value("${wsh.front.ip}")
    public void setIp(String ipssss) {
        PageUserController.ip = ipssss;
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public String index(Model model) {
        model.addAttribute("host", "https://www.baidu.com");
        return "user/index";
    }

    @RequestMapping(value = "test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String test() {
        return "value: " + ip;
    }
}
