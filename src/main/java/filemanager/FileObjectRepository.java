package filemanager;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alexey Smolyaninov
 */
public interface FileObjectRepository extends JpaRepository<FileObject, Long>{
    
}
