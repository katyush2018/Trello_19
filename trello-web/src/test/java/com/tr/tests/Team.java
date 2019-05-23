package com.tr.tests;

public class Team {
    private  String teamName;
    private  String desc;

    public String getTeamName() {
        return teamName;
    }

    public String getDesc() {
        return desc;
    }

    public Team WithTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    public Team WithDesc(String desc) {
        this.desc = desc;
        return this;
    }
}
