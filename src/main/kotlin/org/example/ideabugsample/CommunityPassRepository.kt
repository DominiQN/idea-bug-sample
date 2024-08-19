package org.example.ideabugsample

import org.springframework.data.jpa.repository.JpaRepository

interface CommunityPassRepository : JpaRepository<CommunityPass, Long>
