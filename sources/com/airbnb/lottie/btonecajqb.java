package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.collection.xrmfcynszj;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class btonecajqb {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private float f20329agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private List f20330btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private float f20331draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private androidx.collection.esjtqupxsv f20332dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float f20333eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private Rect f20334gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Map f20335gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private List f20337lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private xrmfcynszj f20338nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f20339ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Map f20340ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private float f20342wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Map f20343wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tzroggbefp f20336iobyxmoadg = new tzroggbefp();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final HashSet f20344zoijcleaow = new HashSet();

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f20341rgvfuqvkyq = 0;

    public tzroggbefp agtfadlqog() {
        return this.f20336iobyxmoadg;
    }

    public Map btonecajqb() {
        float fEablkybsjg = v7.btonecajqb.eablkybsjg();
        if (fEablkybsjg != this.f20333eablkybsjg) {
            for (Map.Entry entry : this.f20343wkgbmnqykc.entrySet()) {
                this.f20343wkgbmnqykc.put((String) entry.getKey(), ((jpowsppfya) entry.getValue()).iobyxmoadg(this.f20333eablkybsjg / fEablkybsjg));
            }
        }
        this.f20333eablkybsjg = fEablkybsjg;
        return this.f20343wkgbmnqykc;
    }

    public o7.nufgyqmvbu draadjrbmk(String str) {
        int size = this.f20337lqeggnwhkg.size();
        for (int i13 = 0; i13 < size; i13++) {
            o7.nufgyqmvbu nufgyqmvbuVar = (o7.nufgyqmvbu) this.f20337lqeggnwhkg.get(i13);
            if (nufgyqmvbuVar.iobyxmoadg(str)) {
                return nufgyqmvbuVar;
            }
        }
        return null;
    }

    public float dxjokdxxww() {
        return this.f20329agtfadlqog;
    }

    public float eablkybsjg() {
        return this.f20342wflxmlrfwp - this.f20331draadjrbmk;
    }

    public List gtknphoqwx() {
        return this.f20330btonecajqb;
    }

    public float gxszxtbevo() {
        return this.f20342wflxmlrfwp;
    }

    public void iobyxmoadg(String str) {
        v7.wkgbmnqykc.ppxfxbqfkf(str);
        this.f20344zoijcleaow.add(str);
    }

    public void iwizpuwonk(boolean z13) {
        this.f20336iobyxmoadg.zoijcleaow(z13);
    }

    public void jyumaefscl(boolean z13) {
        this.f20339ojitshcjhn = z13;
    }

    public void kcexrzcfyt(int i13) {
        this.f20341rgvfuqvkyq += i13;
    }

    public Map lqeggnwhkg() {
        return this.f20335gxszxtbevo;
    }

    public float nufgyqmvbu(float f13) {
        return v7.dxjokdxxww.dxjokdxxww(this.f20331draadjrbmk, this.f20342wflxmlrfwp, f13);
    }

    public List ojitshcjhn(String str) {
        return (List) this.f20340ppxfxbqfkf.get(str);
    }

    public boolean oxmwwwfdhm() {
        return !this.f20343wkgbmnqykc.isEmpty();
    }

    public xrmfcynszj ppxfxbqfkf() {
        return this.f20338nufgyqmvbu;
    }

    public float rgvfuqvkyq() {
        return this.f20331draadjrbmk;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f20330btonecajqb.iterator();
        while (it.hasNext()) {
            sb3.append(((r7.eablkybsjg) it.next()).lereixgezr("\t"));
        }
        return sb3.toString();
    }

    public boolean vdvldrhtss() {
        return this.f20339ojitshcjhn;
    }

    public int wflxmlrfwp() {
        return this.f20341rgvfuqvkyq;
    }

    public float wkgbmnqykc() {
        return (long) ((eablkybsjg() / this.f20329agtfadlqog) * 1000.0f);
    }

    public r7.eablkybsjg yggfygwlhe(long j13) {
        return (r7.eablkybsjg) this.f20332dxjokdxxww.wkgbmnqykc(j13);
    }

    public void zdlpuopuiu(Rect rect, float f13, float f14, float f15, List list, androidx.collection.esjtqupxsv esjtqupxsvVar, Map map, Map map2, float f16, xrmfcynszj xrmfcynszjVar, Map map3, List list2) {
        this.f20334gtknphoqwx = rect;
        this.f20331draadjrbmk = f13;
        this.f20342wflxmlrfwp = f14;
        this.f20329agtfadlqog = f15;
        this.f20330btonecajqb = list;
        this.f20332dxjokdxxww = esjtqupxsvVar;
        this.f20340ppxfxbqfkf = map;
        this.f20343wkgbmnqykc = map2;
        this.f20333eablkybsjg = f16;
        this.f20338nufgyqmvbu = xrmfcynszjVar;
        this.f20335gxszxtbevo = map3;
        this.f20337lqeggnwhkg = list2;
    }

    public Rect zoijcleaow() {
        return this.f20334gtknphoqwx;
    }
}
