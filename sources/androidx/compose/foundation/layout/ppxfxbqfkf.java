package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.ixidwrxhsl;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f4888yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ float f4889zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(float f13, boolean z13) {
            super(1);
            this.f4889zdlpuopuiu = f13;
            this.f4888yggfygwlhe = z13;
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

    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, float f13, boolean z13) {
        return wkgbmnqykcVar.eablkybsjg(new AspectRatioElement(f13, z13, InspectableValueKt.isDebugInspectorInfoEnabled() ? new iobyxmoadg(f13, z13) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final boolean ppxfxbqfkf(long j13, int i13, int i14) {
        int iAgtfadlqog = w0.zoijcleaow.agtfadlqog(j13);
        if (i13 <= w0.zoijcleaow.draadjrbmk(j13) && iAgtfadlqog <= i13) {
            int iWflxmlrfwp = w0.zoijcleaow.wflxmlrfwp(j13);
            if (i14 <= w0.zoijcleaow.gtknphoqwx(j13) && iWflxmlrfwp <= i14) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, float f13, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return iobyxmoadg(wkgbmnqykcVar, f13, z13);
    }
}
