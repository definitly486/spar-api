package bz0;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import k01.dxjokdxxww;
import k01.nufgyqmvbu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends bz0.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dxjokdxxww f17698ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f17699zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f17700cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f17702jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f17703yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17704zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17702jyumaefscl = obj;
            this.f17700cqumvgiudr |= Integer.MIN_VALUE;
            return gxszxtbevo.this.dxjokdxxww(null, null, this);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f17705cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ int f17706iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f17707jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f17709zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(String str, int i13, String str2, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f17707jyumaefscl = str;
            this.f17706iwizpuwonk = i13;
            this.f17705cqumvgiudr = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return gxszxtbevo.this.new ppxfxbqfkf(this.f17707jyumaefscl, this.f17706iwizpuwonk, this.f17705cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f17709zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                dxjokdxxww dxjokdxxwwVar = gxszxtbevo.this.f17698ppxfxbqfkf;
                String str = this.f17707jyumaefscl;
                int i14 = this.f17706iwizpuwonk;
                String str2 = this.f17705cqumvgiudr;
                this.f17709zdlpuopuiu = 1;
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
        int f17710jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f17712zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17712zdlpuopuiu = obj;
            this.f17710jyumaefscl |= Integer.MIN_VALUE;
            Object objBtonecajqb = gxszxtbevo.this.btonecajqb(null, 0, null, this);
            return objBtonecajqb == mg.zoijcleaow.gxszxtbevo() ? objBtonecajqb : kcexrzcfyt.iobyxmoadg(objBtonecajqb);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(nufgyqmvbu orderLocalSource, dxjokdxxww orderRemoteSource, pkzmftpjix dispatcher) {
        super(dispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f17699zoijcleaow = orderLocalSource;
        this.f17698ppxfxbqfkf = orderRemoteSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object btonecajqb(String str, int i13, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i14 = zoijcleaowVar.f17710jyumaefscl;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f17710jyumaefscl = i14 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f17712zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = zoijcleaowVar.f17710jyumaefscl;
        if (i15 != 0) {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return ((kcexrzcfyt) obj).rgvfuqvkyq();
        }
        zdlpuopuiu.zoijcleaow(obj);
        tg.draadjrbmk ppxfxbqfkfVar = new ppxfxbqfkf(str, i13, str2, null);
        zoijcleaowVar.f17710jyumaefscl = 1;
        Object objGxszxtbevo2 = gxszxtbevo(ppxfxbqfkfVar, zoijcleaowVar);
        return objGxszxtbevo2 == objGxszxtbevo ? objGxszxtbevo : objGxszxtbevo2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object dxjokdxxww(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f17700cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f17700cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f17702jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f17700cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                str = (String) iobyxmoadgVar.f17703yggfygwlhe;
                gxszxtbevoVar2 = (gxszxtbevo) iobyxmoadgVar.f17704zdlpuopuiu;
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
        dxjokdxxww dxjokdxxwwVar = this.f17698ppxfxbqfkf;
        iobyxmoadgVar.f17704zdlpuopuiu = this;
        iobyxmoadgVar.f17703yggfygwlhe = str;
        iobyxmoadgVar.f17700cqumvgiudr = 1;
        if (dxjokdxxwwVar.zoijcleaow(str, str2, iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        gxszxtbevoVar2 = this;
        nufgyqmvbu nufgyqmvbuVar = gxszxtbevoVar2.f17699zoijcleaow;
        iobyxmoadgVar.f17704zdlpuopuiu = null;
        iobyxmoadgVar.f17703yggfygwlhe = null;
        iobyxmoadgVar.f17700cqumvgiudr = 2;
        if (nufgyqmvbuVar.iobyxmoadg(str, iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
