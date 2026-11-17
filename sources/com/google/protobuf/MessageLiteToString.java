package com.google.protobuf;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
final class MessageLiteToString {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final String LIST_SUFFIX = "List";
    private static final String MAP_SUFFIX = "Map";

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, ' ');
    }

    private MessageLiteToString() {
    }

    private static void indent(int i13, StringBuilder sb3) {
        while (i13 > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = i13 > cArr.length ? cArr.length : i13;
            sb3.append(cArr, 0, length);
            i13 -= length;
        }
    }

    private static boolean isDefaultValue(Object obj) {
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
        if (obj instanceof ByteString) {
            return obj.equals(ByteString.EMPTY);
        }
        if (obj instanceof MessageLite) {
            return obj == ((MessageLite) obj).getDefaultInstanceForType();
        }
        return (obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0;
    }

    private static String pascalCaseToSnakeCase(String str) {
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

    static void printField(StringBuilder sb3, int i13, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                printField(sb3, i13, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                printField(sb3, i13, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb3.append('\n');
        indent(i13, sb3);
        sb3.append(pascalCaseToSnakeCase(str));
        if (obj instanceof String) {
            sb3.append(": \"");
            sb3.append(TextFormatEscaper.escapeText((String) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb3.append(": \"");
            sb3.append(TextFormatEscaper.escapeBytes((ByteString) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb3.append(" {");
            reflectivePrintWithIndent((GeneratedMessageLite) obj, sb3, i13 + 2);
            sb3.append("\n");
            indent(i13, sb3);
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
        printField(sb3, i14, "key", entry.getKey());
        printField(sb3, i14, "value", entry.getValue());
        sb3.append("\n");
        indent(i13, sb3);
        sb3.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0172  */
    /* JADX WARN: Code duplicated, block: B:65:0x018f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0197  */
    /* JADX WARN: Code duplicated, block: B:69:0x019d  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01af  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0172, please report this as an issue */
    private static void reflectivePrintWithIndent(MessageLite messageLite, StringBuilder sb3, int i13) {
        int i14;
        int i15;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        Object objInvokeOrDie;
        boolean zBooleanValue;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i16 = 0;
        while (true) {
            i14 = 3;
            if (i16 >= length) {
                break;
            }
            java.lang.reflect.Method method5 = declaredMethods[i16];
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
            if (!strSubstring.endsWith(LIST_SUFFIX) || strSubstring.endsWith(BUILDER_LIST_SUFFIX) || strSubstring.equals(LIST_SUFFIX) || (method4 = (java.lang.reflect.Method) entry.getValue()) == null || !method4.getReturnType().equals(List.class)) {
                if (!strSubstring.endsWith(MAP_SUFFIX) || strSubstring.equals(MAP_SUFFIX) || (method3 = (java.lang.reflect.Method) entry.getValue()) == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                    i15 = 3;
                    if (hashSet.contains("set" + strSubstring)) {
                        if (strSubstring.endsWith(BYTES_SUFFIX)) {
                            if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                                method = (java.lang.reflect.Method) entry.getValue();
                                method2 = (java.lang.reflect.Method) map.get("has" + strSubstring);
                                if (method != null) {
                                    objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method, messageLite, new Object[0]);
                                    if (method2 == null) {
                                        zBooleanValue = ((Boolean) GeneratedMessageLite.invokeOrDie(method2, messageLite, new Object[0])).booleanValue();
                                    } else if (isDefaultValue(objInvokeOrDie)) {
                                        zBooleanValue = false;
                                    } else {
                                        zBooleanValue = true;
                                    }
                                    if (zBooleanValue) {
                                        printField(sb3, i13, strSubstring, objInvokeOrDie);
                                    }
                                }
                            }
                        } else {
                            method = (java.lang.reflect.Method) entry.getValue();
                            method2 = (java.lang.reflect.Method) map.get("has" + strSubstring);
                            if (method != null) {
                                objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method, messageLite, new Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = ((Boolean) GeneratedMessageLite.invokeOrDie(method2, messageLite, new Object[0])).booleanValue();
                                } else if (isDefaultValue(objInvokeOrDie)) {
                                    zBooleanValue = true;
                                } else {
                                    zBooleanValue = false;
                                }
                                if (zBooleanValue) {
                                    printField(sb3, i13, strSubstring, objInvokeOrDie);
                                }
                            }
                        }
                    }
                } else {
                    i15 = 3;
                    printField(sb3, i13, strSubstring.substring(0, strSubstring.length() - 3), GeneratedMessageLite.invokeOrDie(method3, messageLite, new Object[0]));
                }
                i14 = i15;
            } else {
                printField(sb3, i13, strSubstring.substring(0, strSubstring.length() - 4), GeneratedMessageLite.invokeOrDie(method4, messageLite, new Object[0]));
                i14 = 3;
            }
        }
        if (messageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator<Map.Entry<T, Object>> it = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                printField(sb3, i13, "[" + ((GeneratedMessageLite.ExtensionDescriptor) entry2.getKey()).getNumber() + "]", entry2.getValue());
            }
        }
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) messageLite).unknownFields;
        if (unknownFieldSetLite != null) {
            unknownFieldSetLite.printWithIndent(sb3, i13);
        }
    }

    static String toString(MessageLite messageLite, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("# ");
        sb3.append(str);
        reflectivePrintWithIndent(messageLite, sb3, 0);
        return sb3.toString();
    }
}
