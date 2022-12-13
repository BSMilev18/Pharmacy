import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ArrayList<Medicine> medicine = new ArrayList<Medicine>();
        Medicine medicine1 = new Medicine("Liliac", 15.99, 34, "2022-07-18");
        Medicine medicine2 = new Medicine("Gavigstol", 24.50, 12, "2023-01-10");
        Medicine medicine3 = new Medicine("Sintaz", 10.99, 9, "2023-02-28");
        Medicine medicine4 = new Medicine("Vashnik", 4.99, 12, "2023-02-10");
        medicine.add(medicine1);
        medicine.add(medicine2);
        medicine.add(medicine3);
        medicine.add(medicine4);
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("Option 1: General Stuff");
        System.out.println("Option 2: Expiration date One");
        System.out.println("option 3: Expiration date Two");
        String reader = sc.nextLine();

        if(reader == "1"){
            for(Medicine m : medicine){
                System.out.println(m.toString());
            }

            System.out.println(" ");
            System.out.println(priceUnderTen(medicine).toString());
            System.out.println(" ");
            System.out.println(" ");
            ArrayList<Medicine> meds1 = priceOverFifteen(medicine);
            System.out.println("Price over fifteen:");
            for (Medicine med: meds1) {
                System.out.println("[Name = " + med.name + ", " + "Count = " + med.count + "]");
            }
            System.out.println(" ");
            System.out.println("All names and prices:");
            System.out.println(allNamesAndPrice(medicine));
        }
        if(reader == "2"){
            System.out.println("Enter expiration date:");
            String date1 = sc.nextLine();
            System.out.println(expirationDate(medicine, date1));
        }
        if(reader == "3"){
            //Hypothetically, lets say there's something here
        }
        if(reader == "Exit")
        {
            System.out.println("Goodbye");
        }
        else{
            System.out.println("Incorrect input");
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

    public static ArrayList<Medicine> priceUnderTen(ArrayList<Medicine> medicine){

        ArrayList<Medicine> medicinePriceUnderTen = new ArrayList<Medicine>();
        for(Medicine p : medicine){
            if(p.getPrice() < 10.00){
                medicinePriceUnderTen.add(p);
            }
        }
        return medicinePriceUnderTen;
    }

    public static ArrayList<Medicine> priceOverFifteen(ArrayList<Medicine> medicine){

        ArrayList<Medicine> medicinePriceOverFifteen = new ArrayList<Medicine>();
        for(Medicine p : medicine){
            if(p.getPrice() > 15.00){
                medicinePriceOverFifteen.add(p);
            }
        }
        return medicinePriceOverFifteen;
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

    public static ArrayList<Medicine> expirationDate(ArrayList<Medicine> medicine, String date){

        Scanner s = new Scanner(System.in);
        ArrayList<Medicine> expirationDateInfo = new ArrayList<Medicine>();
        for(Medicine e1 : medicine){
            if(e1.getExpirationDate() == date){
                expirationDateInfo.add(e1);
            }
        }
        return expirationDateInfo;
    }

    public static ArrayList<Medicine> allNamesAndPrice(ArrayList<Medicine> medicine){

        ArrayList<Medicine> medicineInfo = new ArrayList<Medicine>();
        for(Medicine e1 : medicine){
            System.out.println("[Name = " + e1.name + ", " + "Price = " + e1.price + "]");
        }
        return medicineInfo;
    }
}
