import java.util.ArrayList;
public class Group {
    //group attributes
    private int groupNumber;
    private Trainer groupTrainer;
    private String groupName;
    private Sport sport;
    private ArrayList<Kid> groupKids;
    private static final int groupMaxLimit=2;
    private static int id =1;
    //group constructor
    public Group(Trainer groupTrainer,String groupName,Sport sport ){
        this.groupNumber = id++;
        this.groupTrainer = groupTrainer;
        this.groupName = groupName;
        this.sport = sport;
        this.groupKids = new ArrayList<>();
        //adding this group to the static ArrayList allGroups in sportClub class
        SportClub.allGroups.add(this);
    }
    //function to know if there is a vacancy for adding a kid
    public boolean canIAddKid(){
        return groupKids.size() < groupMaxLimit;
    }
    //A function to find out if the kid already exists
    public boolean IsThisKidExist(Kid kid1){
        //for each kid in groupKids compare it with the kid we want to add if the kid exists return true
        for (Kid kid : groupKids) {
           if(kid.equals(kid1))
               return true;
        }
        //if the kid we want to add is not in the groupKids return false
        return false;
    }
    //function for Adding kid to the group
    public void AddKid(Kid kid){
        //if there is a vacancy for adding a kid in the group and the kid was not in the group before
        // then add kid else return massages
        if(canIAddKid()){
            if(!IsThisKidExist(kid)){
                groupKids.add(kid);
                System.out.println("The kid "+kid.getName()+" has been added to the group"+this.groupNumber);
            }
            else System.out.println("This kid is already exist in the group"+this.groupNumber);
        }
        else System.out.println("the group is full , you cannot add a new Kid");
    }
   //function to see if we can Remove Specific kid from the group
    private boolean CanIRemove(Kid kid){
        //if the kid we want to remove it already exist return true else return false
        for (Kid k : groupKids) {
            if(k.equals(kid)){
                return true;
            }
        }
        return false;
    }
    //function for Removing kid
    public void RemoveKid(Kid kid){
        //if I can remove the kid Remove it and Show a message that the operation was successful
        if(CanIRemove(kid)){
            this.groupKids.remove(kid);
            System.out.println("The kid has been removed from the group"+this.groupNumber);
        }
        //if I cannot remove the kid Show a message that the operation wasn't successful
        else
            System.out.println("This kid is not Exist in the group"+this.groupNumber);
    }
    //setters and getters for all attributes
    public int getGroupNumber() {
        return groupNumber;
    }

    public int getGroupMaxLimit() {
        return groupMaxLimit;
    }

    public Trainer getGroupTrainer() {
        return groupTrainer;
    }

    public void setGroupTrainer(Trainer groupTrainer) {
        this.groupTrainer = groupTrainer;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<Kid> getGroupKids() {
        return groupKids;
    }

    public void setGroupKids(ArrayList<Kid> groupKids) {
        this.groupKids = groupKids;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
    //toString function
    @Override
    public String toString(){
        return "group"+this.groupNumber+" : \n" +
                "name : "+this.groupName+"\n" +
                "Kids number : "+this.groupKids.size()+"\n" +
                "Sport : "+this.getSport().getSportName()+"\n";
    }
    //equals function that depends on the IDs being equal to the two groups
    public boolean equals(Group group){
        return this.groupNumber == group.getGroupNumber();
    }
}