package h4;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ojitshcjhn extends dxjokdxxww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f39366ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f39367zoijcleaow;

    public ojitshcjhn(String str, String str2, String str3) {
        super(str);
        this.f39367zoijcleaow = str2;
        this.f39366ppxfxbqfkf = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ojitshcjhn.class != obj.getClass()) {
            return false;
        }
        ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
        return this.f39346iobyxmoadg.equals(ojitshcjhnVar.f39346iobyxmoadg) && Objects.equals(this.f39367zoijcleaow, ojitshcjhnVar.f39367zoijcleaow) && Objects.equals(this.f39366ppxfxbqfkf, ojitshcjhnVar.f39366ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f39346iobyxmoadg.hashCode()) * 31;
        String str = this.f39367zoijcleaow;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39366ppxfxbqfkf;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // h4.dxjokdxxww
    public String toString() {
        return this.f39346iobyxmoadg + ": url=" + this.f39366ppxfxbqfkf;
    }
}
