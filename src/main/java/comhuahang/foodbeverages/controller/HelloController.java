package comhuahang.foodbeverages.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 阿俊哥
 * @Date: 2019/6/17 14:26
 * @Version 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "docker 部署成功！";
    }
}
