package de.etractive.ionos

import javafx.scene.Scene
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyCodeCombination
import javafx.stage.Stage
import tornadofx.App
import tornadofx.FX
import tornadofx.UIComponent
import tornadofx.launch

class TestApp : App(TestDnsEditor::class) {

    override fun createPrimaryScene(view: UIComponent): Scene {
        FX.layoutDebuggerShortcut = KeyCodeCombination(KeyCode.J, KeyCodeCombination.CONTROL_DOWN)
        view.title = "ionos"
        return super.createPrimaryScene(view).apply {
            // this.addApplicationStylesheets()
        }
    }

    override fun start(stage: Stage) {
        stage.width = 800.0
        stage.height = 600.0
        super.start(stage)
    }
}

fun main(args: Array<String>) {
    launch<TestApp>(args)
}
