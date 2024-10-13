package QuestionsExplanantions.SOLIDExplanation;

public class EmployeeOCP {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeOCP(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void printMe(){
        System.out.println("id=" + this.id + "name=" + this.name );
    }

    @Override
    public String toString() {
        return "EmployeeOCP{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

