import java.util.*;
import java.io.*;

public class SportClub {
     //static collection save all groups for all sports
     static ArrayList<Group> allGroups = new ArrayList<>();
     //static collection to Save the sports offered by the club
     static ArrayList<Sport> allSports = new ArrayList<>();
    //static collection to Save all trainers work in the club
     static ArrayList<Trainer> allTrainers = new ArrayList<>();
    //static collection to Save all kids in the club
     static ArrayList<Kid> allKids = new ArrayList<>();

     //Forming new group function
    public static void FormingNewGroup(){
         Scanner in  = new Scanner(System.in);
         System.out.println("Enter Trainer ID that you want");
         //show trainers data
        for (Trainer t:allTrainers) {
            System.out.println(t);
        }
        int TrainerID = in.nextInt();
        System.out.println("enter the name of the group");
        String GroupName = in.next();
        System.out.println("Enter Sport ID that you want");
        //show sports data
        for (Sport s:allSports) {
            System.out.println("ID = "+s.getSportID()+"."+s.getSportName());
        }
        int SportID = in.nextInt();
        /*if the ID of the trainer between 0 and the number of all trainers
        and the ID of the sport between 0 and the number of all sports
        is correct create new object of Group with the entered data*/
        if(TrainerID<=allTrainers.size()&&TrainerID>0&&SportID<=allSports.size()&&SportID>0){
            Group newGroup = new Group(allTrainers.get(TrainerID-1),GroupName,allSports.get(SportID-1));
        }
        else System.out.println("Wrong ID for trainer or Sport , the Mission failed ");
    }
    //function to add specific kid to specific group
    public static void AddKidToGroup(Kid kid,Group group){
        for (Group g:allGroups) {
            if(g.equals(group))
                g.AddKid(kid);
        }
    }
    //function to remove specific kid to specific group
    public static void RemoveKidFromGroup(Kid kid , Group group){
        for (Group g:allGroups) {
            if(g.equals(group))
                g.RemoveKid(kid);
        }
    }
    //function show the number of kids in each group for specific sport and get the average
    public static void AverageNumberOfKids(Sport sport){
        int numberAllKidsInSport = 0;
        int numberGroupsBelongToSport = 0;
        for (Group g:allGroups) {
            if(g.getSport().equals(sport)){
                //number of kids in each group belongs to this sport
                System.out.println("The number of kid in group"+g.getGroupNumber()+" = "+g.getGroupKids().size());
                //sum the number of kids in all groups belongs to this sport
                numberAllKidsInSport+=g.getGroupKids().size();
                //sum the number of groups belongs to this sport
                numberGroupsBelongToSport++;
            }
        }
        //Calculate the average number of kids per group of a certain sport
        System.out.println("the Average number of kids = "+(numberAllKidsInSport/numberGroupsBelongToSport));
    }

    public static void DisplayGroups(){
        /*Displaying all groups in a format similar to the following:
           sport1: groupNo1 groupNo2 groupNo3 …
           sport2: groupNo1 groupNo2 groupNo3 …
           …
           the sports and groups are sorted in ascending order already in the collections by ID
        */
        for (Sport s:allSports) {
            System.out.print("sport"+s.getSportID()+":");
            for (Group g:allGroups) {
                if(g.getSport().equals(s)) {
                    System.out.print("groupNo."+g.getGroupNumber()+" ");
                    //System.out.print(g.getGroupName()+" ");
                }
            }
            System.out.println();
        }
    }
// function to save groups in text file GroupsData.txt
    public static void SaveInFile(){
        try{
            File fw = new File("src/main/GroupsData.txt");
            PrintWriter pr = new PrintWriter(fw);
            for (Group g:allGroups) {
                pr.println(g);
            }
            pr.close();
            System.out.println("Done!");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
    // function to save the whole data into a text file AllData.txt and save this file
    // automatically inside the folder src/main/
    public static void SaveAllDataInFile(){
        try{
            File fw = new File("src/main/AllData.txt");
            PrintWriter pr = new PrintWriter(fw);
            pr.println("Sport Club : ");
            pr.println("The sports offered by the club : ");
            for (Sport s:allSports) {
                pr.println(s);
            }
            pr.println();
            pr.println("the trainers who work in the club : ");
            for(Trainer t :allTrainers){
                pr.println(t);
            }
            pr.println();
            pr.println("Information about all the Kids in the club : ");
            for (Kid k:allKids) {
                pr.println(k);
            }
            pr.println();
            pr.println("All Group Data : ");
            for (Group g:allGroups) {
                pr.println(g);
            }
            pr.close();
            System.out.println("Done!");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
