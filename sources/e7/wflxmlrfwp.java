package e7;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class wflxmlrfwp implements Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Map f30769zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final zoijcleaow f30768yggfygwlhe = new zoijcleaow(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final wflxmlrfwp f30767jyumaefscl = new wflxmlrfwp();

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f30770iobyxmoadg;

        public iobyxmoadg(wflxmlrfwp wflxmlrfwpVar) {
            this.f30770iobyxmoadg = tzroggbefp.iwizpuwonk(wflxmlrfwpVar.f30769zdlpuopuiu);
        }

        public final wflxmlrfwp iobyxmoadg() {
            return new wflxmlrfwp(i7.ppxfxbqfkf.zoijcleaow(this.f30770iobyxmoadg), null);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public /* synthetic */ wflxmlrfwp(Map map, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wflxmlrfwp) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f30769zdlpuopuiu, ((wflxmlrfwp) obj).f30769zdlpuopuiu);
    }

    public int hashCode() {
        return this.f30769zdlpuopuiu.hashCode();
    }

    public final boolean isEmpty() {
        return this.f30769zdlpuopuiu.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Map map = this.f30769zdlpuopuiu;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(entry.getValue());
            arrayList.add(cqumvgiudr.iobyxmoadg(str, null));
        }
        return arrayList.iterator();
    }

    public final iobyxmoadg ppxfxbqfkf() {
        return new iobyxmoadg(this);
    }

    public String toString() {
        return "Parameters(entries=" + this.f30769zdlpuopuiu + ')';
    }

    public final Object wkgbmnqykc(String str) {
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(this.f30769zdlpuopuiu.get(str));
        return null;
    }

    public final Map zoijcleaow() {
        if (isEmpty()) {
            return tzroggbefp.dxjokdxxww();
        }
        Map map = this.f30769zdlpuopuiu;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return linkedHashMap;
        }
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(((Map.Entry) it.next()).getValue());
        throw null;
    }

    private wflxmlrfwp(Map map) {
        this.f30769zdlpuopuiu = map;
    }

    public wflxmlrfwp() {
        this(tzroggbefp.dxjokdxxww());
    }
}
