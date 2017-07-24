package FacadeMethod;

/**
 * Created by Jeremy on 2017/7/20.
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }


    public void startup(){
        System.out.println("Computer start up!");
        this.cpu.startup();
        this.disk.startup();
        this.memory.startup();
        System.out.println("Computer finish to start up!");
    }

    public void shutdown(){
        System.out.println("Computer shut down!");
        this.cpu.shutdown();
        this.memory.shutdown();
        this.disk.shutdown();
        System.out.println("Computer finish to shoudown!");
    }

}
