package com.li.jacky.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jacky on 2017/9/1.
 * 容器持有
 */

public class SingletonManager {

    private static Map<String, Object> map = new HashMap<>();

    private SingletonManager() {}

    public static void registerModule(String key, Object module) {
        if (!map.containsKey(key)) {
            map.put(key, module);
        }
    }

    public static Object getModule(String key) {
        return map.get(key);
    }
}
