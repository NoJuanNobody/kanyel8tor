package io.AlejandroLondono;


/**
 * Created by alejandrolondono on 4/29/16.
 */
public class Kanye {

    public String display = "";
    public double memory = 0;
    public double inputOne = 0;
    public Mode currentMode = Mode.DECIMAL;
    public enum Mode {
        DECIMAL, BINARY, HEX, OCTAL
    };
    public TrigUnit currentTrigUnit =TrigUnit.RADIANS;
    public enum TrigUnit {
        RADIANS, DEGREES
    }

    public void startEq(double input){
        this.inputOne = input;
    }

    public double add(double input){
        return this.inputOne + input;
    }

    public double subtract(double input){
        return this.inputOne - input;
    }

    public double divide(double input){
        return this.inputOne/input;
    }

    public double exp(double power){
        return Math.pow(this.inputOne, power);

    }

    public double exp(){
        return Math.pow(this.inputOne, 2);
    }

    public double multiply(double input){
        return this.inputOne * input;
    }

    public double sqrt(){
        return Math.sqrt(inputOne);
    }

    public double inverse(){
        return 1/this.inputOne;

    }

    public double switchSign(){
        double negOne = -1 ;
        return multiply(negOne);
    }

    public String binaryMode(){
        int inputInt = (int) inputOne;
        return Integer.toBinaryString(inputInt);
    }

    public String hexMode(){
        int inputInt = (int) inputOne;
        return Integer.toHexString(inputInt);
    }

    public String octalMode(){
        int inputInt = (int) inputOne;
        return Integer.toOctalString(inputInt);
    }
//if you keep incrementing, you will eventually increment out of the range
    public void switchDisplayMode(){
        int i = Mode.valueOf(currentMode.toString()).ordinal();
        i++;

        convertDisplayMode(Mode.values()[i]);
    }

//    THIS IS NOT FULLY OPERATIONAL. IT NEEDS TO TAKE A STRING AND COMPARE A MODE BEFORE????
    public void convertDisplayMode(Mode mode){
        this.currentMode = mode;

        switch (currentMode){
            case BINARY:
                binaryMode();
                break;
            case HEX:
                hexMode();
                break;
            case OCTAL:
                octalMode();
                break;
            default:

                break;

        }
//        return to display variable
    }

    public double sine(){
        return Math.sin(inputOne);
    }

    public double cosine(){
        return Math.cos(inputOne);
    }

    public double tangent(){
        return Math.tan(inputOne);
    }

    public double arcSine(){
        double modOne = inputOne%1;
        return Math.asin(modOne);
    }

    public double arcCosine(){
        double modOne = inputOne%1;
        return Math.acos(modOne);
    }

    public double arcTangent(){
        double modOne = inputOne%1;
        return Math.atan(modOne);
    }

    public void switchUnitsMode(){

    }

    public void switchUnitsMode(TrigUnit unit){

    }


}
