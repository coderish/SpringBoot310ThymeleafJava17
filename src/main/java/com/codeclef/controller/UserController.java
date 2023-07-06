//package com.codeclef.controller;
//
//import com.codeclef.entity.AppUser;
//import com.codeclef.repository.AppUserRepository;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class UserController {
//
//    private AppUserRepository userRepository;
//
//    @Autowired
//    public UserController(AppUserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @GetMapping("/index")
//    public String showUserList(Model model) {
//        model.addAttribute("users", userRepository.findAll());
//        return "index";
//    }
//
//    @GetMapping("/signup")
//    public String showSignUpForm(AppUser appUser) {
//        return "add-user";
//    }
//
//    @PostMapping("/adduser")
//    public String addUser(@Valid AppUser appUser, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "add-user";
//        }
//
//        userRepository.save(appUser);
//        return "redirect:/index";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String showUpdateForm(@PathVariable("id") long id, Model model) {
//        AppUser user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        model.addAttribute("user", user);
//
//        return "update-user";
//    }
//
//    @PostMapping("/update/{id}")
//    public String updateUser(@PathVariable("id") long id, @Valid AppUser appUser, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            appUser.setId(id);
//            return "update-user";
//        }
//
//        userRepository.save(appUser);
//
//        return "redirect:/index";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteUser(@PathVariable("id") long id, Model model) {
//        AppUser user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        userRepository.delete(user);
//
//        return "redirect:/index";
//    }
//}
