package ExpressionsAndCalculationsWithUserInput.Basic;

public class WeightConvertor {

    public static float weights(float pound){

        /*
          the method converts the weight in pounds and converts into kilograms
          using the formula: pound/2.2
          return type being in floating point
         */

        return (float) (pound/2.2f);

    }// end of method

    public static void main(String[]args){

        /*
          the main method takes in 2 sample weights in pounds and using the above function
          converts them into kilograms and then returns the weights in their respective kg values
         */

        float x = 186.2f;
        float y = weights(x);

        System.out.println("Pounds: " + x);
        System.out.println("Kilograms: " + y);

        float z = 207.0f;
        float a = weights(z);

        System.out.println("Pounds: " + z);
        System.out.println("Kilograms: " + a);

        System.out.println("Total: " + (y+a));
    }// end of main
}//end of class