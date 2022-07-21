package laura.portfolio.musicdatabase.backend.model;

public class Genre {

    private Integer code;
    private String name;
    private String observations;

    public Genre(){

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", observations='" + observations + '\'' +
                '}';
    }
}
