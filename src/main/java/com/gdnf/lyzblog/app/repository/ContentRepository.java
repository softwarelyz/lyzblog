package com.gdnf.lyzblog.app.repository;

import com.gdnf.lyzblog.app.entity.Content;
import com.gdnf.lyzblog.cores.repository.expand.ExpandJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hongbin on 17/3/6.
 */
@Repository
public interface ContentRepository extends ExpandJpaRepository<Content,Long> {


}
