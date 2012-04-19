/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.service.impl;

import be.ugent.maf.cellmissy.entity.Treatment;
import be.ugent.maf.cellmissy.repository.TreatmentRepository;
import be.ugent.maf.cellmissy.service.TreatmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Paola
 */
@Service("treatmentService")
@Transactional
public class TreatmentServiceImpl implements TreatmentService {

    @Autowired
    private TreatmentRepository treatmentRepository;

    @Override
    public Treatment findById(Long id) {
        return treatmentRepository.findById(id);
    }

    @Override
    public List<Treatment> findAll() {
        return treatmentRepository.findAll();
    }

    @Override
    public Treatment save(Treatment entity) {
        return treatmentRepository.save(entity);
    }

    @Override
    public void delete(Treatment entity) {
        entity = treatmentRepository.save(entity);
        treatmentRepository.delete(entity);
    }
    
    @Override
    public List<Treatment> findByType(Integer treatmentType) {
        return treatmentRepository.findByType(treatmentType);
    }
}
