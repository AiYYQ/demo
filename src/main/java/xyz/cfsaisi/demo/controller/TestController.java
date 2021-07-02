/**
 * @author YYQ
 */
package xyz.cfsaisi.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/asd")
public class TestController {

    @GetMapping("/set")
    public void a(HttpSession session){
        session.setAttribute("a","共享session");
    }

    @GetMapping("/get")
    public String b(HttpSession session){
        Object a = session.getAttribute("a");
        return a.toString();
    }


    @PostMapping("/abc")
    public void abc(){

    }
}
