package a5;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.Collections;
import t3.dsvhmnatus;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww implements wflxmlrfwp {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final byte[] f428cqumvgiudr = {73, 68, 51};

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f429agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f430btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f431draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private dsvhmnatus f432dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f433eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f434gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f435gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f436iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private long f437iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private dsvhmnatus f438jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private long f439kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private String f440lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private dsvhmnatus f441nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f442ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f443oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y2.yadqdtsiqt f444ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f445rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f446vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f447wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f448wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f449yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f450zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.cdpycssgdh f451zoijcleaow;

    public dxjokdxxww(boolean z13, String str) {
        this(z13, null, 0, str);
    }

    private void agtfadlqog() {
        this.f451zoijcleaow.rgvfuqvkyq(0);
        if (this.f443oxmwwwfdhm) {
            this.f451zoijcleaow.oxmwwwfdhm(10);
        } else {
            int i13 = 2;
            int iNufgyqmvbu = this.f451zoijcleaow.nufgyqmvbu(2) + 1;
            if (iNufgyqmvbu != 2) {
                y2.kcexrzcfyt.nufgyqmvbu("AdtsReader", "Detected audio object type: " + iNufgyqmvbu + ", but assuming AAC LC.");
            } else {
                i13 = iNufgyqmvbu;
            }
            this.f451zoijcleaow.oxmwwwfdhm(5);
            byte[] bArrIobyxmoadg = t3.iobyxmoadg.iobyxmoadg(i13, this.f445rgvfuqvkyq, this.f451zoijcleaow.nufgyqmvbu(3));
            t3.iobyxmoadg.zoijcleaow zoijcleaowVarEablkybsjg = t3.iobyxmoadg.eablkybsjg(bArrIobyxmoadg);
            androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(this.f440lqeggnwhkg).ntlheqmsrt(this.f435gxszxtbevo).zeieaojujs("audio/mp4a-latm").tzroggbefp(zoijcleaowVarEablkybsjg.f109439ppxfxbqfkf).kegysxyocb(zoijcleaowVarEablkybsjg.f109440zoijcleaow).nuxfzjnpeb(zoijcleaowVarEablkybsjg.f109438iobyxmoadg).metgxyhuhe(Collections.singletonList(bArrIobyxmoadg)).uwvvkdfqfp(this.f448wkgbmnqykc).weqkydbzbr(this.f433eablkybsjg).cllcsxoeiz();
            this.f439kcexrzcfyt = 1024000000 / ((long) iobyxmoadgVarCllcsxoeiz.f9759iozdgvuglv);
            this.f441nufgyqmvbu.iobyxmoadg(iobyxmoadgVarCllcsxoeiz);
            this.f443oxmwwwfdhm = true;
        }
        this.f451zoijcleaow.oxmwwwfdhm(4);
        int iNufgyqmvbu2 = this.f451zoijcleaow.nufgyqmvbu(13);
        int i14 = iNufgyqmvbu2 - 7;
        if (this.f447wflxmlrfwp) {
            i14 = iNufgyqmvbu2 - 9;
        }
        jyumaefscl(this.f441nufgyqmvbu, this.f439kcexrzcfyt, 0, i14);
    }

    private void btonecajqb(y2.yadqdtsiqt yadqdtsiqtVar) {
        byte[] bArrEablkybsjg = yadqdtsiqtVar.eablkybsjg();
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        while (iGxszxtbevo < iLqeggnwhkg) {
            int i13 = iGxszxtbevo + 1;
            byte b13 = bArrEablkybsjg[iGxszxtbevo];
            int i14 = b13 & 255;
            if (this.f431draadjrbmk == 512 && draadjrbmk((byte) -1, (byte) i14) && (this.f429agtfadlqog || nufgyqmvbu(yadqdtsiqtVar, iGxszxtbevo - 1))) {
                this.f446vdvldrhtss = (b13 & 8) >> 3;
                this.f447wflxmlrfwp = (b13 & 1) == 0;
                if (this.f429agtfadlqog) {
                    zdlpuopuiu();
                } else {
                    oxmwwwfdhm();
                }
                yadqdtsiqtVar.sopmlzcsov(i13);
                return;
            }
            int i15 = this.f431draadjrbmk;
            int i16 = i14 | i15;
            if (i16 == 329) {
                this.f431draadjrbmk = 768;
            } else if (i16 == 511) {
                this.f431draadjrbmk = UserVerificationMethods.USER_VERIFY_NONE;
            } else if (i16 == 836) {
                this.f431draadjrbmk = UserVerificationMethods.USER_VERIFY_ALL;
            } else if (i16 == 1075) {
                yggfygwlhe();
                yadqdtsiqtVar.sopmlzcsov(i13);
                return;
            } else if (i15 != 256) {
                this.f431draadjrbmk = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
            iGxszxtbevo = i13;
        }
        yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
    }

    private boolean draadjrbmk(byte b13, byte b14) {
        return wflxmlrfwp(((b13 & 255) << 8) | (b14 & 255));
    }

    private boolean dxjokdxxww(y2.yadqdtsiqt yadqdtsiqtVar, byte[] bArr, int i13) {
        int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), i13 - this.f434gtknphoqwx);
        yadqdtsiqtVar.draadjrbmk(bArr, this.f434gtknphoqwx, iMin);
        int i14 = this.f434gtknphoqwx + iMin;
        this.f434gtknphoqwx = i14;
        return i14 == i13;
    }

    private boolean iwizpuwonk(y2.yadqdtsiqt yadqdtsiqtVar, byte[] bArr, int i13) {
        if (yadqdtsiqtVar.iobyxmoadg() < i13) {
            return false;
        }
        yadqdtsiqtVar.draadjrbmk(bArr, 0, i13);
        return true;
    }

    private void jyumaefscl(dsvhmnatus dsvhmnatusVar, long j13, int i13, int i14) {
        this.f430btonecajqb = 4;
        this.f434gtknphoqwx = i13;
        this.f438jyumaefscl = dsvhmnatusVar;
        this.f437iwizpuwonk = j13;
        this.f450zdlpuopuiu = i14;
    }

    private void kcexrzcfyt() {
        this.f430btonecajqb = 0;
        this.f434gtknphoqwx = 0;
        this.f431draadjrbmk = UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    private void lqeggnwhkg(y2.yadqdtsiqt yadqdtsiqtVar) {
        if (yadqdtsiqtVar.iobyxmoadg() == 0) {
            return;
        }
        this.f451zoijcleaow.f123526iobyxmoadg[0] = yadqdtsiqtVar.eablkybsjg()[yadqdtsiqtVar.gxszxtbevo()];
        this.f451zoijcleaow.rgvfuqvkyq(2);
        int iNufgyqmvbu = this.f451zoijcleaow.nufgyqmvbu(4);
        int i13 = this.f445rgvfuqvkyq;
        if (i13 != -1 && iNufgyqmvbu != i13) {
            vdvldrhtss();
            return;
        }
        if (!this.f429agtfadlqog) {
            this.f429agtfadlqog = true;
            this.f442ojitshcjhn = this.f446vdvldrhtss;
            this.f445rgvfuqvkyq = iNufgyqmvbu;
        }
        zdlpuopuiu();
    }

    private boolean nufgyqmvbu(y2.yadqdtsiqt yadqdtsiqtVar, int i13) {
        yadqdtsiqtVar.sopmlzcsov(i13 + 1);
        if (!iwizpuwonk(yadqdtsiqtVar, this.f451zoijcleaow.f123526iobyxmoadg, 1)) {
            return false;
        }
        this.f451zoijcleaow.rgvfuqvkyq(4);
        int iNufgyqmvbu = this.f451zoijcleaow.nufgyqmvbu(1);
        int i14 = this.f442ojitshcjhn;
        if (i14 != -1 && iNufgyqmvbu != i14) {
            return false;
        }
        if (this.f445rgvfuqvkyq != -1) {
            if (!iwizpuwonk(yadqdtsiqtVar, this.f451zoijcleaow.f123526iobyxmoadg, 1)) {
                return true;
            }
            this.f451zoijcleaow.rgvfuqvkyq(2);
            if (this.f451zoijcleaow.nufgyqmvbu(4) != this.f445rgvfuqvkyq) {
                return false;
            }
            yadqdtsiqtVar.sopmlzcsov(i13 + 2);
        }
        if (!iwizpuwonk(yadqdtsiqtVar, this.f451zoijcleaow.f123526iobyxmoadg, 4)) {
            return true;
        }
        this.f451zoijcleaow.rgvfuqvkyq(14);
        int iNufgyqmvbu2 = this.f451zoijcleaow.nufgyqmvbu(13);
        if (iNufgyqmvbu2 < 7) {
            return false;
        }
        byte[] bArrEablkybsjg = yadqdtsiqtVar.eablkybsjg();
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        int i15 = i13 + iNufgyqmvbu2;
        if (i15 >= iLqeggnwhkg) {
            return true;
        }
        byte b13 = bArrEablkybsjg[i15];
        if (b13 == -1) {
            int i16 = i15 + 1;
            if (i16 == iLqeggnwhkg) {
                return true;
            }
            return draadjrbmk((byte) -1, bArrEablkybsjg[i16]) && ((bArrEablkybsjg[i16] & 8) >> 3) == iNufgyqmvbu;
        }
        if (b13 != 73) {
            return false;
        }
        int i17 = i15 + 1;
        if (i17 == iLqeggnwhkg) {
            return true;
        }
        if (bArrEablkybsjg[i17] != 68) {
            return false;
        }
        int i18 = i15 + 2;
        return i18 == iLqeggnwhkg || bArrEablkybsjg[i18] == 51;
    }

    private void ojitshcjhn() {
        this.f432dxjokdxxww.lqeggnwhkg(this.f444ppxfxbqfkf, 10);
        this.f444ppxfxbqfkf.sopmlzcsov(6);
        jyumaefscl(this.f432dxjokdxxww, 0L, 10, this.f444ppxfxbqfkf.lmojexxdyd() + 10);
    }

    private void oxmwwwfdhm() {
        this.f430btonecajqb = 1;
        this.f434gtknphoqwx = 0;
    }

    private void rgvfuqvkyq(y2.yadqdtsiqt yadqdtsiqtVar) {
        int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), this.f450zdlpuopuiu - this.f434gtknphoqwx);
        this.f438jyumaefscl.lqeggnwhkg(yadqdtsiqtVar, iMin);
        int i13 = this.f434gtknphoqwx + iMin;
        this.f434gtknphoqwx = i13;
        if (i13 == this.f450zdlpuopuiu) {
            y2.iobyxmoadg.lqeggnwhkg(this.f449yggfygwlhe != -9223372036854775807L);
            this.f438jyumaefscl.zoijcleaow(this.f449yggfygwlhe, 1, this.f450zdlpuopuiu, 0, null);
            this.f449yggfygwlhe += this.f437iwizpuwonk;
            kcexrzcfyt();
        }
    }

    private void vdvldrhtss() {
        this.f429agtfadlqog = false;
        kcexrzcfyt();
    }

    public static boolean wflxmlrfwp(int i13) {
        return (i13 & 65526) == 65520;
    }

    private void yggfygwlhe() {
        this.f430btonecajqb = 2;
        this.f434gtknphoqwx = f428cqumvgiudr.length;
        this.f450zdlpuopuiu = 0;
        this.f444ppxfxbqfkf.sopmlzcsov(0);
    }

    private void zdlpuopuiu() {
        this.f430btonecajqb = 3;
        this.f434gtknphoqwx = 0;
    }

    private void zoijcleaow() {
        y2.iobyxmoadg.eablkybsjg(this.f441nufgyqmvbu);
        stevsuqkhv.nufgyqmvbu(this.f438jyumaefscl);
        stevsuqkhv.nufgyqmvbu(this.f432dxjokdxxww);
    }

    @Override // a5.wflxmlrfwp
    public void eablkybsjg(long j13, int i13) {
        this.f449yggfygwlhe = j13;
    }

    public long gtknphoqwx() {
        return this.f439kcexrzcfyt;
    }

    @Override // a5.wflxmlrfwp
    public void gxszxtbevo(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.iobyxmoadg();
        this.f440lqeggnwhkg = wkgbmnqykcVar.zoijcleaow();
        dsvhmnatus dsvhmnatusVarKcexrzcfyt = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 1);
        this.f441nufgyqmvbu = dsvhmnatusVarKcexrzcfyt;
        this.f438jyumaefscl = dsvhmnatusVarKcexrzcfyt;
        if (!this.f436iobyxmoadg) {
            this.f432dxjokdxxww = new t3.wflxmlrfwp();
            return;
        }
        wkgbmnqykcVar.iobyxmoadg();
        dsvhmnatus dsvhmnatusVarKcexrzcfyt2 = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 5);
        this.f432dxjokdxxww = dsvhmnatusVarKcexrzcfyt2;
        dsvhmnatusVarKcexrzcfyt2.iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(wkgbmnqykcVar.zoijcleaow()).ntlheqmsrt(this.f435gxszxtbevo).zeieaojujs("application/id3").cllcsxoeiz());
    }

    @Override // a5.wflxmlrfwp
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
        zoijcleaow();
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            int i13 = this.f430btonecajqb;
            if (i13 == 0) {
                btonecajqb(yadqdtsiqtVar);
            } else if (i13 == 1) {
                lqeggnwhkg(yadqdtsiqtVar);
            } else if (i13 != 2) {
                if (i13 == 3) {
                    if (dxjokdxxww(yadqdtsiqtVar, this.f451zoijcleaow.f123526iobyxmoadg, this.f447wflxmlrfwp ? 7 : 5)) {
                        agtfadlqog();
                    }
                } else {
                    if (i13 != 4) {
                        throw new IllegalStateException();
                    }
                    rgvfuqvkyq(yadqdtsiqtVar);
                }
            } else if (dxjokdxxww(yadqdtsiqtVar, this.f444ppxfxbqfkf.eablkybsjg(), 10)) {
                ojitshcjhn();
            }
        }
    }

    @Override // a5.wflxmlrfwp
    public void ppxfxbqfkf() {
        this.f449yggfygwlhe = -9223372036854775807L;
        vdvldrhtss();
    }

    @Override // a5.wflxmlrfwp
    public void wkgbmnqykc(boolean z13) {
    }

    public dxjokdxxww(boolean z13, String str, int i13, String str2) {
        this.f451zoijcleaow = new y2.cdpycssgdh(new byte[7]);
        this.f444ppxfxbqfkf = new y2.yadqdtsiqt(Arrays.copyOf(f428cqumvgiudr, 10));
        this.f442ojitshcjhn = -1;
        this.f445rgvfuqvkyq = -1;
        this.f439kcexrzcfyt = -9223372036854775807L;
        this.f449yggfygwlhe = -9223372036854775807L;
        this.f436iobyxmoadg = z13;
        this.f448wkgbmnqykc = str;
        this.f433eablkybsjg = i13;
        this.f435gxszxtbevo = str2;
        kcexrzcfyt();
    }
}
