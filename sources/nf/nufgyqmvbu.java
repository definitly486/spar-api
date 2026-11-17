package nf;

import com.pandulapeter.beagle.common.configuration.Text;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu implements jf.iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f69941gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final Void f69942lqeggnwhkg = null;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final tg.draadjrbmk f69943eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Text f69944iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f69945ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f69946wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f69947zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public nufgyqmvbu(Text title, List items, boolean z13, String id2, tg.draadjrbmk draadjrbmkVar) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f69944iobyxmoadg = title;
        this.f69947zoijcleaow = items;
        this.f69945ppxfxbqfkf = z13;
        this.f69946wkgbmnqykc = id2;
        this.f69943eablkybsjg = draadjrbmkVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f69944iobyxmoadg, nufgyqmvbuVar.f69944iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f69947zoijcleaow, nufgyqmvbuVar.f69947zoijcleaow) && this.f69945ppxfxbqfkf == nufgyqmvbuVar.f69945ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f69946wkgbmnqykc, nufgyqmvbuVar.f69946wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f69943eablkybsjg, nufgyqmvbuVar.f69943eablkybsjg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public int hashCode() {
        int iHashCode = ((this.f69944iobyxmoadg.hashCode() * 31) + this.f69947zoijcleaow.hashCode()) * 31;
        boolean z13 = this.f69945ppxfxbqfkf;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int iHashCode2 = (((iHashCode + r13) * 31) + this.f69946wkgbmnqykc.hashCode()) * 31;
        tg.draadjrbmk draadjrbmkVar = this.f69943eablkybsjg;
        return iHashCode2 + (draadjrbmkVar == null ? 0 : draadjrbmkVar.hashCode());
    }

    public String toString() {
        return "ItemListModule(title=" + this.f69944iobyxmoadg + ", items=" + this.f69947zoijcleaow + ", isExpandedInitially=" + this.f69945ppxfxbqfkf + ", id=" + this.f69946wkgbmnqykc + ", onItemSelected=" + this.f69943eablkybsjg + ")";
    }

    public /* synthetic */ nufgyqmvbu(Text text, List list, boolean z13, String str, tg.draadjrbmk draadjrbmkVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(text, list, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? kf.ppxfxbqfkf.zoijcleaow() : str, (i13 & 16) != 0 ? (tg.draadjrbmk) f69942lqeggnwhkg : draadjrbmkVar);
    }
}
