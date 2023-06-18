package org.example.service;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConvertTest {

    @Test
    public void test(){
        Map<ConsentEnum, Boolean> defaults = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, null);
        defaults.put(ConsentEnum.POST, null);
        defaults.put(ConsentEnum.TEXT, null);

        Map<ConsentEnum, Boolean> toApply = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, false);
        defaults.put(ConsentEnum.TEXT, true);

        Convert convert = new Convert();
        Map<ConsentEnum, Boolean> consentEnumBooleanMap = convert.applyDefaults(defaults, toApply);
        System.out.println(consentEnumBooleanMap);
        assertEquals(false, consentEnumBooleanMap.get(ConsentEnum.MAIL));
        assertEquals(true, consentEnumBooleanMap.get(ConsentEnum.TEXT));
        assertEquals(null, consentEnumBooleanMap.get(ConsentEnum.POST));
    }

    @Test
    public void applySecondLot(){
        Map<ConsentEnum, Boolean> defaults = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, null);
        defaults.put(ConsentEnum.POST, null);
        defaults.put(ConsentEnum.TEXT, null);

        Map<ConsentEnum, Boolean> toApply = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, false);
        defaults.put(ConsentEnum.TEXT, true);

        Map<ConsentEnum, Boolean> toApply2 = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, true);
        defaults.put(ConsentEnum.TEXT, true);

        Convert convert = new Convert();
        Map<ConsentEnum, Boolean> consentEnumBooleanMap = convert.applyDefaults(defaults, toApply);
        Map<ConsentEnum, Boolean> consentEnumBooleanMap2 = convert.applyDefaults(consentEnumBooleanMap, toApply2);
        System.out.println(consentEnumBooleanMap2);
        assertEquals(true, consentEnumBooleanMap2.get(ConsentEnum.MAIL));
        assertEquals(true, consentEnumBooleanMap2.get(ConsentEnum.TEXT));
        assertEquals(null, consentEnumBooleanMap2.get(ConsentEnum.POST));
    }

    @Test
    public void applyThirdLot(){
        Map<ConsentEnum, Boolean> defaults = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, null);
        defaults.put(ConsentEnum.POST, null);
        defaults.put(ConsentEnum.TEXT, null);

        Map<ConsentEnum, Boolean> toApply = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, false);
        defaults.put(ConsentEnum.TEXT, true);

        Map<ConsentEnum, Boolean> toApply2 = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, true);
        defaults.put(ConsentEnum.TEXT, true);

        Map<ConsentEnum, Boolean> toApply3 = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, true);
        defaults.put(ConsentEnum.TEXT, true);
        defaults.put(ConsentEnum.POST, false);

        Convert convert = new Convert();
        Map<ConsentEnum, Boolean> consentEnumBooleanMap = convert.applyDefaults(defaults, toApply);
        Map<ConsentEnum, Boolean> consentEnumBooleanMap2 = convert.applyDefaults(consentEnumBooleanMap, toApply2);
        Map<ConsentEnum, Boolean> consentEnumBooleanMap3 = convert.applyDefaults(consentEnumBooleanMap2, toApply3);
        System.out.println(consentEnumBooleanMap3);
        assertEquals(true, consentEnumBooleanMap3.get(ConsentEnum.MAIL));
        assertEquals(true, consentEnumBooleanMap3.get(ConsentEnum.TEXT));
        assertEquals(false, consentEnumBooleanMap3.get(ConsentEnum.POST));
    }

    @Test
    public void applyThirdLot2(){
        Map<ConsentEnum, Boolean> defaults = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, false);
        defaults.put(ConsentEnum.POST, true);
        defaults.put(ConsentEnum.TEXT, null);

        Map<ConsentEnum, Boolean> toApply = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, false);
        defaults.put(ConsentEnum.TEXT, true);

        Map<ConsentEnum, Boolean> toApply2 = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, true);
        defaults.put(ConsentEnum.TEXT, true);

        Map<ConsentEnum, Boolean> toApply3 = new HashMap<>();
        defaults.put(ConsentEnum.TEXT, false);
        defaults.put(ConsentEnum.POST, false);

        Convert convert = new Convert();
        Map<ConsentEnum, Boolean> consentEnumBooleanMap = convert.applyDefaults(defaults, toApply);
        Map<ConsentEnum, Boolean> consentEnumBooleanMap2 = convert.applyDefaults(consentEnumBooleanMap, toApply2);
        Map<ConsentEnum, Boolean> consentEnumBooleanMap3 = convert.applyDefaults(consentEnumBooleanMap2, toApply3);
        System.out.println(consentEnumBooleanMap3);
        assertEquals(true, consentEnumBooleanMap3.get(ConsentEnum.MAIL));
        assertEquals(false, consentEnumBooleanMap3.get(ConsentEnum.TEXT));
        assertEquals(false, consentEnumBooleanMap3.get(ConsentEnum.POST));
    }

    @Test
    public void applyThirdLot3(){
        Map<ConsentEnum, Boolean> defaults = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, false);
        defaults.put(ConsentEnum.POST, true);
        defaults.put(ConsentEnum.TEXT, null);

        Map<ConsentEnum, Boolean> toApply = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, false);
        defaults.put(ConsentEnum.TEXT, true);

        Map<ConsentEnum, Boolean> toApply2 = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, true);
        defaults.put(ConsentEnum.TEXT, true);

        Map<ConsentEnum, Boolean> toApply3 = new HashMap<>();
        defaults.put(ConsentEnum.TEXT, false);
        defaults.put(ConsentEnum.POST, false);

        Convert convert = new Convert();
        Map<ConsentEnum, Boolean> consentEnumBooleanMap = convert.applyDefaults2(defaults, toApply);
        Map<ConsentEnum, Boolean> consentEnumBooleanMap2 = convert.applyDefaults2(consentEnumBooleanMap, toApply2);
        Map<ConsentEnum, Boolean> consentEnumBooleanMap3 = convert.applyDefaults2(consentEnumBooleanMap2, toApply3);
        System.out.println(consentEnumBooleanMap3);
        assertEquals(true, consentEnumBooleanMap3.get(ConsentEnum.MAIL));
        assertEquals(false, consentEnumBooleanMap3.get(ConsentEnum.TEXT));
        assertEquals(false, consentEnumBooleanMap3.get(ConsentEnum.POST));
    }


    @Test
    public void applyThirdLot4(){
        Map<ConsentEnum, Boolean> defaults = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, false);
        defaults.put(ConsentEnum.POST, true);
        defaults.put(ConsentEnum.TEXT, null);

        Map<ConsentEnum, Boolean> toApply = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, false);
        defaults.put(ConsentEnum.TEXT, true);

        Map<ConsentEnum, Boolean> toApply2 = new HashMap<>();
        defaults.put(ConsentEnum.MAIL, true);
        defaults.put(ConsentEnum.TEXT, true);

        Map<ConsentEnum, Boolean> toApply3 = new HashMap<>();
        defaults.put(ConsentEnum.TEXT, false);
        defaults.put(ConsentEnum.POST, false);

        Convert convert = new Convert();
        Map<ConsentEnum, Boolean> consentEnumBooleanMap = convert.applyDefaults3(defaults, toApply);
        Map<ConsentEnum, Boolean> consentEnumBooleanMap2 = convert.applyDefaults3(consentEnumBooleanMap, toApply2);
        Map<ConsentEnum, Boolean> consentEnumBooleanMap3 = convert.applyDefaults3(consentEnumBooleanMap2, toApply3);
        System.out.println(consentEnumBooleanMap3);
        assertEquals(true, consentEnumBooleanMap3.get(ConsentEnum.MAIL));
        assertEquals(false, consentEnumBooleanMap3.get(ConsentEnum.TEXT));
        assertEquals(false, consentEnumBooleanMap3.get(ConsentEnum.POST));
    }


}