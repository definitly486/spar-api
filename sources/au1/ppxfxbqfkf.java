package au1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final iobyxmoadg f14617eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f14618iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f14619ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f14620wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f14621zoijcleaow;

    public enum iobyxmoadg {
        VIDEO,
        IMAGE;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f14622iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public ppxfxbqfkf(String id2, String buttonTitle, String adv, String url, iobyxmoadg type) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(buttonTitle, "buttonTitle");
        zdlpuopuiu.btonecajqb(adv, "adv");
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(type, "type");
        this.f14618iobyxmoadg = id2;
        this.f14621zoijcleaow = buttonTitle;
        this.f14619ppxfxbqfkf = adv;
        this.f14620wkgbmnqykc = url;
        this.f14617eablkybsjg = type;
    }

    public final String eablkybsjg() {
        return this.f14620wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f14618iobyxmoadg, ppxfxbqfkfVar.f14618iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14621zoijcleaow, ppxfxbqfkfVar.f14621zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f14619ppxfxbqfkf, ppxfxbqfkfVar.f14619ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f14620wkgbmnqykc, ppxfxbqfkfVar.f14620wkgbmnqykc) && this.f14617eablkybsjg == ppxfxbqfkfVar.f14617eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f14618iobyxmoadg.hashCode() * 31) + this.f14621zoijcleaow.hashCode()) * 31) + this.f14619ppxfxbqfkf.hashCode()) * 31) + this.f14620wkgbmnqykc.hashCode()) * 31) + this.f14617eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f14619ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f14618iobyxmoadg;
    }

    public String toString() {
        return "StorySlideUiModel(id=" + this.f14618iobyxmoadg + ", buttonTitle=" + this.f14621zoijcleaow + ", adv=" + this.f14619ppxfxbqfkf + ", url=" + this.f14620wkgbmnqykc + ", type=" + this.f14617eablkybsjg + ")";
    }

    public final iobyxmoadg wkgbmnqykc() {
        return this.f14617eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f14621zoijcleaow;
    }
}
