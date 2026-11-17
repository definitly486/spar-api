package z0;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static long f127481cqumvgiudr = 0;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static long f127482esjtqupxsv = 0;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static boolean f127483iwizpuwonk = false;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static boolean f127484jyumaefscl = true;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public static boolean f127485kcexrzcfyt = false;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static boolean f127486yggfygwlhe = true;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static boolean f127487zdlpuopuiu = true;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private iobyxmoadg f127492eablkybsjg;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    final ppxfxbqfkf f127498ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private iobyxmoadg f127499oxmwwwfdhm;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f127495iobyxmoadg = 1000;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public boolean f127505zoijcleaow = false;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int f127500ppxfxbqfkf = 0;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private HashMap f127504wkgbmnqykc = null;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f127494gxszxtbevo = 32;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f127496lqeggnwhkg = 32;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public boolean f127491dxjokdxxww = false;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public boolean f127489btonecajqb = false;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean[] f127493gtknphoqwx = new boolean[32];

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    int f127490draadjrbmk = 1;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    int f127503wflxmlrfwp = 0;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f127488agtfadlqog = 32;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private dxjokdxxww[] f127501rgvfuqvkyq = new dxjokdxxww[1000];

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f127502vdvldrhtss = 0;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    z0.zoijcleaow[] f127497nufgyqmvbu = new z0.zoijcleaow[32];

    interface iobyxmoadg {
        void clear();

        dxjokdxxww getKey();

        void iobyxmoadg(iobyxmoadg iobyxmoadgVar);

        boolean isEmpty();

        void ppxfxbqfkf(dxjokdxxww dxjokdxxwwVar);

        dxjokdxxww zoijcleaow(wkgbmnqykc wkgbmnqykcVar, boolean[] zArr);
    }

    static class zoijcleaow extends z0.zoijcleaow {
        zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f127506eablkybsjg = new btonecajqb(this, ppxfxbqfkfVar);
        }
    }

    public wkgbmnqykc() {
        cdpycssgdh();
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        this.f127498ojitshcjhn = ppxfxbqfkfVar;
        this.f127492eablkybsjg = new nufgyqmvbu(ppxfxbqfkfVar);
        if (f127483iwizpuwonk) {
            this.f127499oxmwwwfdhm = new zoijcleaow(ppxfxbqfkfVar);
        } else {
            this.f127499oxmwwwfdhm = new z0.zoijcleaow(ppxfxbqfkfVar);
        }
    }

    private void agtfadlqog() {
        for (int i13 = 0; i13 < this.f127503wflxmlrfwp; i13++) {
            z0.zoijcleaow zoijcleaowVar = this.f127497nufgyqmvbu[i13];
            zoijcleaowVar.f127508iobyxmoadg.f127432esjtqupxsv = zoijcleaowVar.f127511zoijcleaow;
        }
    }

    private void cdpycssgdh() {
        int i13 = 0;
        if (f127483iwizpuwonk) {
            while (i13 < this.f127503wflxmlrfwp) {
                z0.zoijcleaow zoijcleaowVar = this.f127497nufgyqmvbu[i13];
                if (zoijcleaowVar != null) {
                    this.f127498ojitshcjhn.f127477iobyxmoadg.iobyxmoadg(zoijcleaowVar);
                }
                this.f127497nufgyqmvbu[i13] = null;
                i13++;
            }
            return;
        }
        while (i13 < this.f127503wflxmlrfwp) {
            z0.zoijcleaow zoijcleaowVar2 = this.f127497nufgyqmvbu[i13];
            if (zoijcleaowVar2 != null) {
                this.f127498ojitshcjhn.f127480zoijcleaow.iobyxmoadg(zoijcleaowVar2);
            }
            this.f127497nufgyqmvbu[i13] = null;
            i13++;
        }
    }

    public static eablkybsjg cqumvgiudr() {
        return null;
    }

    private void draadjrbmk(z0.zoijcleaow zoijcleaowVar) {
        int i13;
        if (f127486yggfygwlhe && zoijcleaowVar.f127507gxszxtbevo) {
            zoijcleaowVar.f127508iobyxmoadg.gxszxtbevo(this, zoijcleaowVar.f127511zoijcleaow);
        } else {
            z0.zoijcleaow[] zoijcleaowVarArr = this.f127497nufgyqmvbu;
            int i14 = this.f127503wflxmlrfwp;
            zoijcleaowVarArr[i14] = zoijcleaowVar;
            dxjokdxxww dxjokdxxwwVar = zoijcleaowVar.f127508iobyxmoadg;
            dxjokdxxwwVar.f127435iwizpuwonk = i14;
            this.f127503wflxmlrfwp = i14 + 1;
            dxjokdxxwwVar.nufgyqmvbu(this, zoijcleaowVar);
        }
        if (f127486yggfygwlhe && this.f127505zoijcleaow) {
            int i15 = 0;
            while (i15 < this.f127503wflxmlrfwp) {
                if (this.f127497nufgyqmvbu[i15] == null) {
                    System.out.println("WTF");
                }
                z0.zoijcleaow zoijcleaowVar2 = this.f127497nufgyqmvbu[i15];
                if (zoijcleaowVar2 != null && zoijcleaowVar2.f127507gxszxtbevo) {
                    zoijcleaowVar2.f127508iobyxmoadg.gxszxtbevo(this, zoijcleaowVar2.f127511zoijcleaow);
                    if (f127483iwizpuwonk) {
                        this.f127498ojitshcjhn.f127477iobyxmoadg.iobyxmoadg(zoijcleaowVar2);
                    } else {
                        this.f127498ojitshcjhn.f127480zoijcleaow.iobyxmoadg(zoijcleaowVar2);
                    }
                    this.f127497nufgyqmvbu[i15] = null;
                    int i16 = i15 + 1;
                    int i17 = i16;
                    while (true) {
                        i13 = this.f127503wflxmlrfwp;
                        if (i16 >= i13) {
                            break;
                        }
                        z0.zoijcleaow[] zoijcleaowVarArr2 = this.f127497nufgyqmvbu;
                        int i18 = i16 - 1;
                        z0.zoijcleaow zoijcleaowVar3 = zoijcleaowVarArr2[i16];
                        zoijcleaowVarArr2[i18] = zoijcleaowVar3;
                        dxjokdxxww dxjokdxxwwVar2 = zoijcleaowVar3.f127508iobyxmoadg;
                        if (dxjokdxxwwVar2.f127435iwizpuwonk == i16) {
                            dxjokdxxwwVar2.f127435iwizpuwonk = i18;
                        }
                        i17 = i16;
                        i16++;
                    }
                    if (i17 < i13) {
                        this.f127497nufgyqmvbu[i17] = null;
                    }
                    this.f127503wflxmlrfwp = i13 - 1;
                    i15--;
                }
                i15++;
            }
            this.f127505zoijcleaow = false;
        }
    }

    private dxjokdxxww iobyxmoadg(dxjokdxxww.iobyxmoadg iobyxmoadgVar, String str) {
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) this.f127498ojitshcjhn.f127478ppxfxbqfkf.zoijcleaow();
        if (dxjokdxxwwVar == null) {
            dxjokdxxwwVar = new dxjokdxxww(iobyxmoadgVar, str);
            dxjokdxxwwVar.lqeggnwhkg(iobyxmoadgVar, str);
        } else {
            dxjokdxxwwVar.eablkybsjg();
            dxjokdxxwwVar.lqeggnwhkg(iobyxmoadgVar, str);
        }
        int i13 = this.f127502vdvldrhtss;
        int i14 = this.f127495iobyxmoadg;
        if (i13 >= i14) {
            int i15 = i14 * 2;
            this.f127495iobyxmoadg = i15;
            this.f127501rgvfuqvkyq = (dxjokdxxww[]) Arrays.copyOf(this.f127501rgvfuqvkyq, i15);
        }
        dxjokdxxww[] dxjokdxxwwVarArr = this.f127501rgvfuqvkyq;
        int i16 = this.f127502vdvldrhtss;
        this.f127502vdvldrhtss = i16 + 1;
        dxjokdxxwwVarArr[i16] = dxjokdxxwwVar;
        return dxjokdxxwwVar;
    }

    private int istkbnxepw(iobyxmoadg iobyxmoadgVar, boolean z13) {
        for (int i13 = 0; i13 < this.f127490draadjrbmk; i13++) {
            this.f127493gtknphoqwx[i13] = false;
        }
        boolean z14 = false;
        int i14 = 0;
        while (!z14) {
            i14++;
            if (i14 >= this.f127490draadjrbmk * 2) {
                return i14;
            }
            if (iobyxmoadgVar.getKey() != null) {
                this.f127493gtknphoqwx[iobyxmoadgVar.getKey().f127436jyumaefscl] = true;
            }
            dxjokdxxww dxjokdxxwwVarZoijcleaow = iobyxmoadgVar.zoijcleaow(this, this.f127493gtknphoqwx);
            if (dxjokdxxwwVarZoijcleaow != null) {
                boolean[] zArr = this.f127493gtknphoqwx;
                int i15 = dxjokdxxwwVarZoijcleaow.f127436jyumaefscl;
                if (zArr[i15]) {
                    return i14;
                }
                zArr[i15] = true;
            }
            if (dxjokdxxwwVarZoijcleaow != null) {
                float f13 = Float.MAX_VALUE;
                int i16 = -1;
                for (int i17 = 0; i17 < this.f127503wflxmlrfwp; i17++) {
                    z0.zoijcleaow zoijcleaowVar = this.f127497nufgyqmvbu[i17];
                    if (zoijcleaowVar.f127508iobyxmoadg.f127434istkbnxepw != dxjokdxxww.iobyxmoadg.UNRESTRICTED && !zoijcleaowVar.f127507gxszxtbevo && zoijcleaowVar.zdlpuopuiu(dxjokdxxwwVarZoijcleaow)) {
                        float fNufgyqmvbu = zoijcleaowVar.f127506eablkybsjg.nufgyqmvbu(dxjokdxxwwVarZoijcleaow);
                        if (fNufgyqmvbu < 0.0f) {
                            float f14 = (-zoijcleaowVar.f127511zoijcleaow) / fNufgyqmvbu;
                            if (f14 < f13) {
                                i16 = i17;
                                f13 = f14;
                            }
                        }
                    }
                }
                if (i16 > -1) {
                    z0.zoijcleaow zoijcleaowVar2 = this.f127497nufgyqmvbu[i16];
                    zoijcleaowVar2.f127508iobyxmoadg.f127435iwizpuwonk = -1;
                    zoijcleaowVar2.cqumvgiudr(dxjokdxxwwVarZoijcleaow);
                    dxjokdxxww dxjokdxxwwVar = zoijcleaowVar2.f127508iobyxmoadg;
                    dxjokdxxwwVar.f127435iwizpuwonk = i16;
                    dxjokdxxwwVar.nufgyqmvbu(this, zoijcleaowVar2);
                }
            } else {
                z14 = true;
            }
        }
        return i14;
    }

    public static z0.zoijcleaow kcexrzcfyt(wkgbmnqykc wkgbmnqykcVar, dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, float f13) {
        return wkgbmnqykcVar.oxmwwwfdhm().btonecajqb(dxjokdxxwwVar, dxjokdxxwwVar2, f13);
    }

    private void lereixgezr() {
        int i13 = this.f127494gxszxtbevo * 2;
        this.f127494gxszxtbevo = i13;
        this.f127497nufgyqmvbu = (z0.zoijcleaow[]) Arrays.copyOf(this.f127497nufgyqmvbu, i13);
        ppxfxbqfkf ppxfxbqfkfVar = this.f127498ojitshcjhn;
        ppxfxbqfkfVar.f127479wkgbmnqykc = (dxjokdxxww[]) Arrays.copyOf(ppxfxbqfkfVar.f127479wkgbmnqykc, this.f127494gxszxtbevo);
        int i14 = this.f127494gxszxtbevo;
        this.f127493gtknphoqwx = new boolean[i14];
        this.f127496lqeggnwhkg = i14;
        this.f127488agtfadlqog = i14;
    }

    private int yggfygwlhe(iobyxmoadg iobyxmoadgVar) {
        for (int i13 = 0; i13 < this.f127503wflxmlrfwp; i13++) {
            z0.zoijcleaow zoijcleaowVar = this.f127497nufgyqmvbu[i13];
            if (zoijcleaowVar.f127508iobyxmoadg.f127434istkbnxepw != dxjokdxxww.iobyxmoadg.UNRESTRICTED && zoijcleaowVar.f127511zoijcleaow < 0.0f) {
                boolean z13 = false;
                int i14 = 0;
                while (!z13) {
                    i14++;
                    float f13 = Float.MAX_VALUE;
                    int i15 = 0;
                    int i16 = -1;
                    int i17 = -1;
                    int i18 = 0;
                    while (true) {
                        if (i15 >= this.f127503wflxmlrfwp) {
                            break;
                        }
                        z0.zoijcleaow zoijcleaowVar2 = this.f127497nufgyqmvbu[i15];
                        if (zoijcleaowVar2.f127508iobyxmoadg.f127434istkbnxepw != dxjokdxxww.iobyxmoadg.UNRESTRICTED && !zoijcleaowVar2.f127507gxszxtbevo && zoijcleaowVar2.f127511zoijcleaow < 0.0f) {
                            int i19 = 9;
                            if (f127484jyumaefscl) {
                                int iGxszxtbevo = zoijcleaowVar2.f127506eablkybsjg.gxszxtbevo();
                                int i23 = 0;
                                while (i23 < iGxszxtbevo) {
                                    dxjokdxxww dxjokdxxwwVarZoijcleaow = zoijcleaowVar2.f127506eablkybsjg.zoijcleaow(i23);
                                    float fNufgyqmvbu = zoijcleaowVar2.f127506eablkybsjg.nufgyqmvbu(dxjokdxxwwVarZoijcleaow);
                                    if (fNufgyqmvbu > 0.0f) {
                                        int i24 = 0;
                                        while (i24 < i19) {
                                            float f14 = dxjokdxxwwVarZoijcleaow.f127440pmvmpeiblj[i24] / fNufgyqmvbu;
                                            if ((f14 < f13 && i24 == i18) || i24 > i18) {
                                                i18 = i24;
                                                i17 = dxjokdxxwwVarZoijcleaow.f127436jyumaefscl;
                                                i16 = i15;
                                                f13 = f14;
                                            }
                                            i24++;
                                            i19 = 9;
                                        }
                                    }
                                    i23++;
                                    i19 = 9;
                                }
                            } else {
                                for (int i25 = 1; i25 < this.f127490draadjrbmk; i25++) {
                                    dxjokdxxww dxjokdxxwwVar = this.f127498ojitshcjhn.f127479wkgbmnqykc[i25];
                                    float fNufgyqmvbu2 = zoijcleaowVar2.f127506eablkybsjg.nufgyqmvbu(dxjokdxxwwVar);
                                    if (fNufgyqmvbu2 > 0.0f) {
                                        for (int i26 = 0; i26 < 9; i26++) {
                                            float f15 = dxjokdxxwwVar.f127440pmvmpeiblj[i26] / fNufgyqmvbu2;
                                            if ((f15 < f13 && i26 == i18) || i26 > i18) {
                                                i16 = i15;
                                                i17 = i25;
                                                i18 = i26;
                                                f13 = f15;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i15++;
                    }
                    if (i16 != -1) {
                        z0.zoijcleaow zoijcleaowVar3 = this.f127497nufgyqmvbu[i16];
                        zoijcleaowVar3.f127508iobyxmoadg.f127435iwizpuwonk = -1;
                        zoijcleaowVar3.cqumvgiudr(this.f127498ojitshcjhn.f127479wkgbmnqykc[i17]);
                        dxjokdxxww dxjokdxxwwVar2 = zoijcleaowVar3.f127508iobyxmoadg;
                        dxjokdxxwwVar2.f127435iwizpuwonk = i16;
                        dxjokdxxwwVar2.nufgyqmvbu(this, zoijcleaowVar3);
                    } else {
                        z13 = true;
                    }
                    if (i14 > this.f127490draadjrbmk / 2) {
                        z13 = true;
                    }
                }
                return i14;
            }
        }
        return 0;
    }

    public void btonecajqb(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, int i13, int i14) {
        z0.zoijcleaow zoijcleaowVarOxmwwwfdhm = oxmwwwfdhm();
        dxjokdxxww dxjokdxxwwVarZdlpuopuiu = zdlpuopuiu();
        dxjokdxxwwVarZdlpuopuiu.f127431cqumvgiudr = 0;
        zoijcleaowVarOxmwwwfdhm.rgvfuqvkyq(dxjokdxxwwVar, dxjokdxxwwVar2, dxjokdxxwwVarZdlpuopuiu, i13);
        if (i14 != 8) {
            wflxmlrfwp(zoijcleaowVarOxmwwwfdhm, (int) (zoijcleaowVarOxmwwwfdhm.f127506eablkybsjg.nufgyqmvbu(dxjokdxxwwVarZdlpuopuiu) * (-1.0f)), i14);
        }
        wkgbmnqykc(zoijcleaowVarOxmwwwfdhm);
    }

    public void dxjokdxxww(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, int i13, boolean z13) {
        z0.zoijcleaow zoijcleaowVarOxmwwwfdhm = oxmwwwfdhm();
        dxjokdxxww dxjokdxxwwVarZdlpuopuiu = zdlpuopuiu();
        dxjokdxxwwVarZdlpuopuiu.f127431cqumvgiudr = 0;
        zoijcleaowVarOxmwwwfdhm.rgvfuqvkyq(dxjokdxxwwVar, dxjokdxxwwVar2, dxjokdxxwwVarZdlpuopuiu, i13);
        wkgbmnqykc(zoijcleaowVarOxmwwwfdhm);
    }

    public z0.zoijcleaow eablkybsjg(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, int i13, int i14) {
        if (f127487zdlpuopuiu && i14 == 8 && dxjokdxxwwVar2.f127437lereixgezr && dxjokdxxwwVar.f127435iwizpuwonk == -1) {
            dxjokdxxwwVar.gxszxtbevo(this, dxjokdxxwwVar2.f127432esjtqupxsv + i13);
            return null;
        }
        z0.zoijcleaow zoijcleaowVarOxmwwwfdhm = oxmwwwfdhm();
        zoijcleaowVarOxmwwwfdhm.agtfadlqog(dxjokdxxwwVar, dxjokdxxwwVar2, i13);
        if (i14 != 8) {
            zoijcleaowVarOxmwwwfdhm.wkgbmnqykc(this, i14);
        }
        wkgbmnqykc(zoijcleaowVarOxmwwwfdhm);
        return zoijcleaowVarOxmwwwfdhm;
    }

    public int esjtqupxsv(Object obj) {
        dxjokdxxww dxjokdxxwwVarDxjokdxxww = ((c1.wkgbmnqykc) obj).dxjokdxxww();
        if (dxjokdxxwwVarDxjokdxxww != null) {
            return (int) (dxjokdxxwwVarDxjokdxxww.f127432esjtqupxsv + 0.5f);
        }
        return 0;
    }

    public void gtknphoqwx(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, dxjokdxxww dxjokdxxwwVar3, dxjokdxxww dxjokdxxwwVar4, float f13, int i13) {
        z0.zoijcleaow zoijcleaowVarOxmwwwfdhm = oxmwwwfdhm();
        zoijcleaowVarOxmwwwfdhm.gtknphoqwx(dxjokdxxwwVar, dxjokdxxwwVar2, dxjokdxxwwVar3, dxjokdxxwwVar4, f13);
        if (i13 != 8) {
            zoijcleaowVarOxmwwwfdhm.wkgbmnqykc(this, i13);
        }
        wkgbmnqykc(zoijcleaowVarOxmwwwfdhm);
    }

    public void gxszxtbevo(dxjokdxxww dxjokdxxwwVar, int i13) {
        if (f127487zdlpuopuiu && dxjokdxxwwVar.f127435iwizpuwonk == -1) {
            float f13 = i13;
            dxjokdxxwwVar.gxszxtbevo(this, f13);
            for (int i14 = 0; i14 < this.f127500ppxfxbqfkf + 1; i14++) {
                dxjokdxxww dxjokdxxwwVar2 = this.f127498ojitshcjhn.f127479wkgbmnqykc[i14];
                if (dxjokdxxwwVar2 != null && dxjokdxxwwVar2.f127438lmojexxdyd && dxjokdxxwwVar2.f127441wwaezpbzkn == dxjokdxxwwVar.f127436jyumaefscl) {
                    dxjokdxxwwVar2.gxszxtbevo(this, dxjokdxxwwVar2.f127444ylkuphrtab + f13);
                }
            }
            return;
        }
        int i15 = dxjokdxxwwVar.f127435iwizpuwonk;
        if (i15 == -1) {
            z0.zoijcleaow zoijcleaowVarOxmwwwfdhm = oxmwwwfdhm();
            zoijcleaowVarOxmwwwfdhm.dxjokdxxww(dxjokdxxwwVar, i13);
            wkgbmnqykc(zoijcleaowVarOxmwwwfdhm);
            return;
        }
        z0.zoijcleaow zoijcleaowVar = this.f127497nufgyqmvbu[i15];
        if (zoijcleaowVar.f127507gxszxtbevo) {
            zoijcleaowVar.f127511zoijcleaow = i13;
            return;
        }
        if (zoijcleaowVar.f127506eablkybsjg.gxszxtbevo() == 0) {
            zoijcleaowVar.f127507gxszxtbevo = true;
            zoijcleaowVar.f127511zoijcleaow = i13;
        } else {
            z0.zoijcleaow zoijcleaowVarOxmwwwfdhm2 = oxmwwwfdhm();
            zoijcleaowVarOxmwwwfdhm2.wflxmlrfwp(dxjokdxxwwVar, i13);
            wkgbmnqykc(zoijcleaowVarOxmwwwfdhm2);
        }
    }

    public ppxfxbqfkf iwizpuwonk() {
        return this.f127498ojitshcjhn;
    }

    public void jyumaefscl(eablkybsjg eablkybsjgVar) {
    }

    public void lqeggnwhkg(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, int i13, boolean z13) {
        z0.zoijcleaow zoijcleaowVarOxmwwwfdhm = oxmwwwfdhm();
        dxjokdxxww dxjokdxxwwVarZdlpuopuiu = zdlpuopuiu();
        dxjokdxxwwVarZdlpuopuiu.f127431cqumvgiudr = 0;
        zoijcleaowVarOxmwwwfdhm.ojitshcjhn(dxjokdxxwwVar, dxjokdxxwwVar2, dxjokdxxwwVarZdlpuopuiu, i13);
        wkgbmnqykc(zoijcleaowVarOxmwwwfdhm);
    }

    public void nufgyqmvbu(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, int i13, int i14) {
        z0.zoijcleaow zoijcleaowVarOxmwwwfdhm = oxmwwwfdhm();
        dxjokdxxww dxjokdxxwwVarZdlpuopuiu = zdlpuopuiu();
        dxjokdxxwwVarZdlpuopuiu.f127431cqumvgiudr = 0;
        zoijcleaowVarOxmwwwfdhm.ojitshcjhn(dxjokdxxwwVar, dxjokdxxwwVar2, dxjokdxxwwVarZdlpuopuiu, i13);
        if (i14 != 8) {
            wflxmlrfwp(zoijcleaowVarOxmwwwfdhm, (int) (zoijcleaowVarOxmwwwfdhm.f127506eablkybsjg.nufgyqmvbu(dxjokdxxwwVarZdlpuopuiu) * (-1.0f)), i14);
        }
        wkgbmnqykc(zoijcleaowVarOxmwwwfdhm);
    }

    public dxjokdxxww ojitshcjhn(int i13, String str) {
        if (this.f127490draadjrbmk + 1 >= this.f127496lqeggnwhkg) {
            lereixgezr();
        }
        dxjokdxxww dxjokdxxwwVarIobyxmoadg = iobyxmoadg(dxjokdxxww.iobyxmoadg.ERROR, str);
        int i14 = this.f127500ppxfxbqfkf + 1;
        this.f127500ppxfxbqfkf = i14;
        this.f127490draadjrbmk++;
        dxjokdxxwwVarIobyxmoadg.f127436jyumaefscl = i14;
        dxjokdxxwwVarIobyxmoadg.f127431cqumvgiudr = i13;
        this.f127498ojitshcjhn.f127479wkgbmnqykc[i14] = dxjokdxxwwVarIobyxmoadg;
        this.f127492eablkybsjg.ppxfxbqfkf(dxjokdxxwwVarIobyxmoadg);
        return dxjokdxxwwVarIobyxmoadg;
    }

    public z0.zoijcleaow oxmwwwfdhm() {
        z0.zoijcleaow zoijcleaowVar;
        if (f127483iwizpuwonk) {
            zoijcleaowVar = (z0.zoijcleaow) this.f127498ojitshcjhn.f127477iobyxmoadg.zoijcleaow();
            if (zoijcleaowVar == null) {
                zoijcleaowVar = new zoijcleaow(this.f127498ojitshcjhn);
                f127482esjtqupxsv++;
            } else {
                zoijcleaowVar.esjtqupxsv();
            }
        } else {
            zoijcleaowVar = (z0.zoijcleaow) this.f127498ojitshcjhn.f127480zoijcleaow.zoijcleaow();
            if (zoijcleaowVar == null) {
                zoijcleaowVar = new z0.zoijcleaow(this.f127498ojitshcjhn);
                f127481cqumvgiudr++;
            } else {
                zoijcleaowVar.esjtqupxsv();
            }
        }
        dxjokdxxww.ppxfxbqfkf();
        return zoijcleaowVar;
    }

    public void pmvmpeiblj() {
        if (this.f127492eablkybsjg.isEmpty()) {
            agtfadlqog();
            return;
        }
        if (!this.f127491dxjokdxxww && !this.f127489btonecajqb) {
            zynmafqrjb(this.f127492eablkybsjg);
            return;
        }
        for (int i13 = 0; i13 < this.f127503wflxmlrfwp; i13++) {
            if (!this.f127497nufgyqmvbu[i13].f127507gxszxtbevo) {
                zynmafqrjb(this.f127492eablkybsjg);
                return;
            }
        }
        agtfadlqog();
    }

    public void ppxfxbqfkf(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, int i13, float f13, dxjokdxxww dxjokdxxwwVar3, dxjokdxxww dxjokdxxwwVar4, int i14, int i15) {
        z0.zoijcleaow zoijcleaowVarOxmwwwfdhm = oxmwwwfdhm();
        zoijcleaowVarOxmwwwfdhm.nufgyqmvbu(dxjokdxxwwVar, dxjokdxxwwVar2, i13, f13, dxjokdxxwwVar3, dxjokdxxwwVar4, i14);
        if (i15 != 8) {
            zoijcleaowVarOxmwwwfdhm.wkgbmnqykc(this, i15);
        }
        wkgbmnqykc(zoijcleaowVarOxmwwwfdhm);
    }

    public dxjokdxxww rgvfuqvkyq() {
        if (this.f127490draadjrbmk + 1 >= this.f127496lqeggnwhkg) {
            lereixgezr();
        }
        dxjokdxxww dxjokdxxwwVarIobyxmoadg = iobyxmoadg(dxjokdxxww.iobyxmoadg.SLACK, null);
        int i13 = this.f127500ppxfxbqfkf + 1;
        this.f127500ppxfxbqfkf = i13;
        this.f127490draadjrbmk++;
        dxjokdxxwwVarIobyxmoadg.f127436jyumaefscl = i13;
        this.f127498ojitshcjhn.f127479wkgbmnqykc[i13] = dxjokdxxwwVarIobyxmoadg;
        return dxjokdxxwwVarIobyxmoadg;
    }

    public dxjokdxxww vdvldrhtss(Object obj) {
        dxjokdxxww dxjokdxxwwVarDxjokdxxww = null;
        if (obj == null) {
            return null;
        }
        if (this.f127490draadjrbmk + 1 >= this.f127496lqeggnwhkg) {
            lereixgezr();
        }
        if (obj instanceof c1.wkgbmnqykc) {
            c1.wkgbmnqykc wkgbmnqykcVar = (c1.wkgbmnqykc) obj;
            dxjokdxxwwVarDxjokdxxww = wkgbmnqykcVar.dxjokdxxww();
            if (dxjokdxxwwVarDxjokdxxww == null) {
                wkgbmnqykcVar.kcexrzcfyt(this.f127498ojitshcjhn);
                dxjokdxxwwVarDxjokdxxww = wkgbmnqykcVar.dxjokdxxww();
            }
            int i13 = dxjokdxxwwVarDxjokdxxww.f127436jyumaefscl;
            if (i13 == -1 || i13 > this.f127500ppxfxbqfkf || this.f127498ojitshcjhn.f127479wkgbmnqykc[i13] == null) {
                if (i13 != -1) {
                    dxjokdxxwwVarDxjokdxxww.eablkybsjg();
                }
                int i14 = this.f127500ppxfxbqfkf + 1;
                this.f127500ppxfxbqfkf = i14;
                this.f127490draadjrbmk++;
                dxjokdxxwwVarDxjokdxxww.f127436jyumaefscl = i14;
                dxjokdxxwwVarDxjokdxxww.f127434istkbnxepw = dxjokdxxww.iobyxmoadg.UNRESTRICTED;
                this.f127498ojitshcjhn.f127479wkgbmnqykc[i14] = dxjokdxxwwVarDxjokdxxww;
            }
        }
        return dxjokdxxwwVarDxjokdxxww;
    }

    void wflxmlrfwp(z0.zoijcleaow zoijcleaowVar, int i13, int i14) {
        zoijcleaowVar.eablkybsjg(ojitshcjhn(i14, null), i13);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    public void wkgbmnqykc(z0.zoijcleaow zoijcleaowVar) {
        dxjokdxxww dxjokdxxwwVarJyumaefscl;
        if (zoijcleaowVar == null) {
            return;
        }
        boolean z13 = true;
        if (this.f127503wflxmlrfwp + 1 >= this.f127488agtfadlqog || this.f127490draadjrbmk + 1 >= this.f127496lqeggnwhkg) {
            lereixgezr();
        }
        boolean z14 = false;
        if (!zoijcleaowVar.f127507gxszxtbevo) {
            zoijcleaowVar.cdpycssgdh(this);
            if (zoijcleaowVar.isEmpty()) {
                return;
            }
            zoijcleaowVar.oxmwwwfdhm();
            if (zoijcleaowVar.gxszxtbevo(this)) {
                dxjokdxxww dxjokdxxwwVarRgvfuqvkyq = rgvfuqvkyq();
                zoijcleaowVar.f127508iobyxmoadg = dxjokdxxwwVarRgvfuqvkyq;
                int i13 = this.f127503wflxmlrfwp;
                draadjrbmk(zoijcleaowVar);
                if (this.f127503wflxmlrfwp == i13 + 1) {
                    this.f127499oxmwwwfdhm.iobyxmoadg(zoijcleaowVar);
                    istkbnxepw(this.f127499oxmwwwfdhm, true);
                    if (dxjokdxxwwVarRgvfuqvkyq.f127435iwizpuwonk == -1) {
                        if (zoijcleaowVar.f127508iobyxmoadg == dxjokdxxwwVarRgvfuqvkyq && (dxjokdxxwwVarJyumaefscl = zoijcleaowVar.jyumaefscl(dxjokdxxwwVarRgvfuqvkyq)) != null) {
                            zoijcleaowVar.cqumvgiudr(dxjokdxxwwVarJyumaefscl);
                        }
                        if (!zoijcleaowVar.f127507gxszxtbevo) {
                            zoijcleaowVar.f127508iobyxmoadg.nufgyqmvbu(this, zoijcleaowVar);
                        }
                        if (f127483iwizpuwonk) {
                            this.f127498ojitshcjhn.f127477iobyxmoadg.iobyxmoadg(zoijcleaowVar);
                        } else {
                            this.f127498ojitshcjhn.f127480zoijcleaow.iobyxmoadg(zoijcleaowVar);
                        }
                        this.f127503wflxmlrfwp--;
                    }
                } else {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
            if (!zoijcleaowVar.kcexrzcfyt()) {
                return;
            } else {
                z14 = z13;
            }
        }
        if (z14) {
            return;
        }
        draadjrbmk(zoijcleaowVar);
    }

    public void yadqdtsiqt() {
        ppxfxbqfkf ppxfxbqfkfVar;
        int i13 = 0;
        while (true) {
            ppxfxbqfkfVar = this.f127498ojitshcjhn;
            dxjokdxxww[] dxjokdxxwwVarArr = ppxfxbqfkfVar.f127479wkgbmnqykc;
            if (i13 >= dxjokdxxwwVarArr.length) {
                break;
            }
            dxjokdxxww dxjokdxxwwVar = dxjokdxxwwVarArr[i13];
            if (dxjokdxxwwVar != null) {
                dxjokdxxwwVar.eablkybsjg();
            }
            i13++;
        }
        ppxfxbqfkfVar.f127478ppxfxbqfkf.ppxfxbqfkf(this.f127501rgvfuqvkyq, this.f127502vdvldrhtss);
        this.f127502vdvldrhtss = 0;
        Arrays.fill(this.f127498ojitshcjhn.f127479wkgbmnqykc, (Object) null);
        HashMap map = this.f127504wkgbmnqykc;
        if (map != null) {
            map.clear();
        }
        this.f127500ppxfxbqfkf = 0;
        this.f127492eablkybsjg.clear();
        this.f127490draadjrbmk = 1;
        for (int i14 = 0; i14 < this.f127503wflxmlrfwp; i14++) {
            z0.zoijcleaow zoijcleaowVar = this.f127497nufgyqmvbu[i14];
            if (zoijcleaowVar != null) {
                zoijcleaowVar.f127509ppxfxbqfkf = false;
            }
        }
        cdpycssgdh();
        this.f127503wflxmlrfwp = 0;
        if (f127483iwizpuwonk) {
            this.f127499oxmwwwfdhm = new zoijcleaow(this.f127498ojitshcjhn);
        } else {
            this.f127499oxmwwwfdhm = new z0.zoijcleaow(this.f127498ojitshcjhn);
        }
    }

    public dxjokdxxww zdlpuopuiu() {
        if (this.f127490draadjrbmk + 1 >= this.f127496lqeggnwhkg) {
            lereixgezr();
        }
        dxjokdxxww dxjokdxxwwVarIobyxmoadg = iobyxmoadg(dxjokdxxww.iobyxmoadg.SLACK, null);
        int i13 = this.f127500ppxfxbqfkf + 1;
        this.f127500ppxfxbqfkf = i13;
        this.f127490draadjrbmk++;
        dxjokdxxwwVarIobyxmoadg.f127436jyumaefscl = i13;
        this.f127498ojitshcjhn.f127479wkgbmnqykc[i13] = dxjokdxxwwVarIobyxmoadg;
        return dxjokdxxwwVarIobyxmoadg;
    }

    public void zoijcleaow(c1.eablkybsjg eablkybsjgVar, c1.eablkybsjg eablkybsjgVar2, float f13, int i13) {
        c1.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = c1.wkgbmnqykc.iobyxmoadg.LEFT;
        dxjokdxxww dxjokdxxwwVarVdvldrhtss = vdvldrhtss(eablkybsjgVar.vdvldrhtss(iobyxmoadgVar));
        c1.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = c1.wkgbmnqykc.iobyxmoadg.TOP;
        dxjokdxxww dxjokdxxwwVarVdvldrhtss2 = vdvldrhtss(eablkybsjgVar.vdvldrhtss(iobyxmoadgVar2));
        c1.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = c1.wkgbmnqykc.iobyxmoadg.RIGHT;
        dxjokdxxww dxjokdxxwwVarVdvldrhtss3 = vdvldrhtss(eablkybsjgVar.vdvldrhtss(iobyxmoadgVar3));
        c1.wkgbmnqykc.iobyxmoadg iobyxmoadgVar4 = c1.wkgbmnqykc.iobyxmoadg.BOTTOM;
        dxjokdxxww dxjokdxxwwVarVdvldrhtss4 = vdvldrhtss(eablkybsjgVar.vdvldrhtss(iobyxmoadgVar4));
        dxjokdxxww dxjokdxxwwVarVdvldrhtss5 = vdvldrhtss(eablkybsjgVar2.vdvldrhtss(iobyxmoadgVar));
        dxjokdxxww dxjokdxxwwVarVdvldrhtss6 = vdvldrhtss(eablkybsjgVar2.vdvldrhtss(iobyxmoadgVar2));
        dxjokdxxww dxjokdxxwwVarVdvldrhtss7 = vdvldrhtss(eablkybsjgVar2.vdvldrhtss(iobyxmoadgVar3));
        dxjokdxxww dxjokdxxwwVarVdvldrhtss8 = vdvldrhtss(eablkybsjgVar2.vdvldrhtss(iobyxmoadgVar4));
        z0.zoijcleaow zoijcleaowVarOxmwwwfdhm = oxmwwwfdhm();
        double d13 = f13;
        double d14 = i13;
        zoijcleaowVarOxmwwwfdhm.vdvldrhtss(dxjokdxxwwVarVdvldrhtss2, dxjokdxxwwVarVdvldrhtss4, dxjokdxxwwVarVdvldrhtss6, dxjokdxxwwVarVdvldrhtss8, (float) (Math.sin(d13) * d14));
        wkgbmnqykc(zoijcleaowVarOxmwwwfdhm);
        z0.zoijcleaow zoijcleaowVarOxmwwwfdhm2 = oxmwwwfdhm();
        zoijcleaowVarOxmwwwfdhm2.vdvldrhtss(dxjokdxxwwVarVdvldrhtss, dxjokdxxwwVarVdvldrhtss3, dxjokdxxwwVarVdvldrhtss5, dxjokdxxwwVarVdvldrhtss7, (float) (Math.cos(d13) * d14));
        wkgbmnqykc(zoijcleaowVarOxmwwwfdhm2);
    }

    void zynmafqrjb(iobyxmoadg iobyxmoadgVar) {
        yggfygwlhe(iobyxmoadgVar);
        istkbnxepw(iobyxmoadgVar, false);
        agtfadlqog();
    }
}
