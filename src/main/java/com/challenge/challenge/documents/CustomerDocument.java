package com.challenge.challenge.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Id;

/**
 * @author hasanAltun
 */

@Data
@Document(indexName = "challenge")
@AllArgsConstructor
public class CustomerDocument {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Text)
    private String email;

    @Field(type = FieldType.Integer)
    private int age;
}
