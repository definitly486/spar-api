package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final f0 f6881iobyxmoadg = new f0();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final AtomicReference f6883zoijcleaow = new AtomicReference(e0.f6865iobyxmoadg.ppxfxbqfkf());

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final int f6882ppxfxbqfkf = 8;

    public static final class iobyxmoadg implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ pj.auzgnhcxok f6884zdlpuopuiu;

        iobyxmoadg(pj.auzgnhcxok auzgnhcxokVar) {
            this.f6884zdlpuopuiu = auzgnhcxokVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            pj.auzgnhcxok.iobyxmoadg.iobyxmoadg(this.f6884zdlpuopuiu, null, 1, null);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ View f6885jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n f6886yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f6887zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(androidx.compose.runtime.n nVar, View view, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f6886yggfygwlhe = nVar;
            this.f6885jyumaefscl = view;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f6886yggfygwlhe, this.f6885jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f6887zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    androidx.compose.runtime.n nVar = this.f6886yggfygwlhe;
                    this.f6887zdlpuopuiu = 1;
                    if (nVar.lrnfpwlwnk(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                if (g0.gxszxtbevo(this.f6885jyumaefscl) == this.f6886yggfygwlhe) {
                    g0.dxjokdxxww(this.f6885jyumaefscl, null);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                if (g0.gxszxtbevo(this.f6885jyumaefscl) == this.f6886yggfygwlhe) {
                    g0.dxjokdxxww(this.f6885jyumaefscl, null);
                }
                throw th2;
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private f0() {
    }

    public final androidx.compose.runtime.n iobyxmoadg(View view) {
        androidx.compose.runtime.n nVarIobyxmoadg = ((e0) f6883zoijcleaow.get()).iobyxmoadg(view);
        g0.dxjokdxxww(view, nVarIobyxmoadg);
        view.addOnAttachStateChangeListener(new iobyxmoadg(pj.gtknphoqwx.wkgbmnqykc(pj.weqkydbzbr.f76789zdlpuopuiu, qj.eablkybsjg.zoijcleaow(view.getHandler(), "windowRecomposer cleanup").xrmfcynszj(), null, new zoijcleaow(nVarIobyxmoadg, view, null), 2, null)));
        return nVarIobyxmoadg;
    }
}
