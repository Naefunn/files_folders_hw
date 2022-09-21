package com.codeclan.filesandfolders.filesservice.repositories;
import com.codeclan.filesandfolders.filesservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
