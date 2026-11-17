package t;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f109192eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final x.rgvfuqvkyq f109194iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f109197ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f109198wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f109199zoijcleaow;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final androidx.collection.jpowsppfya f109193gxszxtbevo = new androidx.collection.jpowsppfya(0, 1, null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final wflxmlrfwp f109195lqeggnwhkg = new wflxmlrfwp();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final androidx.collection.ylkuphrtab f109196nufgyqmvbu = new androidx.collection.ylkuphrtab(10);

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf f109200yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
            super(0);
            this.f109200yggfygwlhe = ppxfxbqfkfVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            wkgbmnqykc.this.lqeggnwhkg(this.f109200yggfygwlhe);
        }
    }

    public wkgbmnqykc(x.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f109194iobyxmoadg = rgvfuqvkyqVar;
    }

    private final void gxszxtbevo(long j13, androidx.collection.jpowsppfya jpowsppfyaVar) {
        this.f109195lqeggnwhkg.nufgyqmvbu(j13, jpowsppfyaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        if (!this.f109199zoijcleaow) {
            this.f109195lqeggnwhkg.dxjokdxxww(ppxfxbqfkfVar);
        } else {
            this.f109192eablkybsjg = true;
            this.f109193gxszxtbevo.agtfadlqog(ppxfxbqfkfVar);
        }
    }

    public final void eablkybsjg() {
        if (this.f109199zoijcleaow) {
            this.f109197ppxfxbqfkf = true;
        } else {
            this.f109195lqeggnwhkg.wkgbmnqykc();
            ppxfxbqfkf();
        }
    }

    public final void ppxfxbqfkf() {
        if (this.f109198wkgbmnqykc) {
            this.f109198wkgbmnqykc = true;
        } else {
            this.f109195lqeggnwhkg.ppxfxbqfkf();
        }
    }

    public final boolean wkgbmnqykc(gxszxtbevo gxszxtbevoVar, boolean z13) {
        if (!this.f109195lqeggnwhkg.iobyxmoadg(gxszxtbevoVar.zoijcleaow(), this.f109194iobyxmoadg, gxszxtbevoVar, z13)) {
            return false;
        }
        boolean z14 = true;
        this.f109199zoijcleaow = true;
        boolean zGxszxtbevo = this.f109195lqeggnwhkg.gxszxtbevo(gxszxtbevoVar.zoijcleaow(), this.f109194iobyxmoadg, gxszxtbevoVar, z13);
        if (!this.f109195lqeggnwhkg.eablkybsjg(gxszxtbevoVar) && !zGxszxtbevo) {
            z14 = false;
        }
        this.f109199zoijcleaow = false;
        if (this.f109192eablkybsjg) {
            this.f109192eablkybsjg = false;
            int iEablkybsjg = this.f109193gxszxtbevo.eablkybsjg();
            for (int i13 = 0; i13 < iEablkybsjg; i13++) {
                lqeggnwhkg((androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) this.f109193gxszxtbevo.wkgbmnqykc(i13));
            }
            this.f109193gxszxtbevo.yggfygwlhe();
        }
        if (this.f109197ppxfxbqfkf) {
            this.f109197ppxfxbqfkf = false;
            eablkybsjg();
        }
        if (this.f109198wkgbmnqykc) {
            this.f109198wkgbmnqykc = false;
            ppxfxbqfkf();
        }
        return z14;
    }

    public final void zoijcleaow(long j13, List list, boolean z13) {
        Object obj;
        wflxmlrfwp wflxmlrfwpVar = this.f109195lqeggnwhkg;
        this.f109196nufgyqmvbu.lqeggnwhkg();
        int size = list.size();
        boolean z14 = true;
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) list.get(i13);
            if (ppxfxbqfkfVar.n0()) {
                ppxfxbqfkfVar.z0(new iobyxmoadg(ppxfxbqfkfVar));
                if (z14) {
                    ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = wflxmlrfwpVar.lqeggnwhkg();
                    Object[] objArr = ppxfxbqfkfVarLqeggnwhkg.f49169zdlpuopuiu;
                    int iDraadjrbmk = ppxfxbqfkfVarLqeggnwhkg.draadjrbmk();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= iDraadjrbmk) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i14];
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((draadjrbmk) obj).gtknphoqwx(), ppxfxbqfkfVar)) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                    draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
                    if (draadjrbmkVar != null) {
                        draadjrbmkVar.agtfadlqog();
                        draadjrbmkVar.draadjrbmk().iobyxmoadg(j13);
                        androidx.collection.ylkuphrtab ylkuphrtabVar = this.f109196nufgyqmvbu;
                        Object objZoijcleaow = ylkuphrtabVar.zoijcleaow(j13);
                        if (objZoijcleaow == null) {
                            objZoijcleaow = new androidx.collection.jpowsppfya(0, 1, null);
                            ylkuphrtabVar.vdvldrhtss(j13, objZoijcleaow);
                        }
                        ((androidx.collection.jpowsppfya) objZoijcleaow).agtfadlqog(draadjrbmkVar);
                        wflxmlrfwpVar = draadjrbmkVar;
                    } else {
                        z14 = false;
                    }
                }
                draadjrbmk draadjrbmkVar2 = new draadjrbmk(ppxfxbqfkfVar);
                draadjrbmkVar2.draadjrbmk().iobyxmoadg(j13);
                androidx.collection.ylkuphrtab ylkuphrtabVar2 = this.f109196nufgyqmvbu;
                Object objZoijcleaow2 = ylkuphrtabVar2.zoijcleaow(j13);
                if (objZoijcleaow2 == null) {
                    objZoijcleaow2 = new androidx.collection.jpowsppfya(0, 1, null);
                    ylkuphrtabVar2.vdvldrhtss(j13, objZoijcleaow2);
                }
                ((androidx.collection.jpowsppfya) objZoijcleaow2).agtfadlqog(draadjrbmkVar2);
                wflxmlrfwpVar.lqeggnwhkg().zoijcleaow(draadjrbmkVar2);
                wflxmlrfwpVar = draadjrbmkVar2;
            }
        }
        if (!z13) {
            return;
        }
        androidx.collection.ylkuphrtab ylkuphrtabVar3 = this.f109196nufgyqmvbu;
        long[] jArr = ylkuphrtabVar3.f4411zoijcleaow;
        Object[] objArr2 = ylkuphrtabVar3.f4409ppxfxbqfkf;
        long[] jArr2 = ylkuphrtabVar3.f4408iobyxmoadg;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j14 = jArr2[i15];
            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j14) < 128) {
                        int i18 = (i15 << 3) + i17;
                        gxszxtbevo(jArr[i18], (androidx.collection.jpowsppfya) objArr2[i18]);
                    }
                    j14 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }
}
