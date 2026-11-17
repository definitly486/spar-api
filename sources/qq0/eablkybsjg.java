package qq0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f80497eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f80498iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f80499ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f80500wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f80501zoijcleaow;

    public eablkybsjg(String id2, String name, String date, int i13, String comment) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(comment, "comment");
        this.f80498iobyxmoadg = id2;
        this.f80501zoijcleaow = name;
        this.f80499ppxfxbqfkf = date;
        this.f80500wkgbmnqykc = i13;
        this.f80497eablkybsjg = comment;
    }

    public final int eablkybsjg() {
        return this.f80500wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f80498iobyxmoadg, eablkybsjgVar.f80498iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f80501zoijcleaow, eablkybsjgVar.f80501zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f80499ppxfxbqfkf, eablkybsjgVar.f80499ppxfxbqfkf) && this.f80500wkgbmnqykc == eablkybsjgVar.f80500wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f80497eablkybsjg, eablkybsjgVar.f80497eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f80498iobyxmoadg.hashCode() * 31) + this.f80501zoijcleaow.hashCode()) * 31) + this.f80499ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f80500wkgbmnqykc)) * 31) + this.f80497eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f80497eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f80498iobyxmoadg;
    }

    public String toString() {
        return "UserReviewItemUiModel(id=" + this.f80498iobyxmoadg + ", name=" + this.f80501zoijcleaow + ", date=" + this.f80499ppxfxbqfkf + ", rating=" + this.f80500wkgbmnqykc + ", comment=" + this.f80497eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f80501zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f80499ppxfxbqfkf;
    }
}
