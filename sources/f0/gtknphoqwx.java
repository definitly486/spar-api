package f0;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.iwxlajgraz;
import g0.iwizpuwonk;
import gg.wwaezpbzkn;
import h.yzdjzghtvl;
import java.util.function.Consumer;
import kotlin.jvm.internal.jyumaefscl;
import pj.dsvhmnatus;
import w0.agtfadlqog;
import x.vdvldrhtss;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx implements f0.ppxfxbqfkf.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iwxlajgraz f32498iobyxmoadg = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.iobyxmoadg implements tg.draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj, ipoelvxyzq.ppxfxbqfkf.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((draadjrbmk) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(draadjrbmk draadjrbmkVar) {
            ((ipoelvxyzq.ppxfxbqfkf) this.f60022zdlpuopuiu).zoijcleaow(draadjrbmkVar);
        }
    }

    static final class ppxfxbqfkf extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f32499zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Comparable invoke(draadjrbmk draadjrbmkVar) {
            return Integer.valueOf(draadjrbmkVar.wkgbmnqykc().eablkybsjg());
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f32500zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Comparable invoke(draadjrbmk draadjrbmkVar) {
            return Integer.valueOf(draadjrbmkVar.zoijcleaow());
        }
    }

    private final void eablkybsjg(boolean z13) {
        this.f32498iobyxmoadg.setValue(Boolean.valueOf(z13));
    }

    @Override // f0.ppxfxbqfkf.iobyxmoadg
    public void iobyxmoadg() {
        eablkybsjg(true);
    }

    public final boolean ppxfxbqfkf() {
        return ((Boolean) this.f32498iobyxmoadg.getValue()).booleanValue();
    }

    public final void wkgbmnqykc(View view, iwizpuwonk iwizpuwonkVar, lg.btonecajqb btonecajqbVar, Consumer consumer) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new draadjrbmk[16], 0);
        wflxmlrfwp.eablkybsjg(iwizpuwonkVar.wkgbmnqykc(), 0, new iobyxmoadg(ppxfxbqfkfVar), 2, null);
        ppxfxbqfkfVar.cqumvgiudr(kg.iobyxmoadg.zoijcleaow(zoijcleaow.f32500zdlpuopuiu, ppxfxbqfkf.f32499zdlpuopuiu));
        draadjrbmk draadjrbmkVar = (draadjrbmk) (ppxfxbqfkfVar.draadjrbmk() != 0 ? ppxfxbqfkfVar.f49169zdlpuopuiu[ppxfxbqfkfVar.draadjrbmk() - 1] : null);
        if (draadjrbmkVar == null) {
            return;
        }
        f0.ppxfxbqfkf ppxfxbqfkfVar2 = new f0.ppxfxbqfkf(draadjrbmkVar.ppxfxbqfkf(), draadjrbmkVar.wkgbmnqykc(), dsvhmnatus.iobyxmoadg(btonecajqbVar), this, view);
        g.lqeggnwhkg lqeggnwhkgVarZoijcleaow = vdvldrhtss.zoijcleaow(draadjrbmkVar.iobyxmoadg());
        long jBtonecajqb = draadjrbmkVar.wkgbmnqykc().btonecajqb();
        ScrollCaptureTarget scrollCaptureTargetIobyxmoadg = btonecajqb.iobyxmoadg(view, yzdjzghtvl.zoijcleaow(w0.vdvldrhtss.zoijcleaow(lqeggnwhkgVarZoijcleaow)), new Point(agtfadlqog.dxjokdxxww(jBtonecajqb), agtfadlqog.btonecajqb(jBtonecajqb)), nufgyqmvbu.iobyxmoadg(ppxfxbqfkfVar2));
        scrollCaptureTargetIobyxmoadg.setScrollBounds(yzdjzghtvl.zoijcleaow(draadjrbmkVar.wkgbmnqykc()));
        consumer.accept(scrollCaptureTargetIobyxmoadg);
    }

    @Override // f0.ppxfxbqfkf.iobyxmoadg
    public void zoijcleaow() {
        eablkybsjg(false);
    }
}
