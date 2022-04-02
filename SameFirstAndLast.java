package proje2Asm;

import java.util.Scanner;

public class SameFirstAndLast {

   /*
    Given an array of ints, print true if the array is length 1 or more, and the first element and the last element are equal.
    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true
    print just true or false
    */
    /*
    Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse
     true değerini yazdırın.
    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true
    sadece  true veya false print et
    */

        public static void main(String[] args) {







            //  code start here
            // Koda burdan başlayin
/* kullanican alinan strink sayilari arraye cevirecegiz
if badisiyle arrayin 0. indeksiyle lenght -1. indeksinin equals methodu ile ayni olup olmadigini kontrol edecegiz.
 */
            Scanner scan=new Scanner(System.in);
            System.out.println("Lutfen Tam sayilar giriniz");
            String myStr= scan.nextLine();
            String[] useThisArray=myStr.split("");



            if (useThisArray[0].equals(useThisArray[useThisArray.length-1])) {
                System.out.println("True");

            } else {
                System.out.println("False");
            }





        }


    }