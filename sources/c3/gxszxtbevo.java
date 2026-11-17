package c3;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo implements wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final gxszxtbevo f18633ppxfxbqfkf = new gxszxtbevo(Collections.emptyMap());

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f18634iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f18635zoijcleaow;

    public gxszxtbevo(Map map) {
        this.f18635zoijcleaow = Collections.unmodifiableMap(map);
    }

    private static boolean btonecajqb(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static byte[] dxjokdxxww(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(StandardCharsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private static void eablkybsjg(HashMap map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), dxjokdxxww(entry.getValue()));
        }
    }

    private static void gtknphoqwx(HashMap map, List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            map.remove(list.get(i13));
        }
    }

    private static Map gxszxtbevo(Map map, eablkybsjg eablkybsjgVar) {
        HashMap map2 = new HashMap(map);
        gtknphoqwx(map2, eablkybsjgVar.ppxfxbqfkf());
        eablkybsjg(map2, eablkybsjgVar.zoijcleaow());
        return map2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gxszxtbevo.class != obj.getClass()) {
            return false;
        }
        return btonecajqb(this.f18635zoijcleaow, ((gxszxtbevo) obj).f18635zoijcleaow);
    }

    public int hashCode() {
        if (this.f18634iobyxmoadg == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f18635zoijcleaow.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f18634iobyxmoadg = iHashCode;
        }
        return this.f18634iobyxmoadg;
    }

    public gxszxtbevo lqeggnwhkg(eablkybsjg eablkybsjgVar) {
        Map mapGxszxtbevo = gxszxtbevo(this.f18635zoijcleaow, eablkybsjgVar);
        return btonecajqb(this.f18635zoijcleaow, mapGxszxtbevo) ? this : new gxszxtbevo(mapGxszxtbevo);
    }

    public Set nufgyqmvbu() {
        return this.f18635zoijcleaow.entrySet();
    }

    @Override // c3.wkgbmnqykc
    public final long ppxfxbqfkf(String str, long j13) {
        byte[] bArr = (byte[]) this.f18635zoijcleaow.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j13;
    }

    @Override // c3.wkgbmnqykc
    public final String wkgbmnqykc(String str, String str2) {
        byte[] bArr = (byte[]) this.f18635zoijcleaow.get(str);
        return bArr != null ? new String(bArr, StandardCharsets.UTF_8) : str2;
    }
}
