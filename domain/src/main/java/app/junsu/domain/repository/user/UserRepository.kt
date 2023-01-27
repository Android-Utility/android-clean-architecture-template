package app.junsu.domain.repository.user

import app.junsu.domain.param.user.auth.SignInParam

interface UserRepository {

    suspend fun signIn(param: SignInParam)
}
