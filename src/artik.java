import  java.util.Scanner;
public class artik {

    public static void main(String[] args) {

        int yil,mod1,mod2,mod3;
        boolean artik = false;
        Scanner input = new Scanner(System.in);
        yil = input.nextInt();

        mod1 = yil % 4;
        mod2 = yil % 100;
        mod3 = yil % 400;

        System.out.print("Yıl Giriniz: ");

        if(mod1 == 0)
        {
            if( mod2== 0)
            {
                if ( mod3 == 0)
                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
        }
        else
            artik = false;

        if(artik)
            System.out.println(yil + " artık yıldır!");
        else
            System.out.println(yil + " artık yıl değildir!");
    }
}