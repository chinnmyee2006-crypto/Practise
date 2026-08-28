class Animal {
    void play() {
        System.out.println("Animal is playing");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void play() {
        System.out.println("Dog is playing with a ball");
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();

        d.play();
        d.sound();
    }
}