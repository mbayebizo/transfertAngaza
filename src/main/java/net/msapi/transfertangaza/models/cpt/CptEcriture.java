package net.msapi.transfertangaza.models.cpt;

import javax.persistence.*;

@Table(name = "cpt_ecritures")
@Entity
public class CptEcriture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ecr_id", nullable = false)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
