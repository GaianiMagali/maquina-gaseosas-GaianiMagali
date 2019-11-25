package ar.edu.unahur.obj2.Estados;

import ar.edu.unahur.obj2.MaquinaGolosinas;

public class Vendido extends EstadoSupport {

    public Vendido(MaquinaGolosinas maquinaGolosinas) {
        super(maquinaGolosinas);
    }

    @Override
    public void agregarDinero(int cantidad) {
        System.out.println("Por favor espera,ya estamos dando una golosina");
    }

    @Override
    public void darVuelto() {
        System.out.println("Lo siento, ya giraste la manivela");
    }

    @Override
    public void apretarPalanca() {
        System.out.println("Girar dos veces no te da otro chicle");
    }

    @Override
    public void entregarBebida() {
        maquinaGolosinas.setEstadoVendido();

        if (maquinaGolosinas.getStock() > 0) {
            maquinaGolosinas.setEstadoSinDinero();
        } else {
            System.out.println("oops,no hay golosinas");
            maquinaGolosinas.setEstadoSinStock();
        }
    }

    @Override
    public String toString() {
        return "Vendido";
    }
}
