package net.msapi.transfertangaza.models.cmm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cmm_chrono_nature")
public class CmmChronoNature  {
    @Id
    private Integer code;
    private String libelle;
    private String typeNature;
}
