package com.aws.aws_spring.profile;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user-profile")
public class UserProfileController {

    @Autowired
    UserProfileService userProfileService;

    @GetMapping("/")
    public List<UserProfile> getUserProfile(){
        return userProfileService.getUserProfile();
    }

}
