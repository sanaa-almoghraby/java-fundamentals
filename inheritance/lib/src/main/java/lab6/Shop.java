package lab6;

import java.util.HashSet;
import java.util.Set;

public class Shop implements UserReriw {
    private String name;
    private String description;
    private String price;
    private int stars;
    Set<Review> reviews;

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stars = 0;
        this.reviews = new HashSet<>();;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    private void calculateStars() {
        int stars = 0;

        for (Review review : this.reviews) {
            stars += review.getNumStar();
        }

        this.stars = stars / this.reviews.size();
    }

    private String getReviews() {
        StringBuilder storeReviews = new StringBuilder();
        for (Review review : this.reviews) {
            storeReviews.append(review.toString());
        }
        return storeReviews.toString();
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", stars=" + stars +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public void addRive(Review review) {
        reviews.add(review);
        calculateStars();

    }
}
