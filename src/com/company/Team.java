<<<<<<< HEAD
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Member> team = new ArrayList<>();
    String name;
    Team(String name, List<Member> team){
        this.name =name;
        this.team.addAll(team);
    }

    public String getName() {
        return name;
    }

    public List<Member> getTeam() {
        return team;
    }
    public void addMember(Member member){
        team.add(member);
    }
    public void deleteMember(Member member){
        team.remove(member);
    }

}
=======
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Member> team = new ArrayList<>();
    String name;
    Team(String name, List<Member> team){
        this.name =name;
        this.team.addAll(team);
    }

    public String getName() {
        return name;
    }

    public List<Member> getTeam() {
        return team;
    }
    public void addMember(Member member){
        team.add(member);
    }
    public void deleteMember(Member member){
        team.remove(member);
    }

}
>>>>>>> a974e8dfe8812a19a394bb792ae3351392d778fb
