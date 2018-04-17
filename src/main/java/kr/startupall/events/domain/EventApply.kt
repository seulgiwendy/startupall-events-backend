package kr.startupall.events.domain

import kr.startupall.events.domain.authentication.Account
import javax.persistence.*

@Entity
data class EventApply(

        @field:Id
        @field:GeneratedValue
        @field:Column(name = "APPLY_ID")
        val id: Long = 0,

        @field:ManyToOne
        @field:JoinColumn(name = "EVENT_ID")
        val event: Event? = null,

        @field:ManyToOne
        @field:JoinColumn(name = "ACCOUNT_ID")
        val account: Account? = null)