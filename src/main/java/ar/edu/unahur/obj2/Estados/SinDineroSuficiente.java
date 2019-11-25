package ar.edu.unahur.obj2.Estados;

import ar.edu.unahur.obj2.MaquinaGolosinas;

public class SinDineroSuficiente extends EstadoSupport {


    public SinDineroSuficiente(MaquinaGolosinas maquinaGolosinas) {
        super(maquinaGolosinas);
    }

    @Override
    public void agregarDinero(int cantidad) {
        this.maquinaGolosinas.setDineroIngresado(cantidad);

        if(maquinaGolosinas.getPrecioBebida() <= maquinaGolosinas.getDineroIngresado()){
            maquinaGolosinas.setEstadoConDinero();
        }else{
            System.out.println("Falta ingresar: " + (maquinaGolosinas.getPrecioBebida()-maquinaGolosinas.getDineroIngresado()));
        }
    }

    @Override
    public void darVuelto() {
        System.out.println("No se puede dar vuelto porque no compro una bebida");
    }

    @Override
    public void apretarPalanca() {
        System.out.println("El precio del producto es:" + maquinaGolosinas);
    }

    @Override
    public void entregarBebida() {
        System.out.println("No se puede entrega bebida porque no ha ingresado el dinero suficiente");
    }

    @Override
    public String toString() {
        return "SinDineroSuficiente";
    }
}
