package entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "utilisateurs")
public class EntityUsers{


    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    private UUID uuid_users;

    private String pseudo_users;
    private int id_roles;
    private int id_perso;

}
