package next.step.minesweeper.domain.board.state

object MineState : BoardPointState() {

    override fun notifyMine(): MineState = this
}
