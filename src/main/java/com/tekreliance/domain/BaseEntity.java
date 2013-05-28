package com.tekreliance.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * User: Jamshid Asatillayev
 * Date: 5/23/13
 * Time: 11:18 AM
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
