package com.example.createTag.Controller;

import com.example.createTag.model.TagesDetails;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/training/projects")
public class CreateTagController {
    @GetMapping("/welcome")
    public String getWelcome(){
        return "Hi Your Welcome";
    }
    @GetMapping(path = "/tags", produces = MediaType.APPLICATION_JSON_VALUE)
    public TagesDetails getTag(@RequestParam String name,
                               @RequestParam String description){

        return new TagesDetails("ae3f59d9-f604-4804-869c-086fa3a7cf80",
                name,
                description,
                "Regular",
                1);
    }

}