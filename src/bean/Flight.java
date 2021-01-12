package bean;

public class Flight {
    private String id;//主键
    private String flightId;//航班Id
    private String planeType;//机型
    private String departureAirPort;//起点机场
    private String departureTime;//目的机场

    public Flight(String flightId, String planeType, String departureAirPort, String departureTime) { this.flightId = flightId;
        this.planeType = planeType;
        this.departureAirPort = departureAirPort;
        this.departureTime = departureTime;
    }

    public String getId() {
        return id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
