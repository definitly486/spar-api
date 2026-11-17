package z0;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class btonecajqb implements zoijcleaow.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static float f127415agtfadlqog = 0.001f;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final zoijcleaow f127417draadjrbmk;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    protected final ppxfxbqfkf f127426wflxmlrfwp;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f127422iobyxmoadg = -1;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f127428zoijcleaow = 16;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f127425ppxfxbqfkf = 16;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    int[] f127427wkgbmnqykc = new int[16];

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    int[] f127419eablkybsjg = new int[16];

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    int[] f127421gxszxtbevo = new int[16];

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    float[] f127423lqeggnwhkg = new float[16];

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    int[] f127424nufgyqmvbu = new int[16];

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    int[] f127418dxjokdxxww = new int[16];

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    int f127416btonecajqb = 0;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    int f127420gtknphoqwx = -1;

    btonecajqb(zoijcleaow zoijcleaowVar, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f127417draadjrbmk = zoijcleaowVar;
        this.f127426wflxmlrfwp = ppxfxbqfkfVar;
        clear();
    }

    private int agtfadlqog() {
        for (int i13 = 0; i13 < this.f127428zoijcleaow; i13++) {
            if (this.f127421gxszxtbevo[i13] == -1) {
                return i13;
            }
        }
        return -1;
    }

    private void draadjrbmk(dxjokdxxww dxjokdxxwwVar, int i13) {
        int[] iArr;
        int i14 = dxjokdxxwwVar.f127436jyumaefscl % this.f127425ppxfxbqfkf;
        int[] iArr2 = this.f127427wkgbmnqykc;
        int i15 = iArr2[i14];
        if (i15 == -1) {
            iArr2[i14] = i13;
        } else {
            while (true) {
                iArr = this.f127419eablkybsjg;
                int i16 = iArr[i15];
                if (i16 == -1) {
                    break;
                } else {
                    i15 = i16;
                }
            }
            iArr[i15] = i13;
        }
        this.f127419eablkybsjg[i13] = -1;
    }

    private void ojitshcjhn() {
        int i13 = this.f127428zoijcleaow * 2;
        this.f127421gxszxtbevo = Arrays.copyOf(this.f127421gxszxtbevo, i13);
        this.f127423lqeggnwhkg = Arrays.copyOf(this.f127423lqeggnwhkg, i13);
        this.f127424nufgyqmvbu = Arrays.copyOf(this.f127424nufgyqmvbu, i13);
        this.f127418dxjokdxxww = Arrays.copyOf(this.f127418dxjokdxxww, i13);
        this.f127419eablkybsjg = Arrays.copyOf(this.f127419eablkybsjg, i13);
        for (int i14 = this.f127428zoijcleaow; i14 < i13; i14++) {
            this.f127421gxszxtbevo[i14] = -1;
            this.f127419eablkybsjg[i14] = -1;
        }
        this.f127428zoijcleaow = i13;
    }

    private void oxmwwwfdhm(dxjokdxxww dxjokdxxwwVar) {
        int[] iArr;
        int i13;
        int i14 = dxjokdxxwwVar.f127436jyumaefscl;
        int i15 = i14 % this.f127425ppxfxbqfkf;
        int[] iArr2 = this.f127427wkgbmnqykc;
        int i16 = iArr2[i15];
        if (i16 == -1) {
            return;
        }
        if (this.f127421gxszxtbevo[i16] == i14) {
            int[] iArr3 = this.f127419eablkybsjg;
            iArr2[i15] = iArr3[i16];
            iArr3[i16] = -1;
            return;
        }
        while (true) {
            iArr = this.f127419eablkybsjg;
            i13 = iArr[i16];
            if (i13 == -1 || this.f127421gxszxtbevo[i13] == i14) {
                break;
            } else {
                i16 = i13;
            }
        }
        if (i13 == -1 || this.f127421gxszxtbevo[i13] != i14) {
            return;
        }
        iArr[i16] = iArr[i13];
        iArr[i13] = -1;
    }

    private void vdvldrhtss(int i13, dxjokdxxww dxjokdxxwwVar, float f13) {
        int iAgtfadlqog = agtfadlqog();
        wflxmlrfwp(iAgtfadlqog, dxjokdxxwwVar, f13);
        if (i13 != -1) {
            this.f127424nufgyqmvbu[iAgtfadlqog] = i13;
            int[] iArr = this.f127418dxjokdxxww;
            iArr[iAgtfadlqog] = iArr[i13];
            iArr[i13] = iAgtfadlqog;
        } else {
            this.f127424nufgyqmvbu[iAgtfadlqog] = -1;
            if (this.f127416btonecajqb > 0) {
                this.f127418dxjokdxxww[iAgtfadlqog] = this.f127420gtknphoqwx;
                this.f127420gtknphoqwx = iAgtfadlqog;
            } else {
                this.f127418dxjokdxxww[iAgtfadlqog] = -1;
            }
        }
        int i14 = this.f127418dxjokdxxww[iAgtfadlqog];
        if (i14 != -1) {
            this.f127424nufgyqmvbu[i14] = iAgtfadlqog;
        }
        draadjrbmk(dxjokdxxwwVar, iAgtfadlqog);
    }

    private void wflxmlrfwp(int i13, dxjokdxxww dxjokdxxwwVar, float f13) {
        this.f127421gxszxtbevo[i13] = dxjokdxxwwVar.f127436jyumaefscl;
        this.f127423lqeggnwhkg[i13] = f13;
        this.f127424nufgyqmvbu[i13] = -1;
        this.f127418dxjokdxxww[i13] = -1;
        dxjokdxxwwVar.iobyxmoadg(this.f127417draadjrbmk);
        dxjokdxxwwVar.f127433iozdgvuglv++;
        this.f127416btonecajqb++;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public void btonecajqb(dxjokdxxww dxjokdxxwwVar, float f13) {
        float f14 = f127415agtfadlqog;
        if (f13 > (-f14) && f13 < f14) {
            wkgbmnqykc(dxjokdxxwwVar, true);
            return;
        }
        if (this.f127416btonecajqb == 0) {
            wflxmlrfwp(0, dxjokdxxwwVar, f13);
            draadjrbmk(dxjokdxxwwVar, 0);
            this.f127420gtknphoqwx = 0;
            return;
        }
        int iRgvfuqvkyq = rgvfuqvkyq(dxjokdxxwwVar);
        if (iRgvfuqvkyq != -1) {
            this.f127423lqeggnwhkg[iRgvfuqvkyq] = f13;
            return;
        }
        if (this.f127416btonecajqb + 1 >= this.f127428zoijcleaow) {
            ojitshcjhn();
        }
        int i13 = this.f127416btonecajqb;
        int i14 = this.f127420gtknphoqwx;
        int i15 = -1;
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = this.f127421gxszxtbevo[i14];
            int i18 = dxjokdxxwwVar.f127436jyumaefscl;
            if (i17 == i18) {
                this.f127423lqeggnwhkg[i14] = f13;
                return;
            }
            if (i17 < i18) {
                i15 = i14;
            }
            i14 = this.f127418dxjokdxxww[i14];
            if (i14 == -1) {
                break;
            }
        }
        vdvldrhtss(i15, dxjokdxxwwVar, f13);
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public void clear() {
        int i13 = this.f127416btonecajqb;
        for (int i14 = 0; i14 < i13; i14++) {
            dxjokdxxww dxjokdxxwwVarZoijcleaow = zoijcleaow(i14);
            if (dxjokdxxwwVarZoijcleaow != null) {
                dxjokdxxwwVarZoijcleaow.wkgbmnqykc(this.f127417draadjrbmk);
            }
        }
        for (int i15 = 0; i15 < this.f127428zoijcleaow; i15++) {
            this.f127421gxszxtbevo[i15] = -1;
            this.f127419eablkybsjg[i15] = -1;
        }
        for (int i16 = 0; i16 < this.f127425ppxfxbqfkf; i16++) {
            this.f127427wkgbmnqykc[i16] = -1;
        }
        this.f127416btonecajqb = 0;
        this.f127420gtknphoqwx = -1;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public void dxjokdxxww(dxjokdxxww dxjokdxxwwVar, float f13, boolean z13) {
        float f14 = f127415agtfadlqog;
        if (f13 <= (-f14) || f13 >= f14) {
            int iRgvfuqvkyq = rgvfuqvkyq(dxjokdxxwwVar);
            if (iRgvfuqvkyq == -1) {
                btonecajqb(dxjokdxxwwVar, f13);
                return;
            }
            float[] fArr = this.f127423lqeggnwhkg;
            float f15 = fArr[iRgvfuqvkyq] + f13;
            fArr[iRgvfuqvkyq] = f15;
            float f16 = f127415agtfadlqog;
            if (f15 <= (-f16) || f15 >= f16) {
                return;
            }
            fArr[iRgvfuqvkyq] = 0.0f;
            wkgbmnqykc(dxjokdxxwwVar, z13);
        }
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public float eablkybsjg(zoijcleaow zoijcleaowVar, boolean z13) {
        float fNufgyqmvbu = nufgyqmvbu(zoijcleaowVar.f127508iobyxmoadg);
        wkgbmnqykc(zoijcleaowVar.f127508iobyxmoadg, z13);
        btonecajqb btonecajqbVar = (btonecajqb) zoijcleaowVar.f127506eablkybsjg;
        int iGxszxtbevo = btonecajqbVar.gxszxtbevo();
        int i13 = 0;
        int i14 = 0;
        while (i13 < iGxszxtbevo) {
            int i15 = btonecajqbVar.f127421gxszxtbevo[i14];
            if (i15 != -1) {
                dxjokdxxww(this.f127426wflxmlrfwp.f127479wkgbmnqykc[i15], btonecajqbVar.f127423lqeggnwhkg[i14] * fNufgyqmvbu, z13);
                i13++;
            }
            i14++;
        }
        return fNufgyqmvbu;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public void gtknphoqwx(float f13) {
        int i13 = this.f127416btonecajqb;
        int i14 = this.f127420gtknphoqwx;
        for (int i15 = 0; i15 < i13; i15++) {
            float[] fArr = this.f127423lqeggnwhkg;
            fArr[i14] = fArr[i14] / f13;
            i14 = this.f127418dxjokdxxww[i14];
            if (i14 == -1) {
                return;
            }
        }
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public int gxszxtbevo() {
        return this.f127416btonecajqb;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public boolean iobyxmoadg(dxjokdxxww dxjokdxxwwVar) {
        return rgvfuqvkyq(dxjokdxxwwVar) != -1;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public float lqeggnwhkg(int i13) {
        int i14 = this.f127416btonecajqb;
        int i15 = this.f127420gtknphoqwx;
        for (int i16 = 0; i16 < i14; i16++) {
            if (i16 == i13) {
                return this.f127423lqeggnwhkg[i15];
            }
            i15 = this.f127418dxjokdxxww[i15];
            if (i15 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public float nufgyqmvbu(dxjokdxxww dxjokdxxwwVar) {
        int iRgvfuqvkyq = rgvfuqvkyq(dxjokdxxwwVar);
        if (iRgvfuqvkyq != -1) {
            return this.f127423lqeggnwhkg[iRgvfuqvkyq];
        }
        return 0.0f;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public void ppxfxbqfkf() {
        int i13 = this.f127416btonecajqb;
        int i14 = this.f127420gtknphoqwx;
        for (int i15 = 0; i15 < i13; i15++) {
            float[] fArr = this.f127423lqeggnwhkg;
            fArr[i14] = fArr[i14] * (-1.0f);
            i14 = this.f127418dxjokdxxww[i14];
            if (i14 == -1) {
                return;
            }
        }
    }

    public int rgvfuqvkyq(dxjokdxxww dxjokdxxwwVar) {
        if (this.f127416btonecajqb != 0 && dxjokdxxwwVar != null) {
            int i13 = dxjokdxxwwVar.f127436jyumaefscl;
            int i14 = this.f127427wkgbmnqykc[i13 % this.f127425ppxfxbqfkf];
            if (i14 == -1) {
                return -1;
            }
            if (this.f127421gxszxtbevo[i14] == i13) {
                return i14;
            }
            do {
                i14 = this.f127419eablkybsjg[i14];
                if (i14 == -1) {
                    break;
                }
            } while (this.f127421gxszxtbevo[i14] != i13);
            if (i14 != -1 && this.f127421gxszxtbevo[i14] == i13) {
                return i14;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i13 = this.f127416btonecajqb;
        for (int i14 = 0; i14 < i13; i14++) {
            dxjokdxxww dxjokdxxwwVarZoijcleaow = zoijcleaow(i14);
            if (dxjokdxxwwVarZoijcleaow != null) {
                String str2 = str + dxjokdxxwwVarZoijcleaow + " = " + lqeggnwhkg(i14) + " ";
                int iRgvfuqvkyq = rgvfuqvkyq(dxjokdxxwwVarZoijcleaow);
                String str3 = str2 + "[p: ";
                String str4 = (this.f127424nufgyqmvbu[iRgvfuqvkyq] != -1 ? str3 + this.f127426wflxmlrfwp.f127479wkgbmnqykc[this.f127421gxszxtbevo[this.f127424nufgyqmvbu[iRgvfuqvkyq]]] : str3 + DevicePublicKeyStringDef.NONE) + ", n: ";
                str = (this.f127418dxjokdxxww[iRgvfuqvkyq] != -1 ? str4 + this.f127426wflxmlrfwp.f127479wkgbmnqykc[this.f127421gxszxtbevo[this.f127418dxjokdxxww[iRgvfuqvkyq]]] : str4 + DevicePublicKeyStringDef.NONE) + "]";
            }
        }
        return str + " }";
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public float wkgbmnqykc(dxjokdxxww dxjokdxxwwVar, boolean z13) {
        int iRgvfuqvkyq = rgvfuqvkyq(dxjokdxxwwVar);
        if (iRgvfuqvkyq == -1) {
            return 0.0f;
        }
        oxmwwwfdhm(dxjokdxxwwVar);
        float f13 = this.f127423lqeggnwhkg[iRgvfuqvkyq];
        if (this.f127420gtknphoqwx == iRgvfuqvkyq) {
            this.f127420gtknphoqwx = this.f127418dxjokdxxww[iRgvfuqvkyq];
        }
        this.f127421gxszxtbevo[iRgvfuqvkyq] = -1;
        int[] iArr = this.f127424nufgyqmvbu;
        int i13 = iArr[iRgvfuqvkyq];
        if (i13 != -1) {
            int[] iArr2 = this.f127418dxjokdxxww;
            iArr2[i13] = iArr2[iRgvfuqvkyq];
        }
        int i14 = this.f127418dxjokdxxww[iRgvfuqvkyq];
        if (i14 != -1) {
            iArr[i14] = iArr[iRgvfuqvkyq];
        }
        this.f127416btonecajqb--;
        dxjokdxxwwVar.f127433iozdgvuglv--;
        if (z13) {
            dxjokdxxwwVar.wkgbmnqykc(this.f127417draadjrbmk);
        }
        return f13;
    }

    @Override // z0.zoijcleaow.iobyxmoadg
    public dxjokdxxww zoijcleaow(int i13) {
        int i14 = this.f127416btonecajqb;
        if (i14 == 0) {
            return null;
        }
        int i15 = this.f127420gtknphoqwx;
        for (int i16 = 0; i16 < i14; i16++) {
            if (i16 == i13 && i15 != -1) {
                return this.f127426wflxmlrfwp.f127479wkgbmnqykc[this.f127421gxszxtbevo[i15]];
            }
            i15 = this.f127418dxjokdxxww[i15];
            if (i15 == -1) {
                break;
            }
        }
        return null;
    }
}
