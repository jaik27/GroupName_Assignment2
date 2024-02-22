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
        // Sample member list
        List<Member> members = Arrays.asList(
            new Member("Member1", "Role1"),
            new Member("Member2", "Role2")
            // Add more members as needed
        );

        // Add members to the model
        model.addAttribute("members", members);

        // Return the view name
        return "group";
    }
}
