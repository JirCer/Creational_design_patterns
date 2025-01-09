package factory_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalAccount {
    public static void main(String[] args) throws IOException {
        GetPlanFactoryMethod planFactoryMethod=new GetPlanFactoryMethod();

        System.out.println("Enter the name of plan for which the account will be generated");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();
        System.out.println("Enter the number of units for account will by calculated ");
        int units=Integer.parseInt(br.readLine());

        Plan plan=planFactoryMethod.getPlan(planName);

        System.out.println("Account amount for" + planName + "of"+ units+"units is: ");
        plan.getRate();
        plan.calculateAccount(units);

    }
}
