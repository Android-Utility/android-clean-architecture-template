package app.junsu.domain.repository.user

interface UserRepository {

    suspend fun login(
        email: String,
        password: String,
    )
}
