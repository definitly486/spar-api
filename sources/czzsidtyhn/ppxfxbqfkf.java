package czzsidtyhn;

import androidx.compose.runtime.c1;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf implements lxfrhoxuzk {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f26458ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f26460zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f26459wkgbmnqykc = c1.ppxfxbqfkf(j1.wkgbmnqykc.f50504eablkybsjg, null, 2, null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f26457eablkybsjg = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);

    public ppxfxbqfkf(int i13, String str) {
        this.f26460zoijcleaow = i13;
        this.f26458ppxfxbqfkf = str;
    }

    private final void lqeggnwhkg(boolean z13) {
        this.f26457eablkybsjg.setValue(Boolean.valueOf(z13));
    }

    public final j1.wkgbmnqykc eablkybsjg() {
        return (j1.wkgbmnqykc) this.f26459wkgbmnqykc.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && this.f26460zoijcleaow == ((ppxfxbqfkf) obj).f26460zoijcleaow;
    }

    public final void gxszxtbevo(j1.wkgbmnqykc wkgbmnqykcVar) {
        this.f26459wkgbmnqykc.setValue(wkgbmnqykcVar);
    }

    public int hashCode() {
        return this.f26460zoijcleaow;
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return eablkybsjg().f50505iobyxmoadg;
    }

    public final void nufgyqmvbu(v1.skhdrjzrfn skhdrjzrfnVar, int i13) {
        if (i13 == 0 || (i13 & this.f26460zoijcleaow) != 0) {
            gxszxtbevo(skhdrjzrfnVar.gxszxtbevo(this.f26460zoijcleaow));
            lqeggnwhkg(skhdrjzrfnVar.oxmwwwfdhm(this.f26460zoijcleaow));
        }
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return eablkybsjg().f50506ppxfxbqfkf;
    }

    public String toString() {
        return this.f26458ppxfxbqfkf + '(' + eablkybsjg().f50505iobyxmoadg + ", " + eablkybsjg().f50508zoijcleaow + ", " + eablkybsjg().f50506ppxfxbqfkf + ", " + eablkybsjg().f50507wkgbmnqykc + ')';
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int wkgbmnqykc(w0.wkgbmnqykc wkgbmnqykcVar) {
        return eablkybsjg().f50508zoijcleaow;
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar) {
        return eablkybsjg().f50507wkgbmnqykc;
    }
}
