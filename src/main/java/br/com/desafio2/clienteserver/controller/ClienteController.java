/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.desafio2.clienteserver.controller;

import br.com.desafio2.clienteserver.model.Cliente;
import br.com.desafio2.clienteserver.repository.ClienteRepository;
import java.security.MessageDigest;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Paola Zanella
 */
@RestController
@RequestMapping("/clientes")
public class ClienteController {
          @Autowired
    private ClienteRepository clienteRepository;
    
    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }
    
    @GetMapping(value="/{id}")
    public Optional<Cliente> listarPeloId(@PathVariable Long id) {
        return clienteRepository.findById(id);
    }
       
    @PostMapping
    public Cliente adicionar(@RequestBody Cliente cliente) {
        cliente.setSenha(Cripto(cliente.getSenha()));
        return clienteRepository.save(cliente);
    }
    
    @PutMapping(value="/{id}")
    public ResponseEntity editar(@PathVariable Long id, @RequestBody Cliente cliente) {
        return clienteRepository.findById(id)
                .map(record -> {
                    record.setNome(cliente.getNome());
                    record.setEmail(cliente.getEmail());
                    record.setSenha(Cripto(cliente.getSenha()));
                    Cliente clienteUpdated = clienteRepository.save(record);
                    return ResponseEntity.ok().body(clienteUpdated);
                }).orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping(value="/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
        return clienteRepository.findById(id)
                .map(record-> {
                    clienteRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
      private String Cripto (String senha) {
                  
        try {
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            String senhahex;
                      senhahex = hexString.toString();
                      senha= senhahex;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO NA CRIPTO DO CLIENTE"+ e);
        }
        
        
        return senha;
    } 
}