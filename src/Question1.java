import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Metodları sırasıyla çağırarak değerleri alıyoruz
        int maxLimit = getMaxLimit(scanner);
        String sentence = getSentence(scanner, maxLimit);
        boolean isCaseSensitive = getCaseSensitivity(scanner);
        char searchChar = getSearchChar(scanner);

        // Karakter sayısını hesaplama metodunu çağırıyoruz
        int count = countWord(sentence, searchChar, isCaseSensitive);

        System.out.println("Girilen cümlede '" + searchChar + "' harfi toplamda " + count + " defa geçmektedir.");

        scanner.close();

    }

    // 1. Kullanıcıdan maksimum pozitif karakter sayısı alma
    public static int getMaxLimit(Scanner scanner) {
        while (true) {
            System.out.print("Maksimum karakter sayısı belirleyin: ");
            if (scanner.hasNextInt()) {
                int limit = scanner.nextInt();
                scanner.nextLine(); // Buffer temizleme
                if (limit > 0) return limit;
            } else {
                scanner.nextLine();
            }
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        }
    }

    // 2. Kullanıcıdan cümle alma ve uzunluk kontrolü
    public static String getSentence(Scanner scanner, int maxLimit) {
        while (true) {
            System.out.print("Lütfen bir cümle girin: ");
            String sentence = scanner.nextLine();
            if (sentence.length() <= maxLimit) {
                return sentence;
            }
            System.out.println("Girilen cümle belirlenen sınırı (" + maxLimit + " karakter) aşıyor! Lütfen tekrar giriniz.");
        }
    }

    // 3. Büyük/Küçük harf duyarlılığı tercihi
    public static boolean getCaseSensitivity(Scanner scanner) {
        while (true) {
            System.out.print("Büyük/küçük harf duyarlılığı aktif olsun mu? (Evet/Hayır): ");
            String response = scanner.nextLine().trim();
            if (response.equalsIgnoreCase("Evet")) {
                return true;
            } else if (response.equalsIgnoreCase("Hayır")) {
                return false;
            } else {
                System.out.println("Lütfen geçerli bir cevap giriniz.");
            }
        }
    }

    // 4. Kullanıcıdan analiz edilecek karakteri alma
    public static char getSearchChar(Scanner scanner) {
        while (true) {
            System.out.print("Analiz etmek için bir harf girin: ");
            String charInput = scanner.nextLine();
            if (charInput.trim().length() == 1) {
                return charInput.trim().charAt(0);
            } else {
                System.out.println("Geçerli bir karakter giriniz.");
            }
        }
    }

    // 5. Verilen karakterin cümle içinde kaç kere geçtiğini hesaplama
    public static int countWord(String sentence, char searchChar, boolean isCaseSensitive) {
        int count = 0;
        String processedSentence = isCaseSensitive ? sentence : sentence.toLowerCase();
        char processedChar = isCaseSensitive ? searchChar : Character.toLowerCase(searchChar);

        for (int i = 0; i < processedSentence.length(); i++) {
            if (processedSentence.charAt(i) == processedChar) {
                count++;
            }
        }
        return count;
    }
}