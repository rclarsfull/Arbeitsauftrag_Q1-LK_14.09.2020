package HauptPackage;

public class Video {
    private String titel;
    private int laenge;
    private boolean vorhanden;

    Video(){
       vorhanden=true;
    };

    Video(String titel,int laenge){
        this.titel=titel;
        this.laenge=laenge;
        vorhanden=true;
    }
    Video(String titel,int laenge,boolean isVorhanden){
        this.titel=titel;
        this.laenge=laenge;
        vorhanden=isVorhanden;
    }


    public int getLaenge() {
        return laenge;
    }

    public String getTitel() {
        return titel;
    }

    public boolean isVorhanden() {
        return vorhanden;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setVorhanden(boolean vorhanden) {
        this.vorhanden = vorhanden;
    }

    public String toString(){
        String ausgabe="";
        ausgabe+="Der Film "+titel+" dauert "+laenge+" Minuten";
        if (vorhanden){
            ausgabe+=" und ist zum ausleih noch verfügbar\n";
        }else {
            ausgabe+=" ist aber leider nicht mehr verfügbar.\n ";
        }
        return ausgabe;
    }


}
