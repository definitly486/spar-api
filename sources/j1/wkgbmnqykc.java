package j1;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final wkgbmnqykc f50504eablkybsjg = new wkgbmnqykc(0, 0, 0, 0);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f50505iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f50506ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f50507wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f50508zoijcleaow;

    static class iobyxmoadg {
        static Insets iobyxmoadg(int i13, int i14, int i15, int i16) {
            return Insets.of(i13, i14, i15, i16);
        }
    }

    private wkgbmnqykc(int i13, int i14, int i15, int i16) {
        this.f50505iobyxmoadg = i13;
        this.f50508zoijcleaow = i14;
        this.f50506ppxfxbqfkf = i15;
        this.f50507wkgbmnqykc = i16;
    }

    public static wkgbmnqykc iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, wkgbmnqykc wkgbmnqykcVar2) {
        return zoijcleaow(Math.max(wkgbmnqykcVar.f50505iobyxmoadg, wkgbmnqykcVar2.f50505iobyxmoadg), Math.max(wkgbmnqykcVar.f50508zoijcleaow, wkgbmnqykcVar2.f50508zoijcleaow), Math.max(wkgbmnqykcVar.f50506ppxfxbqfkf, wkgbmnqykcVar2.f50506ppxfxbqfkf), Math.max(wkgbmnqykcVar.f50507wkgbmnqykc, wkgbmnqykcVar2.f50507wkgbmnqykc));
    }

    public static wkgbmnqykc ppxfxbqfkf(Rect rect) {
        return zoijcleaow(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static wkgbmnqykc wkgbmnqykc(Insets insets) {
        return zoijcleaow(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static wkgbmnqykc zoijcleaow(int i13, int i14, int i15, int i16) {
        return (i13 == 0 && i14 == 0 && i15 == 0 && i16 == 0) ? f50504eablkybsjg : new wkgbmnqykc(i13, i14, i15, i16);
    }

    public Insets eablkybsjg() {
        return iobyxmoadg.iobyxmoadg(this.f50505iobyxmoadg, this.f50508zoijcleaow, this.f50506ppxfxbqfkf, this.f50507wkgbmnqykc);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wkgbmnqykc.class != obj.getClass()) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f50507wkgbmnqykc == wkgbmnqykcVar.f50507wkgbmnqykc && this.f50505iobyxmoadg == wkgbmnqykcVar.f50505iobyxmoadg && this.f50506ppxfxbqfkf == wkgbmnqykcVar.f50506ppxfxbqfkf && this.f50508zoijcleaow == wkgbmnqykcVar.f50508zoijcleaow;
    }

    public int hashCode() {
        return (((((this.f50505iobyxmoadg * 31) + this.f50508zoijcleaow) * 31) + this.f50506ppxfxbqfkf) * 31) + this.f50507wkgbmnqykc;
    }

    public String toString() {
        return "Insets{left=" + this.f50505iobyxmoadg + ", top=" + this.f50508zoijcleaow + ", right=" + this.f50506ppxfxbqfkf + ", bottom=" + this.f50507wkgbmnqykc + '}';
    }
}
