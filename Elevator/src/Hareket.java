

public class Hareket implements Runnable, ITalimatlar {

	final static Asansor elevator = Asansor.getElevator();
        
	@Override
	public void run() {
		while (true) {
			try {
				
				try { Thread.sleep( 2000 ); } catch ( Exception e ) { }
				if(elevator.komut == Komutlar.UP){
					if(!elevator.goUp.isEmpty()){
						elevator.hedefKat = elevator.goUp.peek();
					}
				}
                                else if(elevator.komut == Komutlar.DOWN){
					if(!elevator.goDown.isEmpty()){
						elevator.hedefKat = elevator.goDown.peek();
					}
				}
                                else{
					if(!elevator.goUp.isEmpty()){
						elevator.hedefKat = elevator.goUp.peek();
					}
                                        else if(!elevator.goDown.isEmpty()){
						elevator.hedefKat = elevator.goDown.peek();
					}
				}

				if(elevator.simdikiKat < elevator.hedefKat){
					elevator.komut = Komutlar.UP;
				}
                                else if(elevator.simdikiKat > elevator.hedefKat){
					elevator.komut = Komutlar.DOWN;
				}
                                else{
					elevator.komut = Komutlar.STOP;
				}


				
				if(elevator.goDown.isEmpty() && elevator.goUp.isEmpty()){
					System.out.println("Asansor " +elevator.simdikiKat+ "'ta sabit...");
				}
                                else{
					
					if(elevator.simdikiKat < elevator.hedefKat){
						yukariGit(elevator);
						elevator.simdikiKat++;
					}
					else if(elevator.simdikiKat > elevator.hedefKat){
						asagiGit(elevator);
						elevator.simdikiKat--;
					}
						
					if(elevator.simdikiKat == elevator.hedefKat){
						if(!elevator.goDown.isEmpty() && elevator.goDown.peek() == elevator.hedefKat)
						{
							elevator.goDown.poll();		
						}
						else if(!elevator.goUp.isEmpty() && elevator.goUp.peek() == elevator.hedefKat)
						{
							elevator.goUp.poll();		
						}
						System.out.println("***Asansor " +elevator.hedefKat+"'a ulasti.");
                                                System.out.println("***Kapi Aciliyor...");
					}
					
					System.out.println("Asansor su anda " +elevator.simdikiKat + "'de");
                                        System.out.println("ve " + elevator.komut +"'a hareket ediyor." );
				}
			} catch (Exception e) {
				System.out.println( e ) ;
			}			
		}
	}


	@Override
	public void yukariGit(Asansor a) {

	}

	@Override
	public void asagiGit(Asansor a) {

	}

	@Override
	public boolean kataEris(Asansor a, int kat) {
		if((a.simdikiKat < kat && a.komut == Komutlar.UP) ||
				(a.simdikiKat > kat && a.komut == Komutlar.DOWN)){
			return true;
		}
		return false;
	}
}

