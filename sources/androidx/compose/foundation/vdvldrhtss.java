package androidx.compose.foundation;

import androidx.compose.runtime.a;
import androidx.compose.runtime.lmojexxdyd;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.ixidwrxhsl;
import gg.wwaezpbzkn;
import ikoacuggdj.stevsuqkhv;
import ikoacuggdj.tzroggbefp;
import ikoacuggdj.wypolnanlu;

/* JADX INFO: loaded from: classes.dex */
public abstract class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final a f5436iobyxmoadg = lmojexxdyd.nufgyqmvbu(null, new tg.iobyxmoadg() { // from class: ikoacuggdj.kegysxyocb
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return androidx.compose.foundation.vdvldrhtss.zoijcleaow();
        }
    }, 1, null);

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wypolnanlu f5437yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe.btonecajqb f5438zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(metgxyhuhe.btonecajqb btonecajqbVar, wypolnanlu wypolnanluVar) {
            super(1);
            this.f5438zdlpuopuiu = btonecajqbVar;
            this.f5437yggfygwlhe = wypolnanluVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
            iobyxmoadg(null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ixidwrxhsl ixidwrxhslVar) {
            throw null;
        }
    }

    static final class zoijcleaow implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe.btonecajqb f5439yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ wypolnanlu f5440zdlpuopuiu;

        zoijcleaow(wypolnanlu wypolnanluVar, metgxyhuhe.btonecajqb btonecajqbVar) {
            this.f5440zdlpuopuiu = wypolnanluVar;
            this.f5439yggfygwlhe = btonecajqbVar;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg((androidx.compose.ui.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
        }

        public final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            draadjrbmkVar.sopmlzcsov(-353972293);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-353972293, i13, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:176)");
            }
            stevsuqkhv stevsuqkhvVarIobyxmoadg = this.f5440zdlpuopuiu.iobyxmoadg(this.f5439yggfygwlhe, draadjrbmkVar, 0);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(stevsuqkhvVarIobyxmoadg);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new oxmwwwfdhm(stevsuqkhvVarIobyxmoadg);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) objYadqdtsiqt;
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar.stevsuqkhv();
            return oxmwwwfdhmVar;
        }
    }

    public static final a ppxfxbqfkf() {
        return f5436iobyxmoadg;
    }

    public static final androidx.compose.ui.wkgbmnqykc wkgbmnqykc(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, metgxyhuhe.btonecajqb btonecajqbVar, wypolnanlu wypolnanluVar) {
        if (wypolnanluVar == null) {
            return wkgbmnqykcVar;
        }
        if (wypolnanluVar instanceof tzroggbefp) {
            return wkgbmnqykcVar.eablkybsjg(new IndicationModifierElement(btonecajqbVar, (tzroggbefp) wypolnanluVar));
        }
        return androidx.compose.ui.ppxfxbqfkf.zoijcleaow(wkgbmnqykcVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new iobyxmoadg(btonecajqbVar, wypolnanluVar) : InspectableValueKt.getNoInspectorInfo(), new zoijcleaow(wypolnanluVar, btonecajqbVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wypolnanlu zoijcleaow() {
        return wflxmlrfwp.f5441iobyxmoadg;
    }
}
