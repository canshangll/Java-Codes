package org.example.entity;

import lombok.*;

/*@Setter
@Getter*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private int id;
    private String name;
    private int age;
}
