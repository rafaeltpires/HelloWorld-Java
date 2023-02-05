public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("Hello, Rafa");

        boolean isAlien = false;
        if (isAlien == false)
        {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100)
        {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100))
        {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90))
        {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50)
        {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar)
        {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic)
        {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        // my solution
        double a = 20d;
        double b = 80d;
        double c = ( a + b ) * 100.00d;
        double d = c % 40.00d;
        boolean isZero = ( d == 0 ) ? true : false ;
        System.out.println ( isZero );
        if (!isZero) {
            System.out.println("Got Some remainder");
        }

        // professor solution
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = ( myFirstValue + mySecondValue ) * 100.00d;
        System.out.println("myvaluesTotal = " + myValuesTotal);
        double theRemainder = myFirstValue % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = ( theRemainder == 0 ) ? true : false ;
        System.out.println ( isNoRemainder );
        if (!isNoRemainder) {
            System.out.println("Got Some remainder");
        }

    }
}
