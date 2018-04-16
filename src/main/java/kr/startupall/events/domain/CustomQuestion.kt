package kr.startupall.events.domain

import javax.persistence.*

@Entity
data class CustomQuestion(

        @field:Id
        @field:GeneratedValue
        @field:Column(name = "CQ_ID")
        val id: Long,

        @field:ManyToOne
        @field:JoinColumn(name = "QUESTION_ID")
        val question: Question,

        @field:ManyToOne
        @field:JoinColumn(name = "EVENT_ID")
        val event: Event
)