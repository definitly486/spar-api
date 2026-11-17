package ma0;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f66667iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f66668ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f66669zoijcleaow;

    public zoijcleaow(String name, boolean z13, List list) {
        zdlpuopuiu.btonecajqb(name, "name");
        this.f66667iobyxmoadg = name;
        this.f66669zoijcleaow = z13;
        this.f66668ppxfxbqfkf = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f66667iobyxmoadg, zoijcleaowVar.f66667iobyxmoadg) && this.f66669zoijcleaow == zoijcleaowVar.f66669zoijcleaow && zdlpuopuiu.eablkybsjg(this.f66668ppxfxbqfkf, zoijcleaowVar.f66668ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f66667iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f66669zoijcleaow)) * 31;
        List list = this.f66668ppxfxbqfkf;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f66667iobyxmoadg;
    }

    public String toString() {
        return this.f66667iobyxmoadg + " = " + this.f66669zoijcleaow + " (args: " + this.f66668ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f66669zoijcleaow;
    }

    public /* synthetic */ zoijcleaow(String str, boolean z13, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : list);
    }
}
