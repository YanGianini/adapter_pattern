public class DistanciaAdapter extends DistanciaKM{

    private IDistancia distanciaEstado;

    public DistanciaAdapter(IDistancia distanciaEstado) {
        this.distanciaEstado = distanciaEstado;
    }

    public String recuperarDistancia() {
        if (this.getDistancia() >= 50){
            distanciaEstado.setDistanciaEstado("velho");
        }else if (this.getDistancia() >= 30){
            distanciaEstado.setDistanciaEstado("usado");
        }else if (this.getDistancia() > 0){
            distanciaEstado.setDistanciaEstado("semi novo");
        }else {
            distanciaEstado.setDistanciaEstado("novo");
        }
        return distanciaEstado.getDistanciaEstado();
    }

    public void salvarDistanciaEstado() {
        if (distanciaEstado.getDistanciaEstado().equals("novo")){
            this.setDistancia(0.0f);
        }else if(distanciaEstado.getDistanciaEstado().equals("semi novo")){
            this.setDistancia(1.0f);
        }else if(distanciaEstado.getDistanciaEstado().equals("usado")){
            this.setDistancia(30.0f);
        }else if(distanciaEstado.getDistanciaEstado().equals("velho")){
            this.setDistancia(50.0f);
        }
    }

}
