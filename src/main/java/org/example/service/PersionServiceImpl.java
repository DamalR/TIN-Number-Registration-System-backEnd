package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.Persion;
import org.example.entity.PersionEntity;
import org.example.repository.PersionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersionServiceImpl implements persionService{
    final PersionRepository repository;
    ModelMapper mapper;
    @Bean
    public void setUp(){
        this.mapper = new ModelMapper();
    }

    @Override
    public void add(Persion persion) {
        PersionEntity entity = mapper.map(persion, PersionEntity.class);
        repository.save(entity);
    }

    @Override
    public List<PersionEntity> getPersion() {
        return (List<PersionEntity>) repository.findAll();
    }

    @Override
    public Boolean deletePersion(Long id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Persion getPersionById(Long id) {
        Optional<PersionEntity> byId = repository.findById(id);
        return mapper.map(byId, Persion.class);
    }
}
