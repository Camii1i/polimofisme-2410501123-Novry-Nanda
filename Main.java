// Class induk
class Senjata {
    void serang() {
        System.out.println("Senjata menyerang dengan cara umum.");
    }
}

// Class turunan Pedang
class Pedang extends Senjata {
    @Override
    void serang() {
        System.out.println("Pedang menyerang, damage 80!");
    }
}

// Class turunan Busur
class Busur extends Senjata {
    @Override
    void serang() {
        System.out.println("Busur menyerang dari jauh, damage 60!");
    }
}

// Class turunan Tongkat
class Tongkat extends Senjata {
    @Override
    void serang() {
        System.out.println("Tongkat sihir menyerang, damage 90!");
    }
}

class Kapak extends Senjata {
    @Override
    void serang() {
        System.out.println("Kapak membelah musuh, damage 85!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Membuat objek
        Senjata s1 = new Pedang();
        Senjata s2 = new Busur();
        Senjata s3 = new Tongkat();
        Senjata s4 = new Kapak();

        // Memanggil method serang()
        s1.serang();
        s2.serang();
        s3.serang();
        s4.serang();
    }
}