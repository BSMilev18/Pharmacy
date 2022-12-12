public class Medicine {
    String name;
    double price;
    int count;
    String expirationDate;

    public Medicine(String name, double price, int count, String expirationDate) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", Price=" + price +
                ", Count=" + count +
                ", ExpirationDate='" + expirationDate + '\'';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
