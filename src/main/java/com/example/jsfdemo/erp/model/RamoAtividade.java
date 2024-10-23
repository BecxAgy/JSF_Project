package com.example.jsfdemo.erp.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="ramo_atividade")
public class RamoAtividade implements Serializable {

    private static final long serialVersionUID = 1L ;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
