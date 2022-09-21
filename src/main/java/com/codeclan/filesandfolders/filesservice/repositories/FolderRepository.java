package com.codeclan.filesandfolders.filesservice.repositories;

import com.codeclan.filesandfolders.filesservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
