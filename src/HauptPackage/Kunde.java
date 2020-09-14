package HauptPackage;

public class Kunde {
    private String name;
    private int alter;
    private Video meinGeliehenesViedeo;

    Kunde(){};
    Kunde(String name,int alter){
        this.name=name;
        this.alter=alter;
    }


    Kunde(String name,int alter,Video meinGeliehenesViedeo){
        this.name=name;
        this.alter=alter;
        this.meinGeliehenesViedeo=meinGeliehenesViedeo;
    }

    public int getAlter() {
        return alter;
    }

    public String getName() {
        return name;
    }

    public Video getMeinGeliehenesViedeo() {
        return meinGeliehenesViedeo;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setMeinGeliehenesViedeo(Video meinGeliehenesViedeo) {
        this.meinGeliehenesViedeo = meinGeliehenesViedeo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        if (meinGeliehenesViedeo==null){
            return name+" ist "+alter+" Jahre alt und hat keinen Film ausgeliehen\n";
        }
        return name+" ist "+alter+" Jahre alt und hat den folgenden Film Ausgeliehen:\n"+meinGeliehenesViedeo.toString()+"\n\n";
    }


    public Video filmTausch(Video newVideo){
        if (meinGeliehenesViedeo==null){
            System.out.println(toString()+"\nDieser Film wurde nun auf seinen Namen ausgeliehen:\n"+newVideo.toString());
            return null;
        }
        Video ausgabe=meinGeliehenesViedeo;
        this.meinGeliehenesViedeo.setVorhanden(true);
        this.meinGeliehenesViedeo=newVideo;
        this.meinGeliehenesViedeo.setVorhanden(false);
        System.out.println(toString()+"\nDieser Film wurde nun zurückgegeben und folgender wurde auf seinen Namen ausgeliehen:\n"+newVideo.toString()+"\n");
        return ausgabe;


    }


    public void zurueckgeben(){
        meinGeliehenesViedeo.setVorhanden(false);
        meinGeliehenesViedeo=null;
    }

}
