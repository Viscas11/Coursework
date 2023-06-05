
public class Main {
    public static void main(String[] args) {

     Employee[] employees = new Employee [10];
     employees[0] = new Employee(1, "Зиннатуллин Анатолий Эдуардович",
             50000);
     employees[1] = new Employee(2, "Баранулько Анатолий Геннадьевич",
             67000);
     employees[2] = new Employee(3, "Лицов Анатолий Александрович",
             57000);
     employees[3] = new Employee(4, "Козлан Ринат Данилович",
                73000);
     employees[4] = new Employee(5, "Колпачников Константин Яковлев",
                76000);
     employees[5] = new Employee(5, "Каменев Георгий Геннадьевич",
                65000);
     employees[6] = new Employee(4, "Шелонцев Михаил Петрович",
                55000);
     employees[7] = new Employee(3, "Сафонников Герман Алексеевич",
                89000);
     employees[8] = new Employee(2, "Ярошев Филипп Глебович",
                86000);
     employees[9] = new Employee(1, "Левский Георгий Константинович",
                59000);

     printEmployees(employees);
     salaryAmount(employees);
    }
    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees){
            if ( employee != null )
                System.out.println(employee.toString());
        }
    }
    public static void salaryAmount(Employee[] employees) {
        int salaryAmount = 0;
        for (Employee employee : employees){
            if ( employee != null ){
               salaryAmount += employee.getSalary();
            }
        }
        System.out.println(salaryAmount);
    }
    public static void
}
