package com.google.android.gms.internal.auth;

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
final class zzfz {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzfx zzfxVar, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("# ");
        sb3.append(str);
        zzd(zzfxVar, sb3, 0);
        return sb3.toString();
    }

    static void zzb(StringBuilder sb3, int i13, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb3, i13, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb3, i13, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb3.append('\n');
        zzc(i13, sb3);
        if (!str.isEmpty()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(Character.toLowerCase(str.charAt(0)));
            for (int i14 = 1; i14 < str.length(); i14++) {
                char cCharAt = str.charAt(i14);
                if (Character.isUpperCase(cCharAt)) {
                    sb4.append("_");
                }
                sb4.append(Character.toLowerCase(cCharAt));
            }
            str = sb4.toString();
        }
        sb3.append(str);
        if (obj instanceof String) {
            sb3.append(": \"");
            sb3.append(zzgx.zza(new zzec(((String) obj).getBytes(zzfa.zzb))));
            sb3.append('\"');
            return;
        }
        if (obj instanceof zzef) {
            sb3.append(": \"");
            sb3.append(zzgx.zza((zzef) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof zzev) {
            sb3.append(" {");
            zzd((zzev) obj, sb3, i13 + 2);
            sb3.append("\n");
            zzc(i13, sb3);
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
        int i15 = i13 + 2;
        zzb(sb3, i15, "key", entry.getKey());
        zzb(sb3, i15, "value", entry.getValue());
        sb3.append("\n");
        zzc(i13, sb3);
        sb3.append("}");
    }

    private static void zzc(int i13, StringBuilder sb3) {
        while (i13 > 0) {
            int i14 = 80;
            if (i13 <= 80) {
                i14 = i13;
            }
            sb3.append(zza, 0, i14);
            i13 -= i14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void zzd(zzfx zzfxVar, StringBuilder sb3, int i13) {
        int i14;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzfxVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i15 = 0;
        while (true) {
            i14 = 3;
            if (i15 >= length) {
                break;
            }
            Method method3 = declaredMethods[i15];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i15++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i14);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb3, i13, strSubstring.substring(0, strSubstring.length() - 4), zzev.zzg(method2, zzfxVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb3, i13, strSubstring.substring(0, strSubstring.length() - 3), zzev.zzg(method, zzfxVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzg = zzev.zzg(method4, zzfxVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzg instanceof Boolean) {
                            if (((Boolean) objZzg).booleanValue()) {
                                zzb(sb3, i13, strSubstring, objZzg);
                            }
                        } else if (objZzg instanceof Integer) {
                            if (((Integer) objZzg).intValue() != 0) {
                                zzb(sb3, i13, strSubstring, objZzg);
                            }
                        } else if (objZzg instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzg).floatValue()) != 0) {
                                zzb(sb3, i13, strSubstring, objZzg);
                            }
                        } else if (!(objZzg instanceof Double)) {
                            if (objZzg instanceof String) {
                                zEquals = objZzg.equals("");
                            } else if (objZzg instanceof zzef) {
                                zEquals = objZzg.equals(zzef.zzb);
                            } else if (objZzg instanceof zzfx) {
                                if (objZzg != ((zzfx) objZzg).zze()) {
                                    zzb(sb3, i13, strSubstring, objZzg);
                                }
                            } else if (!(objZzg instanceof Enum) || ((Enum) objZzg).ordinal() != 0) {
                                zzb(sb3, i13, strSubstring, objZzg);
                            }
                            if (!zEquals) {
                                zzb(sb3, i13, strSubstring, objZzg);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzg).doubleValue()) != 0) {
                            zzb(sb3, i13, strSubstring, objZzg);
                        }
                    } else if (((Boolean) zzev.zzg(method5, zzfxVar, new Object[0])).booleanValue()) {
                        zzb(sb3, i13, strSubstring, objZzg);
                    }
                }
            }
            i14 = 3;
        }
        if (zzfxVar instanceof zzeu) {
            throw null;
        }
        zzha zzhaVar = ((zzev) zzfxVar).zzc;
        if (zzhaVar != null) {
            zzhaVar.zzg(sb3, i13);
        }
    }
}
