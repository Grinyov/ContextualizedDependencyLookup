package com.grinyov.IoC;

/**
 * Created by green on 11/6/15.
 *
 * Получение зависимостей в CDL
 *
 * компонент может искать свои зависимости с использованием интерфейса Container
 */
public class ContextualizedDependencyLookup implements ManagedComponent {
    private Dependency dependency;

    @Override
    public void performLookup(Container container) {
        this.dependency = (Dependency) container.getDependency("myDependency");
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}