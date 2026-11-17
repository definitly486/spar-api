package ixidwrxhsl;

import androidx.compose.runtime.fmlbqenlif;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zdlpuopuiu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f50009eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f50010gxszxtbevo = 8;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final zdlpuopuiu f50011lqeggnwhkg = new zdlpuopuiu(0, 0, new Object[0]);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f50012iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final fmlbqenlif.eablkybsjg f50013ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Object[] f50014wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f50015zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final zdlpuopuiu iobyxmoadg() {
            return zdlpuopuiu.f50011lqeggnwhkg;
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private zdlpuopuiu f50016iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f50017zoijcleaow;

        public zoijcleaow(zdlpuopuiu zdlpuopuiuVar, int i13) {
            this.f50016iobyxmoadg = zdlpuopuiuVar;
            this.f50017zoijcleaow = i13;
        }

        public final zdlpuopuiu iobyxmoadg() {
            return this.f50016iobyxmoadg;
        }

        public final void ppxfxbqfkf(zdlpuopuiu zdlpuopuiuVar) {
            this.f50016iobyxmoadg = zdlpuopuiuVar;
        }

        public final int zoijcleaow() {
            return this.f50017zoijcleaow;
        }
    }

    public zdlpuopuiu(int i13, int i14, Object[] objArr, fmlbqenlif.eablkybsjg eablkybsjgVar) {
        this.f50012iobyxmoadg = i13;
        this.f50015zoijcleaow = i14;
        this.f50013ppxfxbqfkf = eablkybsjgVar;
        this.f50014wkgbmnqykc = objArr;
    }

    private final zdlpuopuiu btonecajqb(int i13) {
        Object[] objArr = this.f50014wkgbmnqykc;
        if (objArr.length == 2) {
            return null;
        }
        return new zdlpuopuiu(0, 0, cqumvgiudr.nufgyqmvbu(objArr, i13));
    }

    private final zdlpuopuiu cqumvgiudr(zdlpuopuiu zdlpuopuiuVar, fmlbqenlif.zoijcleaow zoijcleaowVar, fmlbqenlif.eablkybsjg eablkybsjgVar) {
        fmlbqenlif.iobyxmoadg.iobyxmoadg(this.f50015zoijcleaow == 0);
        fmlbqenlif.iobyxmoadg.iobyxmoadg(this.f50012iobyxmoadg == 0);
        fmlbqenlif.iobyxmoadg.iobyxmoadg(zdlpuopuiuVar.f50015zoijcleaow == 0);
        fmlbqenlif.iobyxmoadg.iobyxmoadg(zdlpuopuiuVar.f50012iobyxmoadg == 0);
        Object[] objArr = this.f50014wkgbmnqykc;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + zdlpuopuiuVar.f50014wkgbmnqykc.length);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        int length = this.f50014wkgbmnqykc.length;
        zg.nufgyqmvbu nufgyqmvbuVarZdlpuopuiu = zg.gtknphoqwx.zdlpuopuiu(zg.gtknphoqwx.jyumaefscl(0, zdlpuopuiuVar.f50014wkgbmnqykc.length), 2);
        int iWkgbmnqykc = nufgyqmvbuVarZdlpuopuiu.wkgbmnqykc();
        int iEablkybsjg = nufgyqmvbuVarZdlpuopuiu.eablkybsjg();
        int iGxszxtbevo = nufgyqmvbuVarZdlpuopuiu.gxszxtbevo();
        if ((iGxszxtbevo > 0 && iWkgbmnqykc <= iEablkybsjg) || (iGxszxtbevo < 0 && iEablkybsjg <= iWkgbmnqykc)) {
            while (true) {
                if (gxszxtbevo(zdlpuopuiuVar.f50014wkgbmnqykc[iWkgbmnqykc])) {
                    zoijcleaowVar.ppxfxbqfkf(zoijcleaowVar.iobyxmoadg() + 1);
                } else {
                    Object[] objArr2 = zdlpuopuiuVar.f50014wkgbmnqykc;
                    objArrCopyOf[length] = objArr2[iWkgbmnqykc];
                    objArrCopyOf[length + 1] = objArr2[iWkgbmnqykc + 1];
                    length += 2;
                }
                if (iWkgbmnqykc == iEablkybsjg) {
                    break;
                }
                iWkgbmnqykc += iGxszxtbevo;
            }
        }
        if (length == this.f50014wkgbmnqykc.length) {
            return this;
        }
        if (length == zdlpuopuiuVar.f50014wkgbmnqykc.length) {
            return zdlpuopuiuVar;
        }
        if (length == objArrCopyOf.length) {
            return new zdlpuopuiu(0, 0, objArrCopyOf, eablkybsjgVar);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf2, "copyOf(...)");
        return new zdlpuopuiu(0, 0, objArrCopyOf2, eablkybsjgVar);
    }

    private final boolean draadjrbmk(zdlpuopuiu zdlpuopuiuVar) {
        if (this == zdlpuopuiuVar) {
            return true;
        }
        if (this.f50015zoijcleaow != zdlpuopuiuVar.f50015zoijcleaow || this.f50012iobyxmoadg != zdlpuopuiuVar.f50012iobyxmoadg) {
            return false;
        }
        int length = this.f50014wkgbmnqykc.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (this.f50014wkgbmnqykc[i13] != zdlpuopuiuVar.f50014wkgbmnqykc[i13]) {
                return false;
            }
        }
        return true;
    }

    private final zdlpuopuiu dxjokdxxww(Object obj) {
        zg.nufgyqmvbu nufgyqmvbuVarZdlpuopuiu = zg.gtknphoqwx.zdlpuopuiu(zg.gtknphoqwx.jyumaefscl(0, this.f50014wkgbmnqykc.length), 2);
        int iWkgbmnqykc = nufgyqmvbuVarZdlpuopuiu.wkgbmnqykc();
        int iEablkybsjg = nufgyqmvbuVarZdlpuopuiu.eablkybsjg();
        int iGxszxtbevo = nufgyqmvbuVarZdlpuopuiu.gxszxtbevo();
        if ((iGxszxtbevo > 0 && iWkgbmnqykc <= iEablkybsjg) || (iGxszxtbevo < 0 && iEablkybsjg <= iWkgbmnqykc)) {
            while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zdlpuopuiu(iWkgbmnqykc))) {
                if (iWkgbmnqykc != iEablkybsjg) {
                    iWkgbmnqykc += iGxszxtbevo;
                }
            }
            return btonecajqb(iWkgbmnqykc);
        }
        return this;
    }

    private final int eablkybsjg() {
        if (this.f50015zoijcleaow == 0) {
            return this.f50014wkgbmnqykc.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f50012iobyxmoadg);
        int length = this.f50014wkgbmnqykc.length;
        for (int i13 = iBitCount * 2; i13 < length; i13++) {
            iBitCount += cllcsxoeiz(i13).eablkybsjg();
        }
        return iBitCount;
    }

    private final zdlpuopuiu esjtqupxsv(Object obj, gxszxtbevo gxszxtbevoVar) {
        zg.nufgyqmvbu nufgyqmvbuVarZdlpuopuiu = zg.gtknphoqwx.zdlpuopuiu(zg.gtknphoqwx.jyumaefscl(0, this.f50014wkgbmnqykc.length), 2);
        int iWkgbmnqykc = nufgyqmvbuVarZdlpuopuiu.wkgbmnqykc();
        int iEablkybsjg = nufgyqmvbuVarZdlpuopuiu.eablkybsjg();
        int iGxszxtbevo = nufgyqmvbuVarZdlpuopuiu.gxszxtbevo();
        if ((iGxszxtbevo > 0 && iWkgbmnqykc <= iEablkybsjg) || (iGxszxtbevo < 0 && iEablkybsjg <= iWkgbmnqykc)) {
            while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zdlpuopuiu(iWkgbmnqykc))) {
                if (iWkgbmnqykc != iEablkybsjg) {
                    iWkgbmnqykc += iGxszxtbevo;
                }
            }
            return pmvmpeiblj(iWkgbmnqykc, gxszxtbevoVar);
        }
        return this;
    }

    private final boolean gxszxtbevo(Object obj) {
        zg.nufgyqmvbu nufgyqmvbuVarZdlpuopuiu = zg.gtknphoqwx.zdlpuopuiu(zg.gtknphoqwx.jyumaefscl(0, this.f50014wkgbmnqykc.length), 2);
        int iWkgbmnqykc = nufgyqmvbuVarZdlpuopuiu.wkgbmnqykc();
        int iEablkybsjg = nufgyqmvbuVarZdlpuopuiu.eablkybsjg();
        int iGxszxtbevo = nufgyqmvbuVarZdlpuopuiu.gxszxtbevo();
        if ((iGxszxtbevo > 0 && iWkgbmnqykc <= iEablkybsjg) || (iGxszxtbevo < 0 && iEablkybsjg <= iWkgbmnqykc)) {
            while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, this.f50014wkgbmnqykc[iWkgbmnqykc])) {
                if (iWkgbmnqykc != iEablkybsjg) {
                    iWkgbmnqykc += iGxszxtbevo;
                }
            }
            return true;
        }
        return false;
    }

    private final zdlpuopuiu hcddaimhww(zdlpuopuiu zdlpuopuiuVar, zdlpuopuiu zdlpuopuiuVar2, int i13, int i14, fmlbqenlif.eablkybsjg eablkybsjgVar) {
        if (zdlpuopuiuVar2 == null) {
            return pkzmftpjix(i13, i14, eablkybsjgVar);
        }
        return (this.f50013ppxfxbqfkf == eablkybsjgVar || zdlpuopuiuVar != zdlpuopuiuVar2) ? jpowsppfya(i13, zdlpuopuiuVar2, eablkybsjgVar) : this;
    }

    private final zdlpuopuiu hkdspvbjdz(int i13, Object obj, gxszxtbevo gxszxtbevoVar) {
        if (this.f50013ppxfxbqfkf == gxszxtbevoVar.btonecajqb()) {
            this.f50014wkgbmnqykc[i13 + 1] = obj;
            return this;
        }
        gxszxtbevoVar.gtknphoqwx(gxszxtbevoVar.gxszxtbevo() + 1);
        Object[] objArr = this.f50014wkgbmnqykc;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i13 + 1] = obj;
        return new zdlpuopuiu(this.f50012iobyxmoadg, this.f50015zoijcleaow, objArrCopyOf, gxszxtbevoVar.btonecajqb());
    }

    private final zdlpuopuiu iozdgvuglv(zdlpuopuiu zdlpuopuiuVar, int i13, int i14, fmlbqenlif.zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
        if (oxmwwwfdhm(i13)) {
            zdlpuopuiu zdlpuopuiuVarCllcsxoeiz = cllcsxoeiz(dsvhmnatus(i13));
            if (zdlpuopuiuVar.oxmwwwfdhm(i13)) {
                return zdlpuopuiuVarCllcsxoeiz.yadqdtsiqt(zdlpuopuiuVar.cllcsxoeiz(zdlpuopuiuVar.dsvhmnatus(i13)), i14 + 5, zoijcleaowVar, gxszxtbevoVar);
            }
            if (!zdlpuopuiuVar.vdvldrhtss(i13)) {
                return zdlpuopuiuVarCllcsxoeiz;
            }
            int iAgtfadlqog = zdlpuopuiuVar.agtfadlqog(i13);
            Object objZdlpuopuiu = zdlpuopuiuVar.zdlpuopuiu(iAgtfadlqog);
            Object objSopmlzcsov = zdlpuopuiuVar.sopmlzcsov(iAgtfadlqog);
            int size = gxszxtbevoVar.size();
            zdlpuopuiu zdlpuopuiuVarCdpycssgdh = zdlpuopuiuVarCllcsxoeiz.cdpycssgdh(objZdlpuopuiu != null ? objZdlpuopuiu.hashCode() : 0, objZdlpuopuiu, objSopmlzcsov, i14 + 5, gxszxtbevoVar);
            if (gxszxtbevoVar.size() != size) {
                return zdlpuopuiuVarCdpycssgdh;
            }
            zoijcleaowVar.ppxfxbqfkf(zoijcleaowVar.iobyxmoadg() + 1);
            return zdlpuopuiuVarCdpycssgdh;
        }
        if (!zdlpuopuiuVar.oxmwwwfdhm(i13)) {
            int iAgtfadlqog2 = agtfadlqog(i13);
            Object objZdlpuopuiu2 = zdlpuopuiu(iAgtfadlqog2);
            Object objSopmlzcsov2 = sopmlzcsov(iAgtfadlqog2);
            int iAgtfadlqog3 = zdlpuopuiuVar.agtfadlqog(i13);
            Object objZdlpuopuiu3 = zdlpuopuiuVar.zdlpuopuiu(iAgtfadlqog3);
            return yggfygwlhe(objZdlpuopuiu2 != null ? objZdlpuopuiu2.hashCode() : 0, objZdlpuopuiu2, objSopmlzcsov2, objZdlpuopuiu3 != null ? objZdlpuopuiu3.hashCode() : 0, objZdlpuopuiu3, zdlpuopuiuVar.sopmlzcsov(iAgtfadlqog3), i14 + 5, gxszxtbevoVar.btonecajqb());
        }
        zdlpuopuiu zdlpuopuiuVarCllcsxoeiz2 = zdlpuopuiuVar.cllcsxoeiz(zdlpuopuiuVar.dsvhmnatus(i13));
        if (vdvldrhtss(i13)) {
            int iAgtfadlqog4 = agtfadlqog(i13);
            Object objZdlpuopuiu4 = zdlpuopuiu(iAgtfadlqog4);
            int i15 = i14 + 5;
            if (!zdlpuopuiuVarCllcsxoeiz2.gtknphoqwx(objZdlpuopuiu4 != null ? objZdlpuopuiu4.hashCode() : 0, objZdlpuopuiu4, i15)) {
                return zdlpuopuiuVarCllcsxoeiz2.cdpycssgdh(objZdlpuopuiu4 != null ? objZdlpuopuiu4.hashCode() : 0, objZdlpuopuiu4, sopmlzcsov(iAgtfadlqog4), i15, gxszxtbevoVar);
            }
            zoijcleaowVar.ppxfxbqfkf(zoijcleaowVar.iobyxmoadg() + 1);
        }
        return zdlpuopuiuVarCllcsxoeiz2;
    }

    private final zdlpuopuiu istkbnxepw(int i13, int i14, int i15, Object obj, Object obj2, int i16, fmlbqenlif.eablkybsjg eablkybsjgVar) {
        if (this.f50013ppxfxbqfkf != eablkybsjgVar) {
            return new zdlpuopuiu(this.f50012iobyxmoadg ^ i14, i14 | this.f50015zoijcleaow, wkgbmnqykc(i13, i14, i15, obj, obj2, i16, eablkybsjgVar), eablkybsjgVar);
        }
        this.f50014wkgbmnqykc = wkgbmnqykc(i13, i14, i15, obj, obj2, i16, eablkybsjgVar);
        this.f50012iobyxmoadg ^= i14;
        this.f50015zoijcleaow |= i14;
        return this;
    }

    private final zdlpuopuiu iwizpuwonk(Object obj, Object obj2, gxszxtbevo gxszxtbevoVar) {
        zg.nufgyqmvbu nufgyqmvbuVarZdlpuopuiu = zg.gtknphoqwx.zdlpuopuiu(zg.gtknphoqwx.jyumaefscl(0, this.f50014wkgbmnqykc.length), 2);
        int iWkgbmnqykc = nufgyqmvbuVarZdlpuopuiu.wkgbmnqykc();
        int iEablkybsjg = nufgyqmvbuVarZdlpuopuiu.eablkybsjg();
        int iGxszxtbevo = nufgyqmvbuVarZdlpuopuiu.gxszxtbevo();
        if ((iGxszxtbevo > 0 && iWkgbmnqykc <= iEablkybsjg) || (iGxszxtbevo < 0 && iEablkybsjg <= iWkgbmnqykc)) {
            while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zdlpuopuiu(iWkgbmnqykc))) {
                if (iWkgbmnqykc != iEablkybsjg) {
                    iWkgbmnqykc += iGxszxtbevo;
                }
            }
            gxszxtbevoVar.draadjrbmk(sopmlzcsov(iWkgbmnqykc));
            if (this.f50013ppxfxbqfkf == gxszxtbevoVar.btonecajqb()) {
                this.f50014wkgbmnqykc[iWkgbmnqykc + 1] = obj2;
                return this;
            }
            gxszxtbevoVar.gtknphoqwx(gxszxtbevoVar.gxszxtbevo() + 1);
            Object[] objArr = this.f50014wkgbmnqykc;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iWkgbmnqykc + 1] = obj2;
            return new zdlpuopuiu(0, 0, objArrCopyOf, gxszxtbevoVar.btonecajqb());
        }
        gxszxtbevoVar.agtfadlqog(gxszxtbevoVar.size() + 1);
        return new zdlpuopuiu(0, 0, cqumvgiudr.lqeggnwhkg(this.f50014wkgbmnqykc, 0, obj, obj2), gxszxtbevoVar.btonecajqb());
    }

    private final zdlpuopuiu jpowsppfya(int i13, zdlpuopuiu zdlpuopuiuVar, fmlbqenlif.eablkybsjg eablkybsjgVar) {
        Object[] objArr = this.f50014wkgbmnqykc;
        if (objArr.length == 1 && zdlpuopuiuVar.f50014wkgbmnqykc.length == 2 && zdlpuopuiuVar.f50015zoijcleaow == 0) {
            zdlpuopuiuVar.f50012iobyxmoadg = this.f50015zoijcleaow;
            return zdlpuopuiuVar;
        }
        if (this.f50013ppxfxbqfkf == eablkybsjgVar) {
            objArr[i13] = zdlpuopuiuVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i13] = zdlpuopuiuVar;
        return new zdlpuopuiu(this.f50012iobyxmoadg, this.f50015zoijcleaow, objArrCopyOf, eablkybsjgVar);
    }

    private final zdlpuopuiu jyumaefscl(int i13, int i14, int i15, Object obj, Object obj2, int i16) {
        return new zdlpuopuiu(this.f50012iobyxmoadg ^ i14, i14 | this.f50015zoijcleaow, wkgbmnqykc(i13, i14, i15, obj, obj2, i16, null));
    }

    private final zdlpuopuiu kcexrzcfyt(int i13, Object obj, Object obj2) {
        return new zdlpuopuiu(i13 | this.f50012iobyxmoadg, this.f50015zoijcleaow, cqumvgiudr.lqeggnwhkg(this.f50014wkgbmnqykc, agtfadlqog(i13), obj, obj2));
    }

    private final zdlpuopuiu kegysxyocb(int i13, int i14) {
        Object[] objArr = this.f50014wkgbmnqykc;
        if (objArr.length == 2) {
            return null;
        }
        return new zdlpuopuiu(i14 ^ this.f50012iobyxmoadg, this.f50015zoijcleaow, cqumvgiudr.nufgyqmvbu(objArr, i13));
    }

    private final zdlpuopuiu lereixgezr(Object obj, Object obj2, gxszxtbevo gxszxtbevoVar) {
        zg.nufgyqmvbu nufgyqmvbuVarZdlpuopuiu = zg.gtknphoqwx.zdlpuopuiu(zg.gtknphoqwx.jyumaefscl(0, this.f50014wkgbmnqykc.length), 2);
        int iWkgbmnqykc = nufgyqmvbuVarZdlpuopuiu.wkgbmnqykc();
        int iEablkybsjg = nufgyqmvbuVarZdlpuopuiu.eablkybsjg();
        int iGxszxtbevo = nufgyqmvbuVarZdlpuopuiu.gxszxtbevo();
        if ((iGxszxtbevo > 0 && iWkgbmnqykc <= iEablkybsjg) || (iGxszxtbevo < 0 && iEablkybsjg <= iWkgbmnqykc)) {
            while (true) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zdlpuopuiu(iWkgbmnqykc)) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj2, sopmlzcsov(iWkgbmnqykc))) {
                    return pmvmpeiblj(iWkgbmnqykc, gxszxtbevoVar);
                }
                if (iWkgbmnqykc != iEablkybsjg) {
                    iWkgbmnqykc += iGxszxtbevo;
                }
            }
        }
        return this;
    }

    private final Object lqeggnwhkg(Object obj) {
        zg.nufgyqmvbu nufgyqmvbuVarZdlpuopuiu = zg.gtknphoqwx.zdlpuopuiu(zg.gtknphoqwx.jyumaefscl(0, this.f50014wkgbmnqykc.length), 2);
        int iWkgbmnqykc = nufgyqmvbuVarZdlpuopuiu.wkgbmnqykc();
        int iEablkybsjg = nufgyqmvbuVarZdlpuopuiu.eablkybsjg();
        int iGxszxtbevo = nufgyqmvbuVarZdlpuopuiu.gxszxtbevo();
        if ((iGxszxtbevo <= 0 || iWkgbmnqykc > iEablkybsjg) && (iGxszxtbevo >= 0 || iEablkybsjg > iWkgbmnqykc)) {
            return null;
        }
        while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zdlpuopuiu(iWkgbmnqykc))) {
            if (iWkgbmnqykc == iEablkybsjg) {
                return null;
            }
            iWkgbmnqykc += iGxszxtbevo;
        }
        return sopmlzcsov(iWkgbmnqykc);
    }

    private final zdlpuopuiu mbcevpiqjq(zdlpuopuiu zdlpuopuiuVar, zdlpuopuiu zdlpuopuiuVar2, int i13, int i14) {
        if (zdlpuopuiuVar2 == null) {
            return tzroggbefp(i13, i14);
        }
        return zdlpuopuiuVar != zdlpuopuiuVar2 ? ntlheqmsrt(i13, i14, zdlpuopuiuVar2) : this;
    }

    private final zdlpuopuiu ntlheqmsrt(int i13, int i14, zdlpuopuiu zdlpuopuiuVar) {
        Object[] objArr = zdlpuopuiuVar.f50014wkgbmnqykc;
        if (objArr.length != 2 || zdlpuopuiuVar.f50015zoijcleaow != 0) {
            Object[] objArr2 = this.f50014wkgbmnqykc;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i13] = zdlpuopuiuVar;
            return new zdlpuopuiu(this.f50012iobyxmoadg, this.f50015zoijcleaow, objArrCopyOf);
        }
        if (this.f50014wkgbmnqykc.length == 1) {
            zdlpuopuiuVar.f50012iobyxmoadg = this.f50015zoijcleaow;
            return zdlpuopuiuVar;
        }
        return new zdlpuopuiu(this.f50012iobyxmoadg ^ i14, i14 ^ this.f50015zoijcleaow, cqumvgiudr.gtknphoqwx(this.f50014wkgbmnqykc, i13, agtfadlqog(i14), objArr[0], objArr[1]));
    }

    private final zoijcleaow nufgyqmvbu(Object obj, Object obj2) {
        zg.nufgyqmvbu nufgyqmvbuVarZdlpuopuiu = zg.gtknphoqwx.zdlpuopuiu(zg.gtknphoqwx.jyumaefscl(0, this.f50014wkgbmnqykc.length), 2);
        int iWkgbmnqykc = nufgyqmvbuVarZdlpuopuiu.wkgbmnqykc();
        int iEablkybsjg = nufgyqmvbuVarZdlpuopuiu.eablkybsjg();
        int iGxszxtbevo = nufgyqmvbuVarZdlpuopuiu.gxszxtbevo();
        if ((iGxszxtbevo > 0 && iWkgbmnqykc <= iEablkybsjg) || (iGxszxtbevo < 0 && iEablkybsjg <= iWkgbmnqykc)) {
            while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zdlpuopuiu(iWkgbmnqykc))) {
                if (iWkgbmnqykc != iEablkybsjg) {
                    iWkgbmnqykc += iGxszxtbevo;
                }
            }
            if (obj2 == sopmlzcsov(iWkgbmnqykc)) {
                return null;
            }
            Object[] objArr = this.f50014wkgbmnqykc;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iWkgbmnqykc + 1] = obj2;
            return new zdlpuopuiu(0, 0, objArrCopyOf).ppxfxbqfkf();
        }
        return new zdlpuopuiu(0, 0, cqumvgiudr.lqeggnwhkg(this.f50014wkgbmnqykc, 0, obj, obj2)).zoijcleaow();
    }

    private final boolean oxmwwwfdhm(int i13) {
        return (i13 & this.f50015zoijcleaow) != 0;
    }

    private final zdlpuopuiu pkzmftpjix(int i13, int i14, fmlbqenlif.eablkybsjg eablkybsjgVar) {
        Object[] objArr = this.f50014wkgbmnqykc;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f50013ppxfxbqfkf != eablkybsjgVar) {
            return new zdlpuopuiu(this.f50012iobyxmoadg, i14 ^ this.f50015zoijcleaow, cqumvgiudr.dxjokdxxww(objArr, i13), eablkybsjgVar);
        }
        this.f50014wkgbmnqykc = cqumvgiudr.dxjokdxxww(objArr, i13);
        this.f50015zoijcleaow ^= i14;
        return this;
    }

    private final zdlpuopuiu pmvmpeiblj(int i13, gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.agtfadlqog(gxszxtbevoVar.size() - 1);
        gxszxtbevoVar.draadjrbmk(sopmlzcsov(i13));
        if (this.f50014wkgbmnqykc.length == 2) {
            return null;
        }
        if (this.f50013ppxfxbqfkf != gxszxtbevoVar.btonecajqb()) {
            return new zdlpuopuiu(0, 0, cqumvgiudr.nufgyqmvbu(this.f50014wkgbmnqykc, i13), gxszxtbevoVar.btonecajqb());
        }
        this.f50014wkgbmnqykc = cqumvgiudr.nufgyqmvbu(this.f50014wkgbmnqykc, i13);
        return this;
    }

    private final zoijcleaow ppxfxbqfkf() {
        return new zoijcleaow(this, 0);
    }

    private final Object sopmlzcsov(int i13) {
        return this.f50014wkgbmnqykc[i13 + 1];
    }

    private final zdlpuopuiu tzroggbefp(int i13, int i14) {
        Object[] objArr = this.f50014wkgbmnqykc;
        if (objArr.length == 1) {
            return null;
        }
        return new zdlpuopuiu(this.f50012iobyxmoadg, i14 ^ this.f50015zoijcleaow, cqumvgiudr.dxjokdxxww(objArr, i13));
    }

    private final zdlpuopuiu ulzqkzuiru(int i13, Object obj) {
        Object[] objArr = this.f50014wkgbmnqykc;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i13 + 1] = obj;
        return new zdlpuopuiu(this.f50012iobyxmoadg, this.f50015zoijcleaow, objArrCopyOf);
    }

    private final Object[] wkgbmnqykc(int i13, int i14, int i15, Object obj, Object obj2, int i16, fmlbqenlif.eablkybsjg eablkybsjgVar) {
        Object objZdlpuopuiu = zdlpuopuiu(i13);
        return cqumvgiudr.btonecajqb(this.f50014wkgbmnqykc, i13, dsvhmnatus(i14) + 1, yggfygwlhe(objZdlpuopuiu != null ? objZdlpuopuiu.hashCode() : 0, objZdlpuopuiu, sopmlzcsov(i13), i15, obj, obj2, i16 + 5, eablkybsjgVar));
    }

    private final zdlpuopuiu yggfygwlhe(int i13, Object obj, Object obj2, int i14, Object obj3, Object obj4, int i15, fmlbqenlif.eablkybsjg eablkybsjgVar) {
        if (i15 > 30) {
            return new zdlpuopuiu(0, 0, new Object[]{obj, obj2, obj3, obj4}, eablkybsjgVar);
        }
        int iGxszxtbevo = cqumvgiudr.gxszxtbevo(i13, i15);
        int iGxszxtbevo2 = cqumvgiudr.gxszxtbevo(i14, i15);
        if (iGxszxtbevo != iGxszxtbevo2) {
            return new zdlpuopuiu((1 << iGxszxtbevo) | (1 << iGxszxtbevo2), 0, iGxszxtbevo < iGxszxtbevo2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, eablkybsjgVar);
        }
        return new zdlpuopuiu(0, 1 << iGxszxtbevo, new Object[]{yggfygwlhe(i13, obj, obj2, i14, obj3, obj4, i15 + 5, eablkybsjgVar)}, eablkybsjgVar);
    }

    private final zdlpuopuiu ylkuphrtab(int i13, int i14, gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.agtfadlqog(gxszxtbevoVar.size() - 1);
        gxszxtbevoVar.draadjrbmk(sopmlzcsov(i13));
        if (this.f50014wkgbmnqykc.length == 2) {
            return null;
        }
        if (this.f50013ppxfxbqfkf != gxszxtbevoVar.btonecajqb()) {
            return new zdlpuopuiu(i14 ^ this.f50012iobyxmoadg, this.f50015zoijcleaow, cqumvgiudr.nufgyqmvbu(this.f50014wkgbmnqykc, i13), gxszxtbevoVar.btonecajqb());
        }
        this.f50014wkgbmnqykc = cqumvgiudr.nufgyqmvbu(this.f50014wkgbmnqykc, i13);
        this.f50012iobyxmoadg ^= i14;
        return this;
    }

    private final Object zdlpuopuiu(int i13) {
        return this.f50014wkgbmnqykc[i13];
    }

    private final zoijcleaow zoijcleaow() {
        return new zoijcleaow(this, 1);
    }

    private final zdlpuopuiu zynmafqrjb(int i13, Object obj, Object obj2, fmlbqenlif.eablkybsjg eablkybsjgVar) {
        int iAgtfadlqog = agtfadlqog(i13);
        if (this.f50013ppxfxbqfkf != eablkybsjgVar) {
            return new zdlpuopuiu(i13 | this.f50012iobyxmoadg, this.f50015zoijcleaow, cqumvgiudr.lqeggnwhkg(this.f50014wkgbmnqykc, iAgtfadlqog, obj, obj2), eablkybsjgVar);
        }
        this.f50014wkgbmnqykc = cqumvgiudr.lqeggnwhkg(this.f50014wkgbmnqykc, iAgtfadlqog, obj, obj2);
        this.f50012iobyxmoadg = i13 | this.f50012iobyxmoadg;
        return this;
    }

    public final int agtfadlqog(int i13) {
        return Integer.bitCount((i13 - 1) & this.f50012iobyxmoadg) * 2;
    }

    public final zdlpuopuiu cdpycssgdh(int i13, Object obj, Object obj2, int i14, gxszxtbevo gxszxtbevoVar) {
        int iGxszxtbevo = 1 << cqumvgiudr.gxszxtbevo(i13, i14);
        if (vdvldrhtss(iGxszxtbevo)) {
            int iAgtfadlqog = agtfadlqog(iGxszxtbevo);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zdlpuopuiu(iAgtfadlqog))) {
                gxszxtbevoVar.draadjrbmk(sopmlzcsov(iAgtfadlqog));
                return sopmlzcsov(iAgtfadlqog) == obj2 ? this : hkdspvbjdz(iAgtfadlqog, obj2, gxszxtbevoVar);
            }
            gxszxtbevoVar.agtfadlqog(gxszxtbevoVar.size() + 1);
            return istkbnxepw(iAgtfadlqog, iGxszxtbevo, i13, obj, obj2, i14, gxszxtbevoVar.btonecajqb());
        }
        if (!oxmwwwfdhm(iGxszxtbevo)) {
            gxszxtbevoVar.agtfadlqog(gxszxtbevoVar.size() + 1);
            return zynmafqrjb(iGxszxtbevo, obj, obj2, gxszxtbevoVar.btonecajqb());
        }
        int iDsvhmnatus = dsvhmnatus(iGxszxtbevo);
        zdlpuopuiu zdlpuopuiuVarCllcsxoeiz = cllcsxoeiz(iDsvhmnatus);
        zdlpuopuiu zdlpuopuiuVarIwizpuwonk = i14 == 30 ? zdlpuopuiuVarCllcsxoeiz.iwizpuwonk(obj, obj2, gxszxtbevoVar) : zdlpuopuiuVarCllcsxoeiz.cdpycssgdh(i13, obj, obj2, i14 + 5, gxszxtbevoVar);
        return zdlpuopuiuVarCllcsxoeiz == zdlpuopuiuVarIwizpuwonk ? this : jpowsppfya(iDsvhmnatus, zdlpuopuiuVarIwizpuwonk, gxszxtbevoVar.btonecajqb());
    }

    public final zdlpuopuiu cllcsxoeiz(int i13) {
        Object obj = this.f50014wkgbmnqykc[i13];
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (zdlpuopuiu) obj;
    }

    public final int dsvhmnatus(int i13) {
        return (this.f50014wkgbmnqykc.length - 1) - Integer.bitCount((i13 - 1) & this.f50015zoijcleaow);
    }

    public final boolean gtknphoqwx(int i13, Object obj, int i14) {
        int iGxszxtbevo = 1 << cqumvgiudr.gxszxtbevo(i13, i14);
        if (vdvldrhtss(iGxszxtbevo)) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zdlpuopuiu(agtfadlqog(iGxszxtbevo)));
        }
        if (!oxmwwwfdhm(iGxszxtbevo)) {
            return false;
        }
        zdlpuopuiu zdlpuopuiuVarCllcsxoeiz = cllcsxoeiz(dsvhmnatus(iGxszxtbevo));
        return i14 == 30 ? zdlpuopuiuVarCllcsxoeiz.gxszxtbevo(obj) : zdlpuopuiuVarCllcsxoeiz.gtknphoqwx(i13, obj, i14 + 5);
    }

    public final zdlpuopuiu lmojexxdyd(int i13, Object obj, int i14, gxszxtbevo gxszxtbevoVar) {
        int iGxszxtbevo = 1 << cqumvgiudr.gxszxtbevo(i13, i14);
        if (vdvldrhtss(iGxszxtbevo)) {
            int iAgtfadlqog = agtfadlqog(iGxszxtbevo);
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zdlpuopuiu(iAgtfadlqog)) ? ylkuphrtab(iAgtfadlqog, iGxszxtbevo, gxszxtbevoVar) : this;
        }
        if (!oxmwwwfdhm(iGxszxtbevo)) {
            return this;
        }
        int iDsvhmnatus = dsvhmnatus(iGxszxtbevo);
        zdlpuopuiu zdlpuopuiuVarCllcsxoeiz = cllcsxoeiz(iDsvhmnatus);
        return hcddaimhww(zdlpuopuiuVarCllcsxoeiz, i14 == 30 ? zdlpuopuiuVarCllcsxoeiz.esjtqupxsv(obj, gxszxtbevoVar) : zdlpuopuiuVarCllcsxoeiz.lmojexxdyd(i13, obj, i14 + 5, gxszxtbevoVar), iDsvhmnatus, iGxszxtbevo, gxszxtbevoVar.btonecajqb());
    }

    public final Object ojitshcjhn(int i13, Object obj, int i14) {
        int iGxszxtbevo = 1 << cqumvgiudr.gxszxtbevo(i13, i14);
        if (vdvldrhtss(iGxszxtbevo)) {
            int iAgtfadlqog = agtfadlqog(iGxszxtbevo);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zdlpuopuiu(iAgtfadlqog))) {
                return sopmlzcsov(iAgtfadlqog);
            }
            return null;
        }
        if (!oxmwwwfdhm(iGxszxtbevo)) {
            return null;
        }
        zdlpuopuiu zdlpuopuiuVarCllcsxoeiz = cllcsxoeiz(dsvhmnatus(iGxszxtbevo));
        return i14 == 30 ? zdlpuopuiuVarCllcsxoeiz.lqeggnwhkg(obj) : zdlpuopuiuVarCllcsxoeiz.ojitshcjhn(i13, obj, i14 + 5);
    }

    public final Object[] rgvfuqvkyq() {
        return this.f50014wkgbmnqykc;
    }

    public final zdlpuopuiu stevsuqkhv(int i13, Object obj, int i14) {
        int iGxszxtbevo = 1 << cqumvgiudr.gxszxtbevo(i13, i14);
        if (vdvldrhtss(iGxszxtbevo)) {
            int iAgtfadlqog = agtfadlqog(iGxszxtbevo);
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zdlpuopuiu(iAgtfadlqog)) ? kegysxyocb(iAgtfadlqog, iGxszxtbevo) : this;
        }
        if (!oxmwwwfdhm(iGxszxtbevo)) {
            return this;
        }
        int iDsvhmnatus = dsvhmnatus(iGxszxtbevo);
        zdlpuopuiu zdlpuopuiuVarCllcsxoeiz = cllcsxoeiz(iDsvhmnatus);
        return mbcevpiqjq(zdlpuopuiuVarCllcsxoeiz, i14 == 30 ? zdlpuopuiuVarCllcsxoeiz.dxjokdxxww(obj) : zdlpuopuiuVarCllcsxoeiz.stevsuqkhv(i13, obj, i14 + 5), iDsvhmnatus, iGxszxtbevo);
    }

    public final boolean vdvldrhtss(int i13) {
        return (i13 & this.f50012iobyxmoadg) != 0;
    }

    public final int wflxmlrfwp() {
        return Integer.bitCount(this.f50012iobyxmoadg);
    }

    public final zdlpuopuiu wwaezpbzkn(int i13, Object obj, Object obj2, int i14, gxszxtbevo gxszxtbevoVar) {
        int iGxszxtbevo = 1 << cqumvgiudr.gxszxtbevo(i13, i14);
        if (vdvldrhtss(iGxszxtbevo)) {
            int iAgtfadlqog = agtfadlqog(iGxszxtbevo);
            return (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zdlpuopuiu(iAgtfadlqog)) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj2, sopmlzcsov(iAgtfadlqog))) ? ylkuphrtab(iAgtfadlqog, iGxszxtbevo, gxszxtbevoVar) : this;
        }
        if (!oxmwwwfdhm(iGxszxtbevo)) {
            return this;
        }
        int iDsvhmnatus = dsvhmnatus(iGxszxtbevo);
        zdlpuopuiu zdlpuopuiuVarCllcsxoeiz = cllcsxoeiz(iDsvhmnatus);
        return hcddaimhww(zdlpuopuiuVarCllcsxoeiz, i14 == 30 ? zdlpuopuiuVarCllcsxoeiz.lereixgezr(obj, obj2, gxszxtbevoVar) : zdlpuopuiuVarCllcsxoeiz.wwaezpbzkn(i13, obj, obj2, i14 + 5, gxszxtbevoVar), iDsvhmnatus, iGxszxtbevo, gxszxtbevoVar.btonecajqb());
    }

    public final zoijcleaow wypolnanlu(int i13, Object obj, Object obj2, int i14) {
        zoijcleaow zoijcleaowVarWypolnanlu;
        int iGxszxtbevo = 1 << cqumvgiudr.gxszxtbevo(i13, i14);
        if (vdvldrhtss(iGxszxtbevo)) {
            int iAgtfadlqog = agtfadlqog(iGxszxtbevo);
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zdlpuopuiu(iAgtfadlqog))) {
                return jyumaefscl(iAgtfadlqog, iGxszxtbevo, i13, obj, obj2, i14).zoijcleaow();
            }
            if (sopmlzcsov(iAgtfadlqog) == obj2) {
                return null;
            }
            return ulzqkzuiru(iAgtfadlqog, obj2).ppxfxbqfkf();
        }
        if (!oxmwwwfdhm(iGxszxtbevo)) {
            return kcexrzcfyt(iGxszxtbevo, obj, obj2).zoijcleaow();
        }
        int iDsvhmnatus = dsvhmnatus(iGxszxtbevo);
        zdlpuopuiu zdlpuopuiuVarCllcsxoeiz = cllcsxoeiz(iDsvhmnatus);
        if (i14 == 30) {
            zoijcleaowVarWypolnanlu = zdlpuopuiuVarCllcsxoeiz.nufgyqmvbu(obj, obj2);
            if (zoijcleaowVarWypolnanlu == null) {
                return null;
            }
        } else {
            zoijcleaowVarWypolnanlu = zdlpuopuiuVarCllcsxoeiz.wypolnanlu(i13, obj, obj2, i14 + 5);
            if (zoijcleaowVarWypolnanlu == null) {
                return null;
            }
        }
        zoijcleaowVarWypolnanlu.ppxfxbqfkf(ntlheqmsrt(iDsvhmnatus, iGxszxtbevo, zoijcleaowVarWypolnanlu.iobyxmoadg()));
        return zoijcleaowVarWypolnanlu;
    }

    public final zdlpuopuiu yadqdtsiqt(zdlpuopuiu zdlpuopuiuVar, int i13, fmlbqenlif.zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
        if (this == zdlpuopuiuVar) {
            zoijcleaowVar.zoijcleaow(eablkybsjg());
            return this;
        }
        if (i13 > 30) {
            return cqumvgiudr(zdlpuopuiuVar, zoijcleaowVar, gxszxtbevoVar.btonecajqb());
        }
        int i14 = this.f50015zoijcleaow | zdlpuopuiuVar.f50015zoijcleaow;
        int i15 = this.f50012iobyxmoadg;
        int i16 = zdlpuopuiuVar.f50012iobyxmoadg;
        int i17 = (i15 ^ i16) & (~i14);
        int i18 = i15 & i16;
        int i19 = i17;
        while (i18 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i18);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zdlpuopuiu(agtfadlqog(iLowestOneBit)), zdlpuopuiuVar.zdlpuopuiu(zdlpuopuiuVar.agtfadlqog(iLowestOneBit)))) {
                i19 |= iLowestOneBit;
            } else {
                i14 |= iLowestOneBit;
            }
            i18 ^= iLowestOneBit;
        }
        int i23 = 0;
        if (!((i14 & i19) == 0)) {
            fmlbqenlif.zoijcleaow("Check failed.");
        }
        zdlpuopuiu zdlpuopuiuVar2 = (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50013ppxfxbqfkf, gxszxtbevoVar.btonecajqb()) && this.f50012iobyxmoadg == i19 && this.f50015zoijcleaow == i14) ? this : new zdlpuopuiu(i19, i14, new Object[(Integer.bitCount(i19) * 2) + Integer.bitCount(i14)]);
        int i24 = i14;
        int i25 = 0;
        while (i24 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i24);
            Object[] objArr = zdlpuopuiuVar2.f50014wkgbmnqykc;
            objArr[(objArr.length - 1) - i25] = iozdgvuglv(zdlpuopuiuVar, iLowestOneBit2, i13, zoijcleaowVar, gxszxtbevoVar);
            i25++;
            i24 ^= iLowestOneBit2;
        }
        while (i19 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i19);
            int i26 = i23 * 2;
            if (zdlpuopuiuVar.vdvldrhtss(iLowestOneBit3)) {
                int iAgtfadlqog = zdlpuopuiuVar.agtfadlqog(iLowestOneBit3);
                zdlpuopuiuVar2.f50014wkgbmnqykc[i26] = zdlpuopuiuVar.zdlpuopuiu(iAgtfadlqog);
                zdlpuopuiuVar2.f50014wkgbmnqykc[i26 + 1] = zdlpuopuiuVar.sopmlzcsov(iAgtfadlqog);
                if (vdvldrhtss(iLowestOneBit3)) {
                    zoijcleaowVar.ppxfxbqfkf(zoijcleaowVar.iobyxmoadg() + 1);
                }
            } else {
                int iAgtfadlqog2 = agtfadlqog(iLowestOneBit3);
                zdlpuopuiuVar2.f50014wkgbmnqykc[i26] = zdlpuopuiu(iAgtfadlqog2);
                zdlpuopuiuVar2.f50014wkgbmnqykc[i26 + 1] = sopmlzcsov(iAgtfadlqog2);
            }
            i23++;
            i19 ^= iLowestOneBit3;
        }
        if (draadjrbmk(zdlpuopuiuVar2)) {
            return this;
        }
        return zdlpuopuiuVar.draadjrbmk(zdlpuopuiuVar2) ? zdlpuopuiuVar : zdlpuopuiuVar2;
    }

    public zdlpuopuiu(int i13, int i14, Object[] objArr) {
        this(i13, i14, objArr, null);
    }
}
