package com.wagerflow.frontnode.ui.layouts

import com.vaadin.flow.component.Composite
import com.vaadin.flow.component.HasElement
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.router.ParentLayout
import com.vaadin.flow.router.RouterLayout
import com.vaadin.flow.router.RouterLink
import com.wagerflow.frontnode.ui.MainView
import com.wagerflow.frontnode.ui.pages.*
import java.util.*


@ParentLayout(value = MainLayout::class)
class LayoutWithMenuBar : Composite<Div>(), RouterLayout {

    private val mainContent: Div = Div()

    private val menuBar = HorizontalLayout(
            RouterLink("Home", MainView::class.java),
            RouterLink("Country Labels", CountryLabelDashboard::class.java)
    )


    init {

        content.add(
                menuBar,
                mainContent)

        mainContent.setSizeFull()
    }


    override fun showRouterLayoutContent(hasElement: HasElement) {

        Objects.requireNonNull(hasElement)
        Objects.requireNonNull(hasElement.element)
        mainContent.removeAll()
        mainContent.element.appendChild(hasElement.element)
    }


}