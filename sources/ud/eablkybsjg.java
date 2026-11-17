package ud;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f113358iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f113359ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f113360zoijcleaow;

    public eablkybsjg(wkgbmnqykc performance, wkgbmnqykc crashlytics, double d13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(performance, "performance");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(crashlytics, "crashlytics");
        this.f113358iobyxmoadg = performance;
        this.f113360zoijcleaow = crashlytics;
        this.f113359ppxfxbqfkf = d13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return this.f113358iobyxmoadg == eablkybsjgVar.f113358iobyxmoadg && this.f113360zoijcleaow == eablkybsjgVar.f113360zoijcleaow && Double.compare(this.f113359ppxfxbqfkf, eablkybsjgVar.f113359ppxfxbqfkf) == 0;
    }

    public int hashCode() {
        return (((this.f113358iobyxmoadg.hashCode() * 31) + this.f113360zoijcleaow.hashCode()) * 31) + Double.hashCode(this.f113359ppxfxbqfkf);
    }

    public final wkgbmnqykc iobyxmoadg() {
        return this.f113360zoijcleaow;
    }

    public final double ppxfxbqfkf() {
        return this.f113359ppxfxbqfkf;
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f113358iobyxmoadg + ", crashlytics=" + this.f113360zoijcleaow + ", sessionSamplingRate=" + this.f113359ppxfxbqfkf + ')';
    }

    public final wkgbmnqykc zoijcleaow() {
        return this.f113358iobyxmoadg;
    }
}
