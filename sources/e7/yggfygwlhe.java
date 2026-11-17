package e7;

import android.view.View;
import gg.wwaezpbzkn;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.ikoacuggdj;
import pj.ntlheqmsrt;
import pj.weqkydbzbr;

/* JADX INFO: loaded from: classes2.dex */
public final class yggfygwlhe implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f30786cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private zdlpuopuiu f30787iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private auzgnhcxok f30788jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private kcexrzcfyt f30789yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final View f30790zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f30792zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f30792zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            yggfygwlhe.this.ppxfxbqfkf(null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public yggfygwlhe(View view) {
        this.f30790zdlpuopuiu = view;
    }

    public final synchronized void iobyxmoadg() {
        try {
            auzgnhcxok auzgnhcxokVar = this.f30788jyumaefscl;
            if (auzgnhcxokVar != null) {
                auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
            }
            this.f30788jyumaefscl = pj.gtknphoqwx.wkgbmnqykc(weqkydbzbr.f76789zdlpuopuiu, ikoacuggdj.ppxfxbqfkf().xrmfcynszj(), null, new iobyxmoadg(null), 2, null);
            this.f30789yggfygwlhe = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        zdlpuopuiu zdlpuopuiuVar = this.f30787iwizpuwonk;
        if (zdlpuopuiuVar == null) {
            return;
        }
        this.f30786cqumvgiudr = true;
        zdlpuopuiuVar.zoijcleaow();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        zdlpuopuiu zdlpuopuiuVar = this.f30787iwizpuwonk;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.iobyxmoadg();
        }
    }

    public final void ppxfxbqfkf(zdlpuopuiu zdlpuopuiuVar) {
        zdlpuopuiu zdlpuopuiuVar2 = this.f30787iwizpuwonk;
        if (zdlpuopuiuVar2 != null) {
            zdlpuopuiuVar2.iobyxmoadg();
        }
        this.f30787iwizpuwonk = zdlpuopuiuVar;
    }

    public final synchronized kcexrzcfyt zoijcleaow(ntlheqmsrt ntlheqmsrtVar) {
        kcexrzcfyt kcexrzcfytVar = this.f30789yggfygwlhe;
        if (kcexrzcfytVar != null && i7.gtknphoqwx.oxmwwwfdhm() && this.f30786cqumvgiudr) {
            this.f30786cqumvgiudr = false;
            kcexrzcfytVar.iobyxmoadg(ntlheqmsrtVar);
            return kcexrzcfytVar;
        }
        auzgnhcxok auzgnhcxokVar = this.f30788jyumaefscl;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
        this.f30788jyumaefscl = null;
        kcexrzcfyt kcexrzcfytVar2 = new kcexrzcfyt(this.f30790zdlpuopuiu, ntlheqmsrtVar);
        this.f30789yggfygwlhe = kcexrzcfytVar2;
        return kcexrzcfytVar2;
    }
}
