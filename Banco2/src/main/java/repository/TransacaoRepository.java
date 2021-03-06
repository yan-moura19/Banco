package repository;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import model.Transacao;

public interface TransacaoRepository extends CrudRepository<Transacao, Long>{

	void save(Long idConta, double valor, LocalDate localDate);

}
