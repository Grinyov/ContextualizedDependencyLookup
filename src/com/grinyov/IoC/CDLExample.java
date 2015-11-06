package com.grinyov.IoC;

/**
 * Created by green on 11/6/15.
 *
 * Тип Contextualized Dependency Lookup (CDL) в некоторых отношениях похож на
 Dependency Pull, но в CDL поиск осуществляется в контейнере, который управляет
 ресурсом, а не только в каком-то центральном реестре, и обычно он производится в
 установленной точке.
 */
public class CDLExample {

    public static void main(String[] args) {
        Container container = new DefaultContainer();

        ManagedComponent managedComponent = new ContextualizedDependencyLookup();
        managedComponent.performLookup(container);

        System.out.println(managedComponent);
    }
}

