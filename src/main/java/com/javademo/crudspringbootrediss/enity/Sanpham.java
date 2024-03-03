package com.javademo.crudspringbootrediss.enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@AllArgsConstructor
@Data
@NoArgsConstructor
@RedisHash("Sanpham")
public class Sanpham {
    @Id
    private int id;
    private String name;
    private long price;
    private int ity;

}
