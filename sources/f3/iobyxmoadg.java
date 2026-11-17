package f3;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg extends v2.cdpycssgdh {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f32674eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final m3.kcexrzcfyt f32675gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f32676lqeggnwhkg;

    public iobyxmoadg(boolean z13, m3.kcexrzcfyt kcexrzcfytVar) {
        this.f32676lqeggnwhkg = z13;
        this.f32675gxszxtbevo = kcexrzcfytVar;
        this.f32674eablkybsjg = kcexrzcfytVar.getLength();
    }

    public static Object esjtqupxsv(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int istkbnxepw(int i13, boolean z13) {
        if (z13) {
            return this.f32675gxszxtbevo.zoijcleaow(i13);
        }
        if (i13 > 0) {
            return i13 - 1;
        }
        return -1;
    }

    public static Object iwizpuwonk(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object jyumaefscl(Object obj) {
        return ((Pair) obj).second;
    }

    private int zynmafqrjb(int i13, boolean z13) {
        if (z13) {
            return this.f32675gxszxtbevo.ppxfxbqfkf(i13);
        }
        if (i13 < this.f32674eablkybsjg - 1) {
            return i13 + 1;
        }
        return -1;
    }

    protected abstract v2.cdpycssgdh cdpycssgdh(int i13);

    protected abstract Object cqumvgiudr(int i13);

    @Override // v2.cdpycssgdh
    public int draadjrbmk(int i13, int i14, boolean z13) {
        if (this.f32676lqeggnwhkg) {
            if (i14 == 1) {
                i14 = 2;
            }
            z13 = false;
        }
        int iYggfygwlhe = yggfygwlhe(i13);
        int iPmvmpeiblj = pmvmpeiblj(iYggfygwlhe);
        int iDraadjrbmk = cdpycssgdh(iYggfygwlhe).draadjrbmk(i13 - iPmvmpeiblj, i14 != 2 ? i14 : 0, z13);
        if (iDraadjrbmk != -1) {
            return iPmvmpeiblj + iDraadjrbmk;
        }
        int iIstkbnxepw = istkbnxepw(iYggfygwlhe, z13);
        while (iIstkbnxepw != -1 && cdpycssgdh(iIstkbnxepw).vdvldrhtss()) {
            iIstkbnxepw = istkbnxepw(iIstkbnxepw, z13);
        }
        if (iIstkbnxepw != -1) {
            return pmvmpeiblj(iIstkbnxepw) + cdpycssgdh(iIstkbnxepw).ppxfxbqfkf(z13);
        }
        if (i14 == 2) {
            return ppxfxbqfkf(z13);
        }
        return -1;
    }

    @Override // v2.cdpycssgdh
    public int eablkybsjg(int i13, int i14, boolean z13) {
        if (this.f32676lqeggnwhkg) {
            if (i14 == 1) {
                i14 = 2;
            }
            z13 = false;
        }
        int iYggfygwlhe = yggfygwlhe(i13);
        int iPmvmpeiblj = pmvmpeiblj(iYggfygwlhe);
        int iEablkybsjg = cdpycssgdh(iYggfygwlhe).eablkybsjg(i13 - iPmvmpeiblj, i14 != 2 ? i14 : 0, z13);
        if (iEablkybsjg != -1) {
            return iPmvmpeiblj + iEablkybsjg;
        }
        int iZynmafqrjb = zynmafqrjb(iYggfygwlhe, z13);
        while (iZynmafqrjb != -1 && cdpycssgdh(iZynmafqrjb).vdvldrhtss()) {
            iZynmafqrjb = zynmafqrjb(iZynmafqrjb, z13);
        }
        if (iZynmafqrjb != -1) {
            return pmvmpeiblj(iZynmafqrjb) + cdpycssgdh(iZynmafqrjb).iobyxmoadg(z13);
        }
        if (i14 == 2) {
            return iobyxmoadg(z13);
        }
        return -1;
    }

    @Override // v2.cdpycssgdh
    public int iobyxmoadg(boolean z13) {
        if (this.f32674eablkybsjg == 0) {
            return -1;
        }
        if (this.f32676lqeggnwhkg) {
            z13 = false;
        }
        int iGxszxtbevo = z13 ? this.f32675gxszxtbevo.gxszxtbevo() : 0;
        while (cdpycssgdh(iGxszxtbevo).vdvldrhtss()) {
            iGxszxtbevo = zynmafqrjb(iGxszxtbevo, z13);
            if (iGxszxtbevo == -1) {
                return -1;
            }
        }
        return pmvmpeiblj(iGxszxtbevo) + cdpycssgdh(iGxszxtbevo).iobyxmoadg(z13);
    }

    protected abstract int kcexrzcfyt(Object obj);

    protected abstract int lereixgezr(int i13);

    @Override // v2.cdpycssgdh
    public final v2.cdpycssgdh.zoijcleaow lqeggnwhkg(int i13, v2.cdpycssgdh.zoijcleaow zoijcleaowVar, boolean z13) {
        int iZdlpuopuiu = zdlpuopuiu(i13);
        int iPmvmpeiblj = pmvmpeiblj(iZdlpuopuiu);
        cdpycssgdh(iZdlpuopuiu).lqeggnwhkg(i13 - lereixgezr(iZdlpuopuiu), zoijcleaowVar, z13);
        zoijcleaowVar.f115304ppxfxbqfkf += iPmvmpeiblj;
        if (z13) {
            zoijcleaowVar.f115306zoijcleaow = esjtqupxsv(cqumvgiudr(iZdlpuopuiu), y2.iobyxmoadg.eablkybsjg(zoijcleaowVar.f115306zoijcleaow));
        }
        return zoijcleaowVar;
    }

    @Override // v2.cdpycssgdh
    public final v2.cdpycssgdh.zoijcleaow nufgyqmvbu(Object obj, v2.cdpycssgdh.zoijcleaow zoijcleaowVar) {
        Object objIwizpuwonk = iwizpuwonk(obj);
        Object objJyumaefscl = jyumaefscl(obj);
        int iKcexrzcfyt = kcexrzcfyt(objIwizpuwonk);
        int iPmvmpeiblj = pmvmpeiblj(iKcexrzcfyt);
        cdpycssgdh(iKcexrzcfyt).nufgyqmvbu(objJyumaefscl, zoijcleaowVar);
        zoijcleaowVar.f115304ppxfxbqfkf += iPmvmpeiblj;
        zoijcleaowVar.f115306zoijcleaow = obj;
        return zoijcleaowVar;
    }

    @Override // v2.cdpycssgdh
    public final v2.cdpycssgdh.ppxfxbqfkf ojitshcjhn(int i13, v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar, long j13) {
        int iYggfygwlhe = yggfygwlhe(i13);
        int iPmvmpeiblj = pmvmpeiblj(iYggfygwlhe);
        int iLereixgezr = lereixgezr(iYggfygwlhe);
        cdpycssgdh(iYggfygwlhe).ojitshcjhn(i13 - iPmvmpeiblj, ppxfxbqfkfVar, j13);
        Object objCqumvgiudr = cqumvgiudr(iYggfygwlhe);
        if (!v2.cdpycssgdh.ppxfxbqfkf.f115274vdvldrhtss.equals(ppxfxbqfkfVar.f115286iobyxmoadg)) {
            objCqumvgiudr = esjtqupxsv(objCqumvgiudr, ppxfxbqfkfVar.f115286iobyxmoadg);
        }
        ppxfxbqfkfVar.f115286iobyxmoadg = objCqumvgiudr;
        ppxfxbqfkfVar.f115279agtfadlqog += iLereixgezr;
        ppxfxbqfkfVar.f115289ojitshcjhn += iLereixgezr;
        return ppxfxbqfkfVar;
    }

    protected abstract int pmvmpeiblj(int i13);

    @Override // v2.cdpycssgdh
    public int ppxfxbqfkf(boolean z13) {
        int i13 = this.f32674eablkybsjg;
        if (i13 == 0) {
            return -1;
        }
        if (this.f32676lqeggnwhkg) {
            z13 = false;
        }
        int iWkgbmnqykc = z13 ? this.f32675gxszxtbevo.wkgbmnqykc() : i13 - 1;
        while (cdpycssgdh(iWkgbmnqykc).vdvldrhtss()) {
            iWkgbmnqykc = istkbnxepw(iWkgbmnqykc, z13);
            if (iWkgbmnqykc == -1) {
                return -1;
            }
        }
        return pmvmpeiblj(iWkgbmnqykc) + cdpycssgdh(iWkgbmnqykc).ppxfxbqfkf(z13);
    }

    @Override // v2.cdpycssgdh
    public final Object wflxmlrfwp(int i13) {
        int iZdlpuopuiu = zdlpuopuiu(i13);
        return esjtqupxsv(cqumvgiudr(iZdlpuopuiu), cdpycssgdh(iZdlpuopuiu).wflxmlrfwp(i13 - lereixgezr(iZdlpuopuiu)));
    }

    protected abstract int yggfygwlhe(int i13);

    protected abstract int zdlpuopuiu(int i13);

    @Override // v2.cdpycssgdh
    public final int zoijcleaow(Object obj) {
        int iZoijcleaow;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objIwizpuwonk = iwizpuwonk(obj);
        Object objJyumaefscl = jyumaefscl(obj);
        int iKcexrzcfyt = kcexrzcfyt(objIwizpuwonk);
        if (iKcexrzcfyt == -1 || (iZoijcleaow = cdpycssgdh(iKcexrzcfyt).zoijcleaow(objJyumaefscl)) == -1) {
            return -1;
        }
        return lereixgezr(iKcexrzcfyt) + iZoijcleaow;
    }
}
