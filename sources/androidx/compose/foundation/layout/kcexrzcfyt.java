package androidx.compose.foundation.layout;

import czzsidtyhn.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
final class kcexrzcfyt extends oxmwwwfdhm {

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f4868pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private jhduphickx f4869ylkuphrtab;

    public kcexrzcfyt(jhduphickx jhduphickxVar, boolean z13) {
        this.f4869ylkuphrtab = jhduphickxVar;
        this.f4868pkzmftpjix = z13;
    }

    @Override // androidx.compose.foundation.layout.oxmwwwfdhm
    public long I0(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        int iCzzsidtyhn = this.f4869ylkuphrtab == jhduphickx.Min ? pmvmpeibljVar.czzsidtyhn(w0.zoijcleaow.gtknphoqwx(j13)) : pmvmpeibljVar.ydmasvzmpa(w0.zoijcleaow.gtknphoqwx(j13));
        if (iCzzsidtyhn < 0) {
            iCzzsidtyhn = 0;
        }
        return w0.zoijcleaow.f118283zoijcleaow.eablkybsjg(iCzzsidtyhn);
    }

    @Override // androidx.compose.foundation.layout.oxmwwwfdhm
    public boolean J0() {
        return this.f4868pkzmftpjix;
    }

    public void L0(boolean z13) {
        this.f4868pkzmftpjix = z13;
    }

    public final void M0(jhduphickx jhduphickxVar) {
        this.f4869ylkuphrtab = jhduphickxVar;
    }

    @Override // z.yadqdtsiqt
    public int cdpycssgdh(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        return this.f4869ylkuphrtab == jhduphickx.Min ? draadjrbmkVar.czzsidtyhn(i13) : draadjrbmkVar.ydmasvzmpa(i13);
    }

    @Override // z.yadqdtsiqt
    public int lmojexxdyd(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        return this.f4869ylkuphrtab == jhduphickx.Min ? draadjrbmkVar.czzsidtyhn(i13) : draadjrbmkVar.ydmasvzmpa(i13);
    }
}
