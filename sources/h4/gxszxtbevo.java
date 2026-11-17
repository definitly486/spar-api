package h4;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo extends dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final byte[] f39353eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f39354ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final String f39355wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f39356zoijcleaow;

    public gxszxtbevo(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f39356zoijcleaow = str;
        this.f39354ppxfxbqfkf = str2;
        this.f39355wkgbmnqykc = str3;
        this.f39353eablkybsjg = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gxszxtbevo.class != obj.getClass()) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return Objects.equals(this.f39356zoijcleaow, gxszxtbevoVar.f39356zoijcleaow) && Objects.equals(this.f39354ppxfxbqfkf, gxszxtbevoVar.f39354ppxfxbqfkf) && Objects.equals(this.f39355wkgbmnqykc, gxszxtbevoVar.f39355wkgbmnqykc) && Arrays.equals(this.f39353eablkybsjg, gxszxtbevoVar.f39353eablkybsjg);
    }

    public int hashCode() {
        String str = this.f39356zoijcleaow;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39354ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f39355wkgbmnqykc;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f39353eablkybsjg);
    }

    @Override // h4.dxjokdxxww
    public String toString() {
        return this.f39346iobyxmoadg + ": mimeType=" + this.f39356zoijcleaow + ", filename=" + this.f39354ppxfxbqfkf + ", description=" + this.f39355wkgbmnqykc;
    }
}
