package com.example.demo.entity;


import com.example.demo.model.Equipment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="meetingroom")
public class RoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "equipmentId")
    private EquipmentEntity equipmentEntity;

    @NotNull(message = "Null Field : name" )
    @Column(name = "name")
    private String name;

    @NotNull(message = "Null Field : date" )
    @Column(name = "date")
    private LocalDate date;

    @NotNull(message = "Null Field : starHour" )
    @Column(name = "startHour", nullable = false)
    private LocalTime startHour;

    @NotNull(message = "Null Field : endHour" )
    @Column(name = "endHour", nullable = false)
    private LocalTime endHour;

}
