package j00;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.pkzmftpjix;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pkzmftpjix f50350iobyxmoadg;

    /* JADX INFO: renamed from: j00.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1073iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f50351yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f50352zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1073iobyxmoadg(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f50351yggfygwlhe = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1073iobyxmoadg(this.f50351yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f50352zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                tg.draadjrbmk draadjrbmkVar = this.f50351yggfygwlhe;
                this.f50352zdlpuopuiu = 1;
                obj = draadjrbmkVar.invoke(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return obj;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1073iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f50353yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f50354zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f50353yggfygwlhe = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f50353yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f50354zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                tg.draadjrbmk draadjrbmkVar = this.f50353yggfygwlhe;
                this.f50354zdlpuopuiu = 1;
                obj = draadjrbmkVar.invoke(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return kcexrzcfyt.iobyxmoadg(kcexrzcfyt.wkgbmnqykc(obj));
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f50355jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f50357zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50357zdlpuopuiu = obj;
            this.f50355jyumaefscl |= Integer.MIN_VALUE;
            Object objLqeggnwhkg = iobyxmoadg.lqeggnwhkg(iobyxmoadg.this, null, this);
            return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : kcexrzcfyt.iobyxmoadg(objLqeggnwhkg);
        }
    }

    public iobyxmoadg(pkzmftpjix coroutineDispatcher) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f50350iobyxmoadg = coroutineDispatcher;
    }

    static /* synthetic */ Object eablkybsjg(iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(iobyxmoadgVar.f50350iobyxmoadg, new C1073iobyxmoadg(draadjrbmkVar, null), gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object lqeggnwhkg(iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f50355jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f50355jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = iobyxmoadgVar.new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = iobyxmoadgVar.new zoijcleaow(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = zoijcleaowVar.f50357zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f50355jyumaefscl;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                pkzmftpjix pkzmftpjixVar = iobyxmoadgVar.f50350iobyxmoadg;
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(draadjrbmkVar, null);
                zoijcleaowVar.f50355jyumaefscl = 1;
                objLqeggnwhkg = dxjokdxxww.lqeggnwhkg(pkzmftpjixVar, ppxfxbqfkfVar, zoijcleaowVar);
                if (objLqeggnwhkg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            }
            return ((kcexrzcfyt) objLqeggnwhkg).rgvfuqvkyq();
        } catch (Exception e13) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            return kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(e13));
        }
    }

    public Object gxszxtbevo(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        return lqeggnwhkg(this, draadjrbmkVar, gxszxtbevoVar);
    }

    public Object wkgbmnqykc(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        return eablkybsjg(this, draadjrbmkVar, gxszxtbevoVar);
    }
}
