import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
* Pruebas para el desarrollo de parte tecnica 1
* @author Ing Carlos Santiago Benitez
*/
public class Tests {

    @Test
    public void calcetinesTest1(){

        PruebaTecnica pruebaTecnica = new PruebaTecnica();

        int velasApagadas = pruebaTecnica.comercianteCalcetines(new int[]{0, 5, 3, 1, 5, 5, 0, 3, 2, 3});
        Assertions.assertEquals(3, velasApagadas);
    }

    @Test
    public void calcetinesTest2(){
        PruebaTecnica pruebaTecnica = new PruebaTecnica();
        int velasApagadas = pruebaTecnica.comercianteCalcetines(new int[]{3, 2, 1, 3});
        Assertions.assertEquals(1, velasApagadas);
    }

    @Test
    public void minimoMaximoTest1(){
        PruebaTecnica pruebaTecnica = new PruebaTecnica();
        int[] minMax = pruebaTecnica.minimoMaximo(new int[]{3, 2, 1, 3, 1});
        Assertions.assertArrayEquals(new int[]{7,9}, minMax);
    }

    @Test
    public void minimoMaximoTest2(){
        PruebaTecnica pruebaTecnica = new PruebaTecnica();
        int[] minMax = pruebaTecnica.minimoMaximo(new int[]{1, 2, 3, 4, 5});
        Assertions.assertArrayEquals(new int[]{10,14}, minMax);
    }

    @Test
    public void velasTest1(){
        PruebaTecnica pruebaTecnica = new PruebaTecnica();

        int velasApagadas = pruebaTecnica.velasCumpleanos(new int[]{0, 5, 3, 1, 5, 5, 0, 3, 2, 3});
        Assertions.assertEquals(3, velasApagadas);
    }

    @Test
    public void velasTest2(){
        PruebaTecnica pruebaTecnica = new PruebaTecnica();
        int velasApagadas = pruebaTecnica.velasCumpleanos(new int[]{3, 2, 1, 3});
        Assertions.assertEquals(2, velasApagadas);
    }

}
