// THREE BICYCLES RACE WITH EACH OTHER BY AUTOMATION THROUGH ASSIGNING RANDOM VALUES

class carRace {

    static class Bicycle {
        int cadence = 0;
        int speed = 0;
        int gear = 1;
        void changeCadence(int newValue) {cadence = newValue;}
        void changeGear(int newValue) {gear = newValue;}
        int speedUp(int increment ) {return speed = speed + increment;}
        void applyBreaks(int decrement) {speed = speed - decrement;}
        void printStates() {
            System.out.println("cadence: " + cadence + " Speed: " + speed + "kmph" + " Gear: " + gear); }
    }
    //Put second number to avoid confusion
	
    public static void main(String[] args)  throws InterruptedException{
        //Creating matching distances
        int d1 = 200; int d2 = 200; int d3 = 200;

        for(int i = 0; i<20; i++) {
            //randomizing values
            int bike1c1 = (int)(Math.random()  * 101);
            int bike1s = (int)(Math.random()  * 20);
            int bike1g = (int)(Math.random()  * 7 );
            int bike2c = (int)(Math.random()  * 101);
            int bike2s = (int)(Math.random()  * 20);
            int bike2g = (int)(Math.random()  * 7);
            int bike3c = (int)(Math.random() * 101);
            int bike3s = (int)(Math.random()  * 20);
            int bike3g = (int)(Math.random()  * 7);

            //Creating Bicycles
            Bicycle bike1 = new Bicycle();
            Bicycle bike2 = new Bicycle();
            Bicycle bike3 = new Bicycle();

            //Assigning values
            bike1.changeCadence(bike1c1);
            bike1.speedUp(bike1s + 1);

            int bike1ss = bike1.speedUp(bike1s+1);
            bike1.changeGear(bike1g + 1);
            Thread.sleep(1200);
            System.out.println("Bike 1");
            bike1.printStates();
            d1 = d1 - bike1ss;	  //Subtracting distance from initial distance
            System.out.println("");
            System.out.println("distance left: " + d1);
            bike2.changeCadence(bike2c);
            bike2.speedUp(bike2s + 1);
            int bike2ss = bike2.speedUp(bike2s + 1);
            bike2.changeGear(bike2g + 1);
            Thread.sleep(1200);
            d2 = d2 - bike2ss; //Subtracting distance from initial distance
            System.out.println("Bike 2");
            bike2.printStates();
            System.out.println("Distance left: " +d2);
            System.out.println("");
            bike3.changeCadence(bike3c);
            bike3.speedUp(bike3s + 1);
            int bike3ss = bike3.speedUp(bike3s +1);
            bike3.changeGear(bike3g + 1);
            Thread.sleep(1000);
            System.out.println("Bike 3");
            d3 = d3- bike3ss; //Subtracting distance from initial distance
            bike3.printStates();
            System.out.println("Distance left = " + d3);
            System.out.println("");

            //Creating if, else statements to assign positioning in the leaderboard
            if(d1 < d3 && d1 < d2) {
                System.out.println("Bike 1 is in first place.");

                if(d2 < d3) {
                    System.out.println("Bike 2 in second place.");
                    System.out.println("Bike 3 in third place."); }

                else { System.out.println("Bike 3 is in second place.");
                    System.out.println("Bike 2 is in third place."); }
            }

            else if (d2 < d1 && d2 < d3 ){
                System.out.println("Bike 2 is in first place.");
                if(d1 < d3) {
                    System.out.println("Bike 1 in second place.");
                    System.out.println("Bike 3 in third place."); }

                else {
                    System.out.println("Bike 3 in second place.");
                    System.out.println("Bike 1 in third place.");
                }
            }

            else if (d3 < d1 && d3 < d2) {
                System.out.println("Bike 3 is in first place.");
                if(d1 < d2) { System.out.println("Bike 1 in second place.");
                    System.out.println("Bike 2 in third place."); }

                else {
                    System.out.println("Bike 2 in second place.");
                    System.out.println("Bike 1 in third place."); }
            }

            else  if(d1 == d2) {
                System.out.println("Bike 1 and 2 are tied");
                if(d1 < d3) { System.out.println("Bike 3 is in second place "); }
                else { System.out.println("Bike 3 is in first place"); }
            }
            else if(d1 == d3){
                System.out.println("Bike 1 and 3 are tied");
                if(d1 < d2) { System.out.println("Bike 2 is in second place "); }
                else { System.out.println("Bike 2 is in first place"); }
            }

            else if(d2 == d3) {
                System.out.println("Bike 2 and 3 are tied");
                if(d2 < d1) { System.out.println("Bike 1 is in second place "); }
                else { System.out.println("Bike 1 is in first place"); }
            }
            System.out.println("");
            //Race finishes, loop ends
            if(d1 <= 0 || d2 <= 0 || d3 <= 0) {
                break;
            }
        }
        // Race officially ends
        System.out.println("RACE COMPLETED!");
    }
}
