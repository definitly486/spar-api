package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.ixidwrxhsl;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0083iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ float f4853jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ float f4854yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ x.iobyxmoadg f4855zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0083iobyxmoadg(x.iobyxmoadg iobyxmoadgVar, float f13, float f14) {
            super(1);
            this.f4855zdlpuopuiu = iobyxmoadgVar;
            this.f4854yggfygwlhe = f13;
            this.f4853jyumaefscl = f14;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
            iobyxmoadg(null);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ixidwrxhsl ixidwrxhslVar) {
            throw null;
        }
    }

    private static final boolean eablkybsjg(x.iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar instanceof x.gtknphoqwx;
    }

    public static final androidx.compose.ui.wkgbmnqykc gxszxtbevo(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, x.iobyxmoadg iobyxmoadgVar, float f13, float f14) {
        return wkgbmnqykcVar.eablkybsjg(new AlignmentLineOffsetDpElement(iobyxmoadgVar, f13, f14, InspectableValueKt.isDebugInspectorInfoEnabled() ? new C0083iobyxmoadg(iobyxmoadgVar, f13, f14) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc lqeggnwhkg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, x.iobyxmoadg iobyxmoadgVar, float f13, float f14, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = w0.nufgyqmvbu.f118267yggfygwlhe.ppxfxbqfkf();
        }
        if ((i13 & 4) != 0) {
            f14 = w0.nufgyqmvbu.f118267yggfygwlhe.ppxfxbqfkf();
        }
        return gxszxtbevo(wkgbmnqykcVar, iobyxmoadgVar, f13, f14);
    }

    public static final androidx.compose.ui.wkgbmnqykc nufgyqmvbu(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, float f13, float f14) {
        return wkgbmnqykcVar.eablkybsjg(!Float.isNaN(f13) ? lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, x.zoijcleaow.iobyxmoadg(), f13, 0.0f, 4, null) : androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg).eablkybsjg(!Float.isNaN(f14) ? lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, x.zoijcleaow.zoijcleaow(), 0.0f, f14, 2, null) : androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x.istkbnxepw ppxfxbqfkf(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, final x.iobyxmoadg iobyxmoadgVar, final float f13, float f14, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(eablkybsjg(iobyxmoadgVar) ? w0.zoijcleaow.wkgbmnqykc(j13, 0, 0, 0, 0, 11, null) : w0.zoijcleaow.wkgbmnqykc(j13, 0, 0, 0, 0, 14, null));
        int iCllcsxoeiz = kcexrzcfytVarSflfametgt.cllcsxoeiz(iobyxmoadgVar);
        if (iCllcsxoeiz == Integer.MIN_VALUE) {
            iCllcsxoeiz = 0;
        }
        int iIpoelvxyzq = eablkybsjg(iobyxmoadgVar) ? kcexrzcfytVarSflfametgt.ipoelvxyzq() : kcexrzcfytVarSflfametgt.eslsurpljm();
        int iGtknphoqwx = (eablkybsjg(iobyxmoadgVar) ? w0.zoijcleaow.gtknphoqwx(j13) : w0.zoijcleaow.draadjrbmk(j13)) - iIpoelvxyzq;
        final int iAgtfadlqog = zg.gtknphoqwx.agtfadlqog((!Float.isNaN(f13) ? draadjrbmkVar.hszhottldk(f13) : 0) - iCllcsxoeiz, 0, iGtknphoqwx);
        final int iAgtfadlqog2 = zg.gtknphoqwx.agtfadlqog(((!Float.isNaN(f14) ? draadjrbmkVar.hszhottldk(f14) : 0) - iIpoelvxyzq) + iCllcsxoeiz, 0, iGtknphoqwx - iAgtfadlqog);
        int iEslsurpljm = eablkybsjg(iobyxmoadgVar) ? kcexrzcfytVarSflfametgt.eslsurpljm() : Math.max(kcexrzcfytVarSflfametgt.eslsurpljm() + iAgtfadlqog + iAgtfadlqog2, w0.zoijcleaow.agtfadlqog(j13));
        final int iMax = eablkybsjg(iobyxmoadgVar) ? Math.max(kcexrzcfytVarSflfametgt.ipoelvxyzq() + iAgtfadlqog + iAgtfadlqog2, w0.zoijcleaow.wflxmlrfwp(j13)) : kcexrzcfytVarSflfametgt.ipoelvxyzq();
        final int i13 = iEslsurpljm;
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, iEslsurpljm, iMax, null, new tg.draadjrbmk() { // from class: czzsidtyhn.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return androidx.compose.foundation.layout.iobyxmoadg.wkgbmnqykc(iobyxmoadgVar, f13, iAgtfadlqog, i13, iAgtfadlqog2, kcexrzcfytVarSflfametgt, iMax, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wkgbmnqykc(x.iobyxmoadg iobyxmoadgVar, float f13, int i13, int i14, int i15, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i16, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2) {
        int iEslsurpljm;
        int iIpoelvxyzq;
        if (eablkybsjg(iobyxmoadgVar)) {
            iEslsurpljm = 0;
        } else {
            iEslsurpljm = !w0.nufgyqmvbu.dxjokdxxww(f13, w0.nufgyqmvbu.f118267yggfygwlhe.ppxfxbqfkf()) ? i13 : (i14 - i15) - kcexrzcfytVar.eslsurpljm();
        }
        if (eablkybsjg(iobyxmoadgVar)) {
            iIpoelvxyzq = !w0.nufgyqmvbu.dxjokdxxww(f13, w0.nufgyqmvbu.f118267yggfygwlhe.ppxfxbqfkf()) ? i13 : (i16 - i15) - kcexrzcfytVar.ipoelvxyzq();
        } else {
            iIpoelvxyzq = 0;
        }
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar2, kcexrzcfytVar, iEslsurpljm, iIpoelvxyzq, 0.0f, 4, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
