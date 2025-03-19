import java.util.*;

public class Main {
    static Random random = new Random();

    static String randomSpecialCharacter() {
        String[] specialCharacters = {"!", "#", "$", "%", "&", ",", ".", "*", "+", "-", "?", "@", "£", "/"};
        int index = random.nextInt(specialCharacters.length);
        return specialCharacters[index];
    }

    static String randomDigit() {
        int digit = random.nextInt(10); // 0-9 arasındaki rakamlar
        return String.valueOf(digit);
    }

    static String randomUppercaseLetter() {
        int asciiCode = random.nextInt(26) + 65; // A-Z arasındaki büyük harfler
        char letter = (char) asciiCode;
        return String.valueOf(letter);
    }

    static String randomLowercaseLetter() {
        int asciiCode = random.nextInt(26) + 97; // a-z arasındaki küçük harfler
        char letter = (char) asciiCode;
        return String.valueOf(letter);
    }

    public static void main(String[] args) {
        int categoryUsageCount[] = {0, 0, 0, 0}; // Her kategori (özel karakter, rakam, büyük harf, küçük harf) için kullanım sayacı
        String password[] = new String[8]; // 8 karakterli şifre dizisi
        boolean isPasswordComplete = false;

        // Şifreye tüm kategorilerden en az birer karakter ekleyene kadar döngü
        while (!isPasswordComplete) {
            int randomCategory = random.nextInt(4); // 4 kategori arasından rastgele seçim
            int randomIndex = random.nextInt(8); // Şifrede rastgele bir indeks seç
            if (password[randomIndex] == null) { // Eğer o indeks boşsa
                if (randomCategory == 0 && categoryUsageCount[0] == 0) {
                    categoryUsageCount[0] = 1;
                    password[randomIndex] = randomSpecialCharacter();
                } else if (randomCategory == 1 && categoryUsageCount[1] == 0) {
                    categoryUsageCount[1] = 1;
                    password[randomIndex] = randomDigit();
                } else if (randomCategory == 2 && categoryUsageCount[2] == 0) {
                    categoryUsageCount[2] = 1;
                    password[randomIndex] = randomUppercaseLetter();
                } else if (randomCategory == 3 && categoryUsageCount[3] == 0) {
                    categoryUsageCount[3] = 1;
                    password[randomIndex] = randomLowercaseLetter();
                }
            }

            // Tüm kategoriler kullanıldı mı diye kontrol et
            int usedCategories = 0;
            for (int i = 0; i < 4; i++) {
                if (categoryUsageCount[i] == 1) {
                    usedCategories++;
                }
            }
            if (usedCategories == 4) {
                isPasswordComplete = true;
            }
        }

        // Şifrenin kalan kısımlarını tamamla
        boolean isPasswordFullyFilled = false;
        while (!isPasswordFullyFilled) {
            int randomCategory = random.nextInt(4);
            int randomIndex = random.nextInt(8);
            if (password[randomIndex] == null) {
                if (randomCategory == 0) password[randomIndex] = randomSpecialCharacter();
                else if (randomCategory == 1) password[randomIndex] = randomDigit();
                else if (randomCategory == 2) password[randomIndex] = randomUppercaseLetter();
                else if (randomCategory == 3) password[randomIndex] = randomLowercaseLetter();
            }

            // Şifre tamamen doldu mu diye kontrol et
            int filledSlots = 0;
            for (int i = 0; i < 8; i++) {
                if (password[i] != null) filledSlots++;
            }
            if (filledSlots == 8) {
                isPasswordFullyFilled = true;
            }
        }

        // Şifreyi birleştir
        String generatedPassword = "";
        for (int i = 0; i < 8; i++) {
            generatedPassword += password[i];
        }

        System.out.println("Oluşturulan şifre = " + generatedPassword);
    }
}
