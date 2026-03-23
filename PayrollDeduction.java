/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payrolldeduction;

public class PayrollDeduction {

    public static void main(String[] args) {

        
        int[] employeeID = {10001,10002,10003,10004,10005,10006, 
            10007,10008,10009,10010,10011,10012, 
            10013,10014,10015,10016,10017,10018, 
            10019,10020,10021,10022,10023,10024, 
            10025,10026,10027,10028,10029,10030, 
            10031,10032,10033,10034
};

        String[] names = {
            "Garcia, Manuel", "Lim, Antonio", "Aquiono, Biance", "Reyes, Isabella",
            "Hernandez, Eduard", "Villanueva, Andrea", "San Jose, Brad", "Romualdez, Alice", "Ateinza, Rosie",
            "Alvaro, Roderick", "Salcedo, Anthony", "Lopez, Josie", "Farala, Martha", "Martinez, Leila",
            "Romualdez, Fredrick", "Mata, Christian", "De Leon, Selena", "San Jose, Allion", "Rosario, Cydney",
            "Bautista, Mark", "Lazaro, Darlene", "Delos Santos, Kolby", "Santos, Vella", "Del Rosario, Tomas",
            "Tolentino, Jacklyn", "Gutierez, Percival", "Manalaysay, Garfield", "Villegas, Lizeth", "Ramos, Carol",
            "Maceda, Emelia", "Aguilar, Delia", "Castro, John Rafael", "Martinez, Carlos Ian", "Santos, Beatriz"

        };

        double[] hourlyRate = {
            535, 357, 357, 313, 313, 255, 133, 133, 313,
            302, 229, 142, 318, 255, 249, 133, 133, 138,
            138, 142, 133, 133, 142, 147, 147,
            142, 133, 133, 133, 313, 313, 313, 313, 313

        };

        
        double[] hoursCutoff1 = {80, 70, 80, 90, 70, 70, 80, 70, 80,
            80, 80, 70, 80, 80, 80, 70, 70, 80, 80, 70, 80, 80, 80, 85, 75,
            80, 75, 80, 85, 75, 80, 80, 75, 70
};
        double[] hoursCutoff2 = {85, 70, 75, 80, 70, 70, 85, 70, 80,
            80, 70, 75, 80, 85, 80, 70, 70, 80, 80, 70, 80, 80, 80, 85, 75,
            80, 80, 80, 70, 75, 80, 80, 80, 70
};

        
        for (int i = 0; i < employeeID.length; i++) {

            double gross1 = computeGross(hoursCutoff1[i], hourlyRate[i]);
            double gross2 = computeGross(hoursCutoff2[i], hourlyRate[i]);

            double sss = computeSSS(gross2);
            double philhealth = computePhilHealth(gross2);
            double pagibig = computePagIbig(gross2);
            double tax = computeIncomeTax(gross2);

            double totalDeduction = sss + philhealth + pagibig + tax;
            double netPay2 = gross2 - totalDeduction;

            
            printEmployeePayslip(
                    employeeID[i],
                    names[i],
                    hourlyRate[i],
                    hoursCutoff1[i],
                    gross1,
                    hoursCutoff2[i],
                    gross2,
                    sss,
                    philhealth,
                    pagibig,
                    tax,
                    totalDeduction,
                    netPay2
            );
        }
    }

    

    private static double computeGross(double hours, double rate) {
        return hours * rate;
    }

    private static double computeSSS(double salary) {
        return salary * 0.045;
    }

    private static double computePhilHealth(double salary) {
        return salary * 0.03;
    }

    private static double computePagIbig(double salary) {
        return (salary > 1500) ? 100 : salary * 0.02;
    }

    private static double computeIncomeTax(double salary) {
        if (salary <= 20833)
            return 0;
        else if (salary <= 33332)
            return salary * 0.15;
        else
            return salary * 0.20;
    }

    

    private static void printEmployeePayslip(
            int id, String name, double rate,
            double hours1, double gross1,
            double hours2, double gross2,
            double sss, double philhealth,
            double pagibig, double tax,
            double totalDeduction, double netPay2) {

        
        System.out.println("\n===========================================");
        System.out.println("Employee #: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Hourly Rate: PHP %,.2f\n", rate);

        
        System.out.println("\n===========================================");
        System.out.println("              MOTORPH PAYSLIP");
        System.out.println("===========================================");
        System.out.println("Employee #: " + id);
        System.out.println("Name: " + name);
        System.out.println("Period: JULY (Cutoff 1)\n");

        System.out.printf("Hours Worked:        %10.2f\n", hours1);
        System.out.printf("Gross Pay:        PHP %,10.2f\n", gross1);
        System.out.printf("Net Pay:          PHP %,10.2f\n", gross1);

        
        System.out.println("\n===========================================");
        System.out.println("              MOTORPH PAYSLIP");
        System.out.println("===========================================");
        System.out.println("Employee #: " + id);
        System.out.println("Name: " + name);
        System.out.println("Period: JULY (Cutoff 2)\n");

        System.out.printf("Hours Worked:        %10.2f\n", hours2);
        System.out.printf("Gross Pay:        PHP %,10.2f\n", gross2);

        System.out.println("\n              DEDUCTIONS\n");

        System.out.printf("SSS:             PHP %,10.2f\n", sss);
        System.out.printf("PhilHealth:      PHP %,10.2f\n", philhealth);
        System.out.printf("Pag-IBIG:        PHP %,10.2f\n", pagibig);
        System.out.printf("Tax:             PHP %,10.2f\n", tax);

        System.out.printf("\nTotal Deduction: PHP %,10.2f\n", totalDeduction);
        System.out.printf("Net Pay:         PHP %,10.2f\n", netPay2);

        System.out.println("===========================================");
    }
}
    

