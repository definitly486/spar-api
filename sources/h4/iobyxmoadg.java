package h4;

import java.util.Arrays;
import java.util.Objects;
import v2.yggfygwlhe;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final byte[] f39357eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f39358ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f39359wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f39360zoijcleaow;

    public iobyxmoadg(String str, String str2, int i13, byte[] bArr) {
        super("APIC");
        this.f39360zoijcleaow = str;
        this.f39358ppxfxbqfkf = str2;
        this.f39359wkgbmnqykc = i13;
        this.f39357eablkybsjg = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iobyxmoadg.class != obj.getClass()) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f39359wkgbmnqykc == iobyxmoadgVar.f39359wkgbmnqykc && Objects.equals(this.f39360zoijcleaow, iobyxmoadgVar.f39360zoijcleaow) && Objects.equals(this.f39358ppxfxbqfkf, iobyxmoadgVar.f39358ppxfxbqfkf) && Arrays.equals(this.f39357eablkybsjg, iobyxmoadgVar.f39357eablkybsjg);
    }

    public int hashCode() {
        int i13 = (527 + this.f39359wkgbmnqykc) * 31;
        String str = this.f39360zoijcleaow;
        int iHashCode = (i13 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39358ppxfxbqfkf;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f39357eablkybsjg);
    }

    @Override // h4.dxjokdxxww
    public String toString() {
        return this.f39346iobyxmoadg + ": mimeType=" + this.f39360zoijcleaow + ", description=" + this.f39358ppxfxbqfkf;
    }

    @Override // v2.jyumaefscl.iobyxmoadg
    public void zoijcleaow(yggfygwlhe.zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.hcddaimhww(this.f39357eablkybsjg, this.f39359wkgbmnqykc);
    }
}
