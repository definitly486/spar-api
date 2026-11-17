package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f5554agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f5555btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f5556draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f5557dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f5558eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final xrmfcynszj f5559gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private HashMap f5560gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final e0 f5561iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f5562lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f5563nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f5564ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f5565ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f5566wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Object[] f5567wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int[] f5568zoijcleaow;

    public d0(e0 e0Var) {
        this.f5561iobyxmoadg = e0Var;
        this.f5568zoijcleaow = e0Var.draadjrbmk();
        int iWflxmlrfwp = e0Var.wflxmlrfwp();
        this.f5565ppxfxbqfkf = iWflxmlrfwp;
        this.f5567wkgbmnqykc = e0Var.agtfadlqog();
        this.f5558eablkybsjg = e0Var.ojitshcjhn();
        this.f5557dxjokdxxww = iWflxmlrfwp;
        this.f5555btonecajqb = -1;
        this.f5559gtknphoqwx = new xrmfcynszj();
    }

    private final Object cllcsxoeiz(int[] iArr, int i13) {
        int i14 = i13 * 5;
        return (iArr[i14 + 1] & 1073741824) != 0 ? this.f5567wkgbmnqykc[iArr[i14 + 4]] : draadjrbmk.f5569iobyxmoadg.iobyxmoadg();
    }

    private final Object wypolnanlu(int[] iArr, int i13) {
        if ((iArr[(i13 * 5) + 1] & 536870912) != 0) {
            return this.f5567wkgbmnqykc[g0.oxmwwwfdhm(iArr, i13)];
        }
        return null;
    }

    private final Object zoijcleaow(int[] iArr, int i13) {
        return (iArr[(i13 * 5) + 1] & 268435456) != 0 ? this.f5567wkgbmnqykc[g0.wflxmlrfwp(iArr, i13)] : draadjrbmk.f5569iobyxmoadg.iobyxmoadg();
    }

    public final int agtfadlqog() {
        int i13 = this.f5563nufgyqmvbu;
        if (i13 < this.f5557dxjokdxxww) {
            return this.f5568zoijcleaow[i13 * 5];
        }
        return 0;
    }

    public final int btonecajqb() {
        return this.f5557dxjokdxxww;
    }

    public final int cdpycssgdh(int i13) {
        return this.f5568zoijcleaow[i13 * 5];
    }

    public final int cqumvgiudr() {
        return this.f5565ppxfxbqfkf;
    }

    public final void crxdokpmqz() {
        if (this.f5556draadjrbmk <= 0) {
            if (!((this.f5568zoijcleaow[(this.f5563nufgyqmvbu * 5) + 1] & 1073741824) != 0)) {
                fmlbqenlif.iobyxmoadg("Expected a node group");
            }
            sopmlzcsov();
        }
    }

    public final Object draadjrbmk() {
        int i13 = this.f5563nufgyqmvbu;
        if (i13 < this.f5557dxjokdxxww) {
            return zoijcleaow(this.f5568zoijcleaow, i13);
        }
        return 0;
    }

    public final int dsvhmnatus(int i13) {
        return this.f5568zoijcleaow[(i13 * 5) + 1] & 67108863;
    }

    public final boolean dxjokdxxww() {
        return this.f5562lqeggnwhkg;
    }

    public final boolean eablkybsjg(int i13) {
        return (this.f5568zoijcleaow[(i13 * 5) + 1] & 67108864) != 0;
    }

    public final int esjtqupxsv() {
        return this.f5566wflxmlrfwp - g0.zdlpuopuiu(this.f5568zoijcleaow, this.f5555btonecajqb);
    }

    public final int gtknphoqwx() {
        return this.f5563nufgyqmvbu;
    }

    public final void gxszxtbevo() {
        if (!(this.f5556draadjrbmk > 0)) {
            fmlbqenlif.iobyxmoadg("Unbalanced begin/end empty");
        }
        this.f5556draadjrbmk--;
    }

    public final boolean hcddaimhww(int i13) {
        return (this.f5568zoijcleaow[(i13 * 5) + 1] & 1073741824) != 0;
    }

    public final Object hkdspvbjdz(int i13) {
        int[] iArr = this.f5568zoijcleaow;
        if ((iArr[(i13 * 5) + 1] & 1073741824) != 0) {
            return cllcsxoeiz(iArr, i13);
        }
        return null;
    }

    public final zoijcleaow iobyxmoadg(int i13) {
        ArrayList arrayListBtonecajqb = this.f5561iobyxmoadg.btonecajqb();
        int iKcexrzcfyt = g0.kcexrzcfyt(arrayListBtonecajqb, i13, this.f5565ppxfxbqfkf);
        if (iKcexrzcfyt >= 0) {
            return (zoijcleaow) arrayListBtonecajqb.get(iKcexrzcfyt);
        }
        zoijcleaow zoijcleaowVar = new zoijcleaow(i13);
        arrayListBtonecajqb.add(-(iKcexrzcfyt + 1), zoijcleaowVar);
        return zoijcleaowVar;
    }

    public final int iozdgvuglv(int i13) {
        return g0.ojitshcjhn(this.f5568zoijcleaow, i13);
    }

    public final Object istkbnxepw(int i13, int i14) {
        int iZdlpuopuiu = g0.zdlpuopuiu(this.f5568zoijcleaow, i13);
        int i15 = i13 + 1;
        int i16 = iZdlpuopuiu + i14;
        return i16 < (i15 < this.f5565ppxfxbqfkf ? this.f5568zoijcleaow[(i15 * 5) + 4] : this.f5558eablkybsjg) ? this.f5567wkgbmnqykc[i16] : draadjrbmk.f5569iobyxmoadg.iobyxmoadg();
    }

    public final int iwizpuwonk() {
        return this.f5554agtfadlqog - this.f5566wflxmlrfwp;
    }

    public final Object jpowsppfya() {
        int i13;
        if (this.f5556draadjrbmk > 0 || (i13 = this.f5566wflxmlrfwp) >= this.f5554agtfadlqog) {
            this.f5564ojitshcjhn = false;
            return draadjrbmk.f5569iobyxmoadg.iobyxmoadg();
        }
        this.f5564ojitshcjhn = true;
        Object[] objArr = this.f5567wkgbmnqykc;
        this.f5566wflxmlrfwp = i13 + 1;
        return objArr[i13];
    }

    public final int jyumaefscl() {
        int i13 = this.f5555btonecajqb;
        if (i13 >= 0) {
            return this.f5568zoijcleaow[(i13 * 5) + 1] & 67108863;
        }
        return 0;
    }

    public final boolean kcexrzcfyt() {
        int i13 = this.f5563nufgyqmvbu;
        return i13 < this.f5557dxjokdxxww && (this.f5568zoijcleaow[(i13 * 5) + 1] & 536870912) != 0;
    }

    public final void kegysxyocb(int i13) {
        if (!(this.f5556draadjrbmk == 0)) {
            jyumaefscl.zdlpuopuiu("Cannot reposition while in an empty region");
        }
        this.f5563nufgyqmvbu = i13;
        int i14 = this.f5565ppxfxbqfkf;
        int i15 = i13 < i14 ? this.f5568zoijcleaow[(i13 * 5) + 2] : -1;
        if (i15 != this.f5555btonecajqb) {
            this.f5555btonecajqb = i15;
            if (i15 < 0) {
                this.f5557dxjokdxxww = i14;
            } else {
                this.f5557dxjokdxxww = i15 + g0.ojitshcjhn(this.f5568zoijcleaow, i15);
            }
            this.f5566wflxmlrfwp = 0;
            this.f5554agtfadlqog = 0;
        }
    }

    public final e0 lereixgezr() {
        return this.f5561iobyxmoadg;
    }

    public final boolean lmojexxdyd(int i13) {
        return (this.f5568zoijcleaow[(i13 * 5) + 1] & 134217728) != 0;
    }

    public final void lqeggnwhkg() {
        if (this.f5556draadjrbmk == 0) {
            if (!(this.f5563nufgyqmvbu == this.f5557dxjokdxxww)) {
                jyumaefscl.zdlpuopuiu("endGroup() not called at the end of a group");
            }
            int[] iArr = this.f5568zoijcleaow;
            int i13 = iArr[(this.f5555btonecajqb * 5) + 2];
            this.f5555btonecajqb = i13;
            this.f5557dxjokdxxww = i13 < 0 ? this.f5565ppxfxbqfkf : g0.ojitshcjhn(iArr, i13) + i13;
            int iLqeggnwhkg = this.f5559gtknphoqwx.lqeggnwhkg();
            if (iLqeggnwhkg < 0) {
                this.f5566wflxmlrfwp = 0;
                this.f5554agtfadlqog = 0;
            } else {
                this.f5566wflxmlrfwp = iLqeggnwhkg;
                this.f5554agtfadlqog = i13 >= this.f5565ppxfxbqfkf - 1 ? this.f5558eablkybsjg : this.f5568zoijcleaow[((i13 + 1) * 5) + 4];
            }
        }
    }

    public final int mbcevpiqjq() {
        if (!(this.f5556draadjrbmk == 0)) {
            jyumaefscl.zdlpuopuiu("Cannot skip while in an empty region");
        }
        int[] iArr = this.f5568zoijcleaow;
        int i13 = this.f5563nufgyqmvbu;
        int i14 = (iArr[(i13 * 5) + 1] & 1073741824) == 0 ? iArr[(i13 * 5) + 1] & 67108863 : 1;
        this.f5563nufgyqmvbu = i13 + g0.ojitshcjhn(iArr, i13);
        return i14;
    }

    public final void ntlheqmsrt() {
        if (!(this.f5556draadjrbmk == 0)) {
            jyumaefscl.zdlpuopuiu("Cannot skip the enclosing group while in an empty region");
        }
        this.f5563nufgyqmvbu = this.f5557dxjokdxxww;
        this.f5566wflxmlrfwp = 0;
        this.f5554agtfadlqog = 0;
    }

    public final List nufgyqmvbu() {
        ArrayList arrayList = new ArrayList();
        if (this.f5556draadjrbmk > 0) {
            return arrayList;
        }
        int iOjitshcjhn = this.f5563nufgyqmvbu;
        int i13 = 0;
        while (iOjitshcjhn < this.f5557dxjokdxxww) {
            int[] iArr = this.f5568zoijcleaow;
            int i14 = iOjitshcjhn * 5;
            int i15 = iArr[i14];
            Object objWypolnanlu = wypolnanlu(iArr, iOjitshcjhn);
            int i16 = 1;
            int i17 = this.f5568zoijcleaow[i14 + 1];
            if ((1073741824 & i17) == 0) {
                i16 = i17 & 67108863;
            }
            arrayList.add(new yfnezrywwk(i15, objWypolnanlu, iOjitshcjhn, i16, i13));
            iOjitshcjhn += g0.ojitshcjhn(this.f5568zoijcleaow, iOjitshcjhn);
            i13++;
        }
        return arrayList;
    }

    public final Object ojitshcjhn() {
        int i13 = this.f5563nufgyqmvbu;
        if (i13 < this.f5557dxjokdxxww) {
            return wypolnanlu(this.f5568zoijcleaow, i13);
        }
        return null;
    }

    public final boolean oxmwwwfdhm() {
        return this.f5564ojitshcjhn;
    }

    public final boolean pkzmftpjix() {
        return (this.f5568zoijcleaow[(this.f5563nufgyqmvbu * 5) + 1] & 1073741824) != 0;
    }

    public final Object pmvmpeiblj(int i13) {
        return zoijcleaow(this.f5568zoijcleaow, i13);
    }

    public final void ppxfxbqfkf() {
        this.f5556draadjrbmk++;
    }

    public final int rgvfuqvkyq() {
        return g0.ojitshcjhn(this.f5568zoijcleaow, this.f5563nufgyqmvbu);
    }

    public final void sopmlzcsov() {
        if (this.f5556draadjrbmk <= 0) {
            int i13 = this.f5555btonecajqb;
            int i14 = this.f5563nufgyqmvbu;
            if (!(this.f5568zoijcleaow[(i14 * 5) + 2] == i13)) {
                fmlbqenlif.iobyxmoadg("Invalid slot table detected");
            }
            HashMap map = this.f5560gxszxtbevo;
            if (map != null) {
            }
            xrmfcynszj xrmfcynszjVar = this.f5559gtknphoqwx;
            int i15 = this.f5566wflxmlrfwp;
            int i16 = this.f5554agtfadlqog;
            if (i15 == 0 && i16 == 0) {
                xrmfcynszjVar.nufgyqmvbu(-1);
            } else {
                xrmfcynszjVar.nufgyqmvbu(i15);
            }
            this.f5555btonecajqb = i14;
            this.f5557dxjokdxxww = g0.ojitshcjhn(this.f5568zoijcleaow, i14) + i14;
            int i17 = i14 + 1;
            this.f5563nufgyqmvbu = i17;
            this.f5566wflxmlrfwp = g0.zdlpuopuiu(this.f5568zoijcleaow, i14);
            this.f5554agtfadlqog = i14 >= this.f5565ppxfxbqfkf - 1 ? this.f5558eablkybsjg : this.f5568zoijcleaow[(i17 * 5) + 4];
        }
    }

    public final int stevsuqkhv(int i13) {
        return this.f5568zoijcleaow[(i13 * 5) + 2];
    }

    public String toString() {
        return "SlotReader(current=" + this.f5563nufgyqmvbu + ", key=" + agtfadlqog() + ", parent=" + this.f5555btonecajqb + ", end=" + this.f5557dxjokdxxww + ')';
    }

    public final void tzroggbefp(int i13) {
        int iOjitshcjhn = g0.ojitshcjhn(this.f5568zoijcleaow, i13) + i13;
        int i14 = this.f5563nufgyqmvbu;
        if (!(i14 >= i13 && i14 <= iOjitshcjhn)) {
            jyumaefscl.zdlpuopuiu("Index " + i13 + " is not a parent of " + i14);
        }
        this.f5555btonecajqb = i13;
        this.f5557dxjokdxxww = iOjitshcjhn;
        this.f5566wflxmlrfwp = 0;
        this.f5554agtfadlqog = 0;
    }

    public final int ulzqkzuiru(int i13) {
        int iZdlpuopuiu = g0.zdlpuopuiu(this.f5568zoijcleaow, i13);
        int i14 = i13 + 1;
        return (i14 < this.f5565ppxfxbqfkf ? this.f5568zoijcleaow[(i14 * 5) + 4] : this.f5558eablkybsjg) - iZdlpuopuiu;
    }

    public final int vdvldrhtss() {
        return this.f5566wflxmlrfwp - g0.zdlpuopuiu(this.f5568zoijcleaow, this.f5555btonecajqb);
    }

    public final int wflxmlrfwp() {
        return this.f5557dxjokdxxww;
    }

    public final void wkgbmnqykc() {
        this.f5562lqeggnwhkg = true;
        this.f5561iobyxmoadg.ppxfxbqfkf(this, this.f5560gxszxtbevo);
        this.f5567wkgbmnqykc = new Object[0];
    }

    public final boolean wwaezpbzkn(int i13) {
        return (this.f5568zoijcleaow[(i13 * 5) + 1] & 536870912) != 0;
    }

    public final Object yadqdtsiqt(int i13) {
        return wypolnanlu(this.f5568zoijcleaow, i13);
    }

    public final int yggfygwlhe() {
        return this.f5555btonecajqb;
    }

    public final boolean ylkuphrtab() {
        return zdlpuopuiu() || this.f5563nufgyqmvbu == this.f5557dxjokdxxww;
    }

    public final boolean zdlpuopuiu() {
        return this.f5556draadjrbmk > 0;
    }

    public final Object zynmafqrjb(int i13) {
        return istkbnxepw(this.f5563nufgyqmvbu, i13);
    }
}
