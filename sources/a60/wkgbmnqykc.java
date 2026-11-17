package a60;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.ntlheqmsrt;
import androidx.compose.runtime.ulzqkzuiru;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.zdlpuopuiu;
import v1.jhduphickx;
import v1.skhdrjzrfn;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg implements ntlheqmsrt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f913iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f914zoijcleaow;

        public iobyxmoadg(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.f913iobyxmoadg = viewTreeObserver;
            this.f914zoijcleaow = onGlobalLayoutListener;
        }

        @Override // androidx.compose.runtime.ntlheqmsrt
        public void iobyxmoadg() {
            if (this.f913iobyxmoadg.isAlive()) {
                this.f913iobyxmoadg.removeOnGlobalLayoutListener(this.f914zoijcleaow);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(iwxlajgraz iwxlajgrazVar, View view) {
        skhdrjzrfn skhdrjzrfnVarLmojexxdyd = jhduphickx.lmojexxdyd(view);
        iwxlajgrazVar.setValue(Boolean.valueOf(skhdrjzrfnVarLmojexxdyd != null ? skhdrjzrfnVarLmojexxdyd.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.wkgbmnqykc()) : true));
    }

    public static final i1 ppxfxbqfkf(draadjrbmk draadjrbmkVar, int i13) {
        draadjrbmkVar.sopmlzcsov(-300183752);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-300183752, i13, -1, "ru.myspar.core.ui.compose.utils.keyboardAsState (KeyboardAsState.kt:13)");
        }
        draadjrbmkVar.sopmlzcsov(974325613);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        draadjrbmk.iobyxmoadg iobyxmoadgVar = draadjrbmk.f5569iobyxmoadg;
        if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        final iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
        draadjrbmkVar.stevsuqkhv();
        final View view = (View) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
        final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        draadjrbmkVar.sopmlzcsov(974331061);
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(view) | draadjrbmkVar.lmojexxdyd(viewTreeObserver);
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: a60.zoijcleaow
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return wkgbmnqykc.wkgbmnqykc(viewTreeObserver, iwxlajgrazVar, view, (ulzqkzuiru) obj);
                }
            };
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        draadjrbmkVar.stevsuqkhv();
        jlmebxxoox.zoijcleaow(viewTreeObserver, (tg.draadjrbmk) objYadqdtsiqt2, draadjrbmkVar, 0);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return iwxlajgrazVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ntlheqmsrt wkgbmnqykc(ViewTreeObserver viewTreeObserver, final iwxlajgraz iwxlajgrazVar, final View view, ulzqkzuiru DisposableEffect) {
        zdlpuopuiu.btonecajqb(DisposableEffect, "$this$DisposableEffect");
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: a60.ppxfxbqfkf
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                wkgbmnqykc.eablkybsjg(iwxlajgrazVar, view);
            }
        };
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        return new iobyxmoadg(viewTreeObserver, onGlobalLayoutListener);
    }
}
