package z0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class nufgyqmvbu extends z0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f127467btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    ppxfxbqfkf f127468draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private dxjokdxxww[] f127469dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    zoijcleaow f127470gtknphoqwx;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f127471lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private dxjokdxxww[] f127472nufgyqmvbu;

    class iobyxmoadg implements Comparator {
        iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2) {
            return dxjokdxxwwVar.f127436jyumaefscl - dxjokdxxwwVar2.f127436jyumaefscl;
        }
    }

    class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        dxjokdxxww f127474iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        nufgyqmvbu f127476zoijcleaow;

        zoijcleaow(nufgyqmvbu nufgyqmvbuVar) {
            this.f127476zoijcleaow = nufgyqmvbuVar;
        }

        public void eablkybsjg() {
            Arrays.fill(this.f127474iobyxmoadg.f127446zynmafqrjb, 0.0f);
        }

        public boolean iobyxmoadg(dxjokdxxww dxjokdxxwwVar, float f13) {
            boolean z13 = true;
            if (!this.f127474iobyxmoadg.f127445zdlpuopuiu) {
                for (int i13 = 0; i13 < 9; i13++) {
                    float f14 = dxjokdxxwwVar.f127446zynmafqrjb[i13];
                    if (f14 != 0.0f) {
                        float f15 = f14 * f13;
                        if (Math.abs(f15) < 1.0E-4f) {
                            f15 = 0.0f;
                        }
                        this.f127474iobyxmoadg.f127446zynmafqrjb[i13] = f15;
                    } else {
                        this.f127474iobyxmoadg.f127446zynmafqrjb[i13] = 0.0f;
                    }
                }
                return true;
            }
            for (int i14 = 0; i14 < 9; i14++) {
                float[] fArr = this.f127474iobyxmoadg.f127446zynmafqrjb;
                float f16 = fArr[i14] + (dxjokdxxwwVar.f127446zynmafqrjb[i14] * f13);
                fArr[i14] = f16;
                if (Math.abs(f16) < 1.0E-4f) {
                    this.f127474iobyxmoadg.f127446zynmafqrjb[i14] = 0.0f;
                } else {
                    z13 = false;
                }
            }
            if (z13) {
                nufgyqmvbu.this.lmojexxdyd(this.f127474iobyxmoadg);
            }
            return false;
        }

        public final boolean ppxfxbqfkf() {
            for (int i13 = 8; i13 >= 0; i13--) {
                float f13 = this.f127474iobyxmoadg.f127446zynmafqrjb[i13];
                if (f13 > 0.0f) {
                    return false;
                }
                if (f13 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            String str = "[ ";
            if (this.f127474iobyxmoadg != null) {
                for (int i13 = 0; i13 < 9; i13++) {
                    str = str + this.f127474iobyxmoadg.f127446zynmafqrjb[i13] + " ";
                }
            }
            return str + "] " + this.f127474iobyxmoadg;
        }

        public final boolean wkgbmnqykc(dxjokdxxww dxjokdxxwwVar) {
            for (int i13 = 8; i13 >= 0; i13--) {
                float f13 = dxjokdxxwwVar.f127446zynmafqrjb[i13];
                float f14 = this.f127474iobyxmoadg.f127446zynmafqrjb[i13];
                if (f14 != f13) {
                    return f14 < f13;
                }
            }
            return false;
        }

        public void zoijcleaow(dxjokdxxww dxjokdxxwwVar) {
            this.f127474iobyxmoadg = dxjokdxxwwVar;
        }
    }

    public nufgyqmvbu(ppxfxbqfkf ppxfxbqfkfVar) {
        super(ppxfxbqfkfVar);
        this.f127471lqeggnwhkg = UserVerificationMethods.USER_VERIFY_PATTERN;
        this.f127472nufgyqmvbu = new dxjokdxxww[UserVerificationMethods.USER_VERIFY_PATTERN];
        this.f127469dxjokdxxww = new dxjokdxxww[UserVerificationMethods.USER_VERIFY_PATTERN];
        this.f127467btonecajqb = 0;
        this.f127470gtknphoqwx = new zoijcleaow(this);
        this.f127468draadjrbmk = ppxfxbqfkfVar;
    }

    private void iozdgvuglv(dxjokdxxww dxjokdxxwwVar) {
        int i13;
        int i14 = this.f127467btonecajqb + 1;
        dxjokdxxww[] dxjokdxxwwVarArr = this.f127472nufgyqmvbu;
        if (i14 > dxjokdxxwwVarArr.length) {
            dxjokdxxww[] dxjokdxxwwVarArr2 = (dxjokdxxww[]) Arrays.copyOf(dxjokdxxwwVarArr, dxjokdxxwwVarArr.length * 2);
            this.f127472nufgyqmvbu = dxjokdxxwwVarArr2;
            this.f127469dxjokdxxww = (dxjokdxxww[]) Arrays.copyOf(dxjokdxxwwVarArr2, dxjokdxxwwVarArr2.length * 2);
        }
        dxjokdxxww[] dxjokdxxwwVarArr3 = this.f127472nufgyqmvbu;
        int i15 = this.f127467btonecajqb;
        dxjokdxxwwVarArr3[i15] = dxjokdxxwwVar;
        int i16 = i15 + 1;
        this.f127467btonecajqb = i16;
        if (i16 > 1 && dxjokdxxwwVarArr3[i15].f127436jyumaefscl > dxjokdxxwwVar.f127436jyumaefscl) {
            int i17 = 0;
            while (true) {
                i13 = this.f127467btonecajqb;
                if (i17 >= i13) {
                    break;
                }
                this.f127469dxjokdxxww[i17] = this.f127472nufgyqmvbu[i17];
                i17++;
            }
            Arrays.sort(this.f127469dxjokdxxww, 0, i13, new iobyxmoadg());
            for (int i18 = 0; i18 < this.f127467btonecajqb; i18++) {
                this.f127472nufgyqmvbu[i18] = this.f127469dxjokdxxww[i18];
            }
        }
        dxjokdxxwwVar.f127445zdlpuopuiu = true;
        dxjokdxxwwVar.iobyxmoadg(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lmojexxdyd(dxjokdxxww dxjokdxxwwVar) {
        int i13 = 0;
        while (i13 < this.f127467btonecajqb) {
            if (this.f127472nufgyqmvbu[i13] == dxjokdxxwwVar) {
                while (true) {
                    int i14 = this.f127467btonecajqb;
                    if (i13 >= i14 - 1) {
                        this.f127467btonecajqb = i14 - 1;
                        dxjokdxxwwVar.f127445zdlpuopuiu = false;
                        return;
                    } else {
                        dxjokdxxww[] dxjokdxxwwVarArr = this.f127472nufgyqmvbu;
                        int i15 = i13 + 1;
                        dxjokdxxwwVarArr[i13] = dxjokdxxwwVarArr[i15];
                        i13 = i15;
                    }
                }
            } else {
                i13++;
            }
        }
    }

    @Override // z0.zoijcleaow, z0.wkgbmnqykc.iobyxmoadg
    public void clear() {
        this.f127467btonecajqb = 0;
        this.f127511zoijcleaow = 0.0f;
    }

    @Override // z0.zoijcleaow, z0.wkgbmnqykc.iobyxmoadg
    public boolean isEmpty() {
        return this.f127467btonecajqb == 0;
    }

    @Override // z0.zoijcleaow, z0.wkgbmnqykc.iobyxmoadg
    public void ppxfxbqfkf(dxjokdxxww dxjokdxxwwVar) {
        this.f127470gtknphoqwx.zoijcleaow(dxjokdxxwwVar);
        this.f127470gtknphoqwx.eablkybsjg();
        dxjokdxxwwVar.f127446zynmafqrjb[dxjokdxxwwVar.f127431cqumvgiudr] = 1.0f;
        iozdgvuglv(dxjokdxxwwVar);
    }

    @Override // z0.zoijcleaow
    public String toString() {
        String str = " goal -> (" + this.f127511zoijcleaow + ") : ";
        for (int i13 = 0; i13 < this.f127467btonecajqb; i13++) {
            this.f127470gtknphoqwx.zoijcleaow(this.f127472nufgyqmvbu[i13]);
            str = str + this.f127470gtknphoqwx + " ";
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // z0.zoijcleaow, z0.wkgbmnqykc.iobyxmoadg
    public dxjokdxxww zoijcleaow(wkgbmnqykc wkgbmnqykcVar, boolean[] zArr) {
        int i13 = -1;
        for (int i14 = 0; i14 < this.f127467btonecajqb; i14++) {
            dxjokdxxww dxjokdxxwwVar = this.f127472nufgyqmvbu[i14];
            if (!zArr[dxjokdxxwwVar.f127436jyumaefscl]) {
                this.f127470gtknphoqwx.zoijcleaow(dxjokdxxwwVar);
                if (i13 == -1) {
                    if (this.f127470gtknphoqwx.ppxfxbqfkf()) {
                        i13 = i14;
                    }
                } else if (this.f127470gtknphoqwx.wkgbmnqykc(this.f127472nufgyqmvbu[i13])) {
                    i13 = i14;
                }
            }
        }
        if (i13 == -1) {
            return null;
        }
        return this.f127472nufgyqmvbu[i13];
    }

    @Override // z0.zoijcleaow
    public void zynmafqrjb(wkgbmnqykc wkgbmnqykcVar, z0.zoijcleaow zoijcleaowVar, boolean z13) {
        dxjokdxxww dxjokdxxwwVar = zoijcleaowVar.f127508iobyxmoadg;
        if (dxjokdxxwwVar == null) {
            return;
        }
        z0.zoijcleaow.iobyxmoadg iobyxmoadgVar = zoijcleaowVar.f127506eablkybsjg;
        int iGxszxtbevo = iobyxmoadgVar.gxszxtbevo();
        for (int i13 = 0; i13 < iGxszxtbevo; i13++) {
            dxjokdxxww dxjokdxxwwVarZoijcleaow = iobyxmoadgVar.zoijcleaow(i13);
            float fLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg(i13);
            this.f127470gtknphoqwx.zoijcleaow(dxjokdxxwwVarZoijcleaow);
            if (this.f127470gtknphoqwx.iobyxmoadg(dxjokdxxwwVar, fLqeggnwhkg)) {
                iozdgvuglv(dxjokdxxwwVarZoijcleaow);
            }
            this.f127511zoijcleaow += zoijcleaowVar.f127511zoijcleaow * fLqeggnwhkg;
        }
        lmojexxdyd(dxjokdxxwwVar);
    }
}
