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
}
