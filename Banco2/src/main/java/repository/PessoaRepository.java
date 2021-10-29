package repository;

import org.springframework.data.repository.CrudRepository;

import model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

}
