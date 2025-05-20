package homework.people;

public class ManualEngineer extends Engineer {

    public ManualEngineer(int age, int experience) {
        super(age, experience * 2);
        setSkill(experience * 2);
    }
}
