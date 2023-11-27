package StructuralDesignPatterns.Adapter;

public class HDMItoVGAAdapter implements HDMI{

    private final VGA VGADevice;

    public HDMItoVGAAdapter(VGA VGADevice) {
        this.VGADevice = VGADevice;
    }

    @Override
    public void transferDataHDMI(String data) {
        System.out.println("Converting HDMI to VGA...");
        this.VGADevice.transferDataVGA(data);
    }
}
