package com.gb.DanismanPortal.repository;

import com.gb.DanismanPortal.entity.Job;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

public interface JobRepository extends JpaAttributeConverter<Job, Integer> {
}
