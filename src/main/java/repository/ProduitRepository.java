package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bilel.firstApp.entites.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
