package HauptPackage;

public class Main {

    public static void main(String[] args) {
        Kunde testKunde=new Kunde("Meier",19,new Video("Star Wars Episode 1",136,false));

        System.out.printf(testKunde.toString());

        Video video2=new Video("Star Wars Episode 2",142,true);

        Video video1=testKunde.filmTausch(video2);

        System.out.println(video1.toString());
        System.out.println(testKunde.toString());

    }
}
