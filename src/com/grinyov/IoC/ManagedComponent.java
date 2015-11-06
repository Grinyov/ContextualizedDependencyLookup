package com.grinyov.IoC;

/**
 * Created by green on 11/6/15.
 *
 * Интерфейс компонента для CDL
 *
 * Реализуя этот интерфейс, компонент сигнализирует контейнер о том, что он же­
 лает получить зависимость. Контейнер обычно предоставляется лежащим в осно­
 ве сервером приложений (например, Tomcat или JBoss) или платформой (скажем,
 Spring)
 */
public interface ManagedComponent {
    void performLookup(Container container);
}
