package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IAgenceService;
import tn.esprit.autoloc.entities.Agence;

@RestController @AllArgsConstructor @RequestMapping("/agence")
public class AgenceRestController {
    IAgenceService agenceService;

    @PostMapping("/add")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.addAgence(agence);
    }

    @DeleteMapping("/delete/{idAgence}")
    public void deleteAgence(@PathVariable Long idAgence) {
        agenceService.deleteAgence(idAgence);
    }

    @PutMapping("/update/{idAgence}")
    public Agence updateAgence(@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }
}
