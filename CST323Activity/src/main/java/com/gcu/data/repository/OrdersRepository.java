package com.gcu.data.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.gcu.data.entity.OrderEntity;

public interface OrdersRepository extends CrudRepository<OrderEntity, Long> {

    @Override
    @Query(value = "SELECT * FROM ORDERS", nativeQuery = true)
    List<OrderEntity> findAll();

}

