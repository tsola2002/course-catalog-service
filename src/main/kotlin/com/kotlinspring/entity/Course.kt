package com.kotlinspring.entity

import org.springframework.boot.autoconfigure.domain.EntityScan
import javax.persistence.*

@Entity
@Table(name = "Courses")
data class Course (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id : Int?,
        var name: String,
        var category: String
        )