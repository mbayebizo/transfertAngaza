package net.msapi.transfertangaza.models.cmm;

import javax.persistence.*;

@Table(name = "cmm_groupe")
@Entity
public class CmmGroupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grp_id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
