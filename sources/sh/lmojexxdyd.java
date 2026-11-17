package sh;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class lmojexxdyd {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f106554eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dsvhmnatus f106555iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f106556ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gg.gtknphoqwx f106557wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dsvhmnatus f106558zoijcleaow;

    public lmojexxdyd(dsvhmnatus globalLevel, dsvhmnatus dsvhmnatusVar, Map userDefinedLevelForSpecificAnnotation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(globalLevel, "globalLevel");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f106555iobyxmoadg = globalLevel;
        this.f106558zoijcleaow = dsvhmnatusVar;
        this.f106556ppxfxbqfkf = userDefinedLevelForSpecificAnnotation;
        this.f106557wkgbmnqykc = gg.draadjrbmk.zoijcleaow(new iozdgvuglv(this));
        dsvhmnatus dsvhmnatusVar2 = dsvhmnatus.IGNORE;
        this.f106554eablkybsjg = globalLevel == dsvhmnatusVar2 && dsvhmnatusVar == dsvhmnatusVar2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] zoijcleaow(lmojexxdyd lmojexxdydVar) {
        List listPpxfxbqfkf = hg.jyumaefscl.ppxfxbqfkf();
        listPpxfxbqfkf.add(lmojexxdydVar.f106555iobyxmoadg.wkgbmnqykc());
        dsvhmnatus dsvhmnatusVar = lmojexxdydVar.f106558zoijcleaow;
        if (dsvhmnatusVar != null) {
            listPpxfxbqfkf.add("under-migration:" + dsvhmnatusVar.wkgbmnqykc());
        }
        for (Map.Entry entry : lmojexxdydVar.f106556ppxfxbqfkf.entrySet()) {
            listPpxfxbqfkf.add('@' + entry.getKey() + ':' + ((dsvhmnatus) entry.getValue()).wkgbmnqykc());
        }
        return (String[]) hg.jyumaefscl.iobyxmoadg(listPpxfxbqfkf).toArray(new String[0]);
    }

    public final Map eablkybsjg() {
        return this.f106556ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmojexxdyd)) {
            return false;
        }
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) obj;
        return this.f106555iobyxmoadg == lmojexxdydVar.f106555iobyxmoadg && this.f106558zoijcleaow == lmojexxdydVar.f106558zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f106556ppxfxbqfkf, lmojexxdydVar.f106556ppxfxbqfkf);
    }

    public final boolean gxszxtbevo() {
        return this.f106554eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = this.f106555iobyxmoadg.hashCode() * 31;
        dsvhmnatus dsvhmnatusVar = this.f106558zoijcleaow;
        return ((iHashCode + (dsvhmnatusVar == null ? 0 : dsvhmnatusVar.hashCode())) * 31) + this.f106556ppxfxbqfkf.hashCode();
    }

    public final dsvhmnatus ppxfxbqfkf() {
        return this.f106555iobyxmoadg;
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f106555iobyxmoadg + ", migrationLevel=" + this.f106558zoijcleaow + ", userDefinedLevelForSpecificAnnotation=" + this.f106556ppxfxbqfkf + ')';
    }

    public final dsvhmnatus wkgbmnqykc() {
        return this.f106558zoijcleaow;
    }

    public /* synthetic */ lmojexxdyd(dsvhmnatus dsvhmnatusVar, dsvhmnatus dsvhmnatusVar2, Map map, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(dsvhmnatusVar, (i13 & 2) != 0 ? null : dsvhmnatusVar2, (i13 & 4) != 0 ? hg.tzroggbefp.dxjokdxxww() : map);
    }
}
