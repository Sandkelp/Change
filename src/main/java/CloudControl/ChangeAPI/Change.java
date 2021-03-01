package CloudControl.ChangeAPI;

import java.util.ArrayList;

public class Change {

    private final int dollarVal;

    private final int centVal;

    public Change(int dollarVal, int centVal){

        this.dollarVal = dollarVal;

        this.centVal = centVal;
    }

    
    public String getChange(){

        int[] coins = {25, 10, 5, 1};

        int totalCents = this.dollarVal * 100 + this.centVal;

        ArrayList<Integer> properChange = new ArrayList<Integer>();

        for (int coin:coins){

            properChange.add(totalCents/coin);

            totalCents = totalCents % coin;

        }

        return (" quarters: " + properChange.get(0) + 

                ", dimes: " + properChange.get(1) + 

                ", nickels: " + properChange.get(2) + 

                ", pennies: " + properChange.get(3) );
    }
    
   
}
