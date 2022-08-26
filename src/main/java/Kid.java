public class Kid extends Person {
    private static int id=1;
    private int uniqueID;
    // constructors for kid class
    public Kid(String kidName ,int kidAge ,long kidNumber ,char kidGender){
        this.uniqueID = id++;
        //this variables from super class Human
        this.name = kidName;
        this.age = kidAge;
        this.number = kidNumber;
        this.gender = kidGender;
        //adding this kid to the static ArrayList allKids in sportClub class
        SportClub.allKids.add(this);
    }
    //setter and getter for kid ID
    public int getUniqueID() {
        return uniqueID;
    }

    //toString function
    @Override
    public String toString(){
        return "Kid ID = "+this.uniqueID+", Name = "+this.name+", Age = "+
                this.age+", Number = "+this.number+", Gender = "+this.gender;
    }
    //equals function that depends on the IDs being equal to the two kids
    public boolean equals(Kid kid) {
        return this.uniqueID == kid.uniqueID;
    }
}