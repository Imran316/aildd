package ttInfo;

/**
 *
 * @author imran
 */
public class Professor {
    public String id;
    public String profName;
    public String mobNo;

    public Professor() {
    }
    
    
    public Professor(String id, String profName, String mobNo) {
        this.id = id;
        this.profName = profName;
        this.mobNo = mobNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}