package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class jo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f57212iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f57213zoijcleaow;

    public jo(int i13, vu text) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
        this.f57212iobyxmoadg = i13;
        this.f57213zoijcleaow = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo)) {
            return false;
        }
        jo joVar = (jo) obj;
        return this.f57212iobyxmoadg == joVar.f57212iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57213zoijcleaow, joVar.f57213zoijcleaow);
    }

    public final int hashCode() {
        return this.f57213zoijcleaow.hashCode() + (Integer.hashCode(this.f57212iobyxmoadg) * 31);
    }

    public final String toString() {
        return "HintHelper(priority=" + this.f57212iobyxmoadg + ", text=" + this.f57213zoijcleaow + ")";
    }
}
