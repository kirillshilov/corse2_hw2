package ru.skypro;

public class griffindor extends hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public griffindor(int powerOfMagic, int transgressionDistance, int nobility, int honour, int bravery, String name) {
        super(powerOfMagic, transgressionDistance, name);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }
    public static void compareTwoGriffindorStudent (griffindor one, griffindor two){
        int firstStudent = one.nobility + one.honour + one.bravery;
        int secondStudent = two.nobility + two.honour + two.bravery;
        if (firstStudent == secondStudent){
            System.out.println("Гриффиндорцы ровны");
        }
        else if (firstStudent > secondStudent){
            System.out.println(one.getName() + " Лучший гриффиндорец чем " + two.getName());}
        else {
                System.out.println(two.getName() + " Лучший гриффиндорец чем " + one.getName());
        }
    }

    @Override
    public String toString() {
        return  "nobility= " + nobility +
                ", honour= " + honour +
                ", bravery= " + bravery +
                ", name=' " + getName() + '\'' +
                ", powerOfMagic= " + getPowerOfMagic() +
                ", transgressionDistance= " + getTransgressionDistance() +
                '}';
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    public static void printStudent (griffindor object) {
    System.out.println(object.toString());}
}
