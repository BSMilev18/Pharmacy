import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /*ArrayList<Student> student = new ArrayList<Student>();
        Student student1 = new Student("Kio", "001", new int[]{6, 5, 6, 4}, 4);
        Student student2 = new Student("Kyle", "002", new int[]{3, 4, 6, 3}, 5);
        Student student3 = new Student("Vino", "003", new int[]{3, 4, 5, 4}, 1);
        Student student4 = new Student("Jigo", "004", new int[]{2, 3, 4, 2}, 4);
        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);*/

        ArrayList<Medicine> medicine = new ArrayList<Medicine>();
        Medicine medicine1 = new Medicine("Liliac", 15.99, 34, "2022-7-18");
        Medicine medicine2 = new Medicine("Gavigstol", 24.50, 12, "2023-1-10");
        Medicine medicine3 = new Medicine("Sintaz", 10.99, 9, "2023-2-28");
        Medicine medicine4 = new Medicine("Vashnik", 4.99, 12, "2023-2-10");
        medicine.add(medicine1);
        medicine.add(medicine2);
        medicine.add(medicine3);
        medicine.add(medicine4);
        for(Medicine m : medicine){
            //System.out.println(m.toString());
        }
        System.out.println(priceOverFive(medicine).toString());
        System.out.println(" ");
        System.out.println(countOver10(medicine).toString());
        System.out.println(" ");
        ArrayList<Medicine> meds = expiredMedicine(medicine);
        for (Medicine med: meds) {
            System.out.println("[Name = " + med.name + ", " + "Count = " + med.count + "]");
        }
    }
    public static ArrayList<Medicine> priceOverFive(ArrayList<Medicine> medicine){

        ArrayList<Medicine> medicinePriceOverFive = new ArrayList<Medicine>();
        for(Medicine p : medicine){
            if(p.getPrice() > 5.00){
                medicinePriceOverFive.add(p);
            }
        }
        return medicinePriceOverFive;
    }

    public static ArrayList<Medicine> countOver10(ArrayList<Medicine> medicine){

        ArrayList<Medicine> medicineCountOver10 = new ArrayList<Medicine>();
        for(Medicine c : medicine){
            if(c.getCount() > 10){
                medicineCountOver10.add(c);
            }
        }
        return medicineCountOver10;
    }

    public static ArrayList<Medicine> expiredMedicine(ArrayList<Medicine> medicine){

        ArrayList<Medicine> expiredMedicineInfo = new ArrayList<Medicine>();
        for(Medicine e1 : medicine){
            if(e1.getExpirationDate().charAt(3) == '2'){
                expiredMedicineInfo.add(e1);
            }
        }
        return expiredMedicineInfo;
    }
}