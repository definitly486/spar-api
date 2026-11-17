package czzsidtyhn;

import androidx.compose.runtime.c1;

/* JADX INFO: loaded from: classes.dex */
public final class skhdrjzrfn implements lxfrhoxuzk {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f26471ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f26472zoijcleaow;

    public skhdrjzrfn(ribwqtqdhb ribwqtqdhbVar, String str) {
        this.f26472zoijcleaow = str;
        this.f26471ppxfxbqfkf = c1.ppxfxbqfkf(ribwqtqdhbVar, null, 2, null);
    }

    public final ribwqtqdhb eablkybsjg() {
        return (ribwqtqdhb) this.f26471ppxfxbqfkf.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof skhdrjzrfn) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjg(), ((skhdrjzrfn) obj).eablkybsjg());
        }
        return false;
    }

    public final void gxszxtbevo(ribwqtqdhb ribwqtqdhbVar) {
        this.f26471ppxfxbqfkf.setValue(ribwqtqdhbVar);
    }

    public int hashCode() {
        return this.f26472zoijcleaow.hashCode();
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return eablkybsjg().zoijcleaow();
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return eablkybsjg().ppxfxbqfkf();
    }

    public String toString() {
        return this.f26472zoijcleaow + "(left=" + eablkybsjg().zoijcleaow() + ", top=" + eablkybsjg().wkgbmnqykc() + ", right=" + eablkybsjg().ppxfxbqfkf() + ", bottom=" + eablkybsjg().iobyxmoadg() + ')';
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int wkgbmnqykc(w0.wkgbmnqykc wkgbmnqykcVar) {
        return eablkybsjg().wkgbmnqykc();
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar) {
        return eablkybsjg().iobyxmoadg();
    }
}
