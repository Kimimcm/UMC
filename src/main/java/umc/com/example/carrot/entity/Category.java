package umc.com.example.carrot.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;


    @Builder
    public Category(String name){
        this.name=name;
    }
    public void update(String name) {
        this.name=name;
    }
}
