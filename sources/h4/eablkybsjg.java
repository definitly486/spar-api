package h4;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg extends dxjokdxxww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f39347ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final String f39348wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f39349zoijcleaow;

    public eablkybsjg(String str, String str2, String str3) {
        super("COMM");
        this.f39349zoijcleaow = str;
        this.f39347ppxfxbqfkf = str2;
        this.f39348wkgbmnqykc = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eablkybsjg.class != obj.getClass()) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return Objects.equals(this.f39347ppxfxbqfkf, eablkybsjgVar.f39347ppxfxbqfkf) && Objects.equals(this.f39349zoijcleaow, eablkybsjgVar.f39349zoijcleaow) && Objects.equals(this.f39348wkgbmnqykc, eablkybsjgVar.f39348wkgbmnqykc);
    }

    public int hashCode() {
        String str = this.f39349zoijcleaow;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39347ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f39348wkgbmnqykc;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // h4.dxjokdxxww
    public String toString() {
        return this.f39346iobyxmoadg + ": language=" + this.f39349zoijcleaow + ", description=" + this.f39347ppxfxbqfkf + ", text=" + this.f39348wkgbmnqykc;
    }
}
