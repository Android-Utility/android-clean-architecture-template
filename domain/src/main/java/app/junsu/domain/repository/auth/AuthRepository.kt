package app.junsu.domain.repository.auth

interface AuthRepository {

    suspend fun login(
        email: String,
        password: String,
    )
}
