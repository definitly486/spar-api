package e8;

import a8.eablkybsjg;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.vdvldrhtss;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import rj.btonecajqb;
import rj.iwizpuwonk;
import rj.jyumaefscl;
import rj.lqeggnwhkg;
import rj.oxmwwwfdhm;
import sj.dxjokdxxww;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f30891jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ y7.iobyxmoadg f30892yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f30893zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(y7.iobyxmoadg iobyxmoadgVar, lqeggnwhkg lqeggnwhkgVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f30892yggfygwlhe = iobyxmoadgVar;
            this.f30891jyumaefscl = lqeggnwhkgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f30892yggfygwlhe, this.f30891jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f30893zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    this.f30893zdlpuopuiu = 1;
                    if (crxdokpmqz.iobyxmoadg(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th2) {
                this.f30892yggfygwlhe.iobyxmoadg();
                jyumaefscl.iobyxmoadg.iobyxmoadg(this.f30891jyumaefscl, null, 1, null);
                throw th2;
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Object f30894jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f30895yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f30896zdlpuopuiu;

        public static final class iobyxmoadg implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ rj.zdlpuopuiu f30897zdlpuopuiu;

            public iobyxmoadg(rj.zdlpuopuiu zdlpuopuiuVar) {
                this.f30897zdlpuopuiu = zdlpuopuiuVar;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                iwizpuwonk.iobyxmoadg.iobyxmoadg(this.f30897zdlpuopuiu.kcexrzcfyt(), null, 1, null);
            }
        }

        /* JADX INFO: renamed from: e8.zoijcleaow$ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
        public /* synthetic */ class C0642ppxfxbqfkf extends vdvldrhtss implements tg.iobyxmoadg {
            public C0642ppxfxbqfkf(Object obj) {
                super(0, obj, y7.iobyxmoadg.class, "dispose", "dispose()V", 0);
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                ((y7.iobyxmoadg) this.receiver).iobyxmoadg();
            }
        }

        /* JADX INFO: renamed from: e8.zoijcleaow$ppxfxbqfkf$zoijcleaow, reason: collision with other inner class name */
        public static final class C0643zoijcleaow implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ rj.zdlpuopuiu f30898zdlpuopuiu;

            public C0643zoijcleaow(rj.zdlpuopuiu zdlpuopuiuVar) {
                this.f30898zdlpuopuiu = zdlpuopuiuVar;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Object obj) {
                this.f30898zdlpuopuiu.kcexrzcfyt().eablkybsjg(obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Object obj, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f30894jyumaefscl = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f30894jyumaefscl, gxszxtbevoVar);
            ppxfxbqfkfVar.f30895yggfygwlhe = obj;
            return ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f30896zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rj.zdlpuopuiu zdlpuopuiuVar = (rj.zdlpuopuiu) this.f30895yggfygwlhe;
                C0642ppxfxbqfkf c0642ppxfxbqfkf = new C0642ppxfxbqfkf(((eablkybsjg) this.f30894jyumaefscl).ppxfxbqfkf(y7.eablkybsjg.iobyxmoadg(new iobyxmoadg(zdlpuopuiuVar), new C0643zoijcleaow(zdlpuopuiuVar))));
                this.f30896zdlpuopuiu = 1;
                if (oxmwwwfdhm.iobyxmoadg(zdlpuopuiuVar, c0642ppxfxbqfkf, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(rj.zdlpuopuiu zdlpuopuiuVar, gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: e8.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    /* synthetic */ class C0644zoijcleaow extends kotlin.jvm.internal.iobyxmoadg implements tg.draadjrbmk {
        C0644zoijcleaow(Object obj) {
            super(1, obj, lqeggnwhkg.class, "trySend", "trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;", 8);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg(obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Object p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            ((lqeggnwhkg) this.f60022zdlpuopuiu).eablkybsjg(p13);
        }
    }

    public static final sj.lqeggnwhkg iobyxmoadg(eablkybsjg eablkybsjgVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        return dxjokdxxww.eablkybsjg(new ppxfxbqfkf(eablkybsjgVar, null));
    }

    public static /* synthetic */ jyumaefscl ppxfxbqfkf(eablkybsjg eablkybsjgVar, cllcsxoeiz cllcsxoeizVar, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = -2;
        }
        return zoijcleaow(eablkybsjgVar, cllcsxoeizVar, i13);
    }

    public static final jyumaefscl zoijcleaow(eablkybsjg eablkybsjgVar, cllcsxoeiz scope, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scope, "scope");
        lqeggnwhkg lqeggnwhkgVarZoijcleaow = btonecajqb.zoijcleaow(i13, null, null, 6, null);
        gtknphoqwx.wkgbmnqykc(scope, null, null, new iobyxmoadg(eablkybsjgVar.wkgbmnqykc(y7.eablkybsjg.zoijcleaow(null, new C0644zoijcleaow(lqeggnwhkgVarZoijcleaow), 1, null)), lqeggnwhkgVarZoijcleaow, null), 3, null);
        return lqeggnwhkgVarZoijcleaow;
    }
}
