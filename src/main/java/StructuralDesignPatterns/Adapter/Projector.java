package StructuralDesignPatterns.Adapter;

public class Projector implements VGA {

    @Override
    public void transferDataVGA(String data) {
        System.out.println("Transferring data through VGA: " + data);
    }
}
