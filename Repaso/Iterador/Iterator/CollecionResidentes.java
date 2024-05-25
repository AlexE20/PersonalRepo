package Iterator;
import Residente.Residente;


import Iterator.CollecionIterable;

import java.util.ArrayList;

public class CollecionResidentes implements CollecionIterable {

    private ArrayList<Residente> residentes;

    public CollecionResidentes(ArrayList<Residente> residentes) {
        this.residentes = residentes;
    }

    @Override
    public IteradorResidente crearResidenteEnMora() {
        return new IteradorResidentesMora(this);
    }

    @Override
    public IteradorResidente crearResidentePuntual() {
        return new IteradorResidentesPuntual(this);
    }

    public ArrayList<Residente> getEnmora() {
        ArrayList<Residente> enMora = new ArrayList<>();
        for (Residente residente : this.residentes) {
            if (residente.getSaldoDeudor()>0)
                enMora.add(residente);
        }
        return enMora;
    }
    public ArrayList<Residente> getPuntual() {
        ArrayList<Residente> puntual = new ArrayList<>();
        for (Residente residente : this.residentes) {
            if (residente.getSaldoDeudor()==0)
                puntual.add(residente);
        }
        return puntual;
    }


}
