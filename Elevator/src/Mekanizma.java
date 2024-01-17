
public class Mekanizma {

    public static void kataGit(Asansor elevator, int kat){

        System.err.println("***" +kat+ ". kat icin cagri!" );

        if(elevator.simdikiKat == kat){
            System.out.println("Asansor zaten bu katta... Kapi Aciliyor");
        }

        if(elevator.komut == Komutlar.UP){
            if(elevator.simdikiKat < kat){
                elevator.goUp.add(kat);
            }
            else{
                elevator.goDown.add(kat);
            }
        }
        else if(elevator.komut == Komutlar.DOWN){
            if(elevator.simdikiKat > kat){
                elevator.goDown.add(kat);
            }
            else{
                elevator.goUp.add(kat);
            }
        }
        else{
            if(elevator.simdikiKat > kat){
                elevator.goDown.add(kat);
            }
            else if(elevator.simdikiKat < kat){
                elevator.goUp.add(kat);
            }
        }
    }
}
