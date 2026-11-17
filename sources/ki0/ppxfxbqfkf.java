package ki0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f55700iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f55701ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f55702wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f55703zoijcleaow;

    public ppxfxbqfkf(String itemId, boolean z13, int i13, String url) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(url, "url");
        this.f55700iobyxmoadg = itemId;
        this.f55703zoijcleaow = z13;
        this.f55701ppxfxbqfkf = i13;
        this.f55702wkgbmnqykc = url;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f55700iobyxmoadg, ppxfxbqfkfVar.f55700iobyxmoadg) && this.f55703zoijcleaow == ppxfxbqfkfVar.f55703zoijcleaow && this.f55701ppxfxbqfkf == ppxfxbqfkfVar.f55701ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f55702wkgbmnqykc, ppxfxbqfkfVar.f55702wkgbmnqykc);
    }

    @Override // ki0.wkgbmnqykc
    public String getItemId() {
        return this.f55700iobyxmoadg;
    }

    public int hashCode() {
        return (((((this.f55700iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f55703zoijcleaow)) * 31) + Integer.hashCode(this.f55701ppxfxbqfkf)) * 31) + this.f55702wkgbmnqykc.hashCode();
    }

    public int iobyxmoadg() {
        return this.f55701ppxfxbqfkf;
    }

    public boolean ppxfxbqfkf() {
        return this.f55703zoijcleaow;
    }

    public String toString() {
        return "Url(itemId=" + this.f55700iobyxmoadg + ", isOpen=" + this.f55703zoijcleaow + ", count=" + this.f55701ppxfxbqfkf + ", url=" + this.f55702wkgbmnqykc + ")";
    }

    public final String zoijcleaow() {
        return this.f55702wkgbmnqykc;
    }
}
