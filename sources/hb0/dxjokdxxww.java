package hb0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ib0.iobyxmoadg f40003iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final CharSequence f40004ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f40005zoijcleaow;

    public dxjokdxxww(ib0.iobyxmoadg product, String qrCode, CharSequence qrMsgTitle) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(qrCode, "qrCode");
        zdlpuopuiu.btonecajqb(qrMsgTitle, "qrMsgTitle");
        this.f40003iobyxmoadg = product;
        this.f40005zoijcleaow = qrCode;
        this.f40004ppxfxbqfkf = qrMsgTitle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f40003iobyxmoadg, dxjokdxxwwVar.f40003iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f40005zoijcleaow, dxjokdxxwwVar.f40005zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f40004ppxfxbqfkf, dxjokdxxwwVar.f40004ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f40003iobyxmoadg.hashCode() * 31) + this.f40005zoijcleaow.hashCode()) * 31) + this.f40004ppxfxbqfkf.hashCode();
    }

    public final ib0.iobyxmoadg iobyxmoadg() {
        return this.f40003iobyxmoadg;
    }

    public final CharSequence ppxfxbqfkf() {
        return this.f40004ppxfxbqfkf;
    }

    public String toString() {
        return "Model(product=" + this.f40003iobyxmoadg + ", qrCode=" + this.f40005zoijcleaow + ", qrMsgTitle=" + ((Object) this.f40004ppxfxbqfkf) + ")";
    }

    public final String zoijcleaow() {
        return this.f40005zoijcleaow;
    }
}
