import java.util.Scanner;

public class presaDesicions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Benvinguda i instruccions
        System.out.println("BENVINGUT A LA FINAL DEL TORNEIG");
        System.out.println("Ets l'entrenador de l'equip. Les teves decisions poden fer que guanyis o perdis el partit.");
        System.out.println();
        System.out.println("Com funciona:");
        System.out.println("Se't presentaran diverses decisions.");
        System.out.println("Has d'escriure el NUMERO de l'opció que vulguis i prémer ENTER.");
        System.out.println();

        //Decisió
        System.out.println("Decisió 0: Amb qui comences el partit?");
        System.out.println("1.Amb els de sempre");
        System.out.println("2.Amb la jove promesa");
        int dec0 = scanner.nextInt();
        boolean jove = (dec0 == 2); //això fa que si la opció que elegeixes es la dos sera true

        //Decisió
        System.out.println("Decisió 1: Que dius als jugadors?");
        System.out.println("1.Apretem a dalt");
        System.out.println("2.A la contra");
        int dec1 = scanner.nextInt();

        if (dec1 == 1) {
            System.out.println("Apretem a dalt i tenim una ocasió de seguida");

            //Decisió
            System.out.println("Decisió 2: Els crides que: ");
            System.out.println("1.Xutin de lluny");
            System.out.println("2.Facin una jugada");
            int dec2 = scanner.nextInt();

        if (dec2 == 1){
            if (jove){ //El if comprova la condició si es certa entra aquí dins
                System.out.println("La pilota toca en un defensa i entra.");
                System.out.println("FINAL FELIÇ: Has guanyat el partit");
            }
            else{
                System.out.println("El porter l'atura i ells marquen un gol");
                System.out.println("FINAL TRÀGIC: Has perdut el partit");
            }
            }
            else{
                System.out.println("La pilota arriba al davanter");

                //Decisió
                System.out.println("Decisió 3: Li crides com ha de xutar");
                System.out.println("1.Xut fort");
                System.out.println("2.Vaselina fluixa");
                System.out.println("3.Vaselina perfecta");
                int dec3 = scanner.nextInt();
            }
        }
    }
}


