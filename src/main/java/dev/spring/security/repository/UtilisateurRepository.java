package dev.spring.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.spring.security.entite.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

	Optional<Utilisateur> findByNomUtilisateur(String nomUtilisateur);
}