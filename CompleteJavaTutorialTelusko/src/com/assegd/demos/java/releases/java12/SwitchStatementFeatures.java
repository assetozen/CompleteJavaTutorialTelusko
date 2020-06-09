package com.assegd.demos.java.releases.java12;

public class SwitchStatementFeatures {
    public static void main(String[] args) {
        System.out.println(weightIncrease(FastFood.KFC));
    }


    public enum FastFood {
        MC_DONLADS, BURGER_KING, KFC
    }

    /** - ---------------- older switches -----------------------------------*/

    public static int weightIncrease(FastFood fastFood) {
        int increase; //kgs
        switch (fastFood) {
            case MC_DONLADS:
                increase = 5;
                break;
            case BURGER_KING:
                increase = 2;
                break;
            case KFC:
                increase = 1;
                break;
            default:
                throw new IllegalStateException("Stop feeding me!!");
        }
        return increase;
    }


    /**-------------------- enhanced version of the above commented switch case**/
    /**
     public static int weighIncrease(FastFood fastFood) {
        var increase = switch (fastFood) {
            case MC_DONLADS -> 5;
            case BURGER_KING ->2;
            case KFC -> 1;
            default -> throw new IllegalStateException("Stop feeding me!!");
        };
        return increase;
    }
     */

    /**-------------------------    "Inline the variable" much better enhancement of the stwich case with adding all the logic in ur return     */
    /** just mouse hover on the var = increase and click inline variable it will switch it to the below code*/
/**
    public static int weightIncrease(FastFood fastFood) {
        return switch (fastFood) {
            case MC_DONLADS -> 5;
            case BURGER_KING ->2;
            case KFC -> 1;
            default -> throw new IllegalStateException("Stop feeding me!!");
        };
    }
 */
}