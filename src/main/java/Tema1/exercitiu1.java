package Tema1;

public class exercitiu1 {
    public static void main(String[]args){
        int varsta = 28;
        double inaltime = 1.65;
        boolean prezentaCurs = true;
        System.out.println("Varsta studentului este de" + "" + varsta);
        System.out.println("Inaltimea studentului este de" + "" + inaltime + "" + "metri");

        if (prezentaCurs){
            System.out.println("Studentul este prezent la curs");
        }else {
            System.out.println("Studentul nu este prezent la curs");
        }
    }
}

