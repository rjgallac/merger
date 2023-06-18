package org.example.service;

import java.util.*;
import java.util.stream.Collectors;

public class Convert {
    public Map<ConsentEnum, Boolean> applyDefaults(Map<ConsentEnum, Boolean> toChange, Map<ConsentEnum, Boolean> apply) {
        Map<ConsentEnum, Boolean> newMap = new HashMap<>();

        Iterator<ConsentEnum> iterator = toChange.keySet().iterator();
        while (iterator.hasNext()) {
            ConsentEnum next = iterator.next();
            if(apply.get(next) == null) {
                newMap.put(next, toChange.get(next));
            } else {
                newMap.put(next, apply.get(next));
            }
        }
        return newMap;
    }

    public Map<ConsentEnum, Boolean> applyDefaults2(Map<ConsentEnum, Boolean> toChange, Map<ConsentEnum, Boolean> apply) {
        Map<ConsentEnum, Boolean> newMap = new HashMap<>();

        Iterator<ConsentEnum> iterator = toChange.keySet().iterator();
        while (iterator.hasNext()) {
            ConsentEnum next = iterator.next();
            newMap.put(next, toChange.computeIfAbsent(next, c->apply.get(next)));
        }
        return newMap;
    }

    public Map<ConsentEnum, Boolean> applyDefaults3(Map<ConsentEnum, Boolean> toChange, Map<ConsentEnum, Boolean> apply) {
        return toChange.keySet()
                .stream()
                .map(c -> new AbstractMap.SimpleEntry<>(c, toChange.computeIfAbsent(c, d -> apply.get(d))))
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue() ));
    }

}
