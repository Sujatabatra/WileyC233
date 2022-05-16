package com.sujata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Husband {
	@Id
	private int husbandId;
	private String husbandName;
	@OneToOne
	private Wife wife;
	

}
