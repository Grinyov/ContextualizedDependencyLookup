package com.grinyov.IoC;

/**
 * Created by green on 11/6/15.
 */
public class DefaultContainer implements Container {
    @Override
    public Object getDependency(String key) {
        if ("myDependency".equals(key)) {
            return new Dependency();
        }

        throw new RuntimeException("Unknown dependency: " + key);
    }
}