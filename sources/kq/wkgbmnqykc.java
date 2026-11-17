package kq;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f60388iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f60389zoijcleaow;

    public wkgbmnqykc(String name, String phone) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(phone, "phone");
        this.f60388iobyxmoadg = name;
        this.f60389zoijcleaow = phone;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f60388iobyxmoadg, wkgbmnqykcVar.f60388iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f60389zoijcleaow, wkgbmnqykcVar.f60389zoijcleaow);
    }

    @Override // kq.btonecajqb
    public Object getId() {
        return "CartOrderReceiverUiModel";
    }

    @Override // kq.btonecajqb
    public gtknphoqwx getType() {
        return gtknphoqwx.RECEIVER;
    }

    public int hashCode() {
        return (this.f60388iobyxmoadg.hashCode() * 31) + this.f60389zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f60388iobyxmoadg;
    }

    public String toString() {
        return "CartOrderReceiverUiModel(name=" + this.f60388iobyxmoadg + ", phone=" + this.f60389zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f60389zoijcleaow;
    }
}
