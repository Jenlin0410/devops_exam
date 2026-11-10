package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
package com.example.demo.model.user;


@Controller
public class UserController {

    @GetMapping("/welcome")
    public String welcome(
            @RequestParam String product,
            @RequestParam int quantity,
            Model model) {

        model.addAttribute("product", product);
        model.addAttribute("quantity", quantity);

        return "welcome";
    }
}