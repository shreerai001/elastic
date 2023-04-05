package demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo.customer.OriginLocation;

import java.util.Date;

public class Flight {
    @JsonProperty("FlightNum")
    public String flightNum;
    @JsonProperty("DestCountry")
    public String destCountry;
    @JsonProperty("OriginWeather")
    public String originWeather;
    @JsonProperty("OriginCityName")
    public String originCityName;
    @JsonProperty("AvgTicketPrice")
    public double avgTicketPrice;
    @JsonProperty("DistanceMiles")
    public double distanceMiles;
    @JsonProperty("FlightDelay")
    public boolean flightDelay;
    @JsonProperty("DestWeather")
    public String destWeather;
    @JsonProperty("Dest")
    public String dest;
    @JsonProperty("FlightDelayType")
    public String flightDelayType;
    @JsonProperty("OriginCountry")
    public String originCountry;
    public int dayOfWeek;
    @JsonProperty("DistanceKilometers")
    public double distanceKilometers;
    public Date timestamp;
    @JsonProperty("DestLocation")
    public DestLocation destLocation;
    @JsonProperty("DestAirportID")
    public String destAirportID;
    @JsonProperty("Carrier")
    public String carrier;
    @JsonProperty("Cancelled")
    public boolean cancelled;
    @JsonProperty("FlightTimeMin")
    public double flightTimeMin;
    @JsonProperty("Origin")
    public String origin;
    @JsonProperty("OriginLocation")
    public OriginLocation originLocation;
    @JsonProperty("DestRegion")
    public String destRegion;
    @JsonProperty("OriginAirportID")
    public String originAirportID;
    @JsonProperty("OriginRegion")
    public String originRegion;
    @JsonProperty("DestCityName")
    public String destCityName;
    @JsonProperty("FlightTimeHour")
    public double flightTimeHour;

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getDestCountry() {
        return destCountry;
    }

    public void setDestCountry(String destCountry) {
        this.destCountry = destCountry;
    }

    public String getOriginWeather() {
        return originWeather;
    }

    public void setOriginWeather(String originWeather) {
        this.originWeather = originWeather;
    }

    public String getOriginCityName() {
        return originCityName;
    }

    public void setOriginCityName(String originCityName) {
        this.originCityName = originCityName;
    }

    public double getAvgTicketPrice() {
        return avgTicketPrice;
    }

    public void setAvgTicketPrice(double avgTicketPrice) {
        this.avgTicketPrice = avgTicketPrice;
    }

    public double getDistanceMiles() {
        return distanceMiles;
    }

    public void setDistanceMiles(double distanceMiles) {
        this.distanceMiles = distanceMiles;
    }

    public boolean isFlightDelay() {
        return flightDelay;
    }

    public void setFlightDelay(boolean flightDelay) {
        this.flightDelay = flightDelay;
    }

    public String getDestWeather() {
        return destWeather;
    }

    public void setDestWeather(String destWeather) {
        this.destWeather = destWeather;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getFlightDelayType() {
        return flightDelayType;
    }

    public void setFlightDelayType(String flightDelayType) {
        this.flightDelayType = flightDelayType;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public double getDistanceKilometers() {
        return distanceKilometers;
    }

    public void setDistanceKilometers(double distanceKilometers) {
        this.distanceKilometers = distanceKilometers;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public DestLocation getDestLocation() {
        return destLocation;
    }

    public void setDestLocation(DestLocation destLocation) {
        this.destLocation = destLocation;
    }

    public String getDestAirportID() {
        return destAirportID;
    }

    public void setDestAirportID(String destAirportID) {
        this.destAirportID = destAirportID;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public double getFlightTimeMin() {
        return flightTimeMin;
    }

    public void setFlightTimeMin(double flightTimeMin) {
        this.flightTimeMin = flightTimeMin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public OriginLocation getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(OriginLocation originLocation) {
        this.originLocation = originLocation;
    }

    public String getDestRegion() {
        return destRegion;
    }

    public void setDestRegion(String destRegion) {
        this.destRegion = destRegion;
    }

    public String getOriginAirportID() {
        return originAirportID;
    }

    public void setOriginAirportID(String originAirportID) {
        this.originAirportID = originAirportID;
    }

    public String getOriginRegion() {
        return originRegion;
    }

    public void setOriginRegion(String originRegion) {
        this.originRegion = originRegion;
    }

    public String getDestCityName() {
        return destCityName;
    }

    public void setDestCityName(String destCityName) {
        this.destCityName = destCityName;
    }

    public double getFlightTimeHour() {
        return flightTimeHour;
    }

    public void setFlightTimeHour(double flightTimeHour) {
        this.flightTimeHour = flightTimeHour;
    }

    public int getFlightDelayMin() {
        return flightDelayMin;
    }

    public void setFlightDelayMin(int flightDelayMin) {
        this.flightDelayMin = flightDelayMin;
    }

    @JsonProperty("FlightDelayMin")
    public int flightDelayMin;

    @Override
    public String toString() {
        return "Flight{" +
                "flightNum='" + flightNum + '\'' +
                ", destCountry='" + destCountry + '\'' +
                ", originWeather='" + originWeather + '\'' +
                ", originCityName='" + originCityName + '\'' +
                ", avgTicketPrice=" + avgTicketPrice +
                ", distanceMiles=" + distanceMiles +
                ", flightDelay=" + flightDelay +
                ", destWeather='" + destWeather + '\'' +
                ", dest='" + dest + '\'' +
                ", flightDelayType='" + flightDelayType + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", dayOfWeek=" + dayOfWeek +
                ", distanceKilometers=" + distanceKilometers +
                ", timestamp=" + timestamp +
                ", destLocation=" + destLocation +
                ", destAirportID='" + destAirportID + '\'' +
                ", carrier='" + carrier + '\'' +
                ", cancelled=" + cancelled +
                ", flightTimeMin=" + flightTimeMin +
                ", origin='" + origin + '\'' +
                ", originLocation=" + originLocation +
                ", destRegion='" + destRegion + '\'' +
                ", originAirportID='" + originAirportID + '\'' +
                ", originRegion='" + originRegion + '\'' +
                ", destCityName='" + destCityName + '\'' +
                ", flightTimeHour=" + flightTimeHour +
                ", flightDelayMin=" + flightDelayMin +
                '}';
    }
}
