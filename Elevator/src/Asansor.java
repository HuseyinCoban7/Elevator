import java.util.PriorityQueue;

public class Asansor{

    private static Asansor _elevator;

    int simdikiKat;
    int baslangicKati;
    int bitisKati;
    int hedefKat;
    Komutlar komut;
    PriorityQueue<Integer> goUp;
    PriorityQueue<Integer> goDown;

    private Asansor(){
        this.simdikiKat = 0;
        this.baslangicKati = 0;
        this.bitisKati = 10;
        this.hedefKat = 0;
        this.komut = Komutlar.STOP;
        this.goDown = new PriorityQueue<>((a,b)->(b-a));      
        this.goUp = new PriorityQueue<>();                       

    }

    public synchronized static Asansor getElevator()
    {
        if ( _elevator == null ) {
            _elevator = new Asansor();
        }
        return _elevator;
    }

}
