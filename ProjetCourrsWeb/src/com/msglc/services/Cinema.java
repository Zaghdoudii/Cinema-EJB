package com.msglc.services;

import java.util.Set;
import javax.ejb.Remote;
import com.msglc.model.Film;
import com.msglc.model.SalleProg;
import com.msglc.model.Seance;


@Remote
public interface Cinema {
	
    // Lister l'ensemble de films disponible au cinema.
    public Set<Film> list ();
     
    // Trouver les films correspondants au pattern donn� en entr�e.
    public Set<Film> findByPattern (String pattern);
     
    // Trouver un film � partir d'un id.
    public Film findFilm (int id);
    
    // R�server une s�ance pour un utilisateur.
    public void reserve (Seance seance, Utilisateur u)throws PlusDePlaceException, SoldeNegatifException, UserNotFoundException, SoldeNegatifException, SoldeInsuffisantException;
    
    public Set<SalleProg> getAllSalleProg ();
    public Film createFilm (String name);
    public void update (Film f);
    public float getTarif ();
}