package com.mnb.contest.metabus.entity.photo;

import com.mnb.contest.metabus.entity.PhotoSpot;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(
  name = "GALLERY_SEQ_GENERATOR",
  sequenceName = "GALLERY_SEQ",
  initialValue = 1,
  allocationSize = 1
)
@EntityListeners(AuditingEntityListener.class)
public class Gallery {

  @Id
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "GALLERY_SEQ_GENERATOR"
  )
  private Long id;

  private String name;

  @ManyToOne
  private PhotoSpot photoSpot;

  @CreatedDate
  private LocalDateTime createAt;

  @LastModifiedDate
  private LocalDateTime modifiedAt;
}
