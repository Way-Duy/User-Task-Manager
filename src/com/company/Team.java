package com.company;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
public class Team 
{
    List<Member> team = new ArrayList<>();
    String name;
    String memberNames = "" ;
    int taskPoints = 0;
    String formatter = "###.###";
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
        {
            if(taskPoints == 0)
            {
                memberNames = memberNames + " " + member.getUsername();
            }
            else
            {
                double place =(((double)(member.getTaskPoints()))/((double)(taskPoints)))*100;
                DecimalFormat df = new DecimalFormat(formatter);//print out to 3 decimal places
                memberNames = memberNames + " " + member.getUsername() + " Part %: " + df.format(place);
            }
        }
        if(taskPoints == 0)
        {
            memberNames = memberNames + " No completed team tasks/ No participation score. ";
        }
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
