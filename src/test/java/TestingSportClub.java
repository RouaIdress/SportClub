public class TestingSportClub {

    public static void main(String[] args){
        // in our club we offered just three sports football ,tennis and Gymnastics
        Sport sport1 = new Sport("Football");
        Sport sport2 = new Sport("Tennis");
        Sport sport3 = new Sport("Gymnastics");
        // we have Seven trainers
        Trainer trainer1 = new Trainer("Ali",9876543,'M',40,24);
        Trainer trainer2 = new Trainer("Ava",5789685,'F',40,26);
        Trainer trainer3 = new Trainer("Sophia",95688964,'F',35,31);
        Trainer trainer4 = new Trainer("Sara",7548939,'F',40,22);
        Trainer trainer5 = new Trainer("Charlotte",5887490,'F',45,32);
        Trainer trainer6 = new Trainer("James",8548933,'M',50,27);
        Trainer trainer7 = new Trainer("Mike",87583900,'M',60,29);
        //we have already seven groups
        Group group1 = new Group(trainer1,"Free",sport1);
        Group group2 = new Group(trainer2,"Joy",sport3);
        Group group3 = new Group(trainer3,"Fun",sport2);
        Group group4 = new Group(trainer4,"Happy",sport3);
        Group group5 = new Group(trainer5,"Unity",sport1);
        Group group6 = new Group(trainer6,"Great",sport2);
        Group group7 = new Group(trainer7,"Sea",sport1);

        SportClub.DisplayGroups();

        System.out.println("Forming new group : ");
        SportClub.FormingNewGroup();

        System.out.println("\nDisplay all groups of all sports : ");
        SportClub.DisplayGroups();

        System.out.println("Save groups data in file : ");
        SportClub.SaveInFile();

        Kid kid1 = new Kid("Yousef",10,98745632,'M');
        Kid kid2 = new Kid("Fatima",14,98745632,'F');
        Kid kid3 = new Kid("Sana",17,98745632,'F');
        Kid kid4 = new Kid("Mikel",11,98745632,'M');
        Kid kid5 = new Kid("Adam",15,98745632,'M');
        Kid kid6 = new Kid("Yara",13,98745632,'F');
        Kid kid7 = new Kid("Lora",10,98745632,'F');
        Kid kid8 = new Kid("Ahmad",10,98745632,'M');
        Kid kid9 = new Kid("Jhon",9,98745632,'M');
        Kid kid10 = new Kid("Lama",11,98745632,'F');

        System.out.println("Add Kids : ");
        SportClub.AddKidToGroup(kid1,group1);
        SportClub.AddKidToGroup(kid2,group1);
        SportClub.AddKidToGroup(kid3,group2);
        SportClub.AddKidToGroup(kid4,group3);
        SportClub.AddKidToGroup(kid5,group4);
        SportClub.AddKidToGroup(kid6,group7);
        SportClub.AddKidToGroup(kid7,group5);
        SportClub.AddKidToGroup(kid8,group6);
        SportClub.AddKidToGroup(kid9,group2);
        SportClub.AddKidToGroup(kid10,group3);

        System.out.println();

        System.out.println("Remove kid Already exist in group from it : ");
        SportClub.RemoveKidFromGroup(kid8,group6);

        System.out.println();

        System.out.println("Remove kid not exist in group from it : ");
        SportClub.RemoveKidFromGroup(kid8,group6);

        System.out.println();

        System.out.println("Add kid already exist in group again : ");
        SportClub.AddKidToGroup(kid6,group7);

        System.out.println();

        System.out.println("Add kid to full group : ");
        SportClub.AddKidToGroup(kid10,group1);

        System.out.println();

        System.out.println("number of kids in groups that belongs to Football sport : ");
        SportClub.AverageNumberOfKids(sport1);

        System.out.println();

        System.out.println("Save All data in file : ");
        SportClub.SaveInFile();
        SportClub.SaveAllDataInFile();
    }
}
