package h4;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx extends dxjokdxxww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f39350ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final String f39351wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f39352zoijcleaow;

    public gtknphoqwx(String str, String str2, String str3) {
        super("----");
        this.f39352zoijcleaow = str;
        this.f39350ppxfxbqfkf = str2;
        this.f39351wkgbmnqykc = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gtknphoqwx.class != obj.getClass()) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        return Objects.equals(this.f39350ppxfxbqfkf, gtknphoqwxVar.f39350ppxfxbqfkf) && Objects.equals(this.f39352zoijcleaow, gtknphoqwxVar.f39352zoijcleaow) && Objects.equals(this.f39351wkgbmnqykc, gtknphoqwxVar.f39351wkgbmnqykc);
    }

    public int hashCode() {
        String str = this.f39352zoijcleaow;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39350ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f39351wkgbmnqykc;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // h4.dxjokdxxww
    public String toString() {
        return this.f39346iobyxmoadg + ": domain=" + this.f39352zoijcleaow + ", description=" + this.f39350ppxfxbqfkf;
    }
}
