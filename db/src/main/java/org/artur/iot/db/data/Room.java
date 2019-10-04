package org.artur.iot.db.data;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Room {
    @Id
    private String sensorId;
    private String room;
    private double target;
    private double temperature;
    private int power;
    private boolean heating;
    @ElementCollection
    private List<Double> history;
    private Floorplan floorplan;

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) {
        this.target = target;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isHeating() {
        return heating;
    }

    public void setHeating(boolean heating) {
        this.heating = heating;
    }

    public List<Double> getHistory() {
        return history;
    }

    public void setHistory(List<Double> history) {
        this.history = history;
    }

    public Floorplan getFloorplan() {
        return floorplan;
    }

    public void setFloorplan(Floorplan floorplan) {
        this.floorplan = floorplan;
    }

}
