public class Main {
    public static void main(String[] args) {
        Employee Arda = new Employee("Arda",2500,66,2018);
        Employee Ege = new Employee("Ege",4000,45,2011);

        System.out.println(Arda + ", vergi = "+ Arda.tax()+ ", bonus = "+Arda.bonus()+", maaş artışı = "+Arda.raiseSalary()+
                ", vergi ve bonuslarla birlikte maaş = "+ (Arda.salary+Arda.bonus()-Arda.tax()) + ", toplam maaş = "+(Arda.salary+Arda.bonus()));


        System.out.println(Ege + ", vergi = "+ Ege.tax()+ ", bonus = "+Ege.bonus()+", maaş artışı = "+Ege.raiseSalary()+
                ", vergi ve bonuslarla birlikte maaş = "+ (Ege.salary+Ege.bonus()-Ege.tax()) + ", toplam maaş = "+(Ege.salary+Ege.bonus()));
    }
}

// Arda Dumanoğlu