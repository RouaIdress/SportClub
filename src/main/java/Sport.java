public class Sport {
    //Sport attributes
    private static int id =1;
    private int sportID;
    private String SportName;
    //Sport constructor
    public Sport(String SportName){
        this.sportID = id++;
        this.SportName = SportName;
        //adding this sport to the static ArrayList allSports in sportClub class
        SportClub.allSports.add(this);
    }
    //setters and getters for sport attributes
    public String getSportName() {
        return this.SportName;
    }

    public void setName(String SportName) {
        this.SportName = SportName;
    }

    public int getSportID() {
        return sportID;
    }
    //toString method
    @Override
    public String toString(){
        return "Sport"+this.sportID+" : "+this.SportName;
    }
    public boolean equals(Sport sport){ return this.sportID == sport.sportID; }
}