package y;

import gg.wwaezpbzkn;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.jyumaefscl;
import z.opjhrmiecq;
import z.pkzmftpjix;
import z.rlfsiqarku;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f123484gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final opjhrmiecq f123485iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f123488zoijcleaow = new ipoelvxyzq.ppxfxbqfkf(new z.ppxfxbqfkf[16], 0);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f123486ppxfxbqfkf = new ipoelvxyzq.ppxfxbqfkf(new ppxfxbqfkf[16], 0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f123487wkgbmnqykc = new ipoelvxyzq.ppxfxbqfkf(new pkzmftpjix[16], 0);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f123483eablkybsjg = new ipoelvxyzq.ppxfxbqfkf(new ppxfxbqfkf[16], 0);

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {
        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            gxszxtbevo.this.eablkybsjg();
        }
    }

    public gxszxtbevo(opjhrmiecq opjhrmiecqVar) {
        this.f123485iobyxmoadg = opjhrmiecqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9 */
    private final void ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2, Set set) {
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(32);
        if (!ppxfxbqfkfVar.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitSubtreeIf called on an unattached node");
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar3 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = ppxfxbqfkfVar.wflxmlrfwp().e0();
        if (ppxfxbqfkfVarE0 == null) {
            z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar3, ppxfxbqfkfVar.wflxmlrfwp(), false);
        } else {
            ppxfxbqfkfVar3.zoijcleaow(ppxfxbqfkfVarE0);
        }
        while (ppxfxbqfkfVar3.draadjrbmk() != 0) {
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar4 = (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) ppxfxbqfkfVar3.oxmwwwfdhm(ppxfxbqfkfVar3.draadjrbmk() - 1);
            if ((ppxfxbqfkfVar4.d0() & iIobyxmoadg) != 0) {
                androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE1 = ppxfxbqfkfVar4;
                while (true) {
                    if (ppxfxbqfkfVarE1 != null) {
                        if ((ppxfxbqfkfVarE1.i0() & iIobyxmoadg) != 0) {
                            ?? Dxjokdxxww = ppxfxbqfkfVarE1;
                            ?? ppxfxbqfkfVar5 = 0;
                            while (Dxjokdxxww != 0) {
                                if (Dxjokdxxww instanceof nufgyqmvbu) {
                                    nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) Dxjokdxxww;
                                    if (nufgyqmvbuVar instanceof z.ppxfxbqfkf) {
                                        z.ppxfxbqfkf ppxfxbqfkfVar6 = (z.ppxfxbqfkf) nufgyqmvbuVar;
                                        if ((ppxfxbqfkfVar6.H0() instanceof wkgbmnqykc) && ppxfxbqfkfVar6.I0().contains(ppxfxbqfkfVar2)) {
                                            set.add(nufgyqmvbuVar);
                                        }
                                    }
                                    if (nufgyqmvbuVar.opjhrmiecq().iobyxmoadg(ppxfxbqfkfVar2)) {
                                        break;
                                    }
                                } else if ((Dxjokdxxww.i0() & iIobyxmoadg) != 0 && (Dxjokdxxww instanceof z.wflxmlrfwp)) {
                                    androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) Dxjokdxxww).I0();
                                    int i13 = 0;
                                    while (ppxfxbqfkfVarI0 != null) {
                                        if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                Dxjokdxxww = Dxjokdxxww;
                                                ppxfxbqfkfVar5 = ppxfxbqfkfVar5;
                                                ppxfxbqfkfVar5 = ppxfxbqfkfVar5;
                                                Dxjokdxxww = ppxfxbqfkfVarI0;
                                            } else {
                                                if (ppxfxbqfkfVar5 == 0) {
                                                    ppxfxbqfkfVar5 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                                }
                                                if (Dxjokdxxww != 0) {
                                                    ppxfxbqfkfVar5.zoijcleaow(Dxjokdxxww);
                                                    Dxjokdxxww = 0;
                                                }
                                                ppxfxbqfkfVar5.zoijcleaow(ppxfxbqfkfVarI0);
                                            }
                                        } else {
                                            Dxjokdxxww = Dxjokdxxww;
                                            ppxfxbqfkfVar5 = ppxfxbqfkfVar5;
                                        }
                                        ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0();
                                        Dxjokdxxww = Dxjokdxxww;
                                        ppxfxbqfkfVar5 = ppxfxbqfkfVar5;
                                    }
                                    if (i13 == 1) {
                                        Dxjokdxxww = Dxjokdxxww;
                                        ppxfxbqfkfVar5 = ppxfxbqfkfVar5;
                                    } else {
                                        Dxjokdxxww = Dxjokdxxww;
                                        ppxfxbqfkfVar5 = ppxfxbqfkfVar5;
                                    }
                                }
                                Dxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar5);
                            }
                        }
                        ppxfxbqfkfVarE1 = ppxfxbqfkfVarE1.e0();
                    }
                }
            }
            z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar3, ppxfxbqfkfVar4, false);
        }
    }

    public final void eablkybsjg() {
        this.f123484gxszxtbevo = false;
        HashSet hashSet = new HashSet();
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f123487wkgbmnqykc;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            pkzmftpjix pkzmftpjixVar = (pkzmftpjix) objArr[i13];
            ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) this.f123483eablkybsjg.f49169zdlpuopuiu[i13];
            if (pkzmftpjixVar.weqkydbzbr().gtknphoqwx().n0()) {
                ppxfxbqfkf(pkzmftpjixVar.weqkydbzbr().gtknphoqwx(), ppxfxbqfkfVar2, hashSet);
            }
        }
        this.f123487wkgbmnqykc.nufgyqmvbu();
        this.f123483eablkybsjg.nufgyqmvbu();
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar3 = this.f123488zoijcleaow;
        Object[] objArr2 = ppxfxbqfkfVar3.f49169zdlpuopuiu;
        int iDraadjrbmk2 = ppxfxbqfkfVar3.draadjrbmk();
        for (int i14 = 0; i14 < iDraadjrbmk2; i14++) {
            z.ppxfxbqfkf ppxfxbqfkfVar4 = (z.ppxfxbqfkf) objArr2[i14];
            ppxfxbqfkf ppxfxbqfkfVar5 = (ppxfxbqfkf) this.f123486ppxfxbqfkf.f49169zdlpuopuiu[i14];
            if (ppxfxbqfkfVar4.n0()) {
                ppxfxbqfkf(ppxfxbqfkfVar4, ppxfxbqfkfVar5, hashSet);
            }
        }
        this.f123488zoijcleaow.nufgyqmvbu();
        this.f123486ppxfxbqfkf.nufgyqmvbu();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((z.ppxfxbqfkf) it.next()).N0();
        }
    }

    public final void gxszxtbevo(z.ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
        this.f123488zoijcleaow.zoijcleaow(ppxfxbqfkfVar);
        this.f123486ppxfxbqfkf.zoijcleaow(ppxfxbqfkfVar2);
        zoijcleaow();
    }

    public final void iobyxmoadg(z.ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
        this.f123488zoijcleaow.zoijcleaow(ppxfxbqfkfVar);
        this.f123486ppxfxbqfkf.zoijcleaow(ppxfxbqfkfVar2);
        zoijcleaow();
    }

    public final void wkgbmnqykc(z.ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
        this.f123487wkgbmnqykc.zoijcleaow(z.gtknphoqwx.rgvfuqvkyq(ppxfxbqfkfVar));
        this.f123483eablkybsjg.zoijcleaow(ppxfxbqfkfVar2);
        zoijcleaow();
    }

    public final void zoijcleaow() {
        if (this.f123484gxszxtbevo) {
            return;
        }
        this.f123484gxszxtbevo = true;
        this.f123485iobyxmoadg.cllcsxoeiz(new iobyxmoadg());
    }
}
