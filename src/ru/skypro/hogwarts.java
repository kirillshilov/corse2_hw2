package ru.skypro;

public class hogwarts {
    private String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public hogwarts(int powerOfMagic, int transgressionDistance, String name) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }
    public static void compareAnyStudent(hogwarts one, hogwarts two){
        int firstStudent = one.powerOfMagic + one.transgressionDistance;
        int secondStudent = two.powerOfMagic + two.transgressionDistance;
        if (firstStudent == secondStudent){
            System.out.println("Студенты ровны");
        }
        else if (firstStudent > secondStudent){
            System.out.println(one.name + " Лучший студент чем " + two.name);}
        else {
            System.out.println(two.name + " Лучший студент чем " + one.name);
        }
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
}
