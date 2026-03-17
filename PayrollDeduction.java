/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payrolldeduction;

/**
 *
 * @author PGN-0253
 */
public class PayrollDeduction {

    private static int i;
    
    public static void  main(String[] args) {
        
      
      int[] employeeID = {10001, 10002, 10003, 10004, 10005, 10006, 
          10007, 10008, 10009, 10010, 10011, 10012, 10013, 10014, 10015, 10016, 
          10017, 10018, 10019, 10020, 10021, 10022, 10023, 10024, 10025,
          10026, 10027, 10028, 10029, 10030, 10031, 10032, 10033, 10034};
      
      String[] employeeName = {"Garcia, Manuel", "Lim, Antonio", "Aquiono, Biance", "Reyes, Isabella",
          "Hernandez, Eduard", "Villanueva Andrea", "San Jose, Brad", "Romualdez, Alice", "Ateinza, Rosie",
          "Alvaro, Roderick", "Salcedo, Anthony", "Lopez, Josie", "Farala, Martha", "Martinez, Leila",
          "Romualdez, Fredrick", "Mata, Christian", "De leon, Selena", "San Jose, Allion", "Rosario, Cydney",
          "Bautista, Mark", "Lazaro, Darlene", "Delos Santos, Kolby", "Santos, Vella", "Del Rosario, Tomas",
          "Tolentino, Jacklyn", "Gutierez, Percival", "Manalaysay, Garfield", "Villegas, Lizeth", "Ramos, Carol",
          "Maceda, Emelia", "Aguilar, Delia", "Castro, John Rafael", "Martinez, Carlos Ian", "Santos, Beatriz"
      };
      
      double[] grossSalary = {42800, 24990, 28560, 28170, 21910, 17850, 10640, 9310, 25040, 24160, 
          18320, 9940, 25440, 20400, 19920, 9310, 9310, 9310, 11040, 11040, 10640, 10640, 11360, 
          12495, 11025, 11360, 9975, 10640, 11305, 23457, 25040, 25040, 23475, 21910};
      
      System.out.println("====================================================");
        System.out.println("MotorPH Payroll Deduction Summary");
        System.out.println("====================================================");
      
     // Loop through employees
     for(int i = 0; i < employeeID.length; i++) {
     double sss = computeSSS(grossSalary[i]);
     double philhealth = computePhilHealth(grossSalary[i]);
     double pagibig = computePagIbig(grossSalary[i]);
     double tax = computeIncomeTax(grossSalary[i]);

     double totalDeductions = sss + philhealth + pagibig + tax;
     double netPay = grossSalary[i] - totalDeductions;
          String[] employeeNames = null;
          
     
    System.out.println("Employee: " + employeeName[i]);
    System.out.println("Gross Salary: " + grossSalary[i]);
    System.out.println("SSS: " + sss);
    System.out.println("PhilHealth: " + philhealth);
    System.out.println("PagIBIG: " + pagibig);
    System.out.println("Tax: " + tax);
    System.out.println("Total Deductions: " + totalDeductions);
    System.out.println("Net Pay: " + netPay);
    System.out.println("--------------------------------");
    } 
        
     
}     
    private static double computeSSS(double grossSalary) {
        
        if(grossSalary <= 42800)
            return 1125;
        if(grossSalary <= 24990)
            return 1125;
        if(grossSalary <= 28560)
            return 1125;
        if(grossSalary <= 28170)
            return 1125;
        if(grossSalary <= 21910)
            return 1112.50;
        if(grossSalary <= 17850)
            return 832.50;
        if(grossSalary <= 10640)
            return 472.50;
        if(grossSalary <= 9310)
            return 427.50;
        if(grossSalary <= 25040)
            return 1125;
        if(grossSalary <= 24160)
            return 1080;
        if(grossSalary <= 18320)
            return 832.50;
        if(grossSalary <= 9940)
            return 427.50;
        if(grossSalary <= 25440)
            return 1125;
        if(grossSalary <= 20400)
            return 922.50;
        if(grossSalary <= 19920)
            return 900;
        if(grossSalary <= 9310)
            return 427.50;
        if(grossSalary <= 9310)
            return 427.50;
        if(grossSalary <= 9310)
            return 427.50;
        if(grossSalary <= 11040)
            return 517.50;
        if(grossSalary <= 11040)
            return 517.50;
        if(grossSalary <= 10640)
            return 472.50;
        if(grossSalary <= 10640)
            return 472.50;
        if(grossSalary <= 11360)
            return 517.50;
        if(grossSalary <= 12495)
            return 562.50;
        if(grossSalary <= 11025)
            return 495.50;
        if(grossSalary <= 11360)
            return 517.50;
        if(grossSalary <= 9975)
            return 450.50;
        if(grossSalary <= 10640)
            return 495;
        if(grossSalary <= 11305)
            return 517.50;
        if(grossSalary <= 23457)
            return 1057;
        if(grossSalary <= 25040)
            return 1125;
        if(grossSalary <= 25040)
            return 1125;
        if(grossSalary <= 23475)
            return 1057;
        if(grossSalary <= 21910)
            return 990;
        return 0;    
    }
    
        public static double computePhilHealth(double grossSalary){
    double contribution = grossSalary * 0.03;
    return contribution / 2;
}
    
        public static double computePagIbig(double grossSalary){
    if(grossSalary > 1500)
        return 100;
    else
        return grossSalary * 0.02;
       }

        public static double computeIncomeTax(double grossSalary){

    if(grossSalary <= 20833)
        return 0;
    else if(grossSalary <= 33333)
        return (grossSalary - 20833) * 0.20;
    else if(grossSalary <= 66667)
        return 2500 + (grossSalary - 33333) * 0.25;
    else
        return 10833 + (grossSalary - 66667) * 0.30;
}
       
    }
         

      
    

