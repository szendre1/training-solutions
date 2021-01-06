package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(String... newSkills){
        int level;
        String skillName;
        for(String newSkill:newSkills){
            skillName=newSkill.substring(0,newSkill.length() - 4);
            level=Integer.parseInt(newSkill.substring(newSkill.length() - 2,0));
            skills.add(new Skill("",1));
        }

    }
}
