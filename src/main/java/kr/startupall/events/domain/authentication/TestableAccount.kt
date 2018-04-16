package kr.startupall.events.domain.authentication

class TestableAccount {
    fun generateTestAccount(name: String = "이말년", password: String = "12345678!", loginId: String = "emalyun@naver.com") : Account {
        var account = Account()

        account.loginId = loginId
        account.name = name
        account.password = password

        return account
    }
}