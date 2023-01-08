package background;

/**
 *
 * @author TRAN VAN TRI
 */
public class sourceOFmilktea {

    private String name;
    private String type;
    private double cost;
    private int num;

    public sourceOFmilktea() {

    }

    public int getNum() {
        return num;
    }

    public void setnum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public sourceOFmilktea(String name, String type, double cost, int num) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.num = num;

    }

}
