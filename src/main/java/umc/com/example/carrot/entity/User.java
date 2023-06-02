package umc.com.example.carrot.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name="users")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String mobile_number;

    @Column(nullable = false)
    private int activated;

    private String rating_score;

    @Builder
    public User(String mobile_number, int activated, String rating_score){
        this.mobile_number = mobile_number;
        this.activated = activated;
        this.rating_score = rating_score;
    }

    public void update(String mobile_number, int age, String rating_score) {
        this.mobile_number = mobile_number;
        this.activated = activated;
        this.rating_score = rating_score;
    }
}