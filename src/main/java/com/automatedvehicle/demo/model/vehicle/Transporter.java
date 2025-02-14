package com.automatedvehicle.demo.model.vehicle;

import com.automatedvehicle.demo.model.vertex.Vertex;

import lombok.Data;

@Data
public class Transporter{
    private Vertex vertex;
    private long prevTime;

    public void move(Vertex dest, int length){
        
    }
}
