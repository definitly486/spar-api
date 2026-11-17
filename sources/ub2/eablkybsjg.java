package ub2;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.jyumaefscl;
import lg.gxszxtbevo;
import rj.oxmwwwfdhm;
import rj.zdlpuopuiu;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import tg.rgvfuqvkyq;
import zb2.Event;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private iobyxmoadg f113234eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tb2.iobyxmoadg f113235iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f113236ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Object f113237wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cc2.iobyxmoadg f113238zoijcleaow;

    private interface iobyxmoadg {
        void iobyxmoadg(List list);
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f113240yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f113241zdlpuopuiu;

        static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ eablkybsjg f113242zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(eablkybsjg eablkybsjgVar) {
                super(0);
                this.f113242zdlpuopuiu = eablkybsjgVar;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                this.f113242zdlpuopuiu.nufgyqmvbu(null);
            }
        }

        /* JADX INFO: renamed from: ub2.eablkybsjg$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C2806zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f113243iobyxmoadg;

            C2806zoijcleaow(zdlpuopuiu zdlpuopuiuVar) {
                this.f113243iobyxmoadg = zdlpuopuiuVar;
            }

            @Override // ub2.eablkybsjg.iobyxmoadg
            public void iobyxmoadg(List events) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(events, "events");
                this.f113243iobyxmoadg.eablkybsjg(events);
            }
        }

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = eablkybsjg.this.new zoijcleaow(gxszxtbevoVar);
            zoijcleaowVar.f113240yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f113241zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) this.f113240yggfygwlhe;
                eablkybsjg.this.nufgyqmvbu(new C2806zoijcleaow(zdlpuopuiuVar));
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(eablkybsjg.this);
                this.f113241zdlpuopuiu = 1;
                if (oxmwwwfdhm.iobyxmoadg(zdlpuopuiuVar, iobyxmoadgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zdlpuopuiu zdlpuopuiuVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public eablkybsjg(tb2.iobyxmoadg settings, cc2.iobyxmoadg timer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(settings, "settings");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(timer, "timer");
        this.f113235iobyxmoadg = settings;
        this.f113238zoijcleaow = timer;
        this.f113236ppxfxbqfkf = new ArrayList();
        this.f113237wkgbmnqykc = new Object();
        dxjokdxxww();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(eablkybsjg this$0) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        this$0.lqeggnwhkg();
    }

    private final void dxjokdxxww() {
        this.f113238zoijcleaow.iobyxmoadg(1, this.f113235iobyxmoadg.wkgbmnqykc(), new Runnable() { // from class: ub2.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() {
                eablkybsjg.btonecajqb(this.f113244zdlpuopuiu);
            }
        });
    }

    private final void eablkybsjg() {
        if (this.f113236ppxfxbqfkf.size() >= this.f113235iobyxmoadg.ppxfxbqfkf()) {
            lqeggnwhkg();
        }
    }

    private final List gxszxtbevo() {
        List listM = hg.jyumaefscl.m(this.f113236ppxfxbqfkf);
        this.f113236ppxfxbqfkf.clear();
        return listM;
    }

    private final void lqeggnwhkg() {
        iobyxmoadg iobyxmoadgVar;
        synchronized (this.f113237wkgbmnqykc) {
            try {
                if (!this.f113236ppxfxbqfkf.isEmpty() && (iobyxmoadgVar = this.f113234eablkybsjg) != null) {
                    iobyxmoadgVar.iobyxmoadg(gxszxtbevo());
                }
                dxjokdxxww();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nufgyqmvbu(iobyxmoadg iobyxmoadgVar) {
        this.f113234eablkybsjg = iobyxmoadgVar;
    }

    @Override // ub2.ppxfxbqfkf
    public void iobyxmoadg(Event event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        synchronized (this.f113237wkgbmnqykc) {
            try {
                this.f113236ppxfxbqfkf.add(event);
                if (event.iobyxmoadg()) {
                    lqeggnwhkg();
                } else {
                    eablkybsjg();
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ub2.ppxfxbqfkf
    public lqeggnwhkg zoijcleaow() {
        return dxjokdxxww.eablkybsjg(new zoijcleaow(null));
    }
}
