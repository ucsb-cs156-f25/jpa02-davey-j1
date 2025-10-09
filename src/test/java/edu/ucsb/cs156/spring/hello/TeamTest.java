package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string(){
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void boolean_equals_case_one(){
        assertTrue(team.equals(team));
    }

    @Test 
    public void boolean_equals_case_two(){
        assertFalse(team.equals(null));
    }

    @Test 
    public void boolean_equals_case_three_first_possibility(){
        Team team1 = new Team();
        Team team2 = new Team();
        assertTrue(team1.equals(team2));

    }

    @Test 
    public void boolean_equals_case_three_second_possibility(){
        Team team1 = new Team("test_names");
        Team team2 = new Team("test_names");
        team1.addMember("Reyes");
        assertFalse(team1.equals(team2));
        
    }

    @Test 
    public void boolean_equals_case_three_third_possibility(){
        Team team1 = new Team("test");
        Team team2 = new Team("test_third");
        team1.addMember("Craig");
        team2.addMember("Craig");
        assertFalse(team1.equals(team2));

    }

    @Test 
    public void boolean_equals_case_three_fourth_possibility(){
        Team team1 = new Team("tester");
        Team team2 = new Team("testing");
        team1.addMember("Reyes");
        team1.addMember("Fred");
        assertFalse(team1.equals(team2));

    }

    @Test
    public void test_hashCode_value(){
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void test_hashCode(){
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 0;
        assertEquals(1, result);
    }

    

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
