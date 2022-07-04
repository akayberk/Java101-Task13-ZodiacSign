import java.util.Scanner;
public class ChineseZodiacSign {
    public static void main(String[] args) {
        /*
        this program aims to solve a specific problem link below:
        https://app.patika.dev/courses/java101/odev-cin-zodyagi
        The Problem:
        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        Doğum Tarihi %12 = 0 ➜ Maymun
        Doğum Tarihi %12 = 1 ➜ Horoz
        Doğum Tarihi %12 = 2 ➜ Köpek
        Doğum Tarihi %12 = 3 ➜ Domuz
        Doğum Tarihi %12 = 4 ➜ Fare
        Doğum Tarihi %12 = 5 ➜ Öküz
        Doğum Tarihi %12 = 6 ➜ Kaplan
        Doğum Tarihi %12 = 7 ➜ Tavşan
        Doğum Tarihi %12 = 8 ➜ Ejderha
        Doğum Tarihi %12 = 9 ➜ Yılan
        Doğum Tarihi %12 = 10 ➜ At
        Doğum Tarihi %12 = 11 ➜ Koyun


         */
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your year of birth?     ");
        int yearOfBirth = scan.nextInt();
        if (yearOfBirth>0&&yearOfBirth<=2022){
            int mod = yearOfBirth%12;
            switch (mod){
                case 0:
                    System.out.println("Your Zodiac Sign is: Monkey");
                    break;
                case 1:
                    System.out.println("Your Zodiac Sign is: Cock");
                    break;
                case 2:
                    System.out.println("Your Zodiac Sign is: Dog");
                    break;
                case 3:
                    System.out.println("Your Zodiac Sign is: Pig");
                    break;
                case 4:
                    System.out.println("Your Zodiac Sign is: Mouse");
                    break;
                case 5:
                    System.out.println("Your Zodiac Sign is: Ox");
                    break;
                case 6:
                    System.out.println("Your Zodiac Sign is: Tiger");
                    break;
                case 7:
                    System.out.println("Your Zodiac Sign is: Rabbit");
                    break;
                case 8:
                    System.out.println("Your Zodiac Sign is: Dragon");
                    break;
                case 9:
                    System.out.println("Your Zodiac Sign is: Snake");
                    break;
                case 10:
                    System.out.println("Your Zodiac Sign is: Horse");
                    break;
                case 11:
                    System.out.println("Your Zodiac Sign is: Sheep");
                    break;

            }
        }
        else{
            System.out.println("Year of birth can not be lower or equal than 0 and bigger than " +
                    "2022!");
        }
    }
}
