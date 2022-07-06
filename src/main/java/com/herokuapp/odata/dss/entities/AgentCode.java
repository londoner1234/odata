package com.herokuapp.odata.dss.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table(name="agent_codes")
public class AgentCode {

	@Id
	private Integer id;

	private String AccountId;

	private String UserId;

	private String AgentCode;
}
