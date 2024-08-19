package org.example.ideabugsample

class CommunityPassService(
    private val communityPassRepository: CommunityPassRepository,
) {
    fun create(siteId: String): CommunityPass {
        return communityPassRepository.save(CommunityPass(siteId = siteId))
    }

    fun list(): List<CommunityPass> {
        return communityPassRepository.findAll()
    }
}