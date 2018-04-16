package kr.startupall.events.domain

import javax.persistence.*

@Entity
data class EventApply(

        @field:Id
        @field:GeneratedValue
        @field:Column(name = "APPLY_ID")
        val id: Long,

        @field:ManyToOne
        @field:JoinColumn(name = "EVENT_ID")
        val event: Event,

        @field:ManyToOne
        @field:JoinColumn(name = "ACCOUNT_ID")
        val account: Account
)