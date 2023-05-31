/*Let’s combine a few of the concepts that you have learned so far: conditionals, Boolean expressions, and arithmetic expressions.

In this project, you will write a program that will calculate the monthly car payment a user should expect to make after taking out a car loan. The program will include the following:

Car loan amount
Interest rate of the loan
Length of the loan (in years)
Down payment*/

public class CarLoan {
    public static void main(String[] args) {
        int carLoan= 10000;
        int loanLength = 3; // This will represent a loan length of 3 years
        int interestRate = 5; // This will represent an interest rate of 5% on the loan
        int downPayment = 2000; // This will represent the down payment provided by a user for this car purchase


//Let’s build in some requirements that would prevent a buyer from taking out an invalid car loan
        if(loanLength<=0 || interestRate<=0)
        {
            System.out.println("Error! You must take out a valid car loan.");
        }
        //What if the down payment is more than the price of the car?
        else if(downPayment>=carLoan)
        {
            System.out.println("The car can be paid in full.");
        }else
        {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength *12; // Since we need the monthly payment, we must convert the loan length from years to months.
            int monthlyBalance = remainingBalance / months; // This represents the monthly payment without interest included
            int interest = monthlyBalance*interestRate/100; //.The user needs to pay interest on the loan borrowed.
            int monthlyPayment = monthlyBalance +interest; //Calculate the final monthly payment.

            System.out.println(monthlyPayment); // print out the monthly payment.
        }

    }
}