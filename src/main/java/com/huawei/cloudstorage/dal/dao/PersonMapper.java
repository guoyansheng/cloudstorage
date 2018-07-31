package com.huawei.cloudstorage.dal.dao;

import java.util.List;

import com.huawei.cloudstorage.dal.modelDo.Person;

public interface PersonMapper {
    /**
     * 插入
     * @param person
     */
    void insert(Person person);
    
    /**
     * 查询所有
     * @return
     */
    List<Person> queryAll();
}