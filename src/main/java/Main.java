/* 
7.- Diseñe un algoritmo que califique el puntaje obtenido en el lanzamiento de tres dados en función a la cantidad de Seis obtenidos, de acuerdo a lo siguiente:
- Seis en los tres dados: excelente 
- Seis en dos dados: muy bien 
- Seis en un dado: regular 
- Ningún seis: pésimo
Sacchetti, Maria Giselle C2 */
import java.util.Random;

public class Main {
    public static void main(String[] args) {

      //aqui genero los numerosaleatorios
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int dado3 = random.nextInt(6) + 1;
 
        int seisObtenidos = 0;
      //comparo si sale 6 en los dados
        if (dado1 == 6) seisObtenidos++;
        if (dado2 == 6) seisObtenidos++;
        if (dado3 == 6) seisObtenidos++;
      
        String calificacion;
        switch (seisObtenidos) {
            case 3:
                calificacion = "excelente";
                break;
            case 2:
                calificacion = "muy bien";
                break;
            case 1:
                calificacion = "regular";
                break;
            default:
                calificacion = "pesimo";
        }

       
        System.out.println("Dados lanzados: " + dado1 + ", " + dado2 + ", " + dado3);
        System.out.println("Seis obtenidos: " + seisObtenidos);
        System.out.println("Calificacion obtenida: " + calificacion);
    }
}


/* import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numAle;
    Random ran = new Random();
    numAle = ran.nextInt(6)+1;
    System.out.println(numAle);

    scanner.close();
  }

} */