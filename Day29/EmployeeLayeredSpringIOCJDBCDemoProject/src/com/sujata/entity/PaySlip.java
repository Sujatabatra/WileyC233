package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaySlip {

	private Employee employee;
	private double hr;
	private double pf;
	private double da;
	private double totalSalary;
}
