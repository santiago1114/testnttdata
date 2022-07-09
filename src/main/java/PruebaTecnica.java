import java.util.*;
import java.util.stream.Collectors;

/**
* Pruebas para el desarrollo de parte tecnica 1, cada método es la solucion a un item de la prueba
* @author Ing Carlos Santiago Benitez
*/
public class PruebaTecnica {

   /**
     *   Ingresa un arreglo de enteros donde cada entero representa un color de calcetin,
     *   se realizan parejas de numeros y se retorna la cantidad de parejas realizadas.
     *   @param calcetines Array de enteros
     *   @return Entero con el numero de pares
     *
     */
    public static int comercianteCalcetines(int[] calcetines) {
        List<Integer> calcetinesList = Arrays.stream(calcetines).boxed().collect(Collectors.toList());
        Collections.sort(calcetinesList);

        int pares = 0;
        int i = 0;
        while (i < calcetines.length-1) {
            if (calcetinesList.get(i) == calcetinesList.get(i+1)) {
                pares++;
                i += 2;
            }
            else
                i++;
        }

        return pares;
    }


    /**
     *   Ingresa un arreglo de enteros para la suma minima y maxima usando 4 numeros
     *   @param numeros Arreglo de enteros
     *   @return Arreglo con la suma minima y maxima { sumaMinima, sumaMaxima }
     *
     */
    public int[] minimoMaximo(int[] numeros) {
          int sum = Arrays.stream(numeros).sum();

          int sumaMenor = sum - Arrays.stream(numeros).max().getAsInt();
          int sumaMayor = sum - Arrays.stream(numeros).min().getAsInt();

          return new int[]{sumaMenor, sumaMayor};
    }


    /**
     *   Ingresa un arreglo de enteros para retornar el conteo del valor maximo
     *   @param velas Arreglo de enteros
     *   @return Entero con la frecuencia del valor maximo en el arreglo
     *
     */
    public int velasCumpleanos(int[] velas) {

        List<Integer> velasList = Arrays.stream(velas).boxed().collect(Collectors.toList());

        int maxValue = Collections.max(velasList);
        int maxFreq = Collections.frequency(velasList,maxValue);

        return maxFreq;

    }


}

