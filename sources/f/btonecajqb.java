package f;

import android.view.KeyEvent;
import androidx.collection.jpowsppfya;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.internal.jyumaefscl;

/* JADX INFO: loaded from: classes.dex */
public interface btonecajqb extends nufgyqmvbu {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f32471zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static /* synthetic */ boolean lqeggnwhkg(btonecajqb btonecajqbVar, KeyEvent keyEvent, tg.iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = iobyxmoadg.f32471zdlpuopuiu;
        }
        return btonecajqbVar.yggfygwlhe(keyEvent, iobyxmoadgVar);
    }

    Boolean btonecajqb(int i13, g.lqeggnwhkg lqeggnwhkgVar, tg.draadjrbmk draadjrbmkVar);

    void draadjrbmk();

    void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar);

    g.lqeggnwhkg getFocusRect();

    void gtknphoqwx(FocusTargetNode focusTargetNode);

    boolean gxszxtbevo(KeyEvent keyEvent);

    boolean iobyxmoadg(androidx.compose.ui.focus.wkgbmnqykc wkgbmnqykcVar, g.lqeggnwhkg lqeggnwhkgVar);

    void kcexrzcfyt();

    FocusTargetNode nufgyqmvbu();

    boolean ojitshcjhn();

    void oxmwwwfdhm(FocusTargetNode focusTargetNode);

    boolean ppxfxbqfkf(q.ppxfxbqfkf ppxfxbqfkfVar, tg.iobyxmoadg iobyxmoadgVar);

    boolean rgvfuqvkyq(boolean z13, boolean z14, boolean z15, int i13);

    ojitshcjhn vdvldrhtss();

    androidx.compose.ui.wkgbmnqykc wflxmlrfwp();

    boolean wkgbmnqykc(v.zoijcleaow zoijcleaowVar, tg.iobyxmoadg iobyxmoadgVar);

    boolean yggfygwlhe(KeyEvent keyEvent, tg.iobyxmoadg iobyxmoadgVar);

    jpowsppfya zdlpuopuiu();

    void zoijcleaow();
}
