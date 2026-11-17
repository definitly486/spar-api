package h82;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final iobyxmoadg f39914eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f39915iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f39916ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f39917wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f39918zoijcleaow;

    public enum iobyxmoadg {
        VIDEO,
        IMAGE;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f39919iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public ppxfxbqfkf(String id2, String buttonTitle, String adv, String url, iobyxmoadg type) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(buttonTitle, "buttonTitle");
        zdlpuopuiu.btonecajqb(adv, "adv");
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(type, "type");
        this.f39915iobyxmoadg = id2;
        this.f39918zoijcleaow = buttonTitle;
        this.f39916ppxfxbqfkf = adv;
        this.f39917wkgbmnqykc = url;
        this.f39914eablkybsjg = type;
    }

    public final String eablkybsjg() {
        return this.f39917wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f39915iobyxmoadg, ppxfxbqfkfVar.f39915iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39918zoijcleaow, ppxfxbqfkfVar.f39918zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f39916ppxfxbqfkf, ppxfxbqfkfVar.f39916ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f39917wkgbmnqykc, ppxfxbqfkfVar.f39917wkgbmnqykc) && this.f39914eablkybsjg == ppxfxbqfkfVar.f39914eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f39915iobyxmoadg.hashCode() * 31) + this.f39918zoijcleaow.hashCode()) * 31) + this.f39916ppxfxbqfkf.hashCode()) * 31) + this.f39917wkgbmnqykc.hashCode()) * 31) + this.f39914eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f39916ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f39915iobyxmoadg;
    }

    public String toString() {
        return "StorySlideUiModel(id=" + this.f39915iobyxmoadg + ", buttonTitle=" + this.f39918zoijcleaow + ", adv=" + this.f39916ppxfxbqfkf + ", url=" + this.f39917wkgbmnqykc + ", type=" + this.f39914eablkybsjg + ")";
    }

    public final iobyxmoadg wkgbmnqykc() {
        return this.f39914eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f39918zoijcleaow;
    }
}
