package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
abstract class dsvhmnatus {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final char[] f23895iobyxmoadg;

    static {
        char[] cArr = new char[80];
        f23895iobyxmoadg = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0172  */
    /* JADX WARN: Code duplicated, block: B:65:0x018f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0197  */
    /* JADX WARN: Code duplicated, block: B:69:0x019d  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01af  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0172, please report this as an issue */
    private static void eablkybsjg(hkdspvbjdz hkdspvbjdzVar, StringBuilder sb3, int i13) {
        int i14;
        int i15;
        Method method;
        Method method2;
        Object objYggfygwlhe;
        boolean zBooleanValue;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = hkdspvbjdzVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i16 = 0;
        while (true) {
            i14 = 3;
            if (i16 >= length) {
                break;
            }
            Method method5 = declaredMethods[i16];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i16++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i14);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (Method) entry.getValue()) == null || !method4.getReturnType().equals(List.class)) {
                if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method3 = (Method) entry.getValue()) == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                    i15 = 3;
                    if (hashSet.contains("set" + strSubstring)) {
                        if (strSubstring.endsWith("Bytes")) {
                            if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                                method = (Method) entry.getValue();
                                method2 = (Method) map.get("has" + strSubstring);
                                if (method != null) {
                                    objYggfygwlhe = iwizpuwonk.yggfygwlhe(method, hkdspvbjdzVar, new Object[0]);
                                    if (method2 == null) {
                                        zBooleanValue = ((Boolean) iwizpuwonk.yggfygwlhe(method2, hkdspvbjdzVar, new Object[0])).booleanValue();
                                    } else if (zoijcleaow(objYggfygwlhe)) {
                                        zBooleanValue = false;
                                    } else {
                                        zBooleanValue = true;
                                    }
                                    if (zBooleanValue) {
                                        wkgbmnqykc(sb3, i13, strSubstring, objYggfygwlhe);
                                    }
                                }
                            }
                        } else {
                            method = (Method) entry.getValue();
                            method2 = (Method) map.get("has" + strSubstring);
                            if (method != null) {
                                objYggfygwlhe = iwizpuwonk.yggfygwlhe(method, hkdspvbjdzVar, new Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = ((Boolean) iwizpuwonk.yggfygwlhe(method2, hkdspvbjdzVar, new Object[0])).booleanValue();
                                } else if (zoijcleaow(objYggfygwlhe)) {
                                    zBooleanValue = true;
                                } else {
                                    zBooleanValue = false;
                                }
                                if (zBooleanValue) {
                                    wkgbmnqykc(sb3, i13, strSubstring, objYggfygwlhe);
                                }
                            }
                        }
                    }
                } else {
                    i15 = 3;
                    wkgbmnqykc(sb3, i13, strSubstring.substring(0, strSubstring.length() - 3), iwizpuwonk.yggfygwlhe(method3, hkdspvbjdzVar, new Object[0]));
                }
                i14 = i15;
            } else {
                wkgbmnqykc(sb3, i13, strSubstring.substring(0, strSubstring.length() - 4), iwizpuwonk.yggfygwlhe(method4, hkdspvbjdzVar, new Object[0]));
                i14 = 3;
            }
        }
        rlfsiqarku rlfsiqarkuVar = ((iwizpuwonk) hkdspvbjdzVar).unknownFields;
        if (rlfsiqarkuVar != null) {
            rlfsiqarkuVar.wflxmlrfwp(sb3, i13);
        }
    }

    static String gxszxtbevo(hkdspvbjdz hkdspvbjdzVar, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("# ");
        sb3.append(str);
        eablkybsjg(hkdspvbjdzVar, sb3, 0);
        return sb3.toString();
    }

    private static void iobyxmoadg(int i13, StringBuilder sb3) {
        while (i13 > 0) {
            char[] cArr = f23895iobyxmoadg;
            int length = i13 > cArr.length ? cArr.length : i13;
            sb3.append(cArr, 0, length);
            i13 -= length;
        }
    }

    private static String ppxfxbqfkf(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Character.toLowerCase(str.charAt(0)));
        for (int i13 = 1; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (Character.isUpperCase(cCharAt)) {
                sb3.append("_");
            }
            sb3.append(Character.toLowerCase(cCharAt));
        }
        return sb3.toString();
    }

    static void wkgbmnqykc(StringBuilder sb3, int i13, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                wkgbmnqykc(sb3, i13, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                wkgbmnqykc(sb3, i13, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb3.append('\n');
        iobyxmoadg(i13, sb3);
        sb3.append(ppxfxbqfkf(str));
        if (obj instanceof String) {
            sb3.append(": \"");
            sb3.append(xrmfcynszj.ppxfxbqfkf((String) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof nufgyqmvbu) {
            sb3.append(": \"");
            sb3.append(xrmfcynszj.iobyxmoadg((nufgyqmvbu) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof iwizpuwonk) {
            sb3.append(" {");
            eablkybsjg((iwizpuwonk) obj, sb3, i13 + 2);
            sb3.append("\n");
            iobyxmoadg(i13, sb3);
            sb3.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb3.append(": ");
            sb3.append(obj);
            return;
        }
        sb3.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i14 = i13 + 2;
        wkgbmnqykc(sb3, i14, "key", entry.getKey());
        wkgbmnqykc(sb3, i14, "value", entry.getValue());
        sb3.append("\n");
        iobyxmoadg(i13, sb3);
        sb3.append("}");
    }

    private static boolean zoijcleaow(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof nufgyqmvbu) {
            return obj.equals(nufgyqmvbu.f23969yggfygwlhe);
        }
        if (obj instanceof hkdspvbjdz) {
            return obj == ((hkdspvbjdz) obj).getDefaultInstanceForType();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }
}
