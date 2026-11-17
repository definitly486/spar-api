package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements krqnebusok.eablkybsjg, Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private androidx.collection.iozdgvuglv f5582cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f5583cqumvgiudr;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private HashMap f5585istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f5586iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f5588lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f5589pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f5590yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int[] f5591zdlpuopuiu = new int[0];

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Object[] f5587jyumaefscl = new Object[0];

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final Object f5584esjtqupxsv = new Object();

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private ArrayList f5592zynmafqrjb = new ArrayList();

    private final zoijcleaow pmvmpeiblj(int i13) {
        int i14;
        if (this.f5588lereixgezr) {
            jyumaefscl.zdlpuopuiu("use active SlotWriter to crate an anchor for location instead");
        }
        if (i13 < 0 || i13 >= (i14 = this.f5590yggfygwlhe)) {
            return null;
        }
        return g0.agtfadlqog(this.f5592zynmafqrjb, i13, i14);
    }

    public final Object[] agtfadlqog() {
        return this.f5587jyumaefscl;
    }

    public final ArrayList btonecajqb() {
        return this.f5592zynmafqrjb;
    }

    public final boolean cqumvgiudr(zoijcleaow zoijcleaowVar) {
        int iKcexrzcfyt;
        return zoijcleaowVar.zoijcleaow() && (iKcexrzcfyt = g0.kcexrzcfyt(this.f5592zynmafqrjb, zoijcleaowVar.iobyxmoadg(), this.f5590yggfygwlhe)) >= 0 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f5592zynmafqrjb.get(iKcexrzcfyt), zoijcleaowVar);
    }

    public final int[] draadjrbmk() {
        return this.f5591zdlpuopuiu;
    }

    public final boolean dxjokdxxww() {
        return this.f5590yggfygwlhe > 0 && (this.f5591zdlpuopuiu[1] & 67108864) != 0;
    }

    public final void eablkybsjg() {
        this.f5582cdpycssgdh = new androidx.collection.iozdgvuglv(0, 1, null);
    }

    public final void esjtqupxsv(int[] iArr, int i13, Object[] objArr, int i14, ArrayList arrayList, HashMap map, androidx.collection.iozdgvuglv iozdgvuglvVar) {
        this.f5591zdlpuopuiu = iArr;
        this.f5590yggfygwlhe = i13;
        this.f5587jyumaefscl = objArr;
        this.f5586iwizpuwonk = i14;
        this.f5592zynmafqrjb = arrayList;
        this.f5585istkbnxepw = map;
        this.f5582cdpycssgdh = iozdgvuglvVar;
    }

    public final androidx.collection.iozdgvuglv gtknphoqwx() {
        return this.f5582cdpycssgdh;
    }

    public final void gxszxtbevo() {
        this.f5585istkbnxepw = new HashMap();
    }

    public final zoijcleaow iobyxmoadg(int i13) {
        if (this.f5588lereixgezr) {
            jyumaefscl.zdlpuopuiu("use active SlotWriter to create an anchor location instead");
        }
        boolean z13 = false;
        if (i13 >= 0 && i13 < this.f5590yggfygwlhe) {
            z13 = true;
        }
        if (!z13) {
            fmlbqenlif.iobyxmoadg("Parameter index is out of range");
        }
        ArrayList arrayList = this.f5592zynmafqrjb;
        int iKcexrzcfyt = g0.kcexrzcfyt(arrayList, i13, this.f5590yggfygwlhe);
        if (iKcexrzcfyt >= 0) {
            return (zoijcleaow) arrayList.get(iKcexrzcfyt);
        }
        zoijcleaow zoijcleaowVar = new zoijcleaow(i13);
        arrayList.add(-(iKcexrzcfyt + 1), zoijcleaowVar);
        return zoijcleaowVar;
    }

    public boolean isEmpty() {
        return this.f5590yggfygwlhe == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new ikoacuggdj(this, 0, this.f5590yggfygwlhe);
    }

    public final h0 iwizpuwonk() {
        if (this.f5588lereixgezr) {
            jyumaefscl.zdlpuopuiu("Cannot start a writer when another writer is pending");
        }
        if (!(this.f5583cqumvgiudr <= 0)) {
            jyumaefscl.zdlpuopuiu("Cannot start a writer when a reader is pending");
        }
        this.f5588lereixgezr = true;
        this.f5589pmvmpeiblj++;
        return new h0(this);
    }

    public final d0 jyumaefscl() {
        if (this.f5588lereixgezr) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f5583cqumvgiudr++;
        return new d0(this);
    }

    public final boolean kcexrzcfyt(int i13, zoijcleaow zoijcleaowVar) {
        if (this.f5588lereixgezr) {
            jyumaefscl.zdlpuopuiu("Writer is active");
        }
        if (!(i13 >= 0 && i13 < this.f5590yggfygwlhe)) {
            jyumaefscl.zdlpuopuiu("Invalid group index");
        }
        if (cqumvgiudr(zoijcleaowVar)) {
            int iOjitshcjhn = g0.ojitshcjhn(this.f5591zdlpuopuiu, i13) + i13;
            int iIobyxmoadg = zoijcleaowVar.iobyxmoadg();
            if (i13 <= iIobyxmoadg && iIobyxmoadg < iOjitshcjhn) {
                return true;
            }
        }
        return false;
    }

    public final jztzpxfvev lereixgezr(int i13) {
        zoijcleaow zoijcleaowVarPmvmpeiblj;
        HashMap map = this.f5585istkbnxepw;
        if (map == null || (zoijcleaowVarPmvmpeiblj = pmvmpeiblj(i13)) == null) {
            return null;
        }
        return (jztzpxfvev) map.get(zoijcleaowVarPmvmpeiblj);
    }

    public final int ojitshcjhn() {
        return this.f5586iwizpuwonk;
    }

    public final boolean oxmwwwfdhm() {
        return this.f5588lereixgezr;
    }

    public final void ppxfxbqfkf(d0 d0Var, HashMap map) {
        if (!(d0Var.lereixgezr() == this && this.f5583cqumvgiudr > 0)) {
            jyumaefscl.zdlpuopuiu("Unexpected reader close()");
        }
        this.f5583cqumvgiudr--;
        if (map != null) {
            synchronized (this.f5584esjtqupxsv) {
                try {
                    HashMap map2 = this.f5585istkbnxepw;
                    if (map2 != null) {
                        map2.putAll(map);
                    } else {
                        this.f5585istkbnxepw = map;
                    }
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final HashMap rgvfuqvkyq() {
        return this.f5585istkbnxepw;
    }

    public final int vdvldrhtss() {
        return this.f5589pmvmpeiblj;
    }

    public final int wflxmlrfwp() {
        return this.f5590yggfygwlhe;
    }

    public final void wkgbmnqykc(h0 h0Var, int[] iArr, int i13, Object[] objArr, int i14, ArrayList arrayList, HashMap map, androidx.collection.iozdgvuglv iozdgvuglvVar) {
        if (!(h0Var.ikoacuggdj() == this && this.f5588lereixgezr)) {
            fmlbqenlif.iobyxmoadg("Unexpected writer close()");
        }
        this.f5588lereixgezr = false;
        esjtqupxsv(iArr, i13, objArr, i14, arrayList, map, iozdgvuglvVar);
    }

    public final boolean zdlpuopuiu(zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2) {
        int iIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        int iOjitshcjhn = g0.ojitshcjhn(this.f5591zdlpuopuiu, iIobyxmoadg) + iIobyxmoadg;
        int iIobyxmoadg2 = zoijcleaowVar2.iobyxmoadg();
        return iIobyxmoadg <= iIobyxmoadg2 && iIobyxmoadg2 < iOjitshcjhn;
    }

    public final int zoijcleaow(zoijcleaow zoijcleaowVar) {
        if (this.f5588lereixgezr) {
            jyumaefscl.zdlpuopuiu("Use active SlotWriter to determine anchor location instead");
        }
        if (!zoijcleaowVar.zoijcleaow()) {
            fmlbqenlif.iobyxmoadg("Anchor refers to a group that was removed");
        }
        return zoijcleaowVar.iobyxmoadg();
    }
}
