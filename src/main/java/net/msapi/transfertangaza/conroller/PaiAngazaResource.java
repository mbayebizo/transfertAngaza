package net.msapi.transfertangaza.conroller;


import net.msapi.transfertangaza.models.PaiAngaza;
import net.msapi.transfertangaza.respository.PaiAngazaRepository;
import net.msapi.transfertangaza.service.PaiAngazaService;
import net.msapi.transfertangaza.service.ResponseWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class PaiAngazaResource {

    private final Logger log = LoggerFactory.getLogger(PaiAngazaResource.class);

    private static final String ENTITY_NAME = "paiAngaza";


    private final PaiAngazaService paiAngazaService;

    public PaiAngazaResource(PaiAngazaService paiAngazaService, PaiAngazaRepository paiAngazaRepository) {
        this.paiAngazaService = paiAngazaService;
    }


    @GetMapping
    public ResponseEntity<List<PaiAngaza>> getAllPaiAngazas() {
        log.debug("REST request to get a page of PaiAngazas");
        List<PaiAngaza> l = paiAngazaService.findAll();
        return ResponseEntity.ok().body(l);
    }

    /**
     * {@code GET  /pai-angazas/:id} : get the "id" paiAngaza.
     *
     * @param id the id of the paiAngaza to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the paiAngaza, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/{id}")
    public ResponseEntity getPaiAngaza(@PathVariable Long id) {
        log.debug("REST request to get PaiAngaza : {}", id);
        ResponseWrapper<PaiAngaza> response =paiAngazaService.findOne(id);

        if (response.isStatus()) {
            return ResponseEntity.ok(response.getEntite());
        } else {
            return ResponseEntity.badRequest().body(response.getMessage());
        }
    }

}
