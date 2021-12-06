package net.msapi.transfertangaza.respository.cmm;



import net.msapi.transfertangaza.models.cmm.CmmUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CmmUserRepository extends JpaRepository<CmmUser, Long> {
}
