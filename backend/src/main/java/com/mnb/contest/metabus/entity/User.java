package com.mnb.contest.metabus.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

  @Id
  private String id;

  private String password;

  private String photoSpotName;

  private String coordinate;
}
