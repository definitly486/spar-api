package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.InspectableValueKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h.e;
import h.eslsurpljm;
import h.iwxlajgraz;
import h.krqnebusok;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {
    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f23, float f24, float f25, long j13, e eVar, boolean z13, krqnebusok krqnebusokVar, long j14, long j15, int i13, int i14, wkgbmnqykc wkgbmnqykcVar2, int i15, Object obj) {
        return wkgbmnqykc(wkgbmnqykcVar, (i15 & 1) != 0 ? 1.0f : f13, (i15 & 2) != 0 ? 1.0f : f14, (i15 & 4) == 0 ? f15 : 1.0f, (i15 & 8) != 0 ? 0.0f : f16, (i15 & 16) != 0 ? 0.0f : f17, (i15 & 32) != 0 ? 0.0f : f18, (i15 & 64) != 0 ? 0.0f : f19, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0.0f : f23, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? f24 : 0.0f, (i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 8.0f : f25, (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? btonecajqb.f6294zoijcleaow.iobyxmoadg() : j13, (i15 & 2048) != 0 ? eslsurpljm.iobyxmoadg() : eVar, (i15 & 4096) != 0 ? false : z13, (i15 & 8192) != 0 ? null : krqnebusokVar, (i15 & 16384) != 0 ? iwxlajgraz.iobyxmoadg() : j14, (32768 & i15) != 0 ? iwxlajgraz.iobyxmoadg() : j15, (65536 & i15) != 0 ? eablkybsjg.f6319iobyxmoadg.iobyxmoadg() : i13, (i15 & 131072) != 0 ? ppxfxbqfkf.f6357iobyxmoadg.zynmafqrjb() : i14, (i15 & 262144) == 0 ? wkgbmnqykcVar2 : null);
    }

    public static final androidx.compose.ui.wkgbmnqykc gxszxtbevo(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar) {
        return InspectableValueKt.isDebugInspectorInfoEnabled() ? wkgbmnqykcVar.eablkybsjg(eablkybsjg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null)) : wkgbmnqykcVar;
    }

    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar) {
        return wkgbmnqykcVar.eablkybsjg(new BlockGraphicsLayerElement(draadjrbmkVar));
    }

    public static final androidx.compose.ui.wkgbmnqykc wkgbmnqykc(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f23, float f24, float f25, long j13, e eVar, boolean z13, krqnebusok krqnebusokVar, long j14, long j15, int i13, int i14, wkgbmnqykc wkgbmnqykcVar2) {
        return wkgbmnqykcVar.eablkybsjg(new GraphicsLayerElement(f13, f14, f15, f16, f17, f18, f19, f23, f24, f25, j13, eVar, z13, krqnebusokVar, j14, j15, i13, i14, wkgbmnqykcVar2, null));
    }

    public static final /* synthetic */ androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f23, float f24, float f25, long j13, e eVar, boolean z13, krqnebusok krqnebusokVar, long j14, long j15, int i13) {
        return wkgbmnqykc(wkgbmnqykcVar, f13, f14, f15, f16, f17, f18, f19, f23, f24, f25, j13, eVar, z13, krqnebusokVar, j14, j15, i13, ppxfxbqfkf.f6357iobyxmoadg.zynmafqrjb(), null);
    }
}
