import java.util.Scanner;
/**
 * Read four numbers (N1, N2, N3, N4), which one with 1 digit after the decimal point, 
 * corresponding to 4 scores obtained by a student. 
 * Calculate the average with weights 2, 3, 4 e 1 respectively, 
 * for these 4 scores and print the message "Media: " (Average), followed by the calculated result. 
 * If the average was 7.0 or more, 
 *      print the message "Aluno aprovado." (Approved Student). 
 * If the average was less than 5.0, 
 *      print the message: "Aluno reprovado." (Reproved Student). 
 * If the average was between 5.0 and 6.9, including these, 
 *      the program must print the message "Aluno em exame." (In exam student).
 * in case of exam, read one more score. 
 * Print the message "Nota do exame: " (Exam score) followed by the typed score. 
 * Recalculate the average (sum the exam score with the previous calculated average and divide by 2) 
 * and print the message 
 *      “Aluno aprovado.” (Approved student) in case of average 5.0 or more) 
 *      or "Aluno reprovado." (Reproved student) in case of average 4.9 or less. 
 * For these 2 cases (approved or reproved after the exam) print the message 
 *      "Media final: " (Final average) followed by the final average for this student in the last line.
 */
public class P1040{
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        double N1 = s.nextDouble()*2;
        double N2 = s.nextDouble()*3;
        double N3 = s.nextDouble()*4;
        double N4 = s.nextDouble();
        double avg = (N1+N2+N3+N4)/10;
        System.out.printf("Media: %.1f\n",avg);
        if (avg > 6.9){
            System.out.println("Aluno aprovado.");
        } else if(avg < 5){
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double exam = s.nextDouble();
            System.out.printf("Nota do exame: %.1f\n",exam);
            double fAvg = (exam + avg)/2;
            if (fAvg > 4.9){
                System.out.println("Aluno aprovado.");
            } else System.out.println("Aluno reprovado.");
            System.out.printf("Media final: %.1f\n",fAvg);
        }
        s.close();
    }
}