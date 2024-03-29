package testgroup.todospringapi.models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;


@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NonNull
    private String description;
    private boolean status=true;
    @NonNull
    private LocalDateTime openTask;
    private LocalDateTime closeTask;


}
