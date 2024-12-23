package ue.edu.co.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ue.edu.co.models.SolicitudModel;

@Repository
public interface SolicitudRepository extends CrudRepository<SolicitudModel, Long> {
    List<SolicitudModel> findByEstado(String estado);
}