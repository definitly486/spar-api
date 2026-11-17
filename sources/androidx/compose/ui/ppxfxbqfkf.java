package androidx.compose.ui;

import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.mbcevpiqjq;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    static final class iobyxmoadg extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f7202zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(wkgbmnqykc.zoijcleaow zoijcleaowVar) {
            return Boolean.valueOf(!(zoijcleaowVar instanceof androidx.compose.ui.zoijcleaow));
        }
    }

    static final class zoijcleaow extends jyumaefscl implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.draadjrbmk f7203zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(androidx.compose.runtime.draadjrbmk draadjrbmkVar) {
            super(2);
            this.f7203zdlpuopuiu = draadjrbmkVar;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final wkgbmnqykc invoke(wkgbmnqykc wkgbmnqykcVar, wkgbmnqykc.zoijcleaow zoijcleaowVar) {
            boolean z13 = zoijcleaowVar instanceof androidx.compose.ui.zoijcleaow;
            wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = zoijcleaowVar;
            if (z13) {
                vdvldrhtss vdvldrhtssVarBtonecajqb = ((androidx.compose.ui.zoijcleaow) zoijcleaowVar).btonecajqb();
                zdlpuopuiu.nufgyqmvbu(vdvldrhtssVarBtonecajqb, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                wkgbmnqykcVarWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc(this.f7203zdlpuopuiu, (wkgbmnqykc) ((vdvldrhtss) mbcevpiqjq.eablkybsjg(vdvldrhtssVarBtonecajqb, 3)).invoke(wkgbmnqykc.f7471iobyxmoadg, this.f7203zdlpuopuiu, 0));
            }
            return wkgbmnqykcVar.eablkybsjg(wkgbmnqykcVarWkgbmnqykc);
        }
    }

    public static final wkgbmnqykc eablkybsjg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, wkgbmnqykc wkgbmnqykcVar) {
        draadjrbmkVar.sopmlzcsov(439770924);
        wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = wkgbmnqykc(draadjrbmkVar, wkgbmnqykcVar);
        draadjrbmkVar.stevsuqkhv();
        return wkgbmnqykcVarWkgbmnqykc;
    }

    public static /* synthetic */ wkgbmnqykc ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, vdvldrhtss vdvldrhtssVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = InspectableValueKt.getNoInspectorInfo();
        }
        return zoijcleaow(wkgbmnqykcVar, draadjrbmkVar, vdvldrhtssVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc wkgbmnqykc(androidx.compose.runtime.draadjrbmk draadjrbmkVar, wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar.zoijcleaow(iobyxmoadg.f7202zdlpuopuiu)) {
            return wkgbmnqykcVar;
        }
        draadjrbmkVar.cdpycssgdh(1219399079);
        wkgbmnqykc wkgbmnqykcVar2 = (wkgbmnqykc) wkgbmnqykcVar.iobyxmoadg(wkgbmnqykc.f7471iobyxmoadg, new zoijcleaow(draadjrbmkVar));
        draadjrbmkVar.ntlheqmsrt();
        return wkgbmnqykcVar2;
    }

    public static final wkgbmnqykc zoijcleaow(wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, vdvldrhtss vdvldrhtssVar) {
        return wkgbmnqykcVar.eablkybsjg(new androidx.compose.ui.zoijcleaow(draadjrbmkVar, vdvldrhtssVar));
    }
}
