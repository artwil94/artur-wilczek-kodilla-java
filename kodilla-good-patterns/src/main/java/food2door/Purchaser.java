package food2door;

public class Purchaser {

    private String firstName;
    private String lastName;
    private String address;

    public Purchaser(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Purchaser purchaser = (Purchaser) o;

        if (!firstName.equals(purchaser.firstName)) return false;
        if (!lastName.equals(purchaser.lastName)) return false;
        return address.equals(purchaser.address);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }
}
