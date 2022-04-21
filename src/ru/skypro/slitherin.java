package ru.skypro;

public class slitherin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    public slitherin(int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition ,int resourcefulness,int lustForPower, String name) {
        super(powerOfMagic, transgressionDistance, name);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;

    }
    public static void compareTwoSlitherinStudent (slitherin one, slitherin two){
        int firstStudent = one.cunning + one.determination + one.ambition + one.resourcefulness + one.lustForPower;
        int secondStudent = two.cunning + two.determination + two.ambition + two.resourcefulness + two.lustForPower;
        if (firstStudent == secondStudent){
            System.out.println("Слизеринцы ровны");
        }
        else if (firstStudent > secondStudent){
            System.out.println(one.getName() + " Лучший Слизеринец чем " + two.getName());}
        else  {
            System.out.println(two.getName() + " Лучший Слизеринец чем " + one.getName());
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return
                "name='" + getName() + '\'' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
    public static void printStudent (slitherin object) {
        System.out.println(object.toString());}
}