package vv1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f118117iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f118118ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f118119zoijcleaow;

    public nufgyqmvbu(String title, String subtitle, String buttonText) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(buttonText, "buttonText");
        this.f118117iobyxmoadg = title;
        this.f118119zoijcleaow = subtitle;
        this.f118118ppxfxbqfkf = buttonText;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f118117iobyxmoadg, nufgyqmvbuVar.f118117iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118119zoijcleaow, nufgyqmvbuVar.f118119zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f118118ppxfxbqfkf, nufgyqmvbuVar.f118118ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f118117iobyxmoadg.hashCode() * 31) + this.f118119zoijcleaow.hashCode()) * 31) + this.f118118ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f118118ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f118117iobyxmoadg;
    }

    public String toString() {
        return "TipsDialogUiModel(title=" + this.f118117iobyxmoadg + ", subtitle=" + this.f118119zoijcleaow + ", buttonText=" + this.f118118ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f118119zoijcleaow;
    }
}
