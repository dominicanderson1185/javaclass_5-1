package com.company;

public class Main {


    private String  name;
    private String city;
    private String eye_color;
    private Integer age;


    public Main(String name, String city, String eye_color, Integer age){
        this.name = name;
        this.city = city;
        this.eye_color = eye_color;
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEye_color() {
        return eye_color;
    }



   /* private Integer id_code;
    private String first_name;
    public theArray(Integer id_code, String first_name){
        this.id_code = id_code;
        this.first_name = first_name;
    }


    public String getFirst_name() {
        return first_name;
    }

    public Integer getId_code(){
        return id_code;
    }
*/
}
