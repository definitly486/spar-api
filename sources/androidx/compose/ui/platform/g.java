package androidx.compose.ui.platform;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final androidx.compose.runtime.a f6889iobyxmoadg = androidx.compose.runtime.lmojexxdyd.btonecajqb(iobyxmoadg.f6890zdlpuopuiu);

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f6890zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return null;
        }

        public final bfopjjpdmp iobyxmoadg() {
            return null;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f6891yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f6892zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f6892zdlpuopuiu = obj;
            this.f6891yggfygwlhe |= Integer.MIN_VALUE;
            return g.ppxfxbqfkf(null, null, null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f6893yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f6894zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f6894zdlpuopuiu = obj;
            this.f6893yggfygwlhe |= Integer.MIN_VALUE;
            return g.zoijcleaow(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object ppxfxbqfkf(z.opjhrmiecq opjhrmiecqVar, bfopjjpdmp bfopjjpdmpVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f6891yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f6891yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f6892zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f6891yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ppxfxbqfkfVar.f6891yggfygwlhe = 1;
            if (opjhrmiecqVar.wwaezpbzkn(rgvfuqvkyqVar, ppxfxbqfkfVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                throw new KotlinNothingValueException();
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object zoijcleaow(f fVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f6893yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f6893yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f6894zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f6893yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!fVar.wflxmlrfwp().n0()) {
                throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
            }
            z.opjhrmiecq opjhrmiecqVarVdvldrhtss = z.gtknphoqwx.vdvldrhtss(fVar);
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(z.gtknphoqwx.rgvfuqvkyq(fVar).stevsuqkhv().iobyxmoadg(f6889iobyxmoadg));
            zoijcleaowVar.f6893yggfygwlhe = 1;
            if (ppxfxbqfkf(opjhrmiecqVarVdvldrhtss, null, rgvfuqvkyqVar, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        throw new KotlinNothingValueException();
    }
}
