package com.wagerflow.frontnode.ui.layouts

import com.vaadin.flow.component.Composite
import com.vaadin.flow.component.HasElement
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.html.Span
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.RouterLayout
import com.vaadin.flow.theme.Theme
import com.vaadin.flow.theme.lumo.Lumo
import com.vaadin.flow.theme.material.Material
import java.util.*


@Theme(value = Material::class, variant = Material.LIGHT)
class MainLayout : Composite<VerticalLayout>(), RouterLayout {

    //Component to delegate content through.
    private val mainContent: Div = Div()

    /*private val layout = VerticalLayout(
            Span("from MainLayout top"),
            mainContent,
            Span("from MainLayout bottom"))*/

    init {
        content.add(
                Span("from MainLayout top"),
                mainContent,
                Span("from MainLayout bottom"))

        mainContent.setSizeFull()
    }


    override fun showRouterLayoutContent(hasElement: HasElement) {

        Objects.requireNonNull(hasElement)
        Objects.requireNonNull(hasElement.element)
        mainContent.removeAll()
        mainContent.element.appendChild(hasElement.element)
    }
}