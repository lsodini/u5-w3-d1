package LucaSodini.repositories;

import LucaSodini.entities.Dipendente;
import LucaSodini.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PrenotazioniRepository extends JpaRepository<Prenotazione, UUID> {
    boolean existsByDipendenteAndDataRichiesta(Dipendente dipendente, LocalDate data);
    Optional<Prenotazione> findById(UUID id);
}

