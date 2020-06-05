package com.assegd.demos.exceptionhandling;

public class ExceptionHandlingMultipleCatchBlocksDemo {
    public static void main(String[] args) {
        try {

            int b[] = null;
            b[4] = 8; // Expecting NPE but since it is not handled then it will directly go to Exception catch
            int a[] = new int[5];
            a[4] = 8;
            //a[6] = 10; // Expecting ArrayIndexOutOfBoundsException

            //int i = 9 / 0; // expecting ArthimeticExceptoin
            int i = 8 / 4;
         //} catch (ArithmeticException | ArrayIndexOutOfBoundsException e){ // To display same message for multiple catches
         //       System.out.println("Error ");
         //   }
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit... ");
        }catch (Exception e){
            System.out.println("Something went Wrong");
        }finally {
            System.out.println("Bye"); // this will be printed either u have error or not
        }
    }
}
