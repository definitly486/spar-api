package hg;

/* JADX INFO: loaded from: classes3.dex */
public final class cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f40223iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f40224zoijcleaow;

    public cllcsxoeiz(int i13, Object obj) {
        this.f40223iobyxmoadg = i13;
        this.f40224zoijcleaow = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cllcsxoeiz)) {
            return false;
        }
        cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) obj;
        return this.f40223iobyxmoadg == cllcsxoeizVar.f40223iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f40224zoijcleaow, cllcsxoeizVar.f40224zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f40223iobyxmoadg) * 31;
        Object obj = this.f40224zoijcleaow;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final int iobyxmoadg() {
        return this.f40223iobyxmoadg;
    }

    public final int ppxfxbqfkf() {
        return this.f40223iobyxmoadg;
    }

    public String toString() {
        return "IndexedValue(index=" + this.f40223iobyxmoadg + ", value=" + this.f40224zoijcleaow + ')';
    }

    public final Object wkgbmnqykc() {
        return this.f40224zoijcleaow;
    }

    public final Object zoijcleaow() {
        return this.f40224zoijcleaow;
    }
}
