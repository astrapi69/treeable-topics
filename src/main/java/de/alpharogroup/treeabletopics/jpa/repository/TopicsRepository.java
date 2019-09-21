package de.alpharogroup.treeabletopics.jpa.repository;

import de.alpharogroup.treeabletopics.jpa.entity.Topics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicsRepository extends JpaRepository<Topics, Integer>
{
}