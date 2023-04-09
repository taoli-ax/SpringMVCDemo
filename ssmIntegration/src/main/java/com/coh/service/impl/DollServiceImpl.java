package com.coh.service.impl;

import com.coh.dao.DollDao;
import com.coh.pojo.Doll;
import com.coh.pojo.DollExample;
import com.coh.service.DollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@Transactional

public class DollServiceImpl implements DollService {
    @Autowired
    private DollDao dao;

    @Override
    public List<Doll> login(Doll doll) {
        DollExample dollExample=new DollExample();
        DollExample.Criteria criteria=dollExample.createCriteria();
        criteria.andNameEqualTo(doll.getName());
        criteria.andAgeEqualTo(doll.getAge());
        return dao.selectByExample(dollExample);
    }
}
