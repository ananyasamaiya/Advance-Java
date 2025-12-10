package models;

public enum Status{
    INACTIVE(1,"Inactive"), ACTIVE(2,"Active"), BLOCKED(3,"Blocked"), CLOSED(4,"Closed");
 
    Status(int statusId,String name){
        this.statusId = statusId;
        this.name = name; 
    }
    private Integer statusId;
    private String name;
    
    public Integer getStatusId() {
        return statusId;
    }
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    
}