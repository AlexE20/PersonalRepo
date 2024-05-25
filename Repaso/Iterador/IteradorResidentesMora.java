package Iterator;
import java.util.ArrayList;
import Residente.Residente;





public class IteradorResidentesMora implements IteradorResidente {
    private CollecionResidentes coleccion;
    private ArrayList <Residente> enMora=new ArrayList<>();
    private int currentPosition=0;

    IteradorResidentesMora(CollecionResidentes coleccion){
        this.coleccion=coleccion;

    }

    private void initIterador(){
        if(this.enMora.size()==0){
            this.enMora=coleccion.getEnmora();

        }

    }


    @Override
    public Residente getNext() {
       if(hasMore()){

        Residente tempEnMora=enMora.get(currentPosition);
        currentPosition++;
        return tempEnMora;
       }

       else return null;

    }

    @Override
    public boolean hasMore() {
        initIterador();
        return currentPosition<enMora.size();
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
