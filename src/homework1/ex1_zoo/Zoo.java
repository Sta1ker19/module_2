package homework1.ex1_zoo;

import homework1.ex1_zoo.animal.Animal;

public class Zoo <A extends Animal> {
    private A animal1;
    private A animal2;
    private A animal3;

    public Zoo(A animal1, A animal2, A animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public A getAnimal1() {
        return animal1;

    }

    public A getAnimal2() {
        return animal2;
    }

    public A getAnimal3() {
        return animal3;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animal1=" + animal1 +
                ", animal2=" + animal2 +
                ", animal3=" + animal3 +
                '}';
    }
}