package dev.reviews;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// entry in review colleciton
@Document(collection = "reviews")
// init getters and setters
@Data
// init constructor with all arguments and no arguments
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id // init as unique identifier
    private ObjectId id;
    private String body; // review body

    // create custom constructor that takes only the review body
    public Review(String body){
        this.body = body;
    }
}
