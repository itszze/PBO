package Praktikum.PraktikumPBO.Perkuliahan_Sesi_12;

// Interface Phone
interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}

// Kelas Xiaomi
class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50; // Default volume
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi mati...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
            }
            System.out.println("Volume Xiaomi: " + volume);
        } else {
            System.out.println("Xiaomi mati, tidak bisa menaikkan volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
            }
            System.out.println("Volume Xiaomi: " + volume);
        } else {
            System.out.println("Xiaomi mati, tidak bisa menurunkan volume.");
        }
    }
}

// Kelas iPhone
class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone mati...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
            }
            System.out.println("Volume iPhone: " + volume);
        } else {
            System.out.println("iPhone mati, tidak bisa menaikkan volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
            }
            System.out.println("Volume iPhone: " + volume);
        } else {
            System.out.println("iPhone mati, tidak bisa menurunkan volume.");
        }
    }
}

// Kelas Samsung
class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung mati...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
            }
            System.out.println("Volume Samsung: " + volume);
        } else {
            System.out.println("Samsung mati, tidak bisa menaikkan volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
            }
            System.out.println("Volume Samsung: " + volume);
        } else {
            System.out.println("Samsung mati, tidak bisa menurunkan volume.");
        }
    }
}

// Kelas Oppo
class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Oppo() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Oppo menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Oppo mati...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
            }
            System.out.println("Volume Oppo: " + volume);
        } else {
            System.out.println("Oppo mati, tidak bisa menaikkan volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
            }
            System.out.println("Volume Oppo: " + volume);
        } else {
            System.out.println("Oppo mati, tidak bisa menurunkan volume.");
        }
    }
}

// Kelas PhoneUser
class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        phone.powerOn();
    }

    public void turnOffThePhone() {
        phone.powerOff();
    }

    public void makePhoneLouder() {
        phone.volumeUp();
    }

    public void makePhoneSilent() {
        phone.volumeDown();
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        Phone xiaomi = new Xiaomi();
        Phone iPhone = new iPhone();
        Phone samsung = new Samsung();
        Phone oppo = new Oppo();

        PhoneUser user = new PhoneUser(xiaomi);
        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();

        System.out.println();

        user = new PhoneUser(iPhone);
        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();

        System.out.println();

        user = new PhoneUser(samsung);
        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();

        System.out.println();

        user = new PhoneUser(oppo);
        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();
    }
}
