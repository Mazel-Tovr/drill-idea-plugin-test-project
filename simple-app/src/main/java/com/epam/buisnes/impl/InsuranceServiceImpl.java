package com.epam.buisnes.impl;

import com.epam.buisnes.*;
import com.epam.model.*;
import org.springframework.stereotype.*;


import java.util.*;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    @Override
    public Insurance generate() {
        Insurance insurance = new Insurance("1", "GG", new Date());
        insurance.setName("insurance");
        insurance.getName();
        insurance.operations();
        return insurance;
    }

    @Override
    public Insurance build() {
        return Insurance.builder().id("1").name("OSAGO").build();
    }
}
