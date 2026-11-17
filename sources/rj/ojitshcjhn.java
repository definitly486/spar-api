package rj;

import gg.wwaezpbzkn;
import pj.cllcsxoeiz;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class ojitshcjhn {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ Object f82912iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwizpuwonk f82913jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f82914yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f82915zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(iwizpuwonk iwizpuwonkVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f82913jyumaefscl = iwizpuwonkVar;
            this.f82912iwizpuwonk = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f82913jyumaefscl, this.f82912iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f82914yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f82915zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iwizpuwonk iwizpuwonkVar = this.f82913jyumaefscl;
                    Object obj2 = this.f82912iwizpuwonk;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    this.f82915zdlpuopuiu = 1;
                    if (iwizpuwonkVar.gxszxtbevo(obj2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            return gtknphoqwx.zoijcleaow(gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc) ? gtknphoqwx.f82880zoijcleaow.ppxfxbqfkf(wwaezpbzkn.f37140iobyxmoadg) : gtknphoqwx.f82880zoijcleaow.iobyxmoadg(gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc)));
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final Object iobyxmoadg(iwizpuwonk iwizpuwonkVar, Object obj) {
        Object objEablkybsjg = iwizpuwonkVar.eablkybsjg(obj);
        if (objEablkybsjg instanceof gtknphoqwx.ppxfxbqfkf) {
            return ((gtknphoqwx) pj.btonecajqb.zoijcleaow(null, new iobyxmoadg(iwizpuwonkVar, obj, null), 1, null)).gtknphoqwx();
        }
        return gtknphoqwx.f82880zoijcleaow.ppxfxbqfkf(wwaezpbzkn.f37140iobyxmoadg);
    }
}
