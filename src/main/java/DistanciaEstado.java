public class DistanciaEstado implements IDistancia{

    private String distanciaEstado;

    @Override
    public String getDistanciaEstado() {
        return this.distanciaEstado;
    }

    @Override
    public void setDistanciaEstado(String distanciaEstado){
        this.distanciaEstado = distanciaEstado;
    }
}
