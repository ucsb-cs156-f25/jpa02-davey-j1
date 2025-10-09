package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Dave S.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "davey-j1";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-04");
        team.addMember(member:"Chiran");
        team.addMember(member:"Dave S");
        team.addMember(member:"Ryan Lee");
        team.addMember(member:"Ajay");
        team.addMember(member:"Anthony Herbert");
        team.addMember(member:"Max Lee");
        return team;
    }
}
