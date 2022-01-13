package com.epam.model;


import lombok.*;

import java.util.*;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Insurance {

    private String id;

    private String name;

    private Date creation;

    public Visits operations() {
        Visits v = new Visits(new ArrayList<>());
        v.getItems();
        return v;
    }

    @Value
    static class Visits {
        List<Visits> items;
    }

}
