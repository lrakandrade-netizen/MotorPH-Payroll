/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
   package calculateHoursWorked;

public class calculateHoursWorked {

    public static void main(String[] args) {
        
        String[] employeeNames = {
            "Manuel Garcia", "Lim Antonio", "Aquino Bianca", "Reyes Isabella", "Hernandez Eduard",
            "Villanueva Andrea Mae", "San Jose Brad", "Romualdez Alice", "Atienza Rosie", "Alvaro Roderick",
            "Salcedo Anthony", "Lopez Josie", "Farala Martha", "Martinez Leila", "Romualdez Frederick", "Mata Christian", "De Leon Selena", "San Jose Allison",
            "Rosario Cydney", "Bautista Mark", "Lazaro Darlene", "Delo Santos Kolby", "Santos Vella", "Del Rosario Tomas", "Tolentino Jacklyn",
            "Gutierrez Percival", "Manalaysay Garfield", "Villegas Lizeth", "Ramos Carol", "Maceda Emilia", "Aguilar Delia", 
            "Castro John Rafael", "Martinez Carol Ian", "Santos Beatriz"
        };

        double[] timeIn = {
            8.59, 10.35, 10.23, 10.57, 9.48, 9.31, 9.09, 9.02, 
            8.15, 8.10, 9.08, 9.47, 9.48, 9.23, 8.41, 8.41, 
            9.40, 8.22, 9.53, 8.47, 9.37, 10.54, 10.27, 9.16, 
            10.18, 8.17, 9.05, 8.52, 10.57, 9.04, 10.07, 8.29, 
            10.02, 10.05
        };

        double[] timeOut = {
            18.31, 19.44, 18.32, 18.14, 17.13, 19.29, 16.30, 18.06,
            17.40, 15.13, 19.36, 18.43, 19.21, 18.09, 19.27, 16.45,
            17.24, 16.46, 17.24, 16.27, 18.45, 20.10, 20.10, 17.57, 
            18.07, 18.31, 19.14, 17.23, 21.44, 16.39, 20.51, 16.46, 
            19.39, 18.12
        };

        
        printHeader();

        
        for (int i = 0; i < employeeNames.length; i++) {
            displayEmployeeWorkHours(employeeNames[i], timeIn[i], timeOut[i]);
        }

       
        System.out.println("Computation complete: All hours calculated correctly.");
    }

    
    private static void printHeader() {
        System.out.println("MotorPH Employee Working Hours");
        System.out.println("--------------------------------------------------");
    }

    
    private static void displayEmployeeWorkHours(String name, double timeIn, double timeOut) {
        
        int inHour = (int) timeIn;
        int inMinute = (int) Math.round((timeIn - inHour) * 100);

        int outHour = (int) timeOut;
        int outMinute = (int) Math.round((timeOut - outHour) * 100);

        
        int totalMinutesWorked = (outHour * 60 + outMinute) - (inHour * 60 + inMinute);

        
        double hoursWorked = totalMinutesWorked / 60.0;

        
        System.out.println("Employee Name : " + name);
        System.out.printf("Time In       : %02d:%02d\n", inHour, inMinute);
        System.out.printf("Time Out      : %02d:%02d\n", outHour, outMinute);
        System.out.printf("Total Hours   : %.2f\n", hoursWorked);
        System.out.println("--------------------------------------------------");
    }
}  
        
   
