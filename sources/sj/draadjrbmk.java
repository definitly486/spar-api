package sj;

import pj.auzgnhcxok;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class draadjrbmk {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f106837yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f106838zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f106837yggfygwlhe = lqeggnwhkgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f106837yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f106838zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                lqeggnwhkg lqeggnwhkgVar = this.f106837yggfygwlhe;
                this.f106838zdlpuopuiu = 1;
                if (dxjokdxxww.dxjokdxxww(lqeggnwhkgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final Object iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = lqeggnwhkgVar.collect(tj.oxmwwwfdhm.f110699zdlpuopuiu, gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final Object ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar, lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww.esjtqupxsv(nufgyqmvbuVar);
        Object objCollect = lqeggnwhkgVar.collect(nufgyqmvbuVar, gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final auzgnhcxok wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar, pj.cllcsxoeiz cllcsxoeizVar) {
        return pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new iobyxmoadg(lqeggnwhkgVar, null), 3, null);
    }

    public static final Object zoijcleaow(lqeggnwhkg lqeggnwhkgVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objDxjokdxxww = dxjokdxxww.dxjokdxxww(wflxmlrfwp.zoijcleaow(dxjokdxxww.cllcsxoeiz(lqeggnwhkgVar, rgvfuqvkyqVar), 0, null, 2, null), gxszxtbevoVar);
        return objDxjokdxxww == mg.zoijcleaow.gxszxtbevo() ? objDxjokdxxww : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
