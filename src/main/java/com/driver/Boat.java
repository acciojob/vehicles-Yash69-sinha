package com.driver;

public class Boat implements WaterVehicle{

   String name;
    int capacity;
    public Boat(){

    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
   public String getVehicleName(){
        return this.name;
   }

   @Override
   public int getVehicleCapacity(){
        return this.capacity;
   }


}
