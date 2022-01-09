package com.challenge.challenge.dao;

import com.challenge.challenge.documents.CustomerDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hasanAltun
 */

@Repository
public interface CustomerDao extends ElasticsearchRepository<CustomerDocument,String> {
}
