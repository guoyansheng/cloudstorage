package com.huawei.cloudstorage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.cloudstorage.dal.dao.PersonMapper;
import com.huawei.cloudstorage.dal.modelDo.Person;
import com.huawei.cloudstorage.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> loadPersons() {
        return personMapper.queryAll();
    }

}