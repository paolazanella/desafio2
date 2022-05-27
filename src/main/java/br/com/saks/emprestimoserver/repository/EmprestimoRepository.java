package br.com.saks.emprestimoserver.repository;

import br.com.saks.emprestimoserver.model.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{
    
}
