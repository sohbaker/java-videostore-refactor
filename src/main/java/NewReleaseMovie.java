public class NewReleaseMovie implements RentalType {
    public NewReleaseMovie(String title, int daysRented) {
        this.movieTitle = title;
        this.daysRented = daysRented;
    }

    public String getTitle() {
        return movieTitle;
    }

    public String getType() { return TYPE; }

    public int getDaysRented() {
        return daysRented;
    }

    public double getTotalRentalCost() {
        return getDaysRented() * 3;
    }

    private String movieTitle;
    private int daysRented;
    public static final String TYPE = "New Release";
}
