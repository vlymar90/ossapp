package com.ossapp.mainapp.service;

import com.ossapp.mainapp.dto.RequestStyleDto;
import com.ossapp.mainapp.entities.Style;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StyleService {
    Style findById(Long id);

    Style save(RequestStyleDto requestStyleDto);

    Long deleteById(Long id);

    Style update(RequestStyleDto requestStyleDto, long id);

    List<Style> findAll();
}
