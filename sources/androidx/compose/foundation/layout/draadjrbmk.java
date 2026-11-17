package androidx.compose.foundation.layout;

import java.util.List;
import kotlin.jvm.internal.hcddaimhww;

/* JADX INFO: loaded from: classes.dex */
final class draadjrbmk implements x.zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final a.eablkybsjg f4841iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f4842zoijcleaow;

    public draadjrbmk(a.eablkybsjg eablkybsjgVar, boolean z13) {
        this.f4841iobyxmoadg = eablkybsjgVar;
        this.f4842zoijcleaow = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn dxjokdxxww(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, x.pmvmpeiblj pmvmpeibljVar, androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, int i13, int i14, draadjrbmk draadjrbmkVar2, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        nufgyqmvbu.btonecajqb(iobyxmoadgVar, kcexrzcfytVar, pmvmpeibljVar, draadjrbmkVar.getLayoutDirection(), i13, i14, draadjrbmkVar2.f4841iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(androidx.compose.ui.layout.kcexrzcfyt[] kcexrzcfytVarArr, List list, androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, hcddaimhww hcddaimhwwVar, hcddaimhww hcddaimhwwVar2, draadjrbmk draadjrbmkVar2, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        int length = kcexrzcfytVarArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar = kcexrzcfytVarArr[i13];
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(kcexrzcfytVar, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            nufgyqmvbu.btonecajqb(iobyxmoadgVar, kcexrzcfytVar, (x.pmvmpeiblj) list.get(i14), draadjrbmkVar.getLayoutDirection(), hcddaimhwwVar.f60014zdlpuopuiu, hcddaimhwwVar2.f60014zdlpuopuiu, draadjrbmkVar2.f4841iobyxmoadg);
            i13++;
            i14++;
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn nufgyqmvbu(androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4841iobyxmoadg, draadjrbmkVar.f4841iobyxmoadg) && this.f4842zoijcleaow == draadjrbmkVar.f4842zoijcleaow;
    }

    public int hashCode() {
        return (this.f4841iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f4842zoijcleaow);
    }

    @Override // x.zynmafqrjb
    public x.istkbnxepw lqeggnwhkg(final androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, final List list, long j13) {
        int iAgtfadlqog;
        int iWflxmlrfwp;
        androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, w0.zoijcleaow.agtfadlqog(j13), w0.zoijcleaow.wflxmlrfwp(j13), null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.dxjokdxxww
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return draadjrbmk.nufgyqmvbu((androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
                }
            }, 4, null);
        }
        long jZoijcleaow = this.f4842zoijcleaow ? j13 : w0.zoijcleaow.zoijcleaow(j13 & (-8589934589L));
        if (list.size() == 1) {
            final x.pmvmpeiblj pmvmpeibljVar = (x.pmvmpeiblj) list.get(0);
            if (nufgyqmvbu.nufgyqmvbu(pmvmpeibljVar)) {
                iAgtfadlqog = w0.zoijcleaow.agtfadlqog(j13);
                iWflxmlrfwp = w0.zoijcleaow.wflxmlrfwp(j13);
                kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(w0.zoijcleaow.f118283zoijcleaow.ppxfxbqfkf(w0.zoijcleaow.agtfadlqog(j13), w0.zoijcleaow.wflxmlrfwp(j13)));
            } else {
                kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(jZoijcleaow);
                iAgtfadlqog = Math.max(w0.zoijcleaow.agtfadlqog(j13), kcexrzcfytVarSflfametgt.eslsurpljm());
                iWflxmlrfwp = Math.max(w0.zoijcleaow.wflxmlrfwp(j13), kcexrzcfytVarSflfametgt.ipoelvxyzq());
            }
            final int i13 = iAgtfadlqog;
            final int i14 = iWflxmlrfwp;
            final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar = kcexrzcfytVarSflfametgt;
            return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, i13, i14, null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.btonecajqb
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return draadjrbmk.dxjokdxxww(kcexrzcfytVar, pmvmpeibljVar, draadjrbmkVar, i13, i14, this, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
                }
            }, 4, null);
        }
        final androidx.compose.ui.layout.kcexrzcfyt[] kcexrzcfytVarArr = new androidx.compose.ui.layout.kcexrzcfyt[list.size()];
        final hcddaimhww hcddaimhwwVar = new hcddaimhww();
        hcddaimhwwVar.f60014zdlpuopuiu = w0.zoijcleaow.agtfadlqog(j13);
        final hcddaimhww hcddaimhwwVar2 = new hcddaimhww();
        hcddaimhwwVar2.f60014zdlpuopuiu = w0.zoijcleaow.wflxmlrfwp(j13);
        int size = list.size();
        boolean z13 = false;
        for (int i15 = 0; i15 < size; i15++) {
            x.pmvmpeiblj pmvmpeibljVar2 = (x.pmvmpeiblj) list.get(i15);
            if (nufgyqmvbu.nufgyqmvbu(pmvmpeibljVar2)) {
                z13 = true;
            } else {
                androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt2 = pmvmpeibljVar2.sflfametgt(jZoijcleaow);
                kcexrzcfytVarArr[i15] = kcexrzcfytVarSflfametgt2;
                hcddaimhwwVar.f60014zdlpuopuiu = Math.max(hcddaimhwwVar.f60014zdlpuopuiu, kcexrzcfytVarSflfametgt2.eslsurpljm());
                hcddaimhwwVar2.f60014zdlpuopuiu = Math.max(hcddaimhwwVar2.f60014zdlpuopuiu, kcexrzcfytVarSflfametgt2.ipoelvxyzq());
            }
        }
        if (z13) {
            int i16 = hcddaimhwwVar.f60014zdlpuopuiu;
            int i17 = i16 != Integer.MAX_VALUE ? i16 : 0;
            int i18 = hcddaimhwwVar2.f60014zdlpuopuiu;
            long jIobyxmoadg = w0.ppxfxbqfkf.iobyxmoadg(i17, i16, i18 != Integer.MAX_VALUE ? i18 : 0, i18);
            int size2 = list.size();
            for (int i19 = 0; i19 < size2; i19++) {
                x.pmvmpeiblj pmvmpeibljVar3 = (x.pmvmpeiblj) list.get(i19);
                if (nufgyqmvbu.nufgyqmvbu(pmvmpeibljVar3)) {
                    kcexrzcfytVarArr[i19] = pmvmpeibljVar3.sflfametgt(jIobyxmoadg);
                }
            }
        }
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, hcddaimhwwVar.f60014zdlpuopuiu, hcddaimhwwVar2.f60014zdlpuopuiu, null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.gtknphoqwx(kcexrzcfytVarArr, list, draadjrbmkVar, hcddaimhwwVar, hcddaimhwwVar2, this, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f4841iobyxmoadg + ", propagateMinConstraints=" + this.f4842zoijcleaow + ')';
    }
}
