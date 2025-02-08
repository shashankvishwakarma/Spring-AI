package com.example.tinderaibackend;

import com.example.tinderaibackend.conversations.ConversationRepository;
import com.example.tinderaibackend.matches.MatchRepository;
import com.example.tinderaibackend.profiles.ProfileCreationService;
import com.example.tinderaibackend.profiles.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TinderAiBackendApplication implements CommandLineRunner {

    @Autowired
    private ProfileRepository profileRepository;
    @Autowired
    private ConversationRepository conversationRepository;
    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private ProfileCreationService profileCreationService;

    public static void main(String[] args) {
        SpringApplication.run(TinderAiBackendApplication.class, args);
    }

    public void run(String... args) {
        clearAllData();
        profileCreationService.saveProfilesToDB();

    }

    private void clearAllData() {
        conversationRepository.deleteAll();
        matchRepository.deleteAll();
        profileRepository.deleteAll();
    }

}
