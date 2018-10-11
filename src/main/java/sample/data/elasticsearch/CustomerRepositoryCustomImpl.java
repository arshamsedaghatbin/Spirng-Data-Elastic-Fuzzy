package sample.data.elasticsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;

import java.util.List;

public class CustomerRepositoryCustomImpl implements CustomerRepositoryCustom {
    @Autowired
    protected ElasticsearchTemplate elasticsearchTemplate;

    public List<Customer> findFuzzyByFirstName(String firstName) {
        Criteria c = new Criteria("firstName").fuzzy(firstName);
        return elasticsearchTemplate.queryForList(new CriteriaQuery(c), Customer.class);
    }
}