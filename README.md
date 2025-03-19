# Java Rastgele Şifre Oluşturucu

## Genel Bakış
Bu Java programı, belirlenen kriterlere uygun rastgele bir şifre oluşturan bir algoritma içermektedir. Program aşağıdaki karakter türlerini kullanarak 8 haneli bir şifre üretir:

- **Büyük harfler (A-Z)**
- **Küçük harfler (a-z)**
- **Rakamlar (0-9)**
- **Özel karakterler (!, #, $, %, &, , . , *, +, -, ?, @, £, / vb.)**

Her şifre, her bir kategoriden en az bir karakter içerecek şekilde oluşturulur.

## Fonksiyonlar

### 1. `randomSpecialCharacter()`
Rastgele bir özel karakter döndürür.

### 2. `randomDigit()`
Rastgele bir rakam (0-9) döndürür.

### 3. `randomUppercaseLetter()`
Rastgele bir büyük harf (A-Z) döndürür.

### 4. `randomLowercaseLetter()`
Rastgele bir küçük harf (a-z) döndürür.

## Çalıştırma Talimatları

1. `Main.java` dosyasını Java projenize ekleyin.
2. Aşağıdaki komutlarla kodu derleyip çalıştırın:
   ```sh
   javac Main.java
   java Main
   ```
3. Program, 8 karakter uzunluğunda rastgele bir şifre oluşturup ekrana yazdıracaktır.

## Lisans
Bu proje **MIT Lisansı** altında lisanslanmıştır. Serbestçe kullanılabilir, değiştirilebilir ve dağıtılabilir.

## Yazar
- **Murat Can Sevük**

