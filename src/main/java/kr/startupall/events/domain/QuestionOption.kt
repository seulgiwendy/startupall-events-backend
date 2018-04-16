package kr.startupall.events.domain

import javax.persistence.*

@Entity
data class QuestionOption(

        @field:Id
        @field:GeneratedValue
        @field:Column(name = "Q_OPTION_ID")
        val id: Long,

        @field:Column(name = "Q_OPTION_TEXT")
        val text: String,

        @field:ManyToOne
        @field:JoinColumn(name = "QUESTION_ID")
        val question: Question
)