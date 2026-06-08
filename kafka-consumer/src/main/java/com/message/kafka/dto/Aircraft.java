package com.message.kafka.dto;

public class Aircraft {

    public String aircraftModel;
    public String aircraftType;
    public String airlinesCompany;

    public Aircraft(){

    }
    
    public Aircraft(String aircraftModel, String aircraftType, String airlinesCompany){
        this.aircraftModel = aircraftModel;
        this.aircraftType = aircraftType;
        this.airlinesCompany = airlinesCompany;
    }

    public String getAircraftModel() {
        return aircraftModel;
    }
    public void setAircraftModel(String aircraftModel) {
        this.aircraftModel = aircraftModel;
    }
    public String getAircraftType() {
        return aircraftType;
    }
    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }
    public String getAirlinesCompany() {
        return airlinesCompany;
    }
    public void setAirlinesCompany(String airlinesCompany) {
        this.airlinesCompany = airlinesCompany;
    }

    @Override
    public String toString() {
        return "Aircraft [aircraftModel=" + aircraftModel + ", aircraftType=" + aircraftType + ", airlinesCompany="
                + airlinesCompany + "]";
    }

}
