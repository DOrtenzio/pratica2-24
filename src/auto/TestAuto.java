package auto;

import java.util.Scanner;

public class TestAuto {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //Inserire informzioni tramite set
        Auto a1=new Auto();
            System.out.println("AUTO 1\nInserisci marca");
            a1.setMarca(in.nextLine());
            System.out.println("Inserisci modello");
            a1.setModello(in.nextLine());
            System.out.println("Inserisci prezzo");
            a1.setPrezzo(in.nextDouble());
        in.nextLine();
        Auto a2=new Auto("Fiat","Panda Disel",15000.0);
        Auto a3=new Auto();
            System.out.println("AUTO 3\nInserisci marca");
            a3.setMarca(in.nextLine());
            System.out.println("Inserisci modello");
            a3.setModello(in.nextLine());
            System.out.println("Inserisci prezzo");
            a3.setPrezzo(in.nextDouble());
        in.nextLine();
        Auto a4=new Auto("Opel","Meriva Benzina",5000.0);

        //Get
        System.out.println("Auto 1:"+a1.getAuto());
        System.out.println("Auto 2:"+a2.getMarca()+" ; "+a2.getModello()+" ; "+a2.getPrezzo());
        System.out.println("Auto 3:"+a3.getAuto());
        System.out.println("Auto 4:"+a4.getMarca()+" ; "+a4.getModello()+" ; "+a4.getPrezzo());

    }
}