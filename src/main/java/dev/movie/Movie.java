package dev.movie;

import dev.reviews.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

// this class represents each entry in the movies collection
@Document(collection = "movies")
// init getters,setters and toString
@Data
// init constructor
@AllArgsConstructor
// init no args constructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster; // image link
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference // force database to store Review IDs
    private List<Review> reviewIds; //List of Reviews for each movie
}
