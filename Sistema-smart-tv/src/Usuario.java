import java.util.Arrays;

public class Usuario {
    public static void main (String [] args ) throws Exception {
        smartTv tv = new smartTv();

        System.out.println("TV está ligada? : " + tv.ligada);
        System.out.println("Canal atual : " + tv.canal);
        System.out.println("Volume atual : " + tv.volume);


        tv.ligar ();
            System.out.println("TV está ligada? : " + tv.ligada);

        tv.desligar ();
            System.out.println("TV está ligada? : " + tv.ligada);

        tv.aumentarVolume();
            System.out.println("Novo volume " + tv.volume);

        tv.dimunuirVolume();
            System.out.println("Novo volume " + tv.volume);

        tv.descerCanal();
        System.out.println("O novo canal " + tv.canal);

    }

}
