package ex1;

public class ShipThread implements Runnable{
    private String name;
    private int countBox = 10;

    public ShipThread(String name, int countBox) {
        this.name = name;
        this.countBox = countBox;
    }

    public ShipThread() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountBox() {
        return countBox;
    }

    public void setCountBox(int countBox) {
        this.countBox = countBox;
    }

    @Override
    public void run() {
        while (this.countBox > 0) {
            this.setCountBox(getCountBox()-1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() +" has unloaded the box. Number of boxes on the ship = "+ this.getCountBox()+".");
        }
        System.out.println(this.getName() +" has finished unloading boxes.");
    }
}
