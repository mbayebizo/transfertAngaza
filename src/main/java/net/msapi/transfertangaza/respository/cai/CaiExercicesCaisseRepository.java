package net.msapi.transfertangaza.respository.cai;



import net.msapi.transfertangaza.models.cai.CaiExercicesCaisse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CaiExercicesCaisseRepository extends JpaRepository<CaiExercicesCaisse, Long> {
    Optional<CaiExercicesCaisse> findFirstByOrderByIdDesc();

}
