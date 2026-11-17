package ut1;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tt1.iobyxmoadg f114386zoijcleaow;

    /* JADX INFO: renamed from: ut1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2836iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f114387iobyxmoadg;

        public C2836iobyxmoadg(String id2) {
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f114387iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2836iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f114387iobyxmoadg, ((C2836iobyxmoadg) obj).f114387iobyxmoadg);
        }

        public int hashCode() {
            return this.f114387iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f114387iobyxmoadg;
        }

        public String toString() {
            return "Params(id=" + this.f114387iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f114388cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f114390jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f114391yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f114392zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f114390jyumaefscl = obj;
            this.f114388cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(tt1.iobyxmoadg storyRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(storyRepository, "storyRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f114386zoijcleaow = storyRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C2836iobyxmoadg c2836iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f114388cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f114388cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = zoijcleaowVar.f114390jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f114388cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                c2836iobyxmoadg = (C2836iobyxmoadg) zoijcleaowVar.f114391yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f114392zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        tt1.iobyxmoadg iobyxmoadgVar2 = this.f114386zoijcleaow;
        String strIobyxmoadg = c2836iobyxmoadg.iobyxmoadg();
        zoijcleaowVar.f114392zdlpuopuiu = this;
        zoijcleaowVar.f114391yggfygwlhe = c2836iobyxmoadg;
        zoijcleaowVar.f114388cqumvgiudr = 1;
        objNufgyqmvbu = iobyxmoadgVar2.nufgyqmvbu(strIobyxmoadg, zoijcleaowVar);
        if (objNufgyqmvbu == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        LocalDateTime localDateTime = (LocalDateTime) objNufgyqmvbu;
        if (localDateTime != null && LocalDateTime.now().compareTo((ChronoLocalDateTime<?>) localDateTime) < 0) {
            return null;
        }
        tt1.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f114386zoijcleaow;
        String strIobyxmoadg2 = c2836iobyxmoadg.iobyxmoadg();
        zoijcleaowVar.f114392zdlpuopuiu = null;
        zoijcleaowVar.f114391yggfygwlhe = null;
        zoijcleaowVar.f114388cqumvgiudr = 2;
        objNufgyqmvbu = iobyxmoadgVar3.eablkybsjg(strIobyxmoadg2, zoijcleaowVar);
        return objNufgyqmvbu == objGxszxtbevo ? objGxszxtbevo : objNufgyqmvbu;
    }
}
