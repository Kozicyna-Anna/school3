package ru.hogwarts.school3.model;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String color;

}
