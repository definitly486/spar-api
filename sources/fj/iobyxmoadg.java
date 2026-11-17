package fj;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f34022iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f34023zoijcleaow;

    public iobyxmoadg(Object obj, Object obj2) {
        this.f34022iobyxmoadg = obj;
        this.f34023zoijcleaow = obj2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f34022iobyxmoadg, iobyxmoadgVar.f34022iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f34023zoijcleaow, iobyxmoadgVar.f34023zoijcleaow);
    }

    public int hashCode() {
        Object obj = this.f34022iobyxmoadg;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f34023zoijcleaow;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final Object iobyxmoadg() {
        return this.f34022iobyxmoadg;
    }

    public final Object ppxfxbqfkf() {
        return this.f34022iobyxmoadg;
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f34022iobyxmoadg + ", upper=" + this.f34023zoijcleaow + ')';
    }

    public final Object wkgbmnqykc() {
        return this.f34023zoijcleaow;
    }

    public final Object zoijcleaow() {
        return this.f34023zoijcleaow;
    }
}
