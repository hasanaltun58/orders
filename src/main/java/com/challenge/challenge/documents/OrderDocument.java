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
public class OrderDocument {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String orderNumber;

    @Field(type = FieldType.Nested,includeInParent = true)
    private CustomerDocument customer;


}
