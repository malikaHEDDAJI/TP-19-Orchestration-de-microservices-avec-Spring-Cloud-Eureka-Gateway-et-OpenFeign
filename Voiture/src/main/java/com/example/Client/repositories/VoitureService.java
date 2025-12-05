package com.example.Client.repositories;

import com.example.Client.entities.Voiture;
import java.util.List;

public interface VoitureService {

    Voiture enregistrerVoiture(Voiture voiture);

    Voiture trouverParId(Long id);

    List<Voiture> trouverParClient(Long clientId);

    List<Voiture> trouverToutes();

    Voiture mettreAJour(Long id, Voiture voiture);
}
