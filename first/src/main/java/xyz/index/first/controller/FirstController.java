package xyz.index.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.index.first.service.FirstService;

/**
 * 接口访问控制: first
 *
 * @author yuyonghua
 * @date 2019/7/24 15:49
 */
@RestController
@RequestMapping("/v1/first")
public class FirstController {

    /**
     * first service
     */
    @Autowired
    private FirstService firstService;

    /**
     * first
     *
     * @param name 名称
     * @return 消息
     */
    @GetMapping("hello")
    public ResponseEntity first(@RequestParam("name") String name) {
        return ResponseEntity.ok(firstService.hello(name));
    }
}
