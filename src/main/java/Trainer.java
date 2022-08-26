public class Trainer extends Person {
    //trainer attributes
    private int trainerID;
    private int trainingCostPerMonth;
    private static int id = 1;

    //trainer constructor
    public Trainer(String trainerName, long trainerNumber, char trainerGender, int trainingCostPerMonth, int trainerAge) {
        this.trainerID = id++;
        this.trainingCostPerMonth = trainingCostPerMonth;
        //this attributes from super class Human
        this.name = trainerName;
        this.number = trainerNumber;
        this.gender = trainerGender;
        this.age = trainerAge;
        //adding this trainer to the static ArrayList allTrainers in sportClub class
        SportClub.allTrainers.add(this);
    }

    //setters and getters
    public int getTrainerID() {
        return trainerID;
    }

    public int getTrainingCostPerMonth() {
        return trainingCostPerMonth;
    }

    public void setTrainingCostPerMonth(int trainingCostPerMonth) {
        this.trainingCostPerMonth = trainingCostPerMonth;
    }

    //toString method
    @Override
    public String toString() {
        return "Trainer ID : " + trainerID + ", Name : " + name + ", mobile Number : " + number + ", gender : "
                + gender + ", training cost : " + trainingCostPerMonth;
    }

    //equals function that depends on the IDs being equal to the two trainers
    public boolean equals(Trainer trainer) {
        return this.trainerID == trainer.trainerID;
    }
}