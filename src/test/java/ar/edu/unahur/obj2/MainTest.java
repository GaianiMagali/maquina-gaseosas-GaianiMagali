package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.Estados.EstadoSupport;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {
    MaquinaGolosinas maquinaGolosinas;

    @BeforeMethod
    public void setUp() {
        maquinaGolosinas = new MaquinaGolosinas(10,15);
    }

    //________________________________________Estado actual__________________________________________________
    @Test
    public void testSock() {
        System.out.println("Stock actual de la maquina:");
        System.out.println(maquinaGolosinas.getStock());
    }

    @Test
    public void testEstadoActual() {
        System.out.println("Estado actual de la maquina:");
        System.out.println(maquinaGolosinas.getEstadoActual());
    }

    @Test
    public void testPrecioBebida() {
        System.out.println("Precio de la bebida:");
        System.out.println(maquinaGolosinas.getPrecioBebida());
    }

    //________________________________________Estado con dinero__________________________________________________
    @Test
    public void test() {
        maquinaGolosinas.agregarDinero(20);
        maquinaGolosinas.apretarPalanca();
        System.out.println(maquinaGolosinas.getEstadoActual());
    }

}