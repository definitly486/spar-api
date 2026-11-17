package hi;

import hg.jyumaefscl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Map f40439ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow f40438iobyxmoadg = new zoijcleaow();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String f40440zoijcleaow = jyumaefscl.iwxlajgraz(jyumaefscl.rgvfuqvkyq('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listRgvfuqvkyq = jyumaefscl.rgvfuqvkyq("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iZoijcleaow = og.ppxfxbqfkf.zoijcleaow(0, listRgvfuqvkyq.size() - 1, 2);
        if (iZoijcleaow >= 0) {
            int i13 = 0;
            while (true) {
                StringBuilder sb3 = new StringBuilder();
                String str = f40440zoijcleaow;
                sb3.append(str);
                sb3.append('/');
                sb3.append((String) listRgvfuqvkyq.get(i13));
                int i14 = i13 + 1;
                linkedHashMap.put(sb3.toString(), listRgvfuqvkyq.get(i14));
                linkedHashMap.put(str + '/' + ((String) listRgvfuqvkyq.get(i13)) + "Array", '[' + ((String) listRgvfuqvkyq.get(i14)));
                if (i13 == iZoijcleaow) {
                    break;
                } else {
                    i13 += 2;
                }
            }
        }
        linkedHashMap.put(f40440zoijcleaow + "/Unit", "V");
        iobyxmoadg(linkedHashMap, "Any", "java/lang/Object");
        iobyxmoadg(linkedHashMap, "Nothing", "java/lang/Void");
        iobyxmoadg(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : jyumaefscl.rgvfuqvkyq("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            iobyxmoadg(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : jyumaefscl.rgvfuqvkyq("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            iobyxmoadg(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            iobyxmoadg(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        iobyxmoadg(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        iobyxmoadg(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        iobyxmoadg(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        iobyxmoadg(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i15 = 0; i15 < 23; i15++) {
            StringBuilder sb4 = new StringBuilder();
            String str4 = f40440zoijcleaow;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i15);
            iobyxmoadg(linkedHashMap, "Function" + i15, sb4.toString());
            iobyxmoadg(linkedHashMap, "reflect/KFunction" + i15, str4 + "/reflect/KFunction");
        }
        for (String str5 : jyumaefscl.rgvfuqvkyq("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            iobyxmoadg(linkedHashMap, str5 + ".Companion", f40440zoijcleaow + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f40439ppxfxbqfkf = linkedHashMap;
    }

    private zoijcleaow() {
    }

    private static final void iobyxmoadg(Map map, String str, String str2) {
        map.put(f40440zoijcleaow + '/' + str, 'L' + str2 + ';');
    }

    public static final String zoijcleaow(String classId) {
        zdlpuopuiu.btonecajqb(classId, "classId");
        String str = (String) f40439ppxfxbqfkf.get(classId);
        if (str != null) {
            return str;
        }
        return 'L' + kcexrzcfyt.pkzmftpjix(classId, '.', '$', false, 4, null) + ';';
    }
}
