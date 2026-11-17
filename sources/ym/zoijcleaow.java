package ym;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f125925iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f125926ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f125927zoijcleaow;

    public zoijcleaow(int i13, String fullAddress, String address) {
        zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
        zdlpuopuiu.btonecajqb(address, "address");
        this.f125925iobyxmoadg = i13;
        this.f125927zoijcleaow = fullAddress;
        this.f125926ppxfxbqfkf = address;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f125925iobyxmoadg == zoijcleaowVar.f125925iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f125927zoijcleaow, zoijcleaowVar.f125927zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f125926ppxfxbqfkf, zoijcleaowVar.f125926ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f125925iobyxmoadg) * 31) + this.f125927zoijcleaow.hashCode()) * 31) + this.f125926ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f125927zoijcleaow;
    }

    public String toString() {
        return "AddressSearchListUiModel(index=" + this.f125925iobyxmoadg + ", fullAddress=" + this.f125927zoijcleaow + ", address=" + this.f125926ppxfxbqfkf + ")";
    }

    public final Object zoijcleaow() {
        return Integer.valueOf(this.f125925iobyxmoadg);
    }
}
