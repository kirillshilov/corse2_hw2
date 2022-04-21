package ru.skypro;

public class Main {

    public static void main(String[] args) {
        griffindor harryPotter = new griffindor(89,88,55,21,52, "Harry Potter");
        griffindor hermionaGreyndger = new griffindor(456,56,78,12,45, "Hermiona Greyndger");
        griffindor ronUizli = new griffindor(67,45,12,67,89, "Ron Uizli");

        slitherin drakoMalfoy = new slitherin(34,45,56,67,78,89,90, "Drako Malfoy");
        slitherin grehemMontegu = new slitherin(90,89,78,67,56,45,34, "Grehem Montegu");
        slitherin gregoryGoyl = new slitherin(84,57,98,51,84,84,15, "Gregory Goyl");

        puffenduy zahariyaSmitt = new puffenduy(89,84,84,68,17,"Zahariya Smitt");
        puffenduy sedrikDigory = new puffenduy(84,68,18,85,84,"Sedrik Digory");
        puffenduy djastinFinkh = new puffenduy(84,68,84,12,18,"Djastin Finch-Fletchli");

        kogtewran djouChang = new kogtewran(84,98,48,15,87,37,"Djou Chang");
        kogtewran padmaPatil = new kogtewran(84, 84, 98, 24, 51, 35, "Padma Patil");
        kogtewran markusBelbi = new kogtewran(54,89,78,28,18,35,"Markus Belbi");


    griffindor.printStudent(harryPotter);// Метод для печати ученика факультета. Реализовал его для каждого факультета отдельно. внутри класса факультета
    hogwarts.compareAnyStudent(harryPotter, hermionaGreyndger);// метод для сравнения любых двух студентов. Реализован внутри класса hogwarts
    puffenduy.compareTwoPuffenduyStudent(zahariyaSmitt,sedrikDigory); // метод для сравнения студентов по факультетам. реализовал для каждого факультета отдельно. Внутри класса факультета
    }
}
