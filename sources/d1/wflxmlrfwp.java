package d1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class wflxmlrfwp {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static int f26657nufgyqmvbu;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    int f26659gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    int f26661lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    rgvfuqvkyq f26662ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    rgvfuqvkyq f26663wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public int f26660iobyxmoadg = 0;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public boolean f26664zoijcleaow = false;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    ArrayList f26658eablkybsjg = new ArrayList();

    wflxmlrfwp(rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        this.f26662ppxfxbqfkf = null;
        this.f26663wkgbmnqykc = null;
        int i14 = f26657nufgyqmvbu;
        this.f26659gxszxtbevo = i14;
        f26657nufgyqmvbu = i14 + 1;
        this.f26662ppxfxbqfkf = rgvfuqvkyqVar;
        this.f26663wkgbmnqykc = rgvfuqvkyqVar;
        this.f26661lqeggnwhkg = i13;
    }

    private long ppxfxbqfkf(gxszxtbevo gxszxtbevoVar, long j13) {
        rgvfuqvkyq rgvfuqvkyqVar = gxszxtbevoVar.f26610wkgbmnqykc;
        if (rgvfuqvkyqVar instanceof gtknphoqwx) {
            return j13;
        }
        int size = gxszxtbevoVar.f26604gtknphoqwx.size();
        long jMin = j13;
        for (int i13 = 0; i13 < size; i13++) {
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar.f26604gtknphoqwx.get(i13);
            if (wkgbmnqykcVar instanceof gxszxtbevo) {
                gxszxtbevo gxszxtbevoVar2 = (gxszxtbevo) wkgbmnqykcVar;
                if (gxszxtbevoVar2.f26610wkgbmnqykc != rgvfuqvkyqVar) {
                    jMin = Math.min(jMin, ppxfxbqfkf(gxszxtbevoVar2, ((long) gxszxtbevoVar2.f26605gxszxtbevo) + j13));
                }
            }
        }
        if (gxszxtbevoVar != rgvfuqvkyqVar.f26642dxjokdxxww) {
            return jMin;
        }
        long jBtonecajqb = j13 - rgvfuqvkyqVar.btonecajqb();
        return Math.min(Math.min(jMin, ppxfxbqfkf(rgvfuqvkyqVar.f26647nufgyqmvbu, jBtonecajqb)), jBtonecajqb - ((long) rgvfuqvkyqVar.f26647nufgyqmvbu.f26605gxszxtbevo));
    }

    private long wkgbmnqykc(gxszxtbevo gxszxtbevoVar, long j13) {
        rgvfuqvkyq rgvfuqvkyqVar = gxszxtbevoVar.f26610wkgbmnqykc;
        if (rgvfuqvkyqVar instanceof gtknphoqwx) {
            return j13;
        }
        int size = gxszxtbevoVar.f26604gtknphoqwx.size();
        long jMax = j13;
        for (int i13 = 0; i13 < size; i13++) {
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar.f26604gtknphoqwx.get(i13);
            if (wkgbmnqykcVar instanceof gxszxtbevo) {
                gxszxtbevo gxszxtbevoVar2 = (gxszxtbevo) wkgbmnqykcVar;
                if (gxszxtbevoVar2.f26610wkgbmnqykc != rgvfuqvkyqVar) {
                    jMax = Math.max(jMax, wkgbmnqykc(gxszxtbevoVar2, ((long) gxszxtbevoVar2.f26605gxszxtbevo) + j13));
                }
            }
        }
        if (gxszxtbevoVar != rgvfuqvkyqVar.f26647nufgyqmvbu) {
            return jMax;
        }
        long jBtonecajqb = j13 + rgvfuqvkyqVar.btonecajqb();
        return Math.max(Math.max(jMax, wkgbmnqykc(rgvfuqvkyqVar.f26642dxjokdxxww, jBtonecajqb)), jBtonecajqb - ((long) rgvfuqvkyqVar.f26642dxjokdxxww.f26605gxszxtbevo));
    }

    public void iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar) {
        this.f26658eablkybsjg.add(rgvfuqvkyqVar);
        this.f26663wkgbmnqykc = rgvfuqvkyqVar;
    }

    public long zoijcleaow(c1.gxszxtbevo gxszxtbevoVar, int i13) {
        long jBtonecajqb;
        int i14;
        rgvfuqvkyq rgvfuqvkyqVar = this.f26662ppxfxbqfkf;
        if (rgvfuqvkyqVar instanceof ppxfxbqfkf) {
            if (((ppxfxbqfkf) rgvfuqvkyqVar).f26644gxszxtbevo != i13) {
                return 0L;
            }
        } else if (i13 == 0) {
            if (!(rgvfuqvkyqVar instanceof draadjrbmk)) {
                return 0L;
            }
        } else if (!(rgvfuqvkyqVar instanceof agtfadlqog)) {
            return 0L;
        }
        gxszxtbevo gxszxtbevoVar2 = (i13 == 0 ? gxszxtbevoVar.f18245eablkybsjg : gxszxtbevoVar.f18254gxszxtbevo).f26647nufgyqmvbu;
        gxszxtbevo gxszxtbevoVar3 = (i13 == 0 ? gxszxtbevoVar.f18245eablkybsjg : gxszxtbevoVar.f18254gxszxtbevo).f26642dxjokdxxww;
        boolean zContains = rgvfuqvkyqVar.f26647nufgyqmvbu.f26601draadjrbmk.contains(gxszxtbevoVar2);
        boolean zContains2 = this.f26662ppxfxbqfkf.f26642dxjokdxxww.f26601draadjrbmk.contains(gxszxtbevoVar3);
        long jBtonecajqb2 = this.f26662ppxfxbqfkf.btonecajqb();
        if (zContains && zContains2) {
            long jWkgbmnqykc = wkgbmnqykc(this.f26662ppxfxbqfkf.f26647nufgyqmvbu, 0L);
            long jPpxfxbqfkf = ppxfxbqfkf(this.f26662ppxfxbqfkf.f26642dxjokdxxww, 0L);
            long j13 = jWkgbmnqykc - jBtonecajqb2;
            rgvfuqvkyq rgvfuqvkyqVar2 = this.f26662ppxfxbqfkf;
            int i15 = rgvfuqvkyqVar2.f26642dxjokdxxww.f26605gxszxtbevo;
            if (j13 >= (-i15)) {
                j13 += (long) i15;
            }
            int i16 = rgvfuqvkyqVar2.f26647nufgyqmvbu.f26605gxszxtbevo;
            long j14 = ((-jPpxfxbqfkf) - jBtonecajqb2) - ((long) i16);
            if (j14 >= i16) {
                j14 -= (long) i16;
            }
            float fKcexrzcfyt = rgvfuqvkyqVar2.f26650zoijcleaow.kcexrzcfyt(i13);
            float f13 = fKcexrzcfyt > 0.0f ? (long) ((j14 / fKcexrzcfyt) + (j13 / (1.0f - fKcexrzcfyt))) : 0L;
            long j15 = ((long) ((f13 * fKcexrzcfyt) + 0.5f)) + jBtonecajqb2 + ((long) ((f13 * (1.0f - fKcexrzcfyt)) + 0.5f));
            rgvfuqvkyq rgvfuqvkyqVar3 = this.f26662ppxfxbqfkf;
            jBtonecajqb = ((long) rgvfuqvkyqVar3.f26647nufgyqmvbu.f26605gxszxtbevo) + j15;
            i14 = rgvfuqvkyqVar3.f26642dxjokdxxww.f26605gxszxtbevo;
        } else {
            if (zContains) {
                gxszxtbevo gxszxtbevoVar4 = this.f26662ppxfxbqfkf.f26647nufgyqmvbu;
                return Math.max(wkgbmnqykc(gxszxtbevoVar4, gxszxtbevoVar4.f26605gxszxtbevo), ((long) this.f26662ppxfxbqfkf.f26647nufgyqmvbu.f26605gxszxtbevo) + jBtonecajqb2);
            }
            if (zContains2) {
                gxszxtbevo gxszxtbevoVar5 = this.f26662ppxfxbqfkf.f26642dxjokdxxww;
                return Math.max(-ppxfxbqfkf(gxszxtbevoVar5, gxszxtbevoVar5.f26605gxszxtbevo), ((long) (-this.f26662ppxfxbqfkf.f26642dxjokdxxww.f26605gxszxtbevo)) + jBtonecajqb2);
            }
            rgvfuqvkyq rgvfuqvkyqVar4 = this.f26662ppxfxbqfkf;
            jBtonecajqb = ((long) rgvfuqvkyqVar4.f26647nufgyqmvbu.f26605gxszxtbevo) + rgvfuqvkyqVar4.btonecajqb();
            i14 = this.f26662ppxfxbqfkf.f26642dxjokdxxww.f26605gxszxtbevo;
        }
        return jBtonecajqb - ((long) i14);
    }
}
