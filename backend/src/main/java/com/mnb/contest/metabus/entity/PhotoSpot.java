package com.mnb.contest.metabus.entity;

import com.mnb.contest.metabus.entity.photo.Gallery;
import com.mnb.contest.metabus.entity.photo.Poze;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(
  name = "PHOTO_SPOT_SEQ_GENERATOR",
  sequenceName = "PHOTO_SPOT_SEQ",
  initialValue = 1,
  allocationSize = 1
)
@Table
public class PhotoSpot {

  @Id
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "PHOTO_SPOT_SEQ_GENERATOR"
  )
  private Long id;

  private String photoSpotName;

  @OneToMany(
    orphanRemoval = true,
    mappedBy = "photo_spot",
    cascade = { CascadeType.REMOVE }
  )
  private List<Gallery> galleries = new ArrayList<>();

  @OneToMany(
    orphanRemoval = true,
    mappedBy = "photo_spot",
    cascade = { CascadeType.REMOVE }
  )
  private List<Poze> poses = new ArrayList<>();

  @CreatedDate
  private LocalDateTime createAt;

  @LastModifiedDate
  private LocalDateTime modifiedAt;
}
