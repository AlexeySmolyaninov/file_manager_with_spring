package filemanager;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author Alexey Smolyaninov
 */
@Entity
@Data
public class FileObject extends AbstractPersistable<Long>{
    
    private String name;
    private Long contentLength;
    private String contentType;
    
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] content;
}
