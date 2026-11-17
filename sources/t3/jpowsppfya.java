package t3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public final class jpowsppfya implements rgvfuqvkyq {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f109471eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private oxmwwwfdhm f109472gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f109473iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private dsvhmnatus f109474lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f109475ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f109476wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f109477zoijcleaow;

    public jpowsppfya(int i13, int i14, String str) {
        this.f109473iobyxmoadg = i13;
        this.f109477zoijcleaow = i14;
        this.f109475ppxfxbqfkf = str;
    }

    private void gxszxtbevo(vdvldrhtss vdvldrhtssVar) {
        int iGxszxtbevo = ((dsvhmnatus) y2.iobyxmoadg.eablkybsjg(this.f109474lqeggnwhkg)).gxszxtbevo(vdvldrhtssVar, UserVerificationMethods.USER_VERIFY_ALL, true);
        if (iGxszxtbevo != -1) {
            this.f109476wkgbmnqykc += iGxszxtbevo;
            return;
        }
        this.f109471eablkybsjg = 2;
        this.f109474lqeggnwhkg.zoijcleaow(0L, 1, this.f109476wkgbmnqykc, 0, null);
        this.f109476wkgbmnqykc = 0;
    }

    private void wkgbmnqykc(String str) {
        dsvhmnatus dsvhmnatusVarKcexrzcfyt = this.f109472gxszxtbevo.kcexrzcfyt(UserVerificationMethods.USER_VERIFY_ALL, 4);
        this.f109474lqeggnwhkg = dsvhmnatusVarKcexrzcfyt;
        dsvhmnatusVarKcexrzcfyt.iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().ntlheqmsrt(str).zeieaojujs(str).cllcsxoeiz());
        this.f109472gxszxtbevo.agtfadlqog();
        this.f109472gxszxtbevo.gxszxtbevo(new hkdspvbjdz(-9223372036854775807L));
        this.f109471eablkybsjg = 1;
    }

    @Override // t3.rgvfuqvkyq
    public boolean draadjrbmk(vdvldrhtss vdvldrhtssVar) {
        y2.iobyxmoadg.lqeggnwhkg((this.f109473iobyxmoadg == -1 || this.f109477zoijcleaow == -1) ? false : true);
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(this.f109477zoijcleaow);
        vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 0, this.f109477zoijcleaow);
        return yadqdtsiqtVar.wypolnanlu() == this.f109473iobyxmoadg;
    }

    @Override // t3.rgvfuqvkyq
    public void iobyxmoadg(long j13, long j14) {
        if (j13 == 0 || this.f109471eablkybsjg == 1) {
            this.f109471eablkybsjg = 1;
            this.f109476wkgbmnqykc = 0;
        }
    }

    @Override // t3.rgvfuqvkyq
    public void ppxfxbqfkf(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f109472gxszxtbevo = oxmwwwfdhmVar;
        wkgbmnqykc(this.f109475ppxfxbqfkf);
    }

    @Override // t3.rgvfuqvkyq
    public void release() {
    }

    @Override // t3.rgvfuqvkyq
    public int zoijcleaow(vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) {
        int i13 = this.f109471eablkybsjg;
        if (i13 == 1) {
            gxszxtbevo(vdvldrhtssVar);
            return 0;
        }
        if (i13 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }
}
