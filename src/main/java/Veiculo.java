public class Veiculo {

    IDistancia distancia;
    DistanciaAdapter persistencia;

    public Veiculo(){
        distancia = new DistanciaEstado();
        persistencia = new DistanciaAdapter(distancia);
    }

    public void setDistanciaEstado(String distanciaEstado){
        distancia.setDistanciaEstado(distanciaEstado);
        persistencia.salvarDistanciaEstado();
    }

    public String getDistanciaEstado() {
        return persistencia.recuperarDistancia();
    }

    public float getDistancia() {
        return persistencia.getDistancia();
    }
}
