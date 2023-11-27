package StructuralDesignPatterns.Adapter;

public class Laptop {

    private final HDMI videoOutputHDMI;

    public Laptop(HDMI videoOutputHDMI) {
        this.videoOutputHDMI = videoOutputHDMI;
    }

    public void transferData() {
        this.videoOutputHDMI.transferDataHDMI("data");
    }

}
