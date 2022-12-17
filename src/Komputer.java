public class Komputer extends Elektronik {
    private int memory;
    private int monitor;

    @Override
    public String namaBarang() {
        return "Komputer";
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMonitor() {
        return monitor;
    }

    public void setMonitor(int monitor) {
        this.monitor = monitor;
    }
}