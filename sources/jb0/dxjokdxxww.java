package jb0;

import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import ru.myspar.core.domain.models.payload.UpdateApplicationPayload;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww extends vx.eablkybsjg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final j30.zoijcleaow f51027lqeggnwhkg;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f51029zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return dxjokdxxww.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f51029zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                j30.zoijcleaow zoijcleaowVar = dxjokdxxww.this.f51027lqeggnwhkg;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f51029zdlpuopuiu = 1;
                if (zoijcleaowVar.zoijcleaow(wwaezpbzknVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            dxjokdxxww.this.yggfygwlhe(nufgyqmvbu.iobyxmoadg.f51043iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(j30.zoijcleaow ignoreUpdateUseCase, UpdateApplicationPayload payload) {
        Object value;
        super(new lqeggnwhkg(null, null, false, 7, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ignoreUpdateUseCase, "ignoreUpdateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        this.f51027lqeggnwhkg = ignoreUpdateUseCase;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ((lqeggnwhkg) value).iobyxmoadg(payload.getTitleText(), payload.getMessageText(), payload.getForceUpdate())));
    }

    private final void esjtqupxsv() {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(h40.dxjokdxxww.f39382iobyxmoadg.kcexrzcfyt());
    }

    private final void lereixgezr() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new iobyxmoadg(null), 3, null);
    }

    public final void pmvmpeiblj(ru.myspar.legacy.presentation.dialogs.update.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof ru.myspar.legacy.presentation.dialogs.update.iobyxmoadg.zoijcleaow) {
            lereixgezr();
        } else {
            if (!(event instanceof ru.myspar.legacy.presentation.dialogs.update.iobyxmoadg.C2037iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            esjtqupxsv();
        }
    }
}
