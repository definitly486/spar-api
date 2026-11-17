package gy;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f38662eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f38663iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f38664ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f38665wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f38666zoijcleaow;

    public agtfadlqog(String title, String str, String str2, String str3, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f38663iobyxmoadg = title;
        this.f38666zoijcleaow = str;
        this.f38664ppxfxbqfkf = str2;
        this.f38665wkgbmnqykc = str3;
        this.f38662eablkybsjg = z13;
    }

    public final boolean eablkybsjg() {
        return this.f38662eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtfadlqog)) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return zdlpuopuiu.eablkybsjg(this.f38663iobyxmoadg, agtfadlqogVar.f38663iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f38666zoijcleaow, agtfadlqogVar.f38666zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f38664ppxfxbqfkf, agtfadlqogVar.f38664ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f38665wkgbmnqykc, agtfadlqogVar.f38665wkgbmnqykc) && this.f38662eablkybsjg == agtfadlqogVar.f38662eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = this.f38663iobyxmoadg.hashCode() * 31;
        String str = this.f38666zoijcleaow;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f38664ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f38665wkgbmnqykc;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.f38662eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f38664ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f38665wkgbmnqykc;
    }

    public String toString() {
        return "IntervalInfoEntity(title=" + this.f38663iobyxmoadg + ", subtitle=" + this.f38666zoijcleaow + ", date=" + this.f38664ppxfxbqfkf + ", time=" + this.f38665wkgbmnqykc + ", isOnlyOne=" + this.f38662eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f38663iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f38666zoijcleaow;
    }
}
