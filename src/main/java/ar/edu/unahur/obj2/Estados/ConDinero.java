package ar.edu.unahur.obj2.Estados;

import ar.edu.unahur.obj2.MaquinaGolosinas;

public class ConDinero extends EstadoSupport {

    public ConDinero(MaquinaGolosinas maquinaGolosinas) {
        super(maquinaGolosinas);
    }

    @Override
    public void agregarDinero(int cantidad) {
        System.out.println("Ya has insertado dinero");
        maquinaGolosinas.setEstadoConDinero();
    }

    @Override
    public void darVuelto() {
        maquinaGolosinas.setEstadoSinDinero();

        if(maquinaGolosinas.getPrecioBebida() < maquinaGolosinas.getDineroIngresado()){
            System.out.println("Falta ingresar dinero");
        } if (maquinaGolosinas.getPrecioBebida() == maquinaGolosinas.getDineroIngresado()){
            maquinaGolosinas.setEstadoSinDinero();
        }else{
            System.out.println("Su vuelto es: " + (maquinaGolosinas.getDineroIngresado()-maquinaGolosinas.getPrecioBebida()));
        }
    }

    @Override
    public void apretarPalanca() {
        System.out.println("");
        maquinaGolosinas.setEstadoVendido();
    }

    @Override
    public void entregarBebida() {
        System.out.println("Espere una golosina");
    }

    @Override
    public String toString() {
        return "ConDinero";
    }
}
