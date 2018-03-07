package com.gdnf.lyzblog.app.repository;

import com.gdnf.lyzblog.app.entity.Relationships;
import com.gdnf.lyzblog.cores.repository.expand.ExpandJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hongbin on 17/3/6.
 */
@Repository
public interface RelationshipsRepository extends ExpandJpaRepository<Relationships,Long> {

    List<Relationships> findAllByCid(Long cid);

    List<Relationships> findAllByMid(Long mid);

    @Transactional
    void deleteByCidAndType(Long cid,String type);
    @Transactional
    void deleteByCid(Long cid);
}
