/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computesemimonthlysalary.java;

public class ComputeSemiMonthlySalaryJava {

    public static void main(String[] args) {

        
        String[] employeeNames = {
            "Manuel Garcia", "Lim Antonio", "Aquino Bianca", "Reyes Isabella", "Hernandez Eduard",
            "Villanueva Andrea Mae", "San Jose Brad", "Romualdez Alice", "Atienza Rosie", "Alvaro Roderick",
            "Salcedo Anthony", "Lopez Josie", "Farala Martha", "Martinez Leila", "Romualdez Frederick", 
            "Mata Christian", "De Leon Selena", "San Jose Allison", "Rosario Cydney", "Bautista Mark", 
            "Lazaro Darlene", "Delo Santos Kolby", "Santos Vella", "Del Rosario Tomas", "Tolentino Jacklyn",
            "Gutierrez Percival", "Manalaysay Garfield", "Villegas Lizeth", "Ramos Carol", "Maceda Emilia", 
            "Aguilar Delia", "Castro John Rafael", "Martinez Carol Ian", "Santos Beatriz"
        };

        
        double[] hoursWorked = {
            80, 70, 80, 90, 70, 70, 80, 70, 80,
            80, 80, 70, 80, 80, 80, 70, 70, 80,
            80, 70, 80, 80, 80, 85, 75,
            80, 75, 80, 85, 75, 80, 80, 75, 70
        };

        
        double[] hourlyRate = {
            535, 357, 357, 313, 313, 255, 133, 133, 313,
            302, 229, 142, 318, 255, 249, 133, 133, 138,
            138, 142, 133, 133, 142, 147, 147,
            142, 133, 133, 133, 313, 313, 313, 313, 313
        };

        
        printHeader();

        
        for (int i = 0; i < employeeNames.length; i++) {
            computeAndDisplaySalary(employeeNames[i], hoursWorked[i], hourlyRate[i]);
        }

        
        System.out.println("Computation verified successfully!");
    }

    
    private static void printHeader() {
        System.out.println("MotorPH Semi-Monthly Salary Computation");
        System.out.println("--------------------------------------");
    }

    
        private static void computeAndDisplaySalary(String name, double hoursWorked, double hourlyRate) {
        
        if (hoursWorked <= 0 || hourlyRate <= 0) {
            System.out.println("Invalid data for employee: " + name);
            System.out.println("--------------------------------------");
            return; // Skip computation for invalid entries
        }

      
        double semiMonthlySalary = hoursWorked * hourlyRate;

        
        System.out.println("Employee Name       : " + name);
        System.out.println("Total Hours Worked  : " + hoursWorked);
        System.out.println("Hourly Rate         : " + hourlyRate);
        System.out.printf("Semi-Monthly Salary : %.2f\n", semiMonthlySalary);
        System.out.println("--------------------------------------");
    }
}
    
            
            
                    
                    
            
            
            
            

            
            
    

