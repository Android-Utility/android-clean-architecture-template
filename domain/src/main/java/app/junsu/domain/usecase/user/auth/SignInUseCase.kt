package app.junsu.domain.usecase.user.auth

import app.junsu.domain.param.user.auth.SignInParam
import app.junsu.domain.repository.user.UserRepository
import javax.inject.Inject

class SignInUseCase @Inject constructor(
    private val repository: UserRepository,
) {
    suspend operator fun invoke(
        param: SignInParam,
    ) {
        repository.signIn(param)
    }
}
