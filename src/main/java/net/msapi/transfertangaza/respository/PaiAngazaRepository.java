package net.msapi.transfertangaza.respository;


import net.msapi.transfertangaza.models.PaiAngaza;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data SQL repository for the PaiAngaza entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PaiAngazaRepository extends JpaRepository<PaiAngaza, Long> {
    Optional<PaiAngaza> findByAccountNumberAndAccountQidAndAngazaTransactionQidAndMsisdnAndQid(int accountNumber, String accountQid, String angazaTransactionQid, String msisdn, String qid);
    List<PaiAngaza> findByEtatOrderByEffectiveDateDesc(int etat);

    Page<PaiAngaza> findByEtatOrderByEffectiveDateAsc(Integer etat, Pageable pageable);

}
