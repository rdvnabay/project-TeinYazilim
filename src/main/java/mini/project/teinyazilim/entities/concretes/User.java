package mini.project.teinyazilim.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "name_surname",length = 50,nullable = false)
    private String nameSurname;

    @Column(name = "phone_number",length = 11,nullable = false)
    private int phoneNumber;

    @Column(name = "email",length = 100)
    private String email;

    @Column(name = "password",nullable = false)
    //todo: min 8 max 32 charackter
    private String password;
}
