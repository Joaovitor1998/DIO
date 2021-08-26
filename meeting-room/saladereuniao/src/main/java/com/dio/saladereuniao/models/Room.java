package com.dio.saladereuniao.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_meetingroom")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "startHour", nullable = false)
    private String startHour;

    @Column(name = "endHour", nullable = false)
    private String endHour;

    @Override
    public String toString(){
        String str = String.format("Room: [id = %d, name = %s, startHour = %s, endHour = %s]",
                this.id, this.name, this.startHour, this.endHour);
        return str;
    }
}
