public class Main {
    public static void main(String[] args) {
        Employee Arda = new Employee("Arda",2000,45,1985);

        System.out.println(Arda + ", vergi = "+ Arda.tax()+ ", bonus = "+Arda.bonus()+", maaş artışı = "+Arda.raiseSalary()+
                ", vergi ve bonuslarla birlikte maaş = "+ (Arda.getSalary()+Arda.bonus()-Arda.tax()) + ", toplam maaş = "+(Arda.getSalary()+Arda.raiseSalary()));



    }
}

// Arda Dumanoğlu