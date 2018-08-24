package io.project.model;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 *
 * @author Armen Arzumanyan
 */
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class UserRequest implements Serializable {

    private static final long serialVersionUID = 1L;        
     private Long userId;
    private Long companyId;
    private String email;
    private String companyName;

}
