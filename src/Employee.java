public class Employee {
    public String name;
    public double salary;
    public double workHours;
    public int hireYear;

    public Employee(String name, double salary, float workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) {
            return  (salary * 3)/100;

        } else {
            return 0; // no tax
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            double bonus_hours = workHours - 40;
            return bonus_hours * 30 * 4; // haftalık bonusu 4 ile çarpıp aylığı bulduk
        } else return 0; //no bonus
    }

    @Override
    public String toString() {
        return "Çalışan :  " +
                " İsim = '" + name + '\'' +
                ", Maaş = " + salary +
                ", Çalışma_Saati = " + workHours +
                ", Alım_Yılı = " + hireYear;
    }

    public double raiseSalary() { // vergi ve bonusları dikkate alarak hesapla
        double final_salary = this.salary + bonus() - tax();
        int working_years = 2021 - hireYear;
        if (working_years < 10)
            return (final_salary * 5) / 100;
        else if (working_years > 9 && working_years < 20)
            return (final_salary * 10) / 100;
        else if (working_years > 19)
            return (final_salary * 15) / 100;
        else return final_salary;
    }

}
