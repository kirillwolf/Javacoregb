package Obstances;
import animals.*;

public class Track implements Let  {
    private int length;

    public Track(int length) {
        this.length = length;
    }
    public boolean doIt(Animal animal) {
        return animal.run(length);
    }
    public int getLength(){
        return length;
    }
}
