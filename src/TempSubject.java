import java.util.ArrayList;
import java.util.Date;

public class TempSubject {
    public int tempState;
    public int sensorID=0;
    public String location;
    public String lastTechnicalRevision;
    public float metrologicalPrecision;

    public TempSubject(int initialTemp,
                       String location,
                       String lastTechnicalRevision,
                       float metrologicalPrecision){
        this.tempState=initialTemp;
        this.location = location;
        this.lastTechnicalRevision = lastTechnicalRevision;
        this.metrologicalPrecision = metrologicalPrecision;
    }

    public TempSubject(int initialTemp,
                       int sensorID,
                       String location,
                       String lastTechnicalRevision,
                       float metrologicalPrecision){
        this.tempState=initialTemp;
        this.sensorID = sensorID;
        this.location = location;
        this.lastTechnicalRevision = lastTechnicalRevision;
        this.metrologicalPrecision = metrologicalPrecision;
    }
}
