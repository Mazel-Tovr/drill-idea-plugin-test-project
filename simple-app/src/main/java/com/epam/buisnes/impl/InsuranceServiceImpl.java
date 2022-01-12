package com.epam.buisnes.impl;

import com.epam.buisnes.*;
import com.epam.model.*;
import org.springframework.stereotype.*;


import java.util.*;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    @Override
    public Insurance generate() {
        return new Insurance("1", "GG", new Date());
    }

    @Override
    public Insurance build() {
        return Insurance.builder().id("1").name("OSAGO").build();
    }
}
