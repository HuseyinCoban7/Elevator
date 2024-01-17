public class Main {


    public static void main(String[] args) throws Exception {

        
        Hareket hareket = new Hareket() ;
        new Thread(hareket).start() ;

        
        Asansor asansor = Asansor.getElevator();

        
        Mekanizma.kataGit(asansor, 2);
        Mekanizma.kataGit(asansor, 5);
        Mekanizma.kataGit(asansor, 9);

        Thread.sleep(6000);
        Mekanizma.kataGit(asansor, 4);

        Thread.sleep(2000);
        Mekanizma.kataGit(asansor, 2);
        Mekanizma.kataGit(asansor, 3);
        Mekanizma.kataGit(asansor, 3);
    }

}



        