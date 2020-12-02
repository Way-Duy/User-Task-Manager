package com.company;
import java.util.ArrayList;
import java.util.List;
public class Team 
{
    List<Member> team = new ArrayList<>();
    String name;
    String memberNames = "" ;
    int taskPoints = 0;
    public int getTaskPoints() // return team task points
    {
        return taskPoints;
    }
    public void completedTask() // add a point for task completed by team
    {
        taskPoints++;
    }
    public void clearTaskPoints() // clear the team points 
    {
        taskPoints = 0;
    }
    Team(String name)
    {
        this.name =name;
    }
    public String getName() 
    {
        return name;
    }
    public List<Member> getTeam() 
    {
        return team;
    }

    public String getMemberNames() {
        memberNames ="";
        for (Member member: team)
            memberNames = memberNames + "  " + member.getUsername();

        return memberNames;
    }

    public void addMemberString(String stringMember) //deprecated
    {
        //team.add(member);
        memberNames = memberNames + ",  " + stringMember;
    }
    public void addMember(Member member) //linking member to team
    {
        team.add(member);
    }
    public void deleteMember(Member member)
    {

        team.remove(member);
    }
    public void Edit(String name)
    {
        this.name =name;
    }
}
