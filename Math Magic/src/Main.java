public class Main {
    public static void main(String[] args) {

        //Create an int variable called myNumber.
        //Set it equal to any integer other than 0.

        int myNumber= 9; // original number
        int stepOne= myNumber*myNumber;
        int stepTwo= stepOne + myNumber;
        int stepThree= stepTwo / myNumber;
        int stepFour= stepThree + 17;
        int stepFive= stepFour-myNumber;
        int stepSix= stepFive/6;


        System.out.println(stepSix);

    }
}