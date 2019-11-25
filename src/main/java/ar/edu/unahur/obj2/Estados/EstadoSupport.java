package ar.edu.unahur.obj2.Estados;

import ar.edu.unahur.obj2.MaquinaGolosinas;

public abstract class EstadoSupport implements EstadoMaquina  {
    protected MaquinaGolosinas maquinaGolosinas;

    public EstadoSupport(MaquinaGolosinas maquinaGolosinas) {
        this.maquinaGolosinas = maquinaGolosinas;
    }
}
