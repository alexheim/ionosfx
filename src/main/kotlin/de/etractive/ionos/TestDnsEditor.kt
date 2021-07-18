package de.etractive.ionos

import javafx.scene.layout.VBox
import tornadofx.Fragment
import tornadofx.button

class TestDnsEditor : Fragment() {

    override val root = VBox()

    init {
        button("OK") {}
    }
}
