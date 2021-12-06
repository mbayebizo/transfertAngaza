package net.msapi.transfertangaza.respository.cmm;



import net.msapi.transfertangaza.models.cmm.CmmTier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CmmTiersRepository extends JpaRepository<CmmTier, Long> {
    CmmTier findByTieCompte0(String tieCompte0);

}
