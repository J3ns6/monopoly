package com.hdm.monopoly.backend.di;

import com.hdm.monopoly.backend.board.streets.StreetManager;
import com.hdm.monopoly.backend.player_money.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hdm.monopoly.backend")
public class GameConfig {

    private final Player[] players = new Player[4];
    private final StreetManager streetManager = new StreetManager();
    private final String[] sessionIds = new String[4];

    @Bean
    public Player[] getPlayers() {
        return players;
    }

    @Bean
    public StreetManager getStreetManager() {
        return streetManager;
    }

    @Bean
    public String[] getSessionIds() {
        return sessionIds;
    }
}
