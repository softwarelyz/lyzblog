package com.gdnf.lyzblog.app.repository;

import com.gdnf.lyzblog.app.entity.Attach;
import com.gdnf.lyzblog.cores.repository.expand.ExpandJpaRepository;
import com.gdnf.lyzblog.cores.repository.parameter.Operator;
import com.gdnf.lyzblog.cores.repository.parameter.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

/**
 * Created by hongbin on 17/3/6.
 */
@Repository
public interface AttachRepository extends ExpandJpaRepository<Attach,Long> {

    @Override
    Page<Attach> findAll(Iterable<Predicate> predicates, Operator operator, Pageable pageable);


    Attach findOne(Long aLong);
}
