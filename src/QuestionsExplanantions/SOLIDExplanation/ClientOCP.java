package QuestionsExplanantions.SOLIDExplanation;

public class ClientOCP {
    public static void main(String[] args) {
        EmployeeOCP emp = new EmployeeOCP(1,"sai");
        emp.printMe();

//        TrainEmployeeOCP tr = new TrainEmployeeOCP(1,"sai", "Online");
//        tr.printMe();
        usemeToPrintData(emp);
       // usemeToPrintData(tr);

    }

    public static void usemeToPrintData(EmployeeOCP e){
        e.printMe();
    }
}
