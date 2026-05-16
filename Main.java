class Senjata {
    void serang() {
        System.out.println("Senjata menyerang dengan cara umum.");
    }
}

class Pedang extends Senjata {
    @Override
    void serang() {
        System.out.println("Pedang menyerang, damage 80!");
    }
}

class Busur extends Senjata {
    @Override
    void serang() {
        System.out.println("Busur menyerang dari jauh, damage 60!");
    }
}

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

public class Main {
    public static void main(String[] args) {

        Senjata s1 = new Pedang();
        Senjata s2 = new Busur();
        Senjata s3 = new Tongkat();
        Senjata s4 = new Kapak();

        s1.serang();
        s2.serang();
        s3.serang();
        s4.serang();
    }
}