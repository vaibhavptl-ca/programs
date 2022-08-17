package interview_prep;

public class BasicOperations {

    public static void main(String args[]){
    operations();
    }

    static void operations(){
        int a = 3, b =5 , c = 9, d = 11;
        int result;

        System.out.println(" ------ Basic Operations ------");
        //Adding 2 integers
        result = b + a;
        System.out.println("Sum is : "+ result);
        //Subtracting 2 integers
        result = d-b;
        System.out.println("Sub is : "+ result);
        //Multiplying 2 integers
        result = b*a;
        System.out.println("Mul is : "+ result);
        //Dividing 2 integers
        result = c/b;
        System.out.println("Div is : "+result);
        //Modulus of 2 integers
        result = d % a;
        System.out.println("Mod is : "+ result);

        System.out.println(" ------ Increment Operations ------");

        result = 0;
        //Incrementing operation
        result+= a;
        System.out.println("Incremented value for +=a is : " + result);
        result=+ b;
        System.out.println("Incremented value for =+b is : " + result);
        result+= c;
        System.out.println("Incremented value for +=c is : " + result);
        result=+ d;
        System.out.println("Incremented value for =+d is : " + result);
        result = 0;
        result = a++;
        System.out.println("Incremented value for a++ is : " + result);
        result = 0;
        result = ++a;
        System.out.println("Incremented value for ++a is : " + result);

        System.out.println(" ------ Decrement Operations ------");
        //Decrementing operation
        result-= a;
        System.out.println("Decremented value for -=a is : " + result);
        result=- b;
        System.out.println("Decremented value for =-b is : " + result);
        result-= c;
        System.out.println("Decremented value for -=c is : " + result);
        result=- d;
        System.out.println("Decremented value for -=d is : " + result);
        result = a--;
        System.out.println("Decremented value for a-- is : " + result);
        result = --a;
        System.out.println("Decremented value for --a is : " + result);



        System.out.println("----- Assignment Operators -----");
        //Modulus of 2 integers
        a = a % d;
        System.out.println("Mod is : "+ a);

        int k = ++a; //4
        System.out.println("Incremented value for ++a is : " + k);

        int l = a++; //5
        System.out.println("Incremented value for a++ is : " + l);

        System.out.println(" ----- Ternary Operator ------ ");

        int m = (a<=b)?(a+b) : (a-b);
        System.out.println(" Ternary value  "+ m);

        int n = (a>c)?(a+b) : (a-b);
        System.out.println(" Ternary value  "+ n);

    }


}
