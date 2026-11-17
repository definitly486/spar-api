package j00;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.pkzmftpjix;
import w10.dxjokdxxww;
import w10.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends j00.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dxjokdxxww f50358ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f50359zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f50360cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f50362jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f50363yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f50364zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50362jyumaefscl = obj;
            this.f50360cqumvgiudr |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.dxjokdxxww(null, null, this);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f50365cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ int f50366iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f50367jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f50369zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(String str, int i13, String str2, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f50367jyumaefscl = str;
            this.f50366iwizpuwonk = i13;
            this.f50365cqumvgiudr = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return lqeggnwhkg.this.new ppxfxbqfkf(this.f50367jyumaefscl, this.f50366iwizpuwonk, this.f50365cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f50369zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                dxjokdxxww dxjokdxxwwVar = lqeggnwhkg.this.f50358ppxfxbqfkf;
                String str = this.f50367jyumaefscl;
                int i14 = this.f50366iwizpuwonk;
                String str2 = this.f50365cqumvgiudr;
                this.f50369zdlpuopuiu = 1;
                if (dxjokdxxwwVar.eablkybsjg(str, i14, str2, this) == objGxszxtbevo) {
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

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f50370jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f50372zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50372zdlpuopuiu = obj;
            this.f50370jyumaefscl |= Integer.MIN_VALUE;
            Object objBtonecajqb = lqeggnwhkg.this.btonecajqb(null, 0, null, this);
            return objBtonecajqb == mg.zoijcleaow.gxszxtbevo() ? objBtonecajqb : kcexrzcfyt.iobyxmoadg(objBtonecajqb);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(nufgyqmvbu orderLocalSource, dxjokdxxww orderRemoteSource, pkzmftpjix dispatcher) {
        super(dispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f50359zoijcleaow = orderLocalSource;
        this.f50358ppxfxbqfkf = orderRemoteSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object btonecajqb(String str, int i13, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i14 = zoijcleaowVar.f50370jyumaefscl;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f50370jyumaefscl = i14 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f50372zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = zoijcleaowVar.f50370jyumaefscl;
        if (i15 != 0) {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return ((kcexrzcfyt) obj).rgvfuqvkyq();
        }
        zdlpuopuiu.zoijcleaow(obj);
        tg.draadjrbmk ppxfxbqfkfVar = new ppxfxbqfkf(str, i13, str2, null);
        zoijcleaowVar.f50370jyumaefscl = 1;
        Object objGxszxtbevo2 = gxszxtbevo(ppxfxbqfkfVar, zoijcleaowVar);
        return objGxszxtbevo2 == objGxszxtbevo ? objGxszxtbevo : objGxszxtbevo2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object dxjokdxxww(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f50360cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f50360cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f50362jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f50360cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                str = (String) iobyxmoadgVar.f50363yggfygwlhe;
                lqeggnwhkgVar = (lqeggnwhkg) iobyxmoadgVar.f50364zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(obj);
        dxjokdxxww dxjokdxxwwVar = this.f50358ppxfxbqfkf;
        iobyxmoadgVar.f50364zdlpuopuiu = this;
        iobyxmoadgVar.f50363yggfygwlhe = str;
        iobyxmoadgVar.f50360cqumvgiudr = 1;
        if (dxjokdxxwwVar.zoijcleaow(str, str2, iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        lqeggnwhkgVar = this;
        nufgyqmvbu nufgyqmvbuVar = lqeggnwhkgVar.f50359zoijcleaow;
        iobyxmoadgVar.f50364zdlpuopuiu = null;
        iobyxmoadgVar.f50363yggfygwlhe = null;
        iobyxmoadgVar.f50360cqumvgiudr = 2;
        if (nufgyqmvbuVar.iobyxmoadg(str, iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
