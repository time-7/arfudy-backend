package com.arfudy.backend.repository;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arfudy.backend.entity.Ingrediente;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface IngredienteRepository extends JpaRepository<Ingrediente, Integer> {

//    @Query(nativeQuery = true,
//            value = "select * from ingrediente as i\n"
//                    + "join ingrediente_prato ip\n"
//                    + "on ip.id_ingrediente = i.id_ingrediente\n"
//                    + "where ip.id_prato in (:id_prato_list)")
//    List<Ingrediente> findByIdPrato(@Param("id_prato_list") List<Integer> idPratoList);

}
