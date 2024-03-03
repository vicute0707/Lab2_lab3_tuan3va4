package com.javademo.crudspringbootrediss.repostory;

import com.javademo.crudspringbootrediss.enity.Sanpham;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Sanphamrepo extends CrudRepository<Sanpham,Integer> {

}
