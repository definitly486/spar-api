package ks1;

import b21.ppxfxbqfkf;
import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f60513iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ojitshcjhn f60514jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f60515yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f60516zdlpuopuiu;

    public iobyxmoadg(String image, boolean z13, ojitshcjhn navlink, String reference) {
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        this.f60516zdlpuopuiu = image;
        this.f60515yggfygwlhe = z13;
        this.f60514jyumaefscl = navlink;
        this.f60513iwizpuwonk = reference;
    }

    public final ojitshcjhn eablkybsjg() {
        return this.f60514jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f60516zdlpuopuiu, iobyxmoadgVar.f60516zdlpuopuiu) && this.f60515yggfygwlhe == iobyxmoadgVar.f60515yggfygwlhe && this.f60514jyumaefscl == iobyxmoadgVar.f60514jyumaefscl && zdlpuopuiu.eablkybsjg(this.f60513iwizpuwonk, iobyxmoadgVar.f60513iwizpuwonk);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f60516zdlpuopuiu;
    }

    public int hashCode() {
        return (((((this.f60516zdlpuopuiu.hashCode() * 31) + Boolean.hashCode(this.f60515yggfygwlhe)) * 31) + this.f60514jyumaefscl.hashCode()) * 31) + this.f60513iwizpuwonk.hashCode();
    }

    public final boolean iobyxmoadg() {
        return this.f60515yggfygwlhe;
    }

    public final String lqeggnwhkg() {
        return this.f60513iwizpuwonk;
    }

    public String toString() {
        return "SquareCardUiModel(image=" + this.f60516zdlpuopuiu + ", hasShadow=" + this.f60515yggfygwlhe + ", navlink=" + this.f60514jyumaefscl + ", reference=" + this.f60513iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f60516zdlpuopuiu;
    }
}
