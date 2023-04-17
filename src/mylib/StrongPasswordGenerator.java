package mylib;

import java.util.Random;

public class StrongPasswordGenerator {
    private final int length;
    private final boolean upper;
    private final boolean lower;
    private final boolean numbers;
    private final boolean specialSigns;
    private final String signsAllowed;

    public StrongPasswordGenerator(StrongPasswordBuilder builder){
        this.length = builder.length;
        this.upper = builder.upper;
        this.lower = builder.lower;
        this.numbers = builder.numbers;
        this.specialSigns = builder.specialSigns;
        this.signsAllowed = builder.signsAllowed;
    }

    public String Generate() throws Exception {
        StringBuilder pass = new StringBuilder();
        String baseline = "";
        if(this.upper){
            baseline += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if(this.lower){
            baseline += "abcdefghijklmnopqrstuvwxyz";
        }
        if(this.numbers){
            baseline += "1234567890";
        }
        if(this.specialSigns){
            if(signsAllowed.equals("")) throw new Exception("No allowed signs were provided");
            baseline += signsAllowed;
        }

        Random rnd = new Random();

        for(int i = 0; i<this.length; i++){
            int x = rnd.nextInt(baseline.length());
            pass.append(baseline.charAt(x));
        }
        return pass.toString();
    }

}
