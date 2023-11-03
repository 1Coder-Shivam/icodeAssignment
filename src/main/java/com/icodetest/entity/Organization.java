package com.icodetest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "organizations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organization {
    @Id
    private String id;
    private String name;
    private String address;
    private String registrationNumber;

    // Other organization properties, getters, and setters
}
