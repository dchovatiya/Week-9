import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        String result;
        char grade;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        String name = s.nextLine();
        System.out.print("Enter Roll no: ");
        int rollNo = s.nextInt();
        System.out.print("Enter Maths marks:");
        int maths = s.nextInt();
        System.out.print("Enter English marks:");
        int english = s.nextInt();
        System.out.print("Enter Science marks:");
        int science = s.nextInt();
        double totalMarks = maths + english + science;
        double percentage = (totalMarks / 300) * 100;
        while(totalMarks>=0 || totalMarks<=300)
        {
            if(totalMarks>300)
            {
                System.out.println("Invalid input, Marks should be between 0 to 300.");
                break;
            }

            if (percentage >= 35) {
                result = "Pass";
            } else {
                result = "Fail";
            }
            if (percentage >= 80) {
                grade = 'A' + '+';
            } else if (percentage >= 60) {
                grade = 'A';
            } else if (percentage >= 50) {
                grade = 'B';
            } else {
                grade = 'C';
            }
            System.out.println("|--------------------------------------|");
            System.out.println("|         Mark Sheet                   |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Name:" + name + "                 \t   |");
            System.out.println("|    Roll No:" + rollNo + "    \t\t\t\t\t   |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Subjects: Marks                   |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Maths:" + maths + "         \t\t       |");
            System.out.println("|    Science:" + science + "    \t\t\t       |");
            System.out.println("|    English:" + english + "      \t\t\t       |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Total:" + totalMarks + "       \t\t\t       |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Percentage:" + percentage + "         |");
            System.out.println("|    Result:" + result + "       \t\t\t       |");
            System.out.println("|    Grade:" + grade + "       \t\t\t\t       |");
            System.out.println("|--------------------------------------|");
            break;
        }
    }
}
