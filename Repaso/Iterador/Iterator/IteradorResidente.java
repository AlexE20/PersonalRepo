package Iterator;
import Residente.Residente;

public interface IteradorResidente {
    public Residente getNext();
    public boolean hasMore();
    public int getPosition();
    public void reset();
}
