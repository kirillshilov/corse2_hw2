package ru.skypro;

public class puffenduy extends hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public puffenduy(int powerOfMagic, int transgressionDistance, int industriousness, int loyalty, int honesty, String name) {
        super(powerOfMagic, transgressionDistance, name);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public static void compareTwoPuffenduyStudent (puffenduy one, puffenduy two) {
        int firstStudent = one.industriousness + one.loyalty + one.honesty;
        int secondStudent = two.industriousness + two.loyalty + two.honesty;
        if (firstStudent == secondStudent) {
            System.out.println("Пуффендуйцы ровны");
        } else if (firstStudent > secondStudent) {
            System.out.println(one.getName() + " Лучший Пуффендуец чем " + two.getName());
        } else  {
            System.out.println(two.getName() + " Лучший Пуффендуец чем " + one.getName());
        }
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return
                "name=' " + getName() + '\'' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance= " + getTransgressionDistance() +
                ", industriousness= " + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
    public static void printStudent (puffenduy object) {
        System.out.println(object.toString());}
}
