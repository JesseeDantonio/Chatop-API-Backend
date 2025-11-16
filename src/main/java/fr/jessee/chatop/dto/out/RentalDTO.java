package fr.jessee.chatop.dto.out;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RentalDTO {
    private Long id;
    private String name;
    private Double surface;
    private Double price;
    private String picture;
    private String description;
    private Long ownerId;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
}
