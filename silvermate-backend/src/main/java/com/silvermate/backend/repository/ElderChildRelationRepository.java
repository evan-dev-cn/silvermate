package com.silvermate.backend.repository;

import com.silvermate.backend.entity.ElderChildRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface ElderChildRelationRepository
        extends JpaRepository<ElderChildRelation, Long> {

    @Query("""
        select new map(
            u.userId as elderId,
            u.userName as elderName,
            u.age as age
        )
        from ElderChildRelation r
        join User u on r.elderId = u.userId
        where r.childId = :childId
          and r.status = 1
    """)
    List<Map<String, Object>> findEldersByChildId(@Param("childId") Long childId);
}
