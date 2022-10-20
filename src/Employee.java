public class Employee {
    private String name;
    private double salary;
    private double workHours;
    private int hireYear;



    public Employee(String name, double salary, float workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) {
            return  salary * 0.03;
        } else {
            return 0; // no tax
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            double bonus_hours = workHours - 40;
            return bonus_hours * 30 ; // haftalık bonusu 4 ile çarpabiliriz ?
        } else return 0; //no bonus
    }

    @Override
    public String toString() {
        return "Çalışan :  " +
                " İsim = '" + name + '\'' +
                ", Maaş = " + salary +
                ", Çalışma_Saati = " + workHours +
                ", BaşlangıçYılı = " + hireYear;
    }

    public double raiseSalary() {
        int working_years = 2021 - hireYear;
        if (working_years < 10)
            return (this.salary * 0.05)+bonus()-tax();
        else if (working_years > 9 && working_years < 20)
            return (this.salary * 0.10)+bonus()-tax();
        else if (working_years > 19)
            return (this.salary * 0.15)+bonus()-tax();
        else return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
