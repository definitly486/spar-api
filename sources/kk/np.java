package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class np {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f57837iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f57838zoijcleaow;

    public np(int i13, vu text) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
        this.f57837iobyxmoadg = i13;
        this.f57838zoijcleaow = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np)) {
            return false;
        }
        np npVar = (np) obj;
        return this.f57837iobyxmoadg == npVar.f57837iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57838zoijcleaow, npVar.f57838zoijcleaow);
    }

    public final int hashCode() {
        return this.f57838zoijcleaow.hashCode() + (Integer.hashCode(this.f57837iobyxmoadg) * 31);
    }

    public final String toString() {
        return "HintHelperItem(priority=" + this.f57837iobyxmoadg + ", text=" + this.f57838zoijcleaow + ")";
    }
}
