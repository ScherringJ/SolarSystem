package spring.rest.solarsystemservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import spring.rest.solarsystemservice.dao.PlaneteRepository;
import spring.rest.solarsystemservice.model.Planete;

@RestController
@CrossOrigin("http://localhost:9999/")
public class PlaneteController {

    @Value("${me}")
    private String me;

    @Autowired
    private PlaneteRepository dao;

    @GetMapping(value = "/Planete")
    public Iterable<Planete> getLesPlantes() {
        System.out.println("Hello");
        return dao.findAll();
    }

    @GetMapping(value = "/Planete/{id}")
    public Planete getPlanete(@PathVariable("id") int id) {
        return dao.findById(id);
    }

    @DeleteMapping(value = "/Planete/{id}")
    public void deletePlanete(@PathVariable("id") int id) {
        dao.deleteById(id);
    }

    @PostMapping(value = "/Planete")
    public void addPlanete(@RequestBody Planete planete) {
        if (planete.valide()) {
            dao.save(planete);
        }
    }

    @PutMapping(value = "/Planete/{id}")
    public void updatePlanete(@RequestBody Planete planete, @PathVariable("id") int id) {
        Planete planete1 = this.getPlanete(id);
        planete1.setName(planete.getName());
        planete1.setDiscovery(planete.getDiscovery());
        planete1.setType(planete.getType());
        if (planete1.valide()) {
            dao.save(planete1);
        }
    }

    @GetMapping(value = "/Cestqui")
    public String getName() {
        return me;
    }

}
