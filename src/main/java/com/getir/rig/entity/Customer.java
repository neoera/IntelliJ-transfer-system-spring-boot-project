package com.getir.rig.entity;

import com.getir.rig.entity.base.GenericEntity;
import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="CUSTOMER")
@Audited
public class Customer implements GenericEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerSequence")
    @SequenceGenerator(sequenceName = "CUSTOMER_SEQ", allocationSize = 1, name = "customerSequence")
    @Column(name = "CUSTOMER_ID", updatable = false, nullable = false)
    private Long customerId;

    @Column(name="NAME", length=50, nullable=false)
    private String name;

    @Column(name="SURNAME", length=50, nullable=false)
    private String surname;

    @Column(name="PHONE")
    private String phone;

    @Column(name="EMAIL", length=50, nullable=false)
    private String email;

    @Column(name="CREATE_DATE", nullable=false)
    private Date createDate;

    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private Set<Address> addresses = new HashSet<>();*/

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();

}