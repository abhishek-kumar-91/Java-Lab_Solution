public class eachCharCount{

   
        public static void main(String[] args) {
            String input = "Hello, World!";
            int[] frequency = countCharacterFrequency(input);
    
            System.out.println("Character Frequency:");
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] > 0) {
                    char c = (char) i;
                    System.out.println("'" + c + "': " + frequency[i]);
                }
            }
        }
    
        public static int[] countCharacterFrequency(String str) {
            int[] frequency = new int[256]; // Assuming ASCII characters
    
            for (char c : str.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    frequency[c]++;
                }
            }
    
            return frequency;
        }
    }
    
