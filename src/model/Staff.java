package model;

public class Staff {
  private String name;
  private String age;
  private String address;
  private Long id;
  private String email;

  public Staff(String name, String age, String address, Long id, String email) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.id = id;
    this.email = email;
  }

  public Staff() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
