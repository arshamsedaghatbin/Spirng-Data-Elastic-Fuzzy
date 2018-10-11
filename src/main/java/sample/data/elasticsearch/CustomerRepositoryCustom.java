package sample.data.elasticsearch;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerRepositoryCustom {
     List<Customer> findFuzzyByFirstName(String firstName);
}