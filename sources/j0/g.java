package j0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jrbgnlbqoe f50203iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jrbgnlbqoe f50204ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final jrbgnlbqoe f50205wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jrbgnlbqoe f50206zoijcleaow;

    public g(jrbgnlbqoe jrbgnlbqoeVar, jrbgnlbqoe jrbgnlbqoeVar2, jrbgnlbqoe jrbgnlbqoeVar3, jrbgnlbqoe jrbgnlbqoeVar4) {
        this.f50203iobyxmoadg = jrbgnlbqoeVar;
        this.f50206zoijcleaow = jrbgnlbqoeVar2;
        this.f50204ppxfxbqfkf = jrbgnlbqoeVar3;
        this.f50205wkgbmnqykc = jrbgnlbqoeVar4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50203iobyxmoadg, gVar.f50203iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50206zoijcleaow, gVar.f50206zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50204ppxfxbqfkf, gVar.f50204ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50205wkgbmnqykc, gVar.f50205wkgbmnqykc);
    }

    public int hashCode() {
        jrbgnlbqoe jrbgnlbqoeVar = this.f50203iobyxmoadg;
        int iHashCode = (jrbgnlbqoeVar != null ? jrbgnlbqoeVar.hashCode() : 0) * 31;
        jrbgnlbqoe jrbgnlbqoeVar2 = this.f50206zoijcleaow;
        int iHashCode2 = (iHashCode + (jrbgnlbqoeVar2 != null ? jrbgnlbqoeVar2.hashCode() : 0)) * 31;
        jrbgnlbqoe jrbgnlbqoeVar3 = this.f50204ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (jrbgnlbqoeVar3 != null ? jrbgnlbqoeVar3.hashCode() : 0)) * 31;
        jrbgnlbqoe jrbgnlbqoeVar4 = this.f50205wkgbmnqykc;
        return iHashCode3 + (jrbgnlbqoeVar4 != null ? jrbgnlbqoeVar4.hashCode() : 0);
    }

    public final jrbgnlbqoe iobyxmoadg() {
        return this.f50206zoijcleaow;
    }

    public final jrbgnlbqoe ppxfxbqfkf() {
        return this.f50205wkgbmnqykc;
    }

    public final jrbgnlbqoe wkgbmnqykc() {
        return this.f50203iobyxmoadg;
    }

    public final jrbgnlbqoe zoijcleaow() {
        return this.f50204ppxfxbqfkf;
    }

    public /* synthetic */ g(jrbgnlbqoe jrbgnlbqoeVar, jrbgnlbqoe jrbgnlbqoeVar2, jrbgnlbqoe jrbgnlbqoeVar3, jrbgnlbqoe jrbgnlbqoeVar4, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : jrbgnlbqoeVar, (i13 & 2) != 0 ? null : jrbgnlbqoeVar2, (i13 & 4) != 0 ? null : jrbgnlbqoeVar3, (i13 & 8) != 0 ? null : jrbgnlbqoeVar4);
    }
}
