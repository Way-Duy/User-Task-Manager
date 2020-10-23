package com.company;
import java.util.ArrayList;
import java.util.List;
public class Team 
{
    List<Member> team = new ArrayList<>();
    String name;
    String memberNames = "" ;
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
        return memberNames;
    }

    public void addMemberString(String stringMember)
    {
        //team.add(member);
        memberNames = memberNames + ",  " + stringMember;
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
