package Iterator;
import java.util.ArrayList;
import Residente.Residente;


public class IteradorResidentesPuntual implements IteradorResidente {
    private CollecionResidentes coleccion;
    private ArrayList<Residente> puntual=new ArrayList<>();
    private int currentPosition=0;

    IteradorResidentesPuntual(CollecionResidentes coleccion){
        this.coleccion=coleccion;

    }

    private void initIterador(){
        if(this.puntual.size()==0){
            this.puntual=coleccion.getPuntual();

        }

    }


    @Override
    public Residente getNext() {
        if(hasMore()){

            Residente tempPuntual=puntual.get(currentPosition);
            currentPosition++;
            return tempPuntual;
        }

        else return null;

    }

    @Override
    public boolean hasMore() {
        initIterador();
        return currentPosition<puntual.size();
    }

    @Override
    public int getPosition() {
        return currentPosition;
    }

    @Override
    public void reset() {
        currentPosition=0;
    }
}
