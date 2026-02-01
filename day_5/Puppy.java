interface Animal {
    void sound();
}

class Dog {
    void eat() {
        System.out.println("Dog eats food");
    }
}

class Puppy extends Dog implements Animal {

    void show() {
        super.eat();
    }

    public void sound() {
        System.out.println("Puppy barks");
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.show();
        p.sound();
    }
}
