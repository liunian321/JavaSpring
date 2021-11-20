package com.tds.ehiam.bean;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private String userName;
    private String gender;
    private String age;
    private List<String> address;
    private Map<String,Object> score;
    private String[] hobby;
}
