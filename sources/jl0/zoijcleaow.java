package jl0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f51690iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f51691ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f51692zoijcleaow;

    public zoijcleaow(int i13, String fullAddress, String address) {
        zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
        zdlpuopuiu.btonecajqb(address, "address");
        this.f51690iobyxmoadg = i13;
        this.f51692zoijcleaow = fullAddress;
        this.f51691ppxfxbqfkf = address;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f51690iobyxmoadg == zoijcleaowVar.f51690iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f51692zoijcleaow, zoijcleaowVar.f51692zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f51691ppxfxbqfkf, zoijcleaowVar.f51691ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f51690iobyxmoadg) * 31) + this.f51692zoijcleaow.hashCode()) * 31) + this.f51691ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f51692zoijcleaow;
    }

    public String toString() {
        return "AddressSearchListUiModel(index=" + this.f51690iobyxmoadg + ", fullAddress=" + this.f51692zoijcleaow + ", address=" + this.f51691ppxfxbqfkf + ")";
    }

    public final Object zoijcleaow() {
        return Integer.valueOf(this.f51690iobyxmoadg);
    }
}
