package com.groupname.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.groupname.webapp.model.Member;
import java.util.Arrays;
import java.util.List;

@Controller
public class GroupController {

    @GetMapping("/group")
    public String showGroup(Model model) {
        List<Member> members = Arrays.asList(
            new Member("Jaimin", "DB Analyst", "member1.jpg") 
            new Member("Alex", "Frontend Developer", "member2.jpg") // New member added
            new Member("Alex", "Frontend Developer", "member2.jpg") // New member added
           
        );

        model.addAttribute("members", members);
        return "group";
    }
}
