package fyldjkxazc;

import androidx.compose.runtime.h0;
import androidx.compose.runtime.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.agtfadlqog;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww extends btonecajqb {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public int f35498gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f35500lqeggnwhkg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public int f35502wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public int f35503zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public wkgbmnqykc[] f35499iobyxmoadg = new wkgbmnqykc[16];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public int[] f35501ppxfxbqfkf = new int[16];

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public Object[] f35497eablkybsjg = new Object[16];

    public final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f35504iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f35505ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f35507zoijcleaow;

        public iobyxmoadg() {
        }

        @Override // fyldjkxazc.eablkybsjg
        public int getInt(int i13) {
            return dxjokdxxww.this.f35501ppxfxbqfkf[this.f35507zoijcleaow + i13];
        }

        @Override // fyldjkxazc.eablkybsjg
        public Object iobyxmoadg(int i13) {
            return dxjokdxxww.this.f35497eablkybsjg[this.f35505ppxfxbqfkf + i13];
        }

        public final boolean ppxfxbqfkf() {
            if (this.f35504iobyxmoadg >= dxjokdxxww.this.f35503zoijcleaow) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVarZoijcleaow = zoijcleaow();
            this.f35507zoijcleaow += wkgbmnqykcVarZoijcleaow.wkgbmnqykc();
            this.f35505ppxfxbqfkf += wkgbmnqykcVarZoijcleaow.gxszxtbevo();
            int i13 = this.f35504iobyxmoadg + 1;
            this.f35504iobyxmoadg = i13;
            return i13 < dxjokdxxww.this.f35503zoijcleaow;
        }

        public final wkgbmnqykc zoijcleaow() {
            return dxjokdxxww.this.f35499iobyxmoadg[this.f35504iobyxmoadg];
        }
    }

    public static final class zoijcleaow {
        public static final void eablkybsjg(dxjokdxxww dxjokdxxwwVar, int i13, Object obj, int i14, Object obj2, int i15, Object obj3) {
            int iGxszxtbevo = dxjokdxxwwVar.f35498gxszxtbevo - dxjokdxxwwVar.f35499iobyxmoadg[dxjokdxxwwVar.f35503zoijcleaow - 1].gxszxtbevo();
            Object[] objArr = dxjokdxxwwVar.f35497eablkybsjg;
            objArr[i13 + iGxszxtbevo] = obj;
            objArr[i14 + iGxszxtbevo] = obj2;
            objArr[iGxszxtbevo + i15] = obj3;
        }

        public static dxjokdxxww iobyxmoadg(dxjokdxxww dxjokdxxwwVar) {
            return dxjokdxxwwVar;
        }

        public static final void ppxfxbqfkf(dxjokdxxww dxjokdxxwwVar, int i13, Object obj, int i14, Object obj2) {
            int iGxszxtbevo = dxjokdxxwwVar.f35498gxszxtbevo - dxjokdxxwwVar.f35499iobyxmoadg[dxjokdxxwwVar.f35503zoijcleaow - 1].gxszxtbevo();
            Object[] objArr = dxjokdxxwwVar.f35497eablkybsjg;
            objArr[i13 + iGxszxtbevo] = obj;
            objArr[iGxszxtbevo + i14] = obj2;
        }

        public static final void wkgbmnqykc(dxjokdxxww dxjokdxxwwVar, int i13, Object obj, int i14, Object obj2, int i15, Object obj3, int i16, Object obj4) {
            int iGxszxtbevo = dxjokdxxwwVar.f35498gxszxtbevo - dxjokdxxwwVar.f35499iobyxmoadg[dxjokdxxwwVar.f35503zoijcleaow - 1].gxszxtbevo();
            Object[] objArr = dxjokdxxwwVar.f35497eablkybsjg;
            objArr[i13 + iGxszxtbevo] = obj;
            objArr[i14 + iGxszxtbevo] = obj2;
            objArr[i15 + iGxszxtbevo] = obj3;
            objArr[iGxszxtbevo + i16] = obj4;
        }

        public static final void zoijcleaow(dxjokdxxww dxjokdxxwwVar, int i13, Object obj) {
            dxjokdxxwwVar.f35497eablkybsjg[(dxjokdxxwwVar.f35498gxszxtbevo - dxjokdxxwwVar.f35499iobyxmoadg[dxjokdxxwwVar.f35503zoijcleaow - 1].gxszxtbevo()) + i13] = obj;
        }
    }

    private final void draadjrbmk(int i13, int i14) {
        Object[] objArr = new Object[zoijcleaow(i13, i14)];
        System.arraycopy(this.f35497eablkybsjg, 0, objArr, 0, i13);
        this.f35497eablkybsjg = objArr;
    }

    private final void gtknphoqwx(int i13, int i14) {
        int[] iArr = new int[zoijcleaow(i13, i14)];
        agtfadlqog.draadjrbmk(this.f35501ppxfxbqfkf, iArr, 0, 0, i13);
        this.f35501ppxfxbqfkf = iArr;
    }

    private final void wflxmlrfwp() {
        int iBtonecajqb = gtknphoqwx.btonecajqb(this.f35503zoijcleaow, UserVerificationMethods.USER_VERIFY_ALL);
        int i13 = this.f35503zoijcleaow;
        wkgbmnqykc[] wkgbmnqykcVarArr = new wkgbmnqykc[iBtonecajqb + i13];
        System.arraycopy(this.f35499iobyxmoadg, 0, wkgbmnqykcVarArr, 0, i13);
        this.f35499iobyxmoadg = wkgbmnqykcVarArr;
    }

    private final int zoijcleaow(int i13, int i14) {
        return gtknphoqwx.gxszxtbevo(i13 + gtknphoqwx.btonecajqb(i13, UserVerificationMethods.USER_VERIFY_ALL), i14);
    }

    public final void btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        if (this.f35503zoijcleaow == this.f35499iobyxmoadg.length) {
            wflxmlrfwp();
        }
        int iWkgbmnqykc = this.f35502wkgbmnqykc + wkgbmnqykcVar.wkgbmnqykc();
        int length = this.f35501ppxfxbqfkf.length;
        if (iWkgbmnqykc > length) {
            gtknphoqwx(length, iWkgbmnqykc);
        }
        int iGxszxtbevo = this.f35498gxszxtbevo + wkgbmnqykcVar.gxszxtbevo();
        int length2 = this.f35497eablkybsjg.length;
        if (iGxszxtbevo > length2) {
            draadjrbmk(length2, iGxszxtbevo);
        }
        wkgbmnqykc[] wkgbmnqykcVarArr = this.f35499iobyxmoadg;
        int i13 = this.f35503zoijcleaow;
        this.f35503zoijcleaow = i13 + 1;
        wkgbmnqykcVarArr[i13] = wkgbmnqykcVar;
        this.f35502wkgbmnqykc += wkgbmnqykcVar.wkgbmnqykc();
        this.f35498gxszxtbevo += wkgbmnqykcVar.gxszxtbevo();
    }

    public final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar) {
        btonecajqb(wkgbmnqykcVar);
    }

    public final int eablkybsjg() {
        return this.f35503zoijcleaow;
    }

    public final boolean gxszxtbevo() {
        return eablkybsjg() == 0;
    }

    public final void iobyxmoadg() {
        this.f35503zoijcleaow = 0;
        this.f35502wkgbmnqykc = 0;
        agtfadlqog.lereixgezr(this.f35497eablkybsjg, null, 0, this.f35498gxszxtbevo);
        this.f35498gxszxtbevo = 0;
    }

    public final boolean lqeggnwhkg() {
        return eablkybsjg() != 0;
    }

    public final void nufgyqmvbu(dxjokdxxww dxjokdxxwwVar) {
        wkgbmnqykc[] wkgbmnqykcVarArr = this.f35499iobyxmoadg;
        int i13 = this.f35503zoijcleaow - 1;
        this.f35503zoijcleaow = i13;
        wkgbmnqykc wkgbmnqykcVar = wkgbmnqykcVarArr[i13];
        wkgbmnqykcVarArr[i13] = null;
        dxjokdxxwwVar.btonecajqb(wkgbmnqykcVar);
        Object[] objArr = this.f35497eablkybsjg;
        Object[] objArr2 = dxjokdxxwwVar.f35497eablkybsjg;
        int iGxszxtbevo = dxjokdxxwwVar.f35498gxszxtbevo - wkgbmnqykcVar.gxszxtbevo();
        int iGxszxtbevo2 = this.f35498gxszxtbevo - wkgbmnqykcVar.gxszxtbevo();
        System.arraycopy(objArr, iGxszxtbevo2, objArr2, iGxszxtbevo, this.f35498gxszxtbevo - iGxszxtbevo2);
        agtfadlqog.lereixgezr(this.f35497eablkybsjg, null, this.f35498gxszxtbevo - wkgbmnqykcVar.gxszxtbevo(), this.f35498gxszxtbevo);
        agtfadlqog.draadjrbmk(this.f35501ppxfxbqfkf, dxjokdxxwwVar.f35501ppxfxbqfkf, dxjokdxxwwVar.f35502wkgbmnqykc - wkgbmnqykcVar.wkgbmnqykc(), this.f35502wkgbmnqykc - wkgbmnqykcVar.wkgbmnqykc(), this.f35502wkgbmnqykc);
        this.f35498gxszxtbevo -= wkgbmnqykcVar.gxszxtbevo();
        this.f35502wkgbmnqykc -= wkgbmnqykcVar.wkgbmnqykc();
    }

    public final void ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar) {
        int i13 = this.f35500lqeggnwhkg;
        int iWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc();
        if (i13 == ((iWkgbmnqykc == 0 ? 0 : -1) >>> (32 - iWkgbmnqykc))) {
            wkgbmnqykcVar.gxszxtbevo();
        }
    }

    public String toString() {
        return super.toString();
    }

    public final void wkgbmnqykc(androidx.compose.runtime.wkgbmnqykc wkgbmnqykcVar, h0 h0Var, t tVar, gxszxtbevo gxszxtbevoVar) {
        if (lqeggnwhkg()) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            do {
                iobyxmoadgVar.zoijcleaow().zoijcleaow(iobyxmoadgVar, wkgbmnqykcVar, h0Var, tVar, gxszxtbevoVar);
            } while (iobyxmoadgVar.ppxfxbqfkf());
        }
        iobyxmoadg();
    }
}
