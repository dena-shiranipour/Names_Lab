package com.example.task_01.controller;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping(value = "/greeting")

    public class NamesController {

//        @GetMapping
//        public String greeting(@RequestParam(name = "name", required = false) String name) {
//            if (name == null || name.isEmpty()) {
//                return "Good Afternoon!";
//            } else {
//                return String.format("Good Afternoon %s!", name);
//            }
//        }

//        @GetMapping
//        public Greeting greeting() {
//            Greeting greeting = new Greeting("Dena", "afternoon");
//            return greeting;
//        }
//
//        @GetMapping
//        public String timeOfDay(@RequestParam(value = "timeOfDay", defaultValue = "day") String timeOfDay) {
//            return "Good " + timeOfDay + "!";
//        }

        //get request
        @GetMapping(value = "/summer")
        public Celebration celebration(){
            Celebration celebration = new Celebration("Happy Summer Solstice!");
            return celebration;
        }
    }