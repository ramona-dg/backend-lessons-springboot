package nl.novi.hallo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NameController {

    //attribute
    private List<String> names = new ArrayList<>();

    //constructor
    public NameController() {
        names.add("Johan");
        names.add("Ben");
        names.add("Felien");
        names.add("Sarah");
    }

    @GetMapping(value = "/names")
    @ResponseStatus (HttpStatus.OK)
    public List<String> getNames() {
        return names;
    }

    @GetMapping(value = "/names/{id}")
    @ResponseStatus (HttpStatus.OK)
    public String getNames(@PathVariable int id) {
        return names.get(id);
    }

    @DeleteMapping(value = "/names/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
     public String deleteNames(@PathVariable int id) {
         names.remove(id);
        return "Name removed";
    }

    @PostMapping(value = "/names")
    @ResponseStatus (HttpStatus.ACCEPTED)
        public String addName(@RequestBody String name){
            names.add(name);
        return"Added!";
    }
}
