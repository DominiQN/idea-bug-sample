package org.example.ideabugsample

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.OffsetDateTime

@Entity
class CommunityPass(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,
    val siteId: String,
) {
    val createdAt: OffsetDateTime = OffsetDateTime.now()
}
