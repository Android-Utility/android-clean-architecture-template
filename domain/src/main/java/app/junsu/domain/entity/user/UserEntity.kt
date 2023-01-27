package app.junsu.domain.entity.user

data class UserEntity(
    val accessToken: String,
    val refreshToken: String,
    val accessTokenExpiredAt: String,
    val refreshTokenExpiredAt: String,
)
