/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynhome.entity;


import dynhome.interfaces.IIdentity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author administration
 */
@Getter
@Setter
@Entity
@Table(name = "identities")
public class Identity implements Serializable, IIdentity {

    @Id
    @GeneratedValue
    private long id;
    private String token;
    private String email;
    private boolean valid;
}