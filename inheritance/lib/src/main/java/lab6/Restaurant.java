package lab6;

import java.util.HashSet;
import java.util.Set;

public class Restaurant {

    private String name;
    private int numStar;
    private String priceCategory;
    private Set<Review> reviews;


    public Restaurant(String name, String priceCategory ) {
        this.name = name;
        this.numStar = 0;
        this.priceCategory = priceCategory;
        reviews = new HashSet<>();

    }

    public void addRive(Review review) {
        reviews.add(review);
        starcounter();
    }

    private void starcounter() {
        int stars = 0;
        for (Review review : this.reviews) {
            stars += (review.getNumStar());
        }
        this.numStar = stars / this.reviews.size();
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numStar=" + numStar +
                ", priceCategory='" + priceCategory + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    //    private String getReviews() {
//        String restaurantRev = "";
//        for (Review review : this.reviews) {
//            restaurantRev += restaurantRev;
//        }
//        return restaurantRev.toString();
//
//    }

    private String getReviews() {
        StringBuilder restaurantReviews = new StringBuilder();
        for (Review review : this.reviews) {
            restaurantReviews.append(review.toString());
        }
        return restaurantReviews.toString();
    }
}
