package sp1;

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
    public static final C2652iobyxmoadg f107817eablkybsjg = new C2652iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f107818iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f107819ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f107820wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f107821zoijcleaow;

    /* JADX INFO: renamed from: sp1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2652iobyxmoadg {
        public /* synthetic */ C2652iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2652iobyxmoadg() {
        }
    }

    public iobyxmoadg(String idEvent, String localKey) {
        zdlpuopuiu.btonecajqb(idEvent, "idEvent");
        zdlpuopuiu.btonecajqb(localKey, "localKey");
        this.f107818iobyxmoadg = idEvent;
        this.f107821zoijcleaow = localKey;
        this.f107819ppxfxbqfkf = tzroggbefp.dxjokdxxww();
        this.f107820wkgbmnqykc = tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg("ext_user_id", "unauthorized"));
    }

    public final void eablkybsjg(String id2) {
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f107820wkgbmnqykc.put("ext_user_id", id2);
    }

    public final Map iobyxmoadg() {
        Map map = this.f107820wkgbmnqykc;
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
        return this.f107818iobyxmoadg;
    }

    public final String toString() {
        return getClass().getName() + "(id = " + zoijcleaow() + ", args = " + iobyxmoadg() + ")";
    }

    protected Map wkgbmnqykc() {
        return this.f107819ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        String str = this.f107818iobyxmoadg;
        String str2 = this.f107821zoijcleaow;
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
