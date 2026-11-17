package androidx.media3.exoplayer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class lxfrhoxuzk extends f3.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final HashMap f10621agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int[] f10622btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final v2.cdpycssgdh[] f10623draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f10624dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final int[] f10625gtknphoqwx;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f10626nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final Object[] f10627wflxmlrfwp;

    class iobyxmoadg extends androidx.media3.exoplayer.source.wflxmlrfwp {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final v2.cdpycssgdh.ppxfxbqfkf f10628gxszxtbevo;

        iobyxmoadg(v2.cdpycssgdh cdpycssgdhVar) {
            super(cdpycssgdhVar);
            this.f10628gxszxtbevo = new v2.cdpycssgdh.ppxfxbqfkf();
        }

        @Override // androidx.media3.exoplayer.source.wflxmlrfwp, v2.cdpycssgdh
        public v2.cdpycssgdh.zoijcleaow lqeggnwhkg(int i13, v2.cdpycssgdh.zoijcleaow zoijcleaowVar, boolean z13) {
            v2.cdpycssgdh.zoijcleaow zoijcleaowVarLqeggnwhkg = super.lqeggnwhkg(i13, zoijcleaowVar, z13);
            if (super.agtfadlqog(zoijcleaowVarLqeggnwhkg.f115304ppxfxbqfkf, this.f10628gxszxtbevo).gxszxtbevo()) {
                zoijcleaowVarLqeggnwhkg.zdlpuopuiu(zoijcleaowVar.f115302iobyxmoadg, zoijcleaowVar.f115306zoijcleaow, zoijcleaowVar.f115304ppxfxbqfkf, zoijcleaowVar.f115305wkgbmnqykc, zoijcleaowVar.f115300eablkybsjg, v2.zoijcleaow.f115819lqeggnwhkg, true);
            } else {
                zoijcleaowVarLqeggnwhkg.f115301gxszxtbevo = true;
            }
            return zoijcleaowVarLqeggnwhkg;
        }
    }

    public lxfrhoxuzk(Collection collection, m3.kcexrzcfyt kcexrzcfytVar) {
        this(lmojexxdyd(collection), wwaezpbzkn(collection), kcexrzcfytVar);
    }

    private static v2.cdpycssgdh[] lmojexxdyd(Collection collection) {
        v2.cdpycssgdh[] cdpycssgdhVarArr = new v2.cdpycssgdh[collection.size()];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            cdpycssgdhVarArr[i13] = ((oipsdeybqn) it.next()).zoijcleaow();
            i13++;
        }
        return cdpycssgdhVarArr;
    }

    private static Object[] wwaezpbzkn(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            objArr[i13] = ((oipsdeybqn) it.next()).iobyxmoadg();
            i13++;
        }
        return objArr;
    }

    @Override // f3.iobyxmoadg
    protected v2.cdpycssgdh cdpycssgdh(int i13) {
        return this.f10623draadjrbmk[i13];
    }

    @Override // f3.iobyxmoadg
    protected Object cqumvgiudr(int i13) {
        return this.f10627wflxmlrfwp[i13];
    }

    @Override // v2.cdpycssgdh
    public int dxjokdxxww() {
        return this.f10624dxjokdxxww;
    }

    List iozdgvuglv() {
        return Arrays.asList(this.f10623draadjrbmk);
    }

    @Override // f3.iobyxmoadg
    protected int kcexrzcfyt(Object obj) {
        Integer num = (Integer) this.f10621agtfadlqog.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // f3.iobyxmoadg
    protected int lereixgezr(int i13) {
        return this.f10622btonecajqb[i13];
    }

    @Override // f3.iobyxmoadg
    protected int pmvmpeiblj(int i13) {
        return this.f10625gtknphoqwx[i13];
    }

    @Override // v2.cdpycssgdh
    public int rgvfuqvkyq() {
        return this.f10626nufgyqmvbu;
    }

    public lxfrhoxuzk yadqdtsiqt(m3.kcexrzcfyt kcexrzcfytVar) {
        v2.cdpycssgdh[] cdpycssgdhVarArr = new v2.cdpycssgdh[this.f10623draadjrbmk.length];
        int i13 = 0;
        while (true) {
            v2.cdpycssgdh[] cdpycssgdhVarArr2 = this.f10623draadjrbmk;
            if (i13 >= cdpycssgdhVarArr2.length) {
                return new lxfrhoxuzk(cdpycssgdhVarArr, this.f10627wflxmlrfwp, kcexrzcfytVar);
            }
            cdpycssgdhVarArr[i13] = new iobyxmoadg(cdpycssgdhVarArr2[i13]);
            i13++;
        }
    }

    @Override // f3.iobyxmoadg
    protected int yggfygwlhe(int i13) {
        return y2.stevsuqkhv.gxszxtbevo(this.f10625gtknphoqwx, i13 + 1, false, false);
    }

    @Override // f3.iobyxmoadg
    protected int zdlpuopuiu(int i13) {
        return y2.stevsuqkhv.gxszxtbevo(this.f10622btonecajqb, i13 + 1, false, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private lxfrhoxuzk(v2.cdpycssgdh[] cdpycssgdhVarArr, Object[] objArr, m3.kcexrzcfyt kcexrzcfytVar) {
        super(false, kcexrzcfytVar);
        int i13 = 0;
        int length = cdpycssgdhVarArr.length;
        this.f10623draadjrbmk = cdpycssgdhVarArr;
        this.f10622btonecajqb = new int[length];
        this.f10625gtknphoqwx = new int[length];
        this.f10627wflxmlrfwp = objArr;
        this.f10621agtfadlqog = new HashMap();
        int length2 = cdpycssgdhVarArr.length;
        int iRgvfuqvkyq = 0;
        int iDxjokdxxww = 0;
        int i14 = 0;
        while (i13 < length2) {
            v2.cdpycssgdh cdpycssgdhVar = cdpycssgdhVarArr[i13];
            this.f10623draadjrbmk[i14] = cdpycssgdhVar;
            this.f10625gtknphoqwx[i14] = iRgvfuqvkyq;
            this.f10622btonecajqb[i14] = iDxjokdxxww;
            iRgvfuqvkyq += cdpycssgdhVar.rgvfuqvkyq();
            iDxjokdxxww += this.f10623draadjrbmk[i14].dxjokdxxww();
            this.f10621agtfadlqog.put(objArr[i14], Integer.valueOf(i14));
            i13++;
            i14++;
        }
        this.f10626nufgyqmvbu = iRgvfuqvkyq;
        this.f10624dxjokdxxww = iDxjokdxxww;
    }
}
