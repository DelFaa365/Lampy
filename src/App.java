import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sken = new Scanner(System.in);
        System.out.print("Zadej počet lamp: ");;
        int [] lampy = new int[sken.nextInt()];
        System.out.print("Zadej vzdálenosti jednotlivých lamp od začátku ulice: ");
        for (int i = 0; i < lampy.length; i++) {
            lampy[i] = sken.nextInt();
        }
        Arrays.sort(lampy);
        int mezera = 0;
        for (int i = 0; i < lampy.length-1; i++) {
            if(lampy[i+1]-lampy[i] > mezera){
                mezera = lampy[i+1]-lampy[i];
            }
        }

        double vysledek =(double)mezera/2;

        System.out.println(vysledek);
    }
}
