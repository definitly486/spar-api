package a1;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private a1.zoijcleaow f170iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f172ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private zoijcleaow f174zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f173wkgbmnqykc = 0;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private String f168eablkybsjg = null;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public int f169gxszxtbevo = 0;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    ArrayList f171lqeggnwhkg = new ArrayList();

    class iobyxmoadg implements Comparator {
        iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
            return Integer.compare(ppxfxbqfkfVar.f177iobyxmoadg, ppxfxbqfkfVar2.f177iobyxmoadg);
        }
    }

    static class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        float f176eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f177iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        float f178ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        float f179wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f180zoijcleaow;

        ppxfxbqfkf(int i13, float f13, float f14, float f15, float f16) {
            this.f177iobyxmoadg = i13;
            this.f180zoijcleaow = f16;
            this.f178ppxfxbqfkf = f14;
            this.f179wkgbmnqykc = f13;
            this.f176eablkybsjg = f15;
        }
    }

    static class zoijcleaow {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        double[] f181agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        float[] f182btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        int f183draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        float[] f184dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final int f185eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        float[] f186gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        float[] f187gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f188iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        double[] f189lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        float[] f190nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        double[] f191ojitshcjhn;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f192ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        float f193rgvfuqvkyq;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        a1.zoijcleaow f194wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f195wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        nufgyqmvbu f196zoijcleaow;

        zoijcleaow(int i13, String str, int i14, int i15) {
            nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu();
            this.f196zoijcleaow = nufgyqmvbuVar;
            this.f192ppxfxbqfkf = 0;
            this.f195wkgbmnqykc = 1;
            this.f185eablkybsjg = 2;
            this.f183draadjrbmk = i13;
            this.f188iobyxmoadg = i14;
            nufgyqmvbuVar.eablkybsjg(i13, str);
            this.f187gxszxtbevo = new float[i15];
            this.f189lqeggnwhkg = new double[i15];
            this.f190nufgyqmvbu = new float[i15];
            this.f184dxjokdxxww = new float[i15];
            this.f182btonecajqb = new float[i15];
            this.f186gtknphoqwx = new float[i15];
        }

        public double iobyxmoadg(float f13) {
            a1.zoijcleaow zoijcleaowVar = this.f194wflxmlrfwp;
            if (zoijcleaowVar != null) {
                zoijcleaowVar.wkgbmnqykc(f13, this.f181agtfadlqog);
            } else {
                double[] dArr = this.f181agtfadlqog;
                dArr[0] = this.f184dxjokdxxww[0];
                dArr[1] = this.f182btonecajqb[0];
                dArr[2] = this.f187gxszxtbevo[0];
            }
            double[] dArr2 = this.f181agtfadlqog;
            return dArr2[0] + (this.f196zoijcleaow.ppxfxbqfkf(f13, dArr2[1]) * this.f181agtfadlqog[2]);
        }

        public void ppxfxbqfkf(float f13) {
            this.f193rgvfuqvkyq = f13;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f189lqeggnwhkg.length, 3);
            float[] fArr = this.f187gxszxtbevo;
            this.f181agtfadlqog = new double[fArr.length + 2];
            this.f191ojitshcjhn = new double[fArr.length + 2];
            if (this.f189lqeggnwhkg[0] > 0.0d) {
                this.f196zoijcleaow.iobyxmoadg(0.0d, this.f190nufgyqmvbu[0]);
            }
            double[] dArr2 = this.f189lqeggnwhkg;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f196zoijcleaow.iobyxmoadg(1.0d, this.f190nufgyqmvbu[length]);
            }
            for (int i13 = 0; i13 < dArr.length; i13++) {
                double[] dArr3 = dArr[i13];
                dArr3[0] = this.f184dxjokdxxww[i13];
                dArr3[1] = this.f182btonecajqb[i13];
                dArr3[2] = this.f187gxszxtbevo[i13];
                this.f196zoijcleaow.iobyxmoadg(this.f189lqeggnwhkg[i13], this.f190nufgyqmvbu[i13]);
            }
            this.f196zoijcleaow.wkgbmnqykc();
            double[] dArr4 = this.f189lqeggnwhkg;
            if (dArr4.length > 1) {
                this.f194wflxmlrfwp = a1.zoijcleaow.iobyxmoadg(0, dArr4, dArr);
            } else {
                this.f194wflxmlrfwp = null;
            }
        }

        public void zoijcleaow(int i13, int i14, float f13, float f14, float f15, float f16) {
            this.f189lqeggnwhkg[i13] = ((double) i14) / 100.0d;
            this.f190nufgyqmvbu[i13] = f13;
            this.f184dxjokdxxww[i13] = f14;
            this.f182btonecajqb[i13] = f15;
            this.f187gxszxtbevo[i13] = f16;
        }
    }

    public void eablkybsjg(String str) {
        this.f172ppxfxbqfkf = str;
    }

    public void gxszxtbevo(float f13) {
        int size = this.f171lqeggnwhkg.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f171lqeggnwhkg, new iobyxmoadg());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f174zoijcleaow = new zoijcleaow(this.f173wkgbmnqykc, this.f168eablkybsjg, this.f169gxszxtbevo, size);
        int i13 = 0;
        for (ppxfxbqfkf ppxfxbqfkfVar : this.f171lqeggnwhkg) {
            float f14 = ppxfxbqfkfVar.f179wkgbmnqykc;
            dArr[i13] = ((double) f14) * 0.01d;
            double[] dArr3 = dArr2[i13];
            float f15 = ppxfxbqfkfVar.f180zoijcleaow;
            dArr3[0] = f15;
            float f16 = ppxfxbqfkfVar.f178ppxfxbqfkf;
            dArr3[1] = f16;
            float f17 = ppxfxbqfkfVar.f176eablkybsjg;
            dArr3[2] = f17;
            this.f174zoijcleaow.zoijcleaow(i13, ppxfxbqfkfVar.f177iobyxmoadg, f14, f16, f17, f15);
            i13++;
            dArr2 = dArr2;
        }
        this.f174zoijcleaow.ppxfxbqfkf(f13);
        this.f170iobyxmoadg = a1.zoijcleaow.iobyxmoadg(0, dArr, dArr2);
    }

    public float iobyxmoadg(float f13) {
        return (float) this.f174zoijcleaow.iobyxmoadg(f13);
    }

    public boolean lqeggnwhkg() {
        return this.f169gxszxtbevo == 1;
    }

    public void ppxfxbqfkf(int i13, int i14, String str, int i15, float f13, float f14, float f15, float f16) {
        this.f171lqeggnwhkg.add(new ppxfxbqfkf(i13, f13, f14, f15, f16));
        if (i15 != -1) {
            this.f169gxszxtbevo = i15;
        }
        this.f173wkgbmnqykc = i14;
        this.f168eablkybsjg = str;
    }

    public String toString() {
        String str = this.f172ppxfxbqfkf;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (ppxfxbqfkf ppxfxbqfkfVar : this.f171lqeggnwhkg) {
            str = str + "[" + ppxfxbqfkfVar.f177iobyxmoadg + " , " + decimalFormat.format(ppxfxbqfkfVar.f180zoijcleaow) + "] ";
        }
        return str;
    }

    public void wkgbmnqykc(int i13, int i14, String str, int i15, float f13, float f14, float f15, float f16, Object obj) {
        this.f171lqeggnwhkg.add(new ppxfxbqfkf(i13, f13, f14, f15, f16));
        if (i15 != -1) {
            this.f169gxszxtbevo = i15;
        }
        this.f173wkgbmnqykc = i14;
        zoijcleaow(obj);
        this.f168eablkybsjg = str;
    }

    protected void zoijcleaow(Object obj) {
    }
}
