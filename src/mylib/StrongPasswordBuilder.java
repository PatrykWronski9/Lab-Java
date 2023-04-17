package mylib;

public class StrongPasswordBuilder {
    public int length = 0;
    public boolean upper = false;
    public boolean lower = false;
    public boolean numbers = false;
    public boolean specialSigns = false;
    public String signsAllowed = "";

    public StrongPasswordBuilder(){
    }

    public StrongPasswordBuilder(StrongPasswordBuilder builder){
        this.length = builder.length;
        this.upper = builder.upper;
        this.lower = builder.lower;
        this.numbers = builder.numbers;
        this.specialSigns = builder.specialSigns;
        this.signsAllowed = builder.signsAllowed;
    }

    public StrongPasswordBuilder WithLength(int len){
        this.length = len;
        return this;
    }

    public StrongPasswordBuilder WithUpper(boolean flag){
        this.upper = flag;
        return this;
    }

    public StrongPasswordBuilder WithLower(boolean flag){
        this.lower = flag;
        return this;
    }

    public StrongPasswordBuilder WithNumbers(boolean flag){
        this.numbers = flag;
        return this;
    }

    public StrongPasswordBuilder WithSpecialSigns(boolean flag){
        this.specialSigns = flag;
        return this;
    }

    public StrongPasswordBuilder WithSignsAllowed(String signs){
        this.signsAllowed = signs;
        return this;
    }

    public StrongPasswordGenerator Build() throws Exception {
        StrongPasswordGenerator gen = new StrongPasswordGenerator(this);
        if(this.length <= 0 || (this.specialSigns && this.signsAllowed.equals(""))) throw new Exception("Wrong data provided");
        return gen;
    }
}
