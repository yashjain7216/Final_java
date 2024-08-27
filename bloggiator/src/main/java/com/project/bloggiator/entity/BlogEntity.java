package com.project.bloggiator.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "blog_entries")
@Data
@NoArgsConstructor
public class BlogEntity {

    @Id
    private String id;
    @NonNull
    private String title;
    @NonNull
    private String content;
    private LocalDateTime date;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
