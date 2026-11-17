package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
abstract class pkzmftpjix {
    static String eablkybsjg(wwaezpbzkn wwaezpbzknVar, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("# ");
        sb3.append(str);
        wkgbmnqykc(wwaezpbzknVar, sb3, 0);
        return sb3.toString();
    }

    private static final String iobyxmoadg(String str) {
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (Character.isUpperCase(cCharAt)) {
                sb3.append("_");
            }
            sb3.append(Character.toLowerCase(cCharAt));
        }
        return sb3.toString();
    }

    static final void ppxfxbqfkf(StringBuilder sb3, int i13, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                ppxfxbqfkf(sb3, i13, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                ppxfxbqfkf(sb3, i13, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb3.append('\n');
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            sb3.append(' ');
        }
        sb3.append(str);
        if (obj instanceof String) {
            sb3.append(": \"");
            sb3.append(jhduphickx.ppxfxbqfkf((String) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof gxszxtbevo) {
            sb3.append(": \"");
            sb3.append(jhduphickx.iobyxmoadg((gxszxtbevo) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof kcexrzcfyt) {
            sb3.append(" {");
            wkgbmnqykc((kcexrzcfyt) obj, sb3, i13 + 2);
            sb3.append("\n");
            while (i14 < i13) {
                sb3.append(' ');
                i14++;
            }
            sb3.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb3.append(": ");
            sb3.append(obj.toString());
            return;
        }
        sb3.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i16 = i13 + 2;
        ppxfxbqfkf(sb3, i16, "key", entry.getKey());
        ppxfxbqfkf(sb3, i16, "value", entry.getValue());
        sb3.append("\n");
        while (i14 < i13) {
            sb3.append(' ');
            i14++;
        }
        sb3.append("}");
    }

    private static void wkgbmnqykc(wwaezpbzkn wwaezpbzknVar, StringBuilder sb3, int i13) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : wwaezpbzknVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    ppxfxbqfkf(sb3, i13, iobyxmoadg(str2), kcexrzcfyt.vdvldrhtss(method2, wwaezpbzknVar, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    ppxfxbqfkf(sb3, i13, iobyxmoadg(str3), kcexrzcfyt.vdvldrhtss(method3, wwaezpbzknVar, new Object[0]));
                }
            }
            if (((Method) map2.get("set" + strReplaceFirst)) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    if (map.containsKey("get" + strReplaceFirst.substring(0, strReplaceFirst.length() - 5))) {
                    }
                }
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method4 = (Method) map.get("get" + strReplaceFirst);
                Method method5 = (Method) map.get("has" + strReplaceFirst);
                if (method4 != null) {
                    Object objVdvldrhtss = kcexrzcfyt.vdvldrhtss(method4, wwaezpbzknVar, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) kcexrzcfyt.vdvldrhtss(method5, wwaezpbzknVar, new Object[0])).booleanValue();
                    } else if (zoijcleaow(objVdvldrhtss)) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        ppxfxbqfkf(sb3, i13, iobyxmoadg(str4), objVdvldrhtss);
                    }
                }
            }
        }
        okpsazkaxt okpsazkaxtVar = ((kcexrzcfyt) wwaezpbzknVar).unknownFields;
        if (okpsazkaxtVar != null) {
            okpsazkaxtVar.wflxmlrfwp(sb3, i13);
        }
    }

    private static boolean zoijcleaow(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof gxszxtbevo) {
            return obj.equals(gxszxtbevo.f8642yggfygwlhe);
        }
        if (obj instanceof wwaezpbzkn) {
            return obj == ((wwaezpbzkn) obj).getDefaultInstanceForType();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }
}
