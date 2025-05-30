package homework.people;

public abstract class Engineer extends Person {
    private int skill;
    private int experience;

    public Engineer(int age, int experience) {
        super(age);
        this.experience = experience;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
