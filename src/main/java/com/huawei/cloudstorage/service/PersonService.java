package com.huawei.cloudstorage.service;

import java.util.List;

import com.huawei.cloudstorage.dal.modelDo.Person;

public interface PersonService {

    /**
     * person 查询所有
     * @return
     */
    List<Person> loadPersons();
}