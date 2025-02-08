package InterviewCompany.InsightGeeks2;

public class CharPattern {
    
        public static void main(String[] args) {
            char ch = 'A'; // Start with the character 'A'
    
            // Upper part of the diamond
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
    }
    