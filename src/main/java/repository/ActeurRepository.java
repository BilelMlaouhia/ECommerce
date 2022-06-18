package repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bilel.firstApp.entites.*;
public interface ActeurRepository extends JpaRepository<Acteur,Long>{
public List<Acteur> findByNomContainsIgnoreCase(String nom);
}
