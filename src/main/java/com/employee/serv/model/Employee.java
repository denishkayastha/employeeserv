
package com.employee.serv.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Employee
 * <p>
 * Employee Pojo
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "dob",
    "address"
})
@Entity
@Table(name="employee")
public class Employee {

    /**
     * The unique identifier for an employee.
     * 
     */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
    @JsonPropertyDescription("The unique identifier for an employee.")
    private Integer id;
    /**
     * Name of employee
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of employee")
    @NotNull
    private String name;
    /**
     * Data of birth of employee
     * (Required)
     * 
     */
    @JsonProperty("dob")
    @JsonPropertyDescription("Data of birth of employee")
    @NotNull
    private String dob;
    /**
     * Address
     * <p>
     * Employee address.
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("Employee address.")
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "address_id")
    @NotNull
    private Address address;

    /**
     * The unique identifier for an employee.
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * The unique identifier for an employee.
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Name of employee
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of employee
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Data of birth of employee
     * (Required)
     * 
     */
    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    /**
     * Data of birth of employee
     * (Required)
     * 
     */
    @JsonProperty("dob")
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * Address
     * <p>
     * Employee address.
     * (Required)
     * 
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * Address
     * <p>
     * Employee address.
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Employee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("dob");
        sb.append('=');
        sb.append(((this.dob == null)?"<null>":this.dob));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.dob == null)? 0 :this.dob.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Employee) == false) {
            return false;
        }
        Employee rhs = ((Employee) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.dob == rhs.dob)||((this.dob!= null)&&this.dob.equals(rhs.dob))));
    }

}
