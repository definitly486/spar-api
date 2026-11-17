package androidx.compose.runtime;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class x0 {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f6086iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f6087jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f6088yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f6089zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f6087jyumaefscl = rgvfuqvkyqVar;
            this.f6086iwizpuwonk = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f6087jyumaefscl, this.f6086iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f6088yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f6089zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f6088yggfygwlhe;
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f6087jyumaefscl;
                krqnebusok krqnebusokVar = new krqnebusok(this.f6086iwizpuwonk, cllcsxoeizVar.getCoroutineContext());
                this.f6089zdlpuopuiu = 1;
                if (rgvfuqvkyqVar.invoke(krqnebusokVar, this) == objGxszxtbevo) {
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

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f6090iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f6091jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f6092yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f6093zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(tg.rgvfuqvkyq rgvfuqvkyqVar, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f6091jyumaefscl = rgvfuqvkyqVar;
            this.f6090iwizpuwonk = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f6091jyumaefscl, this.f6090iwizpuwonk, gxszxtbevoVar);
            ppxfxbqfkfVar.f6092yggfygwlhe = obj;
            return ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f6093zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f6092yggfygwlhe;
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f6091jyumaefscl;
                krqnebusok krqnebusokVar = new krqnebusok(this.f6090iwizpuwonk, cllcsxoeizVar.getCoroutineContext());
                this.f6093zdlpuopuiu = 1;
                if (rgvfuqvkyqVar.invoke(krqnebusokVar, this) == objGxszxtbevo) {
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
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f6094iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f6095jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f6096yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f6097zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(tg.rgvfuqvkyq rgvfuqvkyqVar, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f6095jyumaefscl = rgvfuqvkyqVar;
            this.f6094iwizpuwonk = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f6095jyumaefscl, this.f6094iwizpuwonk, gxszxtbevoVar);
            zoijcleaowVar.f6096yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f6097zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f6096yggfygwlhe;
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f6095jyumaefscl;
                krqnebusok krqnebusokVar = new krqnebusok(this.f6094iwizpuwonk, cllcsxoeizVar.getCoroutineContext());
                this.f6097zdlpuopuiu = 1;
                if (rgvfuqvkyqVar.invoke(krqnebusokVar, this) == objGxszxtbevo) {
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
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final i1 iobyxmoadg(Object obj, Object obj2, Object obj3, tg.rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, int i13) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-1703169085, i13, -1, "androidx.compose.runtime.produceState (ProduceState.kt:138)");
        }
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        draadjrbmk.iobyxmoadg iobyxmoadgVar = draadjrbmk.f5569iobyxmoadg;
        if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt = c1.ppxfxbqfkf(obj, null, 2, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(rgvfuqvkyqVar);
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt2 = new zoijcleaow(rgvfuqvkyqVar, iwxlajgrazVar, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        jlmebxxoox.wkgbmnqykc(obj2, obj3, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, (i13 >> 3) & 126);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return iwxlajgrazVar;
    }

    public static final i1 ppxfxbqfkf(Object obj, Object[] objArr, tg.rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, int i13) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(490154582, i13, -1, "androidx.compose.runtime.produceState (ProduceState.kt:200)");
        }
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        draadjrbmk.iobyxmoadg iobyxmoadgVar = draadjrbmk.f5569iobyxmoadg;
        if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt = c1.ppxfxbqfkf(obj, null, 2, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(rgvfuqvkyqVar);
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt2 = new ppxfxbqfkf(rgvfuqvkyqVar, iwxlajgrazVar, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        jlmebxxoox.gxszxtbevo(objArrCopyOf, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, 0);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return iwxlajgrazVar;
    }

    public static final i1 zoijcleaow(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, int i13) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(10454275, i13, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        draadjrbmk.iobyxmoadg iobyxmoadgVar = draadjrbmk.f5569iobyxmoadg;
        if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt = c1.ppxfxbqfkf(obj, null, 2, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(rgvfuqvkyqVar);
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt2 = new iobyxmoadg(rgvfuqvkyqVar, iwxlajgrazVar, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        jlmebxxoox.eablkybsjg(wwaezpbzknVar, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, 6);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return iwxlajgrazVar;
    }
}
