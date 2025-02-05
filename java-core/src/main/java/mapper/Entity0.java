package mapper;

public class Entity0 {
    private long id;
    private String name;
    private int nums;
    private String spec;

    public Entity0(long id, String name, int nums, String spec) {
        this.id = id;
        this.name = name;
        this.nums = nums;
        this.spec = spec;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
}
