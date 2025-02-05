package mapper;

public class DTO {
    private String name;

    public DTO(String name) {
        this.name = name;
    }

    public DTO(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
