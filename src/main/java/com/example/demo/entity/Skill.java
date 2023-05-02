//package com.example.demo.entity;
//
//
//
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.stereotype.Component;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "Skill")
//@Component
//
//public class Skill {
//	
//	@Id
//   @GeneratedValue(strategy = GenerationType.AUTO)
//    private long skill_id;
//	
//    private String skill;
//
//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "skill")
//    private Set<Seeker> seeker=new HashSet<>();
//    
//    
//	public long getId() {
//		return skill_id;
//	}
//
//	public void setId(Integer id) {
//		this.skill_id = id;
//	}
//
//	public String getSkill() {
//		return skill;
//	}
//
//	public void setSkill(String skill) {
//		this.skill = skill;
//	}
//
//	public Skill(long id, String skill) {
//		super();
//		this.skill_id = id;
//		this.skill = skill;
//	}
//
//	public Skill() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Set<Seeker> getSeeker() {
//		return seeker;
//	}
//
//	public void setSeeker(Set<Seeker> seeker) {
//		this.seeker = seeker;
//	}
//	
//
//}