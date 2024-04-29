package midterm.luka_khelashvili_2.task1;

import java.util.List;

import midterm.luka_khelashvili_2.task1.AbstractFantasy;

import java.util.Arrays;
import java.util.Collections;

public class Fantasy extends AbstractFantasy implements Dream {
    private String LukaKhelashvili;

    @Override
    public String methodSedan3(String argInnovation5) {
        if (argInnovation5 == null) {
            return "Default value";
        }

        return argInnovation5.toUpperCase(); 
    }

    @Override
    public List<String> methodMachine4(String argTea6) {
        if (argTea6 == null) {
            return Collections.emptyList(); 
        }

        return Arrays.asList(argTea6, "AnotherValue"); 
    }
    

    @Override
    public String getGrowth1() {
        return "Some growth value";
    }

    @Override
    public String getTreatment2() {
        return "Some treatment value";
    }

    @Override
    public String toString() {
        return "Fantasy{" +
                "LukaKhelashvili='" + LukaKhelashvili + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Fantasy fantasy = new Fantasy();

     
        String sedanResult = fantasy.methodSedan3("Some argument");
        System.out.println("Result of methodSedan3: " + sedanResult);

        List<String> machineResult = fantasy.methodMachine4("Some tea");
        System.out.println("Result of methodMachine4: " + machineResult);

        String growthResult = fantasy.getGrowth1();
        System.out.println("Result of getGrowth1: " + growthResult);

        String treatmentResult = fantasy.getTreatment2();
        System.out.println("Result of getTreatment2: " + treatmentResult);
    }
}
