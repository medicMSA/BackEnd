package com.medic.jpa;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "like")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Like {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "like_id")
	private int likeId;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "supplement_id")
	private int supplementId;
	
}

