package streamapi;

public class Employee {

    private int eid;
    private String ename;
    private String edpt;
    private int esalary;

    public Employee(int eid, String ename, String edpt, int esalary) {
        this.eid = eid;
        this.ename = ename;
        this.edpt = edpt;
        this.esalary = esalary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEdpt() {
        return edpt;
    }

    public void setEdpt(String edpt) {
        this.edpt = edpt;
    }

    public int getEsalary() {
        return esalary;
    }

    public void setEsalary(int esalary) {
        this.esalary = esalary;
    }

    @Override
    public String toString() {
        return "Employee [edpt=" + edpt + ", eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((edpt == null) ? 0 : edpt.hashCode());
        result = prime * result + eid;
        result = prime * result + ((ename == null) ? 0 : ename.hashCode());
        long temp;
        temp = Double.doubleToLongBits(esalary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (edpt == null) {
            if (other.edpt != null)
                return false;
        } else if (!edpt.equals(other.edpt))
            return false;
        if (eid != other.eid)
            return false;
        if (ename == null) {
            if (other.ename != null)
                return false;
        } else if (!ename.equals(other.ename))
            return false;
        if (Double.doubleToLongBits(esalary) != Double.doubleToLongBits(other.esalary))
            return false;
        return true;
    }
    
    
    
}
