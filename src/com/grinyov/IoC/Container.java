package com.grinyov.IoC;

/**
 * Created by green on 11/6/15.
 *
 * Интерфейс, предоставляет собой службу Dependency Lookup
 *
 * Когда контейнер готов передать зависимости компоненту, он вызывает метод
 performLookup () на каждом компоненте по очереди
 */
public interface Container {
    Object getDependency(String key);
}
