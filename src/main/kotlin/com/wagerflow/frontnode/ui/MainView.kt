package com.wagerflow.frontnode.ui

import com.vaadin.flow.component.Composite
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.html.Span
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route
import com.wagerflow.frontnode.ui.layouts.LayoutWithMenuBar
import java.lang.String.valueOf


@Route(value = "", layout = LayoutWithMenuBar::class, absolute = false)
class MainView: Composite<Div>() {

    private val btnClickMe:  Button = Button("click me")
    private val lbClickCount: Span = Span("0")
    private val layout: VerticalLayout = VerticalLayout(btnClickMe, lbClickCount)

    private var clickcount: Int = 0

    init {

        btnClickMe.addClickListener { lbClickCount.text = valueOf(++clickcount) }
        //logger().info("setting now the main ui content..");
        content.add(layout)
        content.setSizeFull()
    }
}