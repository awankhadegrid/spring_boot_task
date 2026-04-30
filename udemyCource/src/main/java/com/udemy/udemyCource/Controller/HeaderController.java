package com.udemy.udemyCource.Controller;

import com.udemy.udemyCource.dto.User;
import lombok.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HeaderController {

    @GetMapping("/getHeader")
    public String getHeader(@RequestHeader("User-Agent") String header){
        return header;
    }

    @GetMapping("/getHeader/map")
    public String getHeader(@RequestHeader Map<String,String> header){
        return "header";
    }

    @GetMapping("/getHeader/rep")
    public ResponseEntity getHeaderResponseEntity(@RequestHeader Map<String,String> header){
        return ResponseEntity.ok().header("a","abhi").build();
    }


    @PostMapping("/createUser")
    public String createUser(@RequestBody User user){
        String name = user.name();
        return user.toString();


    }


}
