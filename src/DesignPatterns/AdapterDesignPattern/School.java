package DesignPatterns.AdapterDesignPattern;

public class School {
    public static void main(String[] args) {


        Pen pen = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setPen(pen);
        assignmentWork.writeAssignment("am bit tired to write assigment with piolet pen");
    }
}
