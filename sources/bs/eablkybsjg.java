package bs;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f16964eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f16965iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f16966ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f16967wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f16968zoijcleaow;

    public eablkybsjg(String id2, String name, String date, int i13, String comment) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(comment, "comment");
        this.f16965iobyxmoadg = id2;
        this.f16968zoijcleaow = name;
        this.f16966ppxfxbqfkf = date;
        this.f16967wkgbmnqykc = i13;
        this.f16964eablkybsjg = comment;
    }

    public final int eablkybsjg() {
        return this.f16967wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f16965iobyxmoadg, eablkybsjgVar.f16965iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f16968zoijcleaow, eablkybsjgVar.f16968zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f16966ppxfxbqfkf, eablkybsjgVar.f16966ppxfxbqfkf) && this.f16967wkgbmnqykc == eablkybsjgVar.f16967wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f16964eablkybsjg, eablkybsjgVar.f16964eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f16965iobyxmoadg.hashCode() * 31) + this.f16968zoijcleaow.hashCode()) * 31) + this.f16966ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f16967wkgbmnqykc)) * 31) + this.f16964eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f16964eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f16965iobyxmoadg;
    }

    public String toString() {
        return "UserReviewItemUiModel(id=" + this.f16965iobyxmoadg + ", name=" + this.f16968zoijcleaow + ", date=" + this.f16966ppxfxbqfkf + ", rating=" + this.f16967wkgbmnqykc + ", comment=" + this.f16964eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f16968zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f16966ppxfxbqfkf;
    }
}
