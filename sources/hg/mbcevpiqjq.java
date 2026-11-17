package hg;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class mbcevpiqjq {
    public static final Object iobyxmoadg(Map map, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        if (map instanceof kegysxyocb) {
            return ((kegysxyocb) map).pkzmftpjix(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
