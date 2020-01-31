package com.lambton;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Start");
        int d =10;
        int n = 20;
        int a[] = new int[]{1,2,3};

        String s = null;

        try {
        int fraction = n/d;
            System.out.println("Fraction : " + fraction);
            System.out.println("Array Value : "+ a[2]);
         //   System.out.println("Array value : "+a[3]); //this will throw ArrayIndexOutOfBound exception

            System.out.println("Length os string : "+s.length());
        }
        catch (ArithmeticException e){
          //  System.out.println(e);
            System.out.println("Error : "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Error: "+e1.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("Error Null : "+e.toString());
        }
        catch (Exception e){
            System.out.println("Error other : "+e.toString());
        }

        finally {
            System.out.println("Finally block");
        }

        System.out.println("End");
    }
}
