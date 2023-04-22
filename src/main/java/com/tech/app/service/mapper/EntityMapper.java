package com.tech.app.service.mapper;

import java.util.List;

public interface EntityMapper<D, E>  {
    E toEntity(D dto);

    D toDTO(E entity);

    List<E> toEntity(List<D> dto);

    List<D> toDTO(List<E> entity);
}
