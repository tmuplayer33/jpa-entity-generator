package com.example.entity.jpa1;

import com.example.annotation.Experimental;
import com.example.util.ExpirationPredicate;
import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;
import lombok.ToString;

/**
 * Note: auto-generated by jpa-entity-generator
 * TODO: This A/B testing mechanism is no longer used
 */
@Data
@ToString
@Deprecated
@Entity(name = "com.example.entity.jpa1.ABTest")
@Table(name = "abtest")
public class ABTest implements Serializable, ExpirationPredicate {

  @Id
  @Column(name = "`identifier`")
  private String identifier;
  @Column(name = "`expiration_timestamp`")
  private Integer expirationTimestamp;
  @Experimental(comment = "The expected data format is JSON")
  @Column(name = "`config`")
  private String config;
}