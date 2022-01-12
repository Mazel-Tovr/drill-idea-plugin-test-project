package com.epam.rest;


import com.epam.buisnes.*;
import com.epam.model.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private UserService userService;

    @Autowired
    private InsuranceService insuranceService;


    @PostMapping("/register")
    public User registerUser(@RequestParam("name") String name, @RequestParam("password") String password) {
        return userService.registerUser(name, password);
    }

    @DeleteMapping("/delete")
    public boolean removeUser(@RequestParam("id") String id) {
        return userService.removeUser(id);
    }

    @GetMapping("/generate")
    public Insurance generateInsurance() {
        return insuranceService.generate();
    }

    @GetMapping("/build")
    public Insurance buildInsurance() {
        return insuranceService.build();
    }

}
