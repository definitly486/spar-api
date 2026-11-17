package f7;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.jyumaefscl;
import pj.agtfadlqog;
import pj.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public interface draadjrbmk extends btonecajqb {

    static final class iobyxmoadg extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f33023jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f33024yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(ViewTreeObserver viewTreeObserver, zoijcleaow zoijcleaowVar) {
            super(1);
            this.f33024yggfygwlhe = viewTreeObserver;
            this.f33023jyumaefscl = zoijcleaowVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            draadjrbmk.this.ppxfxbqfkf(this.f33024yggfygwlhe, this.f33023jyumaefscl);
        }
    }

    public static final class zoijcleaow implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f33026iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f33027jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private boolean f33029zdlpuopuiu;

        zoijcleaow(ViewTreeObserver viewTreeObserver, agtfadlqog agtfadlqogVar) {
            this.f33027jyumaefscl = viewTreeObserver;
            this.f33026iwizpuwonk = agtfadlqogVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            dxjokdxxww size = draadjrbmk.this.getSize();
            if (size != null) {
                draadjrbmk.this.ppxfxbqfkf(this.f33027jyumaefscl, this);
                if (!this.f33029zdlpuopuiu) {
                    this.f33029zdlpuopuiu = true;
                    this.f33026iwizpuwonk.resumeWith(kcexrzcfyt.wkgbmnqykc(size));
                }
            }
            return true;
        }
    }

    private default ppxfxbqfkf getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return zoijcleaow(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), wkgbmnqykc() ? getView().getPaddingTop() + getView().getPaddingBottom() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default dxjokdxxww getSize() {
        ppxfxbqfkf height;
        ppxfxbqfkf width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new dxjokdxxww(width, height);
    }

    private default ppxfxbqfkf getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return zoijcleaow(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), wkgbmnqykc() ? getView().getPaddingLeft() + getView().getPaddingRight() : 0);
    }

    static /* synthetic */ Object lqeggnwhkg(draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww size = draadjrbmkVar.getSize();
        if (size != null) {
            return size;
        }
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        ViewTreeObserver viewTreeObserver = draadjrbmkVar.getView().getViewTreeObserver();
        zoijcleaow zoijcleaowVar = draadjrbmkVar.new zoijcleaow(viewTreeObserver, rgvfuqvkyqVar);
        viewTreeObserver.addOnPreDrawListener(zoijcleaowVar);
        rgvfuqvkyqVar.stevsuqkhv(draadjrbmkVar.new iobyxmoadg(viewTreeObserver, zoijcleaowVar));
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    default void ppxfxbqfkf(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    private default ppxfxbqfkf zoijcleaow(int i13, int i14, int i15) {
        if (i13 == -2) {
            return ppxfxbqfkf.zoijcleaow.f33045iobyxmoadg;
        }
        int i16 = i13 - i15;
        if (i16 > 0) {
            return f7.iobyxmoadg.iobyxmoadg(i16);
        }
        int i17 = i14 - i15;
        if (i17 > 0) {
            return f7.iobyxmoadg.iobyxmoadg(i17);
        }
        return null;
    }

    View getView();

    @Override // f7.btonecajqb
    default Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        return lqeggnwhkg(this, gxszxtbevoVar);
    }

    boolean wkgbmnqykc();
}
