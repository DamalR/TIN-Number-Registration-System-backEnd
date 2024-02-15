package org.example.service;

import org.example.dto.Persion;
import org.example.entity.PersionEntity;

import java.util.List;

public interface persionService {
    void add(Persion persion);
    List<PersionEntity> getPersion();
    Boolean deletePersion(Long id);
    Persion getPersionById(Long id);
}
