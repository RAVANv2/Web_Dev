package com.aws.aws_spring.datastore;


import com.aws.aws_spring.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private final static List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Harsh", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Hitesh", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Lalita", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Sukhbir", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
