package dev.movie;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// specify to MongoRepository the Object and unique dd
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // method to filter by imdbId using automatic queries
    Optional<Movie> findMovieByImdbId(String imdbId);

}
