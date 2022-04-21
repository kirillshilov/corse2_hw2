package ru.skypro;

public class kogtewran extends hogwarts {
    private int intellect;
    private int wisdom;
    private int wittiness;
    private int creation;
    public kogtewran(int powerOfMagic, int transgressionDistance, int intellect, int wisdom, int wittiness,int creation, String name) {
        super(powerOfMagic, transgressionDistance, name);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creation = creation;
    }
    public static void compareTwoKogtewranStudent (kogtewran one, kogtewran two){
        int firstStudent = one.intellect + one.wisdom + one.wittiness + one.creation;
        int secondStudent = two.intellect + two.wisdom + two.wittiness + two.creation;
        if (firstStudent == secondStudent){
            System.out.println("Коктевранцы ровны");
        }
        else if (firstStudent > secondStudent){
            System.out.println(one.getName() + " Лучший Коктевранец чем " + two.getName());}
        else {
            System.out.println(two.getName() + " Лучший Коктевранец чем " + one.getName());
        }
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return
                "name='" + getName() + '\'' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", intellect=" + intellect +
                ", wisdom=" + wisdom +
                ", wittiness=" + wittiness +
                ", creation=" + creation +
                '}';
    }
    public static void printStudent (kogtewran object) {
        System.out.println(object.toString());}
}