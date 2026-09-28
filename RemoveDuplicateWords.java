import java.util.Scanner;
public class RemoveDuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        String result = "";
        for (String word : words) {
           if (!result.contains(word + " ")) {
                result += word + " ";
            }
        }
       System.out.println("After removing duplicate words:");
        System.out.println(result.trim());       
        sc.close();
    }
}
OUTPUT:
Enter a sentence: I LOVE TO BE STUDENT
After removing duplicate words:
I LOVE TO BE STUDENT
