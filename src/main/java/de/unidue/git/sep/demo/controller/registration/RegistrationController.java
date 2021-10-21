package de.unidue.git.sep.demo.controller.registration;

import de.unidue.git.sep.demo.model.registration.UserRegistrationDTO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

public class RegistrationController {
    @GetMapping("/registration")
    public String showRegistrationFormForUsers(WebRequest request, Model model) {
        UserRegistrationDTO userDto = new UserRegistrationDTO();
        model.addAttribute("user", userDto);
        return "user registration";
    }
}
