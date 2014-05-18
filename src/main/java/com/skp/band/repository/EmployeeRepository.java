package com.skp.band.repository;

import com.skp.band.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * User: hyungwook.noh@sk.com
 * Date: 2014. 3. 27.
 */
public interface EmployeeRepository extends PagingAndSortingRepository<EmployeeEntity,Integer>, JpaSpecificationExecutor<EmployeeEntity> {

}
