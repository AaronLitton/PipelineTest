package com.revature.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ClassCreator {

    public static Object getInstance(Class<?> clazz) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?> noArgsConstructor;
        noArgsConstructor = Arrays.stream(clazz.getDeclaredConstructors())
                .filter(c -> c.getParameterCount() == 0)
                .findFirst().orElse(null);
        if(noArgsConstructor != null){
            return noArgsConstructor.newInstance();
        }
        return null;
    }

}
