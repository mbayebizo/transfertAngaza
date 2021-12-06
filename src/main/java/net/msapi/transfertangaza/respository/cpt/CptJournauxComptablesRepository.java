package net.msapi.transfertangaza.respository.cpt;




import net.msapi.transfertangaza.models.cpt.CptJournauxComptables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CptJournauxComptablesRepository extends JpaRepository<CptJournauxComptables, Long> {

    @Query("from CptJournauxComptables where pljInactif=0 and execptId=:execptId and pljCode not in :code and pljReserve=0  order by pljCode asc ")
    List<CptJournauxComptables> listJournauxComptablefitreCodeReserveActive(@Param("execptId") Long execptId, @Param("code") String code);

    @Query("from CptJournauxComptables where pljInactif=0 and execptId=:execptId and pljCode not in :code order by pljCode asc ")
    List<CptJournauxComptables> listJournauxComptablefiltreCodeActive(@Param("execptId") Long execptId, @Param("code") String code);

    @Query("from CptJournauxComptables where pljInactif=0 and execptId=:execptId and pljReserve=0  order by pljCode asc ")
    List<CptJournauxComptables> listJournauxComptableReserveActive(@Param("execptId") Long execptId);

    @Query("from CptJournauxComptables where pljInactif=0 and execptId=:execptId  order by pljCode asc ")
    List<CptJournauxComptables> listJournauxComptableActive(@Param("execptId") Long execptId);
}
