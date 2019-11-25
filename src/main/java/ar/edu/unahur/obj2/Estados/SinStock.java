package ar.edu.unahur.obj2.Estados;

import ar.edu.unahur.obj2.MaquinaGolosinas;

public class SinStock extends EstadoSupport {

    public SinStock(MaquinaGolosinas maquinaGolosinas) {
        super(maquinaGolosinas);
    }

    @Override
    public void agregarDinero(int cantidad) {
        System.out.println("No hay stock");
    }

    @Override
    public void darVuelto() {
        System.out.println("No hay stock");
    }

    @Override
    public void apretarPalanca() {
        System.out.println("No hay stock");
    }

    @Override
    public void entregarBebida() {
        System.out.println("No hay stock");
    }
}
