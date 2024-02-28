import java.util.ArrayList;
import java.util.Date;

public class TempSubject {
    public int tempState;
    public int sensorID;
    public String location;
    public Date lastTechnicalRevision;
    public float metrologicalPrecision;

    public TempSubject(int initialTemp,
                       int sensorID,
                       String location,
                       Date lastTechnicalRevision,
                       float metrologicalPrecision){
        this.tempState=initialTemp;
        this.sensorID = sensorID;
        this.location = location;
        this.lastTechnicalRevision = lastTechnicalRevision;
        this.metrologicalPrecision = metrologicalPrecision;
    }
}
