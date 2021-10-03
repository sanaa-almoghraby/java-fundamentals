package lab6;

public class Review {
    private String body;
    private  String author;
    private int numStar;

    public Review(String body, String author, int numStar) {
        this.body = body;
        this.author = author;
        if( numStar >= 0 && numStar <= 5)
            this.numStar=numStar;
        else
            if(numStar>5)

        this.numStar = 5;

        else
            this.numStar =0;
    }

    public int getNumStar() {
        return this.numStar;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numStar=" + numStar +
                '}';
    }
}
