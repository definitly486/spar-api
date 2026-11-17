package f0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.compose.runtime.weqkydbzbr;
import g0.esjtqupxsv;
import g0.zdlpuopuiu;
import gg.wwaezpbzkn;
import h.yzdjzghtvl;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.jyumaefscl;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.ipoelvxyzq;
import w0.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final cllcsxoeiz f32508eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final lqeggnwhkg f32509gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu f32510iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f32511lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f32512ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final View f32513wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rgvfuqvkyq f32514zoijcleaow;

    static final class eablkybsjg extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final eablkybsjg f32515zdlpuopuiu = new eablkybsjg();

        eablkybsjg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg(((Number) obj).longValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(long j13) {
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ float f32517jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f32518yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        boolean f32519zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = ppxfxbqfkf.this.new gxszxtbevo(gxszxtbevoVar);
            gxszxtbevoVar2.f32517jyumaefscl = ((Number) obj).floatValue();
            return gxszxtbevoVar2;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ojitshcjhn(((Number) obj).floatValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            boolean z13;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f32518yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                float f13 = this.f32517jyumaefscl;
                tg.rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = wflxmlrfwp.ppxfxbqfkf(ppxfxbqfkf.this.f32510iobyxmoadg);
                if (rgvfuqvkyqVarPpxfxbqfkf == null) {
                    w.iobyxmoadg.ppxfxbqfkf("Required value was null.");
                    throw new KotlinNothingValueException();
                }
                boolean zZoijcleaow = ((g0.btonecajqb) ppxfxbqfkf.this.f32510iobyxmoadg.esjtqupxsv().gxszxtbevo(esjtqupxsv.f35662iobyxmoadg.dsvhmnatus())).zoijcleaow();
                if (zZoijcleaow) {
                    f13 = -f13;
                }
                g.eablkybsjg eablkybsjgVarWkgbmnqykc = g.eablkybsjg.wkgbmnqykc(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L)));
                this.f32519zdlpuopuiu = zZoijcleaow;
                this.f32518yggfygwlhe = 1;
                obj = rgvfuqvkyqVarPpxfxbqfkf.invoke(eablkybsjgVarWkgbmnqykc, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                z13 = zZoijcleaow;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z13 = this.f32519zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            long jZdlpuopuiu = ((g.eablkybsjg) obj).zdlpuopuiu();
            return kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(z13 ? -Float.intBitsToFloat((int) (jZdlpuopuiu & 4294967295L)) : Float.intBitsToFloat((int) (jZdlpuopuiu & 4294967295L)));
        }

        public final Object ojitshcjhn(float f13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(Float.valueOf(f13), gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public interface iobyxmoadg {
        void iobyxmoadg();

        void zoijcleaow();
    }

    /* JADX INFO: renamed from: f0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C0704ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ Consumer f32520cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ Rect f32521iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ScrollCaptureSession f32522jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f32524zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0704ppxfxbqfkf(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f32522jyumaefscl = scrollCaptureSession;
            this.f32521iwizpuwonk = rect;
            this.f32520cqumvgiudr = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new C0704ppxfxbqfkf(this.f32522jyumaefscl, this.f32521iwizpuwonk, this.f32520cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f32524zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                ScrollCaptureSession scrollCaptureSession = this.f32522jyumaefscl;
                rgvfuqvkyq rgvfuqvkyqVarWkgbmnqykc = yzdjzghtvl.wkgbmnqykc(this.f32521iwizpuwonk);
                this.f32524zdlpuopuiu = 1;
                obj = ppxfxbqfkfVar.eablkybsjg(scrollCaptureSession, rgvfuqvkyqVarWkgbmnqykc, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            this.f32520cqumvgiudr.accept(yzdjzghtvl.zoijcleaow((rgvfuqvkyq) obj));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C0704ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f32525cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f32527iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f32528jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f32529lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f32530yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f32531zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f32525cqumvgiudr = obj;
            this.f32529lereixgezr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.eablkybsjg(null, null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Runnable f32532jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f32534zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(Runnable runnable, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f32532jyumaefscl = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new zoijcleaow(this.f32532jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f32534zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                lqeggnwhkg lqeggnwhkgVar = ppxfxbqfkf.this.f32509gxszxtbevo;
                this.f32534zdlpuopuiu = 1;
                if (lqeggnwhkgVar.lqeggnwhkg(0.0f, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            ppxfxbqfkf.this.f32512ppxfxbqfkf.zoijcleaow();
            this.f32532jyumaefscl.run();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ppxfxbqfkf(zdlpuopuiu zdlpuopuiuVar, rgvfuqvkyq rgvfuqvkyqVar, cllcsxoeiz cllcsxoeizVar, iobyxmoadg iobyxmoadgVar, View view) {
        this.f32510iobyxmoadg = zdlpuopuiuVar;
        this.f32514zoijcleaow = rgvfuqvkyqVar;
        this.f32512ppxfxbqfkf = iobyxmoadgVar;
        this.f32513wkgbmnqykc = view;
        this.f32508eablkybsjg = dsvhmnatus.dxjokdxxww(cllcsxoeizVar, f0.gxszxtbevo.f32501zdlpuopuiu);
        this.f32509gxszxtbevo = new lqeggnwhkg(rgvfuqvkyqVar.eablkybsjg(), new gxszxtbevo(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(ScrollCaptureSession scrollCaptureSession, rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        int iDxjokdxxww;
        int iWkgbmnqykc;
        ScrollCaptureSession scrollCaptureSessionIobyxmoadg;
        rgvfuqvkyq rgvfuqvkyqVar2;
        int i13;
        int i14;
        int iPpxfxbqfkf;
        int iPpxfxbqfkf2;
        rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf;
        Canvas canvasLockHardwareCanvas;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i15 = wkgbmnqykcVar.f32529lereixgezr;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f32529lereixgezr = i15 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f32525cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i16 = wkgbmnqykcVar.f32529lereixgezr;
        if (i16 != 0) {
            if (i16 == 1) {
                int i17 = wkgbmnqykcVar.f32527iwizpuwonk;
                int i18 = wkgbmnqykcVar.f32528jyumaefscl;
                rgvfuqvkyq rgvfuqvkyqVar3 = (rgvfuqvkyq) wkgbmnqykcVar.f32530yggfygwlhe;
                ScrollCaptureSession scrollCaptureSessionIobyxmoadg2 = f0.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar.f32531zdlpuopuiu);
                gg.zdlpuopuiu.zoijcleaow(obj);
                iDxjokdxxww = i18;
                rgvfuqvkyqVar = rgvfuqvkyqVar3;
                iWkgbmnqykc = i17;
                scrollCaptureSession = scrollCaptureSessionIobyxmoadg2;
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i14 = wkgbmnqykcVar.f32527iwizpuwonk;
                i13 = wkgbmnqykcVar.f32528jyumaefscl;
                rgvfuqvkyqVar2 = (rgvfuqvkyq) wkgbmnqykcVar.f32530yggfygwlhe;
                scrollCaptureSessionIobyxmoadg = f0.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar.f32531zdlpuopuiu);
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            iPpxfxbqfkf = this.f32509gxszxtbevo.ppxfxbqfkf(i13);
            iPpxfxbqfkf2 = this.f32509gxszxtbevo.ppxfxbqfkf(i14);
            rgvfuqvkyqVarPpxfxbqfkf = rgvfuqvkyq.ppxfxbqfkf(rgvfuqvkyqVar2, 0, iPpxfxbqfkf, 0, iPpxfxbqfkf2, 5, null);
            if (iPpxfxbqfkf == iPpxfxbqfkf2) {
                return rgvfuqvkyq.f118272eablkybsjg.iobyxmoadg();
            }
            canvasLockHardwareCanvas = scrollCaptureSessionIobyxmoadg.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-rgvfuqvkyqVarPpxfxbqfkf.gxszxtbevo(), -rgvfuqvkyqVarPpxfxbqfkf.dxjokdxxww());
                canvasLockHardwareCanvas.translate(-this.f32514zoijcleaow.gxszxtbevo(), -this.f32514zoijcleaow.dxjokdxxww());
                this.f32513wkgbmnqykc.getRootView().draw(canvasLockHardwareCanvas);
                return rgvfuqvkyqVarPpxfxbqfkf.wflxmlrfwp(0, vg.iobyxmoadg.wkgbmnqykc(this.f32509gxszxtbevo.zoijcleaow()));
            } finally {
                scrollCaptureSessionIobyxmoadg.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        iDxjokdxxww = rgvfuqvkyqVar.dxjokdxxww();
        iWkgbmnqykc = rgvfuqvkyqVar.wkgbmnqykc();
        lqeggnwhkg lqeggnwhkgVar = this.f32509gxszxtbevo;
        wkgbmnqykcVar.f32531zdlpuopuiu = scrollCaptureSession;
        wkgbmnqykcVar.f32530yggfygwlhe = rgvfuqvkyqVar;
        wkgbmnqykcVar.f32528jyumaefscl = iDxjokdxxww;
        wkgbmnqykcVar.f32527iwizpuwonk = iWkgbmnqykc;
        wkgbmnqykcVar.f32529lereixgezr = 1;
        if (lqeggnwhkgVar.gxszxtbevo(iDxjokdxxww, iWkgbmnqykc, wkgbmnqykcVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        eablkybsjg eablkybsjgVar = eablkybsjg.f32515zdlpuopuiu;
        wkgbmnqykcVar.f32531zdlpuopuiu = scrollCaptureSession;
        wkgbmnqykcVar.f32530yggfygwlhe = rgvfuqvkyqVar;
        wkgbmnqykcVar.f32528jyumaefscl = iDxjokdxxww;
        wkgbmnqykcVar.f32527iwizpuwonk = iWkgbmnqykc;
        wkgbmnqykcVar.f32529lereixgezr = 2;
        if (weqkydbzbr.ppxfxbqfkf(eablkybsjgVar, wkgbmnqykcVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        scrollCaptureSessionIobyxmoadg = scrollCaptureSession;
        rgvfuqvkyqVar2 = rgvfuqvkyqVar;
        i13 = iDxjokdxxww;
        i14 = iWkgbmnqykc;
        iPpxfxbqfkf = this.f32509gxszxtbevo.ppxfxbqfkf(i13);
        iPpxfxbqfkf2 = this.f32509gxszxtbevo.ppxfxbqfkf(i14);
        rgvfuqvkyqVarPpxfxbqfkf = rgvfuqvkyq.ppxfxbqfkf(rgvfuqvkyqVar2, 0, iPpxfxbqfkf, 0, iPpxfxbqfkf2, 5, null);
        if (iPpxfxbqfkf == iPpxfxbqfkf2) {
            return rgvfuqvkyq.f118272eablkybsjg.iobyxmoadg();
        }
        canvasLockHardwareCanvas = scrollCaptureSessionIobyxmoadg.getSurface().lockHardwareCanvas();
        canvasLockHardwareCanvas.save();
        canvasLockHardwareCanvas.translate(-rgvfuqvkyqVarPpxfxbqfkf.gxszxtbevo(), -rgvfuqvkyqVarPpxfxbqfkf.dxjokdxxww());
        canvasLockHardwareCanvas.translate(-this.f32514zoijcleaow.gxszxtbevo(), -this.f32514zoijcleaow.dxjokdxxww());
        this.f32513wkgbmnqykc.getRootView().draw(canvasLockHardwareCanvas);
        return rgvfuqvkyqVarPpxfxbqfkf.wflxmlrfwp(0, vg.iobyxmoadg.wkgbmnqykc(this.f32509gxszxtbevo.zoijcleaow()));
    }

    public void onScrollCaptureEnd(Runnable runnable) {
        pj.gtknphoqwx.wkgbmnqykc(this.f32508eablkybsjg, ipoelvxyzq.f76723zdlpuopuiu, null, new zoijcleaow(runnable, null), 2, null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        f0.eablkybsjg.ppxfxbqfkf(this.f32508eablkybsjg, cancellationSignal, new C0704ppxfxbqfkf(scrollCaptureSession, rect, consumer, null));
    }

    public void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(yzdjzghtvl.zoijcleaow(this.f32514zoijcleaow));
    }

    public void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f32509gxszxtbevo.wkgbmnqykc();
        this.f32511lqeggnwhkg = 0;
        this.f32512ppxfxbqfkf.iobyxmoadg();
        runnable.run();
    }
}
