package ba2;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f15602iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f15603ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f15604zoijcleaow;

    public nufgyqmvbu(String title, String subtitle, String buttonText) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(buttonText, "buttonText");
        this.f15602iobyxmoadg = title;
        this.f15604zoijcleaow = subtitle;
        this.f15603ppxfxbqfkf = buttonText;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f15602iobyxmoadg, nufgyqmvbuVar.f15602iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f15604zoijcleaow, nufgyqmvbuVar.f15604zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f15603ppxfxbqfkf, nufgyqmvbuVar.f15603ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f15602iobyxmoadg.hashCode() * 31) + this.f15604zoijcleaow.hashCode()) * 31) + this.f15603ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f15603ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f15602iobyxmoadg;
    }

    public String toString() {
        return "TipsDialogUiModel(title=" + this.f15602iobyxmoadg + ", subtitle=" + this.f15604zoijcleaow + ", buttonText=" + this.f15603ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f15604zoijcleaow;
    }
}
