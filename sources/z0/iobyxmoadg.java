package z0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg implements zoijcleaow.iobyxmoadg {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static float f127453draadjrbmk = 0.001f;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    protected final ppxfxbqfkf f127462ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f127464zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    int f127459iobyxmoadg = 0;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f127463wkgbmnqykc = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private dxjokdxxww f127456eablkybsjg = null;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int[] f127458gxszxtbevo = new int[8];

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int[] f127460lqeggnwhkg = new int[8];

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private float[] f127461nufgyqmvbu = new float[8];

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f127455dxjokdxxww = -1;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f127454btonecajqb = -1;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f127457gtknphoqwx = false;

    iobyxmoadg(zoijcleaow zoijcleaowVar, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f127464zoijcleaow = zoijcleaowVar;
        this.f127462ppxfxbqfkf = ppxfxbqfkfVar;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public final void btonecajqb(dxjokdxxww dxjokdxxwwVar, float f13) {
        if (f13 == 0.0f) {
            wkgbmnqykc(dxjokdxxwwVar, true);
            return;
        }
        int i13 = this.f127455dxjokdxxww;
        if (i13 == -1) {
            this.f127455dxjokdxxww = 0;
            this.f127461nufgyqmvbu[0] = f13;
            this.f127458gxszxtbevo[0] = dxjokdxxwwVar.f127436jyumaefscl;
            this.f127460lqeggnwhkg[0] = -1;
            dxjokdxxwwVar.f127433iozdgvuglv++;
            dxjokdxxwwVar.iobyxmoadg(this.f127464zoijcleaow);
            this.f127459iobyxmoadg++;
            if (this.f127457gtknphoqwx) {
                return;
            }
            int i14 = this.f127454btonecajqb + 1;
            this.f127454btonecajqb = i14;
            int[] iArr = this.f127458gxszxtbevo;
            if (i14 >= iArr.length) {
                this.f127457gtknphoqwx = true;
                this.f127454btonecajqb = iArr.length - 1;
                return;
            }
            return;
        }
        int i15 = -1;
        for (int i16 = 0; i13 != -1 && i16 < this.f127459iobyxmoadg; i16++) {
            int i17 = this.f127458gxszxtbevo[i13];
            int i18 = dxjokdxxwwVar.f127436jyumaefscl;
            if (i17 == i18) {
                this.f127461nufgyqmvbu[i13] = f13;
                return;
            }
            if (i17 < i18) {
                i15 = i13;
            }
            i13 = this.f127460lqeggnwhkg[i13];
        }
        int length = this.f127454btonecajqb;
        int i19 = length + 1;
        if (this.f127457gtknphoqwx) {
            int[] iArr2 = this.f127458gxszxtbevo;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i19;
        }
        int[] iArr3 = this.f127458gxszxtbevo;
        if (length >= iArr3.length && this.f127459iobyxmoadg < iArr3.length) {
            int i23 = 0;
            while (true) {
                int[] iArr4 = this.f127458gxszxtbevo;
                if (i23 >= iArr4.length) {
                    break;
                }
                if (iArr4[i23] == -1) {
                    length = i23;
                    break;
                }
                i23++;
            }
        }
        int[] iArr5 = this.f127458gxszxtbevo;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i24 = this.f127463wkgbmnqykc * 2;
            this.f127463wkgbmnqykc = i24;
            this.f127457gtknphoqwx = false;
            this.f127454btonecajqb = length - 1;
            this.f127461nufgyqmvbu = Arrays.copyOf(this.f127461nufgyqmvbu, i24);
            this.f127458gxszxtbevo = Arrays.copyOf(this.f127458gxszxtbevo, this.f127463wkgbmnqykc);
            this.f127460lqeggnwhkg = Arrays.copyOf(this.f127460lqeggnwhkg, this.f127463wkgbmnqykc);
        }
        this.f127458gxszxtbevo[length] = dxjokdxxwwVar.f127436jyumaefscl;
        this.f127461nufgyqmvbu[length] = f13;
        if (i15 != -1) {
            int[] iArr6 = this.f127460lqeggnwhkg;
            iArr6[length] = iArr6[i15];
            iArr6[i15] = length;
        } else {
            this.f127460lqeggnwhkg[length] = this.f127455dxjokdxxww;
            this.f127455dxjokdxxww = length;
        }
        dxjokdxxwwVar.f127433iozdgvuglv++;
        dxjokdxxwwVar.iobyxmoadg(this.f127464zoijcleaow);
        int i25 = this.f127459iobyxmoadg + 1;
        this.f127459iobyxmoadg = i25;
        if (!this.f127457gtknphoqwx) {
            this.f127454btonecajqb++;
        }
        int[] iArr7 = this.f127458gxszxtbevo;
        if (i25 >= iArr7.length) {
            this.f127457gtknphoqwx = true;
        }
        if (this.f127454btonecajqb >= iArr7.length) {
            this.f127457gtknphoqwx = true;
            this.f127454btonecajqb = iArr7.length - 1;
        }
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public final void clear() {
        int i13 = this.f127455dxjokdxxww;
        for (int i14 = 0; i13 != -1 && i14 < this.f127459iobyxmoadg; i14++) {
            dxjokdxxww dxjokdxxwwVar = this.f127462ppxfxbqfkf.f127479wkgbmnqykc[this.f127458gxszxtbevo[i13]];
            if (dxjokdxxwwVar != null) {
                dxjokdxxwwVar.wkgbmnqykc(this.f127464zoijcleaow);
            }
            i13 = this.f127460lqeggnwhkg[i13];
        }
        this.f127455dxjokdxxww = -1;
        this.f127454btonecajqb = -1;
        this.f127457gtknphoqwx = false;
        this.f127459iobyxmoadg = 0;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public void dxjokdxxww(dxjokdxxww dxjokdxxwwVar, float f13, boolean z13) {
        float f14 = f127453draadjrbmk;
        if (f13 <= (-f14) || f13 >= f14) {
            int i13 = this.f127455dxjokdxxww;
            if (i13 == -1) {
                this.f127455dxjokdxxww = 0;
                this.f127461nufgyqmvbu[0] = f13;
                this.f127458gxszxtbevo[0] = dxjokdxxwwVar.f127436jyumaefscl;
                this.f127460lqeggnwhkg[0] = -1;
                dxjokdxxwwVar.f127433iozdgvuglv++;
                dxjokdxxwwVar.iobyxmoadg(this.f127464zoijcleaow);
                this.f127459iobyxmoadg++;
                if (this.f127457gtknphoqwx) {
                    return;
                }
                int i14 = this.f127454btonecajqb + 1;
                this.f127454btonecajqb = i14;
                int[] iArr = this.f127458gxszxtbevo;
                if (i14 >= iArr.length) {
                    this.f127457gtknphoqwx = true;
                    this.f127454btonecajqb = iArr.length - 1;
                    return;
                }
                return;
            }
            int i15 = -1;
            for (int i16 = 0; i13 != -1 && i16 < this.f127459iobyxmoadg; i16++) {
                int i17 = this.f127458gxszxtbevo[i13];
                int i18 = dxjokdxxwwVar.f127436jyumaefscl;
                if (i17 == i18) {
                    float[] fArr = this.f127461nufgyqmvbu;
                    float f15 = fArr[i13] + f13;
                    float f16 = f127453draadjrbmk;
                    if (f15 > (-f16) && f15 < f16) {
                        f15 = 0.0f;
                    }
                    fArr[i13] = f15;
                    if (f15 == 0.0f) {
                        if (i13 == this.f127455dxjokdxxww) {
                            this.f127455dxjokdxxww = this.f127460lqeggnwhkg[i13];
                        } else {
                            int[] iArr2 = this.f127460lqeggnwhkg;
                            iArr2[i15] = iArr2[i13];
                        }
                        if (z13) {
                            dxjokdxxwwVar.wkgbmnqykc(this.f127464zoijcleaow);
                        }
                        if (this.f127457gtknphoqwx) {
                            this.f127454btonecajqb = i13;
                        }
                        dxjokdxxwwVar.f127433iozdgvuglv--;
                        this.f127459iobyxmoadg--;
                        return;
                    }
                    return;
                }
                if (i17 < i18) {
                    i15 = i13;
                }
                i13 = this.f127460lqeggnwhkg[i13];
            }
            int length = this.f127454btonecajqb;
            int i19 = length + 1;
            if (this.f127457gtknphoqwx) {
                int[] iArr3 = this.f127458gxszxtbevo;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i19;
            }
            int[] iArr4 = this.f127458gxszxtbevo;
            if (length >= iArr4.length && this.f127459iobyxmoadg < iArr4.length) {
                int i23 = 0;
                while (true) {
                    int[] iArr5 = this.f127458gxszxtbevo;
                    if (i23 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i23] == -1) {
                        length = i23;
                        break;
                    }
                    i23++;
                }
            }
            int[] iArr6 = this.f127458gxszxtbevo;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i24 = this.f127463wkgbmnqykc * 2;
                this.f127463wkgbmnqykc = i24;
                this.f127457gtknphoqwx = false;
                this.f127454btonecajqb = length - 1;
                this.f127461nufgyqmvbu = Arrays.copyOf(this.f127461nufgyqmvbu, i24);
                this.f127458gxszxtbevo = Arrays.copyOf(this.f127458gxszxtbevo, this.f127463wkgbmnqykc);
                this.f127460lqeggnwhkg = Arrays.copyOf(this.f127460lqeggnwhkg, this.f127463wkgbmnqykc);
            }
            this.f127458gxszxtbevo[length] = dxjokdxxwwVar.f127436jyumaefscl;
            this.f127461nufgyqmvbu[length] = f13;
            if (i15 != -1) {
                int[] iArr7 = this.f127460lqeggnwhkg;
                iArr7[length] = iArr7[i15];
                iArr7[i15] = length;
            } else {
                this.f127460lqeggnwhkg[length] = this.f127455dxjokdxxww;
                this.f127455dxjokdxxww = length;
            }
            dxjokdxxwwVar.f127433iozdgvuglv++;
            dxjokdxxwwVar.iobyxmoadg(this.f127464zoijcleaow);
            this.f127459iobyxmoadg++;
            if (!this.f127457gtknphoqwx) {
                this.f127454btonecajqb++;
            }
            int i25 = this.f127454btonecajqb;
            int[] iArr8 = this.f127458gxszxtbevo;
            if (i25 >= iArr8.length) {
                this.f127457gtknphoqwx = true;
                this.f127454btonecajqb = iArr8.length - 1;
            }
        }
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public float eablkybsjg(zoijcleaow zoijcleaowVar, boolean z13) {
        float fNufgyqmvbu = nufgyqmvbu(zoijcleaowVar.f127508iobyxmoadg);
        wkgbmnqykc(zoijcleaowVar.f127508iobyxmoadg, z13);
        zoijcleaow.iobyxmoadg iobyxmoadgVar = zoijcleaowVar.f127506eablkybsjg;
        int iGxszxtbevo = iobyxmoadgVar.gxszxtbevo();
        for (int i13 = 0; i13 < iGxszxtbevo; i13++) {
            dxjokdxxww dxjokdxxwwVarZoijcleaow = iobyxmoadgVar.zoijcleaow(i13);
            dxjokdxxww(dxjokdxxwwVarZoijcleaow, iobyxmoadgVar.nufgyqmvbu(dxjokdxxwwVarZoijcleaow) * fNufgyqmvbu, z13);
        }
        return fNufgyqmvbu;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public void gtknphoqwx(float f13) {
        int i13 = this.f127455dxjokdxxww;
        for (int i14 = 0; i13 != -1 && i14 < this.f127459iobyxmoadg; i14++) {
            float[] fArr = this.f127461nufgyqmvbu;
            fArr[i13] = fArr[i13] / f13;
            i13 = this.f127460lqeggnwhkg[i13];
        }
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public int gxszxtbevo() {
        return this.f127459iobyxmoadg;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public boolean iobyxmoadg(dxjokdxxww dxjokdxxwwVar) {
        int i13 = this.f127455dxjokdxxww;
        if (i13 == -1) {
            return false;
        }
        for (int i14 = 0; i13 != -1 && i14 < this.f127459iobyxmoadg; i14++) {
            if (this.f127458gxszxtbevo[i13] == dxjokdxxwwVar.f127436jyumaefscl) {
                return true;
            }
            i13 = this.f127460lqeggnwhkg[i13];
        }
        return false;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public float lqeggnwhkg(int i13) {
        int i14 = this.f127455dxjokdxxww;
        for (int i15 = 0; i14 != -1 && i15 < this.f127459iobyxmoadg; i15++) {
            if (i15 == i13) {
                return this.f127461nufgyqmvbu[i14];
            }
            i14 = this.f127460lqeggnwhkg[i14];
        }
        return 0.0f;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public final float nufgyqmvbu(dxjokdxxww dxjokdxxwwVar) {
        int i13 = this.f127455dxjokdxxww;
        for (int i14 = 0; i13 != -1 && i14 < this.f127459iobyxmoadg; i14++) {
            if (this.f127458gxszxtbevo[i13] == dxjokdxxwwVar.f127436jyumaefscl) {
                return this.f127461nufgyqmvbu[i13];
            }
            i13 = this.f127460lqeggnwhkg[i13];
        }
        return 0.0f;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public void ppxfxbqfkf() {
        int i13 = this.f127455dxjokdxxww;
        for (int i14 = 0; i13 != -1 && i14 < this.f127459iobyxmoadg; i14++) {
            float[] fArr = this.f127461nufgyqmvbu;
            fArr[i13] = fArr[i13] * (-1.0f);
            i13 = this.f127460lqeggnwhkg[i13];
        }
    }

    public String toString() {
        int i13 = this.f127455dxjokdxxww;
        String str = "";
        for (int i14 = 0; i13 != -1 && i14 < this.f127459iobyxmoadg; i14++) {
            str = ((str + " -> ") + this.f127461nufgyqmvbu[i13] + " : ") + this.f127462ppxfxbqfkf.f127479wkgbmnqykc[this.f127458gxszxtbevo[i13]];
            i13 = this.f127460lqeggnwhkg[i13];
        }
        return str;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public final float wkgbmnqykc(dxjokdxxww dxjokdxxwwVar, boolean z13) {
        if (this.f127456eablkybsjg == dxjokdxxwwVar) {
            this.f127456eablkybsjg = null;
        }
        int i13 = this.f127455dxjokdxxww;
        if (i13 == -1) {
            return 0.0f;
        }
        int i14 = 0;
        int i15 = -1;
        while (i13 != -1 && i14 < this.f127459iobyxmoadg) {
            if (this.f127458gxszxtbevo[i13] == dxjokdxxwwVar.f127436jyumaefscl) {
                if (i13 == this.f127455dxjokdxxww) {
                    this.f127455dxjokdxxww = this.f127460lqeggnwhkg[i13];
                } else {
                    int[] iArr = this.f127460lqeggnwhkg;
                    iArr[i15] = iArr[i13];
                }
                if (z13) {
                    dxjokdxxwwVar.wkgbmnqykc(this.f127464zoijcleaow);
                }
                dxjokdxxwwVar.f127433iozdgvuglv--;
                this.f127459iobyxmoadg--;
                this.f127458gxszxtbevo[i13] = -1;
                if (this.f127457gtknphoqwx) {
                    this.f127454btonecajqb = i13;
                }
                return this.f127461nufgyqmvbu[i13];
            }
            i14++;
            i15 = i13;
            i13 = this.f127460lqeggnwhkg[i13];
        }
        return 0.0f;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public dxjokdxxww zoijcleaow(int i13) {
        int i14 = this.f127455dxjokdxxww;
        for (int i15 = 0; i14 != -1 && i15 < this.f127459iobyxmoadg; i15++) {
            if (i15 == i13) {
                return this.f127462ppxfxbqfkf.f127479wkgbmnqykc[this.f127458gxszxtbevo[i14]];
            }
            i14 = this.f127460lqeggnwhkg[i14];
        }
        return null;
    }
}
