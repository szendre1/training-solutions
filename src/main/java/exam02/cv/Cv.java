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
            //String level1=newSkill.substring(newSkill.length() - 2,1);
            level=Integer.parseInt(newSkill.substring(newSkill.length() - 2,newSkill.length() - 1));

            skills.add(new Skill(skillName,level));
        }

    }

    public int findSkillLevelByName(String sName){
        for(Skill x:skills){
            if (x.getName().equals(sName)){
                return x.getLevel();
            }
        }
        return 0;
    }


}
