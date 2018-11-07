package work.tomosse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import work.tomosse.entity.Score;

@Repository
public interface ScoreRepository extends JpaRepository<Score,Integer> {}