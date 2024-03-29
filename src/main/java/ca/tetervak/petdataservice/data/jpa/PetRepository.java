package ca.tetervak.petdataservice.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200/")
public interface PetRepository extends JpaRepository<Pet, Integer> {
}
