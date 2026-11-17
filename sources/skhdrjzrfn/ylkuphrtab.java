package skhdrjzrfn;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final androidx.compose.runtime.a f107666iobyxmoadg = androidx.compose.runtime.lmojexxdyd.btonecajqb(new tg.iobyxmoadg() { // from class: skhdrjzrfn.lmojexxdyd
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return ylkuphrtab.ppxfxbqfkf();
        }
    });

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static tg.oxmwwwfdhm f107667zoijcleaow = new tg.oxmwwwfdhm() { // from class: skhdrjzrfn.wwaezpbzkn
        @Override // tg.oxmwwwfdhm
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return ylkuphrtab.wkgbmnqykc((lg.btonecajqb) obj, (Context) obj2, (hcddaimhww) obj3, (r0.eablkybsjg) obj4);
        }
    };

    public static final void gxszxtbevo(weqkydbzbr.iobyxmoadg iobyxmoadgVar, Context context, boolean z13, CharSequence charSequence, j0.l lVar, oxmwwwfdhm oxmwwwfdhmVar, tg.draadjrbmk draadjrbmkVar) {
        if (Build.VERSION.SDK_INT >= 28 && charSequence != null && lVar != null && oxmwwwfdhmVar != null && (oxmwwwfdhmVar instanceof cqumvgiudr)) {
            ((cqumvgiudr) oxmwwwfdhmVar).gtknphoqwx(iobyxmoadgVar, charSequence, lVar.oxmwwwfdhm(), draadjrbmkVar);
            iyctptxqzt.eablkybsjg.zoijcleaow(iobyxmoadgVar, context, z13, charSequence, lVar.oxmwwwfdhm());
            return;
        }
        draadjrbmkVar.invoke(iobyxmoadgVar);
        if (charSequence == null || lVar == null) {
            return;
        }
        iyctptxqzt.eablkybsjg.zoijcleaow(iobyxmoadgVar, context, z13, charSequence, lVar.oxmwwwfdhm());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lqeggnwhkg(lrnfpwlwnk lrnfpwlwnkVar, CharSequence charSequence, long j13) {
        return j0.l.lqeggnwhkg(j13, lrnfpwlwnkVar.iobyxmoadg()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(charSequence, lrnfpwlwnkVar.zoijcleaow());
    }

    public static final oxmwwwfdhm nufgyqmvbu(hcddaimhww hcddaimhwwVar, r0.eablkybsjg eablkybsjgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        draadjrbmkVar.sopmlzcsov(430530635);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(430530635, i13, -1, "androidx.compose.foundation.text.selection.rememberPlatformSelectionBehaviors (PlatformSelectionBehaviors.android.kt:94)");
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar.stevsuqkhv();
            return null;
        }
        Context context = (Context) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
        lg.btonecajqb btonecajqbVar = (lg.btonecajqb) draadjrbmkVar.ojitshcjhn(f107666iobyxmoadg);
        boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(btonecajqbVar) | draadjrbmkVar.ulzqkzuiru(context) | ((((i13 & 14) ^ 6) > 4 && draadjrbmkVar.ppxfxbqfkf(hcddaimhwwVar.ordinal())) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && draadjrbmkVar.ulzqkzuiru(eablkybsjgVar)) || (i13 & 48) == 32);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = (oxmwwwfdhm) f107667zoijcleaow.invoke(btonecajqbVar, context, hcddaimhwwVar, eablkybsjgVar);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) objYadqdtsiqt;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return oxmwwwfdhmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lg.btonecajqb ppxfxbqfkf() {
        return pj.ikoacuggdj.zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cqumvgiudr wkgbmnqykc(lg.btonecajqb btonecajqbVar, Context context, hcddaimhww hcddaimhwwVar, r0.eablkybsjg eablkybsjgVar) {
        return new cqumvgiudr(btonecajqbVar, context, hcddaimhwwVar, eablkybsjgVar);
    }
}
