package oppositenumber;

public class OppositeNumber {
    public  int findOppositeOf(int number) {

        if(number == Integer.MIN_VALUE) {
            throw new ArithmeticException("InValid integer number");
        }

//        if(number >= 0) {
//            number =  number - (Math.abs(number)  * 2 );
//        } else {
//            number =  number + (Math.abs(number) * 2);
//        }
//        return number;
        return Math.negateExact(number);
    }
}
