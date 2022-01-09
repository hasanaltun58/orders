package com.challenge.challenge.dao;

import com.challenge.challenge.documents.OrderDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hasanAltun
 */

@Repository
public interface OrderDao extends ElasticsearchRepository<OrderDocument,String> {
}
