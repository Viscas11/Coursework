public class Employee {
    private int deport;
    private String fio;
    private int salary;


    private int id;
    private static int idCounter;

    public Employee(int deport, String fio, int salary) {
        this.deport = deport;
        this.fio = fio;
        this.salary = salary;
        id = ++idCounter;
    }
    @Override
    public String toString() {
        return String.format("Отдел: %d \nФ.И.О %s \nЗарплата %d",
                deport, fio, salary);
    }
    public int getDeport() {
        return this.deport;
    }
    public String getFio() {
        return this.fio;
    }
    public int getSalary() {
      return this.salary;
    }

    public void setDeport(int deport) {
        this.deport = deport;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}

