package w32;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final C2951iobyxmoadg f118645eablkybsjg = new C2951iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f118646iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f118647ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f118648wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f118649zoijcleaow;

    /* JADX INFO: renamed from: w32.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2951iobyxmoadg {
        public /* synthetic */ C2951iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2951iobyxmoadg() {
        }
    }

    public iobyxmoadg(String idEvent, String localKey) {
        zdlpuopuiu.btonecajqb(idEvent, "idEvent");
        zdlpuopuiu.btonecajqb(localKey, "localKey");
        this.f118646iobyxmoadg = idEvent;
        this.f118649zoijcleaow = localKey;
        this.f118647ppxfxbqfkf = tzroggbefp.dxjokdxxww();
        this.f118648wkgbmnqykc = tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg("ext_user_id", "unauthorized"));
    }

    public final void eablkybsjg(String id2) {
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f118648wkgbmnqykc.put("ext_user_id", id2);
    }

    public final Map iobyxmoadg() {
        Map map = this.f118648wkgbmnqykc;
        Map mapWkgbmnqykc = wkgbmnqykc();
        LinkedHashMap linkedHashMap = new LinkedHashMap(tzroggbefp.eablkybsjg(mapWkgbmnqykc.size()));
        for (Map.Entry entry : mapWkgbmnqykc.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getValue();
            if (str == null) {
                str = "";
            }
            linkedHashMap.put(key, str);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!kcexrzcfyt.zfvoamnweg((String) entry2.getValue())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return tzroggbefp.rgvfuqvkyq(map, linkedHashMap2);
    }

    public final String ppxfxbqfkf() {
        return this.f118646iobyxmoadg;
    }

    public final String toString() {
        return getClass().getName() + "(id = " + zoijcleaow() + ", args = " + iobyxmoadg() + ")";
    }

    protected Map wkgbmnqykc() {
        return this.f118647ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        String str = this.f118646iobyxmoadg;
        String str2 = this.f118649zoijcleaow;
        String str3 = null;
        if (kcexrzcfyt.zfvoamnweg(str2)) {
            str2 = null;
        }
        if (str2 != null) {
            str3 = "_" + str2;
        }
        if (str3 == null) {
            str3 = "";
        }
        return str + str3;
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? "" : str2);
    }
}
