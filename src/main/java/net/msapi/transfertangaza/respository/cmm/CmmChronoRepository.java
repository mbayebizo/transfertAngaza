package net.msapi.transfertangaza.respository.cmm;




import net.msapi.transfertangaza.models.cmm.CmmChrono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CmmChronoRepository extends JpaRepository<CmmChrono, Long> {

    @Query("select chrono  from CmmChrono chrono where  chrono.chrPrive=0 " +
            " AND (chrono.chrNature BETWEEN 60 AND 69)" +
            " order by chrono.chrPeriode")
    List<CmmChrono> findListChronoCaissePublic();

    @Query("select chrono  from CmmChrono chrono where " +
            " (chrono.chrNature BETWEEN 60 AND 69)" +
            " order by chrono.chrPeriode")
    List<CmmChrono> findListChronoCaisseAll();

    Optional<CmmChrono> findByChrSerieAndChrNatureAndChrPeriodeOrderByChrIdDesc(String userChrSerie, Integer nature, String anne);

    Optional<CmmChrono> findByChrSerieAndChrNatureAndChrPeriodeIsNullOrderByChrIdDesc(String userChrSerie, Integer nature);

    Optional<CmmChrono> findByChrNatureAndChrPeriodeOrderByChrIdDesc(Integer nature, String anne);

    Optional<CmmChrono> findByChrNatureAndChrPeriodeIsNullOrderByChrIdDesc(Integer nature);

    Optional<CmmChrono> findByChrSerieAndChrNatureOrderByChrIdDesc(String usrchrSerie, Integer nature);

    List<CmmChrono> findByChrSerieAndChrNatureAndChrPeriode(String serie, Integer nature, String anneString);

    Optional<CmmChrono> findByChrCodeCaisseAndChrSerieAndChrNatureAndChrPeriode(String caisse, String serie, Integer nature, String anneString);

}
