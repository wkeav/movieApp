package com.Astra.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class movie {
    //unique identifier 
    @Id
    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate; 

    private String trailerLink;

    private String poster;

    private List<String> genres; 

    private List<String> backdrops; 

}

