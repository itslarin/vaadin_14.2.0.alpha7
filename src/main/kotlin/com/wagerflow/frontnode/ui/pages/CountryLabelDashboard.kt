package com.wagerflow.frontnode.ui.pages

import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.dialog.Dialog
import com.vaadin.flow.component.html.Label
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route
import com.wagerflow.frontnode.ui.layouts.LayoutWithMenuBar


@Route("dashboard/countrylabels",layout = LayoutWithMenuBar::class)
class CountryLabelDashboard(): VerticalLayout() {



    init {



        val dialog = Dialog(Label("this is dialog"))
        dialog.isResizable = true

        dialog.width = "900px"

        dialog.addOpenedChangeListener { event ->

            println("!!!opened-changed event fired")

            dialog.width = "900px"

            println("!!!dialog width = ${dialog.width}")
        }

        dialog.addResizeListener { event ->

            println("!!! on resize event width = ${dialog.width}")
        }


        val button = Button("open dialog")
        button.addClickListener{ dialog.open() }


        val top = HorizontalLayout()
        val middle = HorizontalLayout()
        val bottom = HorizontalLayout()


        bottom.add(button)

        add(
                top,
                middle,
                bottom)

    }

}