package p.tuimapps.restapi.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String author;
    private String place;

}
