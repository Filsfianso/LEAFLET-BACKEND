package com.example.leafletbackend.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "arch_1004901")
public class Archive {
    @Id
    Date date;
    int id_device;
    double latitude;
    double longitude;
}
