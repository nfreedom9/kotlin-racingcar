package racing.domain.car

class RacingCarName(name: String) {
    val name: String

    init {
        validateLength(name)
        validateBlank(name)
        this.name = name
    }

    private fun validateBlank(name: String) {
        require(!name.contains(BLANK)) { "이름엔 공백이 포함될 수 없습니다." }
    }

    private fun validateLength(name: String) {
        require(name.length <= MAX_LENGTH) { "이름의 길이는 최대 ${MAX_LENGTH}글자입니다." }
    }

    companion object {
        private const val BLANK = " "
        private const val MAX_LENGTH = 8
    }
}