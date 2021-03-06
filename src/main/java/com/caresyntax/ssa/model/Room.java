package com.caresyntax.ssa.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ROOM")
@Getter
@Setter
@NoArgsConstructor
public class Room implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer Id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ROOM_NUMBER")
    private Integer roomNumber;
}
