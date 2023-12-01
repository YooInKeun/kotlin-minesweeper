package minesweeper

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class MinesTest: BehaviorSpec({

    Given("지뢰들이 주어지고") {
        val mines = setOf(
            Position(0, 0),
            Position(1, 1),
            Position(0, 1)
        )
        When("2차원 정수 배열 게임판을 받는다면") {
            val height = Height(3)
            val width = Width(3)
            val dimensions = BoardDimensions(height, width)
            Then("지뢰 위치를 표시하고 주변 셀들의 숫자를 증가시킨다.") {
                Mines(mines).increaseNearCellNumbers(NumberBoard(dimensions)) shouldBe arrayOf(
                    arrayOf(-1,-1,2),
                    arrayOf(3,-1,2),
                    arrayOf(1,1,1)
                )
            }
        }
    }
})