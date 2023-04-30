package com.mtorresvalls.practica3pat.controller;


import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtorresvalls.practica3pat.service.Form;

@RestController
@RequestMapping("/api")
public class FormController {

    private FormServiceImpl formServiceImpl = new FormServiceImpl();
    private ArrayList<Form> forms = new ArrayList<>(); 
    
    @GetMapping("/getForms")
    public ResponseEntity<ArrayList<Form>> getForm(){        
        return new ResponseEntity<>(formServiceImpl.getForms(), HttpStatus.OK);
    }

    @GetMapping("/addNewForm/nombre={nombre}/email={email}/mensaje={mensaje}")
    public ResponseEntity<HttpStatus> addForm(@PathVariable String nombre, @PathVariable String email, @PathVariable String mensaje){
        System.out.println(nombre + email + mensaje);
        if (nombre != null && email != null && mensaje != null){
            forms = formServiceImpl.getForms();

            Form form = new Form(nombre, email, mensaje);
            form.setId(forms.size());

            formServiceImpl.addForm(form);
        
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/deleteForm/param={parametro}")
    public ResponseEntity<HttpStatus> deleteForm(@PathVariable String parametro){
        System.out.println(parametro);
        if (parametro != null){
            formServiceImpl.deleteForm(parametro); 

            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
