/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.undertow.servlet.util;

import io.undertow.servlet.api.AnnotationRetriever;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 */
public class DefaultAnnotationRetriever implements AnnotationRetriever {

    public static final DefaultAnnotationRetriever INSTANCE = new DefaultAnnotationRetriever();

    private DefaultAnnotationRetriever() {
    }

    @Override
    public Annotation getAnnotation(Class<?> clazz, Class<? extends Annotation> annotType) throws RuntimeException {
        return clazz.getAnnotation(annotType);
    }

    @Override
    public Annotation getAnnotation(Class<?> clazz, Method m, Class<? extends Annotation> annotType) throws RuntimeException {
        return m.getAnnotation(annotType);
    }

    @Override
    public Annotation getDeclaredAnnotation(Class<?> clazz, Class<? extends Annotation> annotType) throws RuntimeException {
        return clazz.getDeclaredAnnotation(annotType);
    }

    @Override
    public Annotation getDeclaredAnnotation(Class<?> clazz, Method m, Class<? extends Annotation> annotType) throws RuntimeException {
        return m.getDeclaredAnnotation(annotType);
    }

    @Override
    public boolean isAnnotationPresent(Class<?> clazz, Method m, Class<? extends Annotation> annotType) throws RuntimeException {
        return m.isAnnotationPresent(annotType);
    }

    @Override
    public Annotation[][] getParameterAnnotations(Class<?> clazz, Method m) throws RuntimeException {
        return m.getParameterAnnotations();
    }

    @Override
    public Method[] getDeclaredMethods(Class<?> clazz) throws RuntimeException {
        return clazz.getDeclaredMethods();
    }

    @Override
    public Method getMethod(Class<?> clazz, String name, Class<?>... params) throws NoSuchMethodException {
        return clazz.getMethod(name, params);
    }
}
