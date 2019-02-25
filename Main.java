import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> kopi   = new ArrayList<String>();
        MesinKopi robusta = new MesinKopi();
        robusta.setJenis("Robusta");
        robusta.setJumlahStok(40);
        kopi.add(robusta.getJenis());

        MesinKopi Arabica = new MesinKopi();
        robusta.setJenis("Arabica");
        robusta.setJumlahStok(35);
        kopi.add(robusta.getJenis());

        MesinKopi flores = new MesinKopi();
        robusta.setJenis("Kopi Flores");
        robusta.setJumlahStok(40);
        kopi.add(robusta.getJenis());

        for(int i=0; i< kopi.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+kopi.get(i));
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih ");
        int pilihanKopi = keyboard.nextInt() -1;

        ArrayList<String> Topping   = new ArrayList<String>();
        Topping susu = new Topping();
        susu.setJenisTopping("susu");
        susu.setJumlahStok(30);
        Topping.add(susu.getJenisTopping());

        Topping gula = new Topping();
        gula.setJenisTopping("Gula");
        gula.setJumlahStok(35);
        Topping.add(gula.getJenisTopping());

        Topping cream = new Topping();
        cream.setJenisTopping("Cream");
        cream.setJumlahStok(32);
        Topping.add(cream.getJenisTopping());

        for(int i=0; i< Topping.size();i++){
            int j= i+1;
            System.out.println("Menu Topping adalah "+j+" "+Topping.get(i));
        }

        Scanner monitor = new Scanner(System.in);
        System.out.println("Masukan toping yang mau dipilih ");
        int pilihanToping = monitor.nextInt() -1;

        System.out.println("Pesanan anda adalah " + kopi.get(pilihanKopi)+ "dengan Topping " + Topping.get(pilihanToping));


    }
}
