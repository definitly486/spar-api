package h4;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc extends dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final String[] f39376eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final dxjokdxxww[] f39377gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final boolean f39378ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final boolean f39379wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f39380zoijcleaow;

    public wkgbmnqykc(String str, boolean z13, boolean z14, String[] strArr, dxjokdxxww[] dxjokdxxwwVarArr) {
        super("CTOC");
        this.f39380zoijcleaow = str;
        this.f39378ppxfxbqfkf = z13;
        this.f39379wkgbmnqykc = z14;
        this.f39376eablkybsjg = strArr;
        this.f39377gxszxtbevo = dxjokdxxwwVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wkgbmnqykc.class != obj.getClass()) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f39378ppxfxbqfkf == wkgbmnqykcVar.f39378ppxfxbqfkf && this.f39379wkgbmnqykc == wkgbmnqykcVar.f39379wkgbmnqykc && Objects.equals(this.f39380zoijcleaow, wkgbmnqykcVar.f39380zoijcleaow) && Arrays.equals(this.f39376eablkybsjg, wkgbmnqykcVar.f39376eablkybsjg) && Arrays.equals(this.f39377gxszxtbevo, wkgbmnqykcVar.f39377gxszxtbevo);
    }

    public int hashCode() {
        int i13 = (((527 + (this.f39378ppxfxbqfkf ? 1 : 0)) * 31) + (this.f39379wkgbmnqykc ? 1 : 0)) * 31;
        String str = this.f39380zoijcleaow;
        return i13 + (str != null ? str.hashCode() : 0);
    }
}
