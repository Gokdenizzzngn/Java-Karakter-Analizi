# 🔤 Java Cümle ve Karakter Analiz Uygulaması

Bu proje, kullanıcının belirlediği karakter sınırı içinde bir cümle alan, isteğe bağlı büyük/küçük harf duyarlılığı seçeneği sunan ve seçilen karakterin cümle içinde kaç defa geçtiğini hesaplayan modüler bir Java konsol uygulamasıdır.

---

## 🚀 Özellikler

- **Maksimum karakter ve cümle kontrolü:** Kullanıcı tarafından belirlenen maksimum karakter uzunluğunu doğrular ve sınırı aşan girdileri reddeder.
- **Büyük/Küçük Harf Duyarlılığı:** Harf sayımı yapılırken duyarlılığın (Case-sensitivity) açık veya kapalı olması seçilebilir.
- **Güvenli Girdi Yönetimi:** Pozitif sayı, geçerli cevap ve tek karakter doğrulama adımlarıyla kullanıcı hatalarını önler.
- **Modüler Kod Yapısı:** Tek Sorumluluk İlkesine (Single Responsibility Principle) uygun ayrı fonksiyonlar (`methods`) kullanılmıştır.

---

## 🛠️ Teknolojiler ve Gereksinimler

- **Dil:** Java (OpenJDK 27)
- **IDE:** IntelliJ IDEA
- **Kütüphaneler:** Standart Java Kütüphaneleri (`java.util.Scanner`)

---

## 💻 Kurulum ve Çalıştırma

### 1. Depoyu Klonlayın ve çalıştırın
```bash
git clone https://github.com/Gokdenizzzngn/Java-Karakter-Analizi.git
cd Java-Karakter-Analizi
javac src/Question1.java
java -cp src Question1
