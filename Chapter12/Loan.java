
public class Loan   {
    private double annualInterestRate;
    private double numberOfYear;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan()   {
        this(2.5, 1, 10000);
    }

    public Loan(double annualInterstRate, int numberOfYear, double loanAmount)  {
        this.annualInterstRate = annualInterestRate;
        this.numberOfYear = numberOfYear;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate()   {
        return annualInterestRate;
    }

    public double getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear)   {
        this.numberOfYear = numberOfYear;
    }

    public double getLoanAmount(double loanAmount)   {
        this.loanAmount = loanAmount;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }

    public double getMonthlyPayment()   {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12));

        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYear * 12;

        return totalPayment;
    }

    public static void main(String [] args) {
        Loan ln = new Loan(0.035, 10, 560000);
        System.out.println("月供" + ln.getMonthlyPayment() + "元，总供" + ln.getTotalPayment() + "元。 ");

    }

}