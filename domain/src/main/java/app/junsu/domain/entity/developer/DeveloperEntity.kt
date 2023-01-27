package app.junsu.domain.entity.developer

import app.junsu.domain.enum.major.Major

data class DeveloperEntity(
    val name: String,
    val major: Major,
    val githubUrl: String,
)
