package b82;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a82.iobyxmoadg f15541zoijcleaow;

    /* JADX INFO: renamed from: b82.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0266iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15542iobyxmoadg;

        public C0266iobyxmoadg(String id2) {
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f15542iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0266iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f15542iobyxmoadg, ((C0266iobyxmoadg) obj).f15542iobyxmoadg);
        }

        public int hashCode() {
            return this.f15542iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f15542iobyxmoadg;
        }

        public String toString() {
            return "Params(id=" + this.f15542iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f15543cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f15545jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f15546yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f15547zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f15545jyumaefscl = obj;
            this.f15543cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(a82.iobyxmoadg storyRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(storyRepository, "storyRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f15541zoijcleaow = storyRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0266iobyxmoadg c0266iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f15543cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f15543cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = zoijcleaowVar.f15545jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f15543cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                c0266iobyxmoadg = (C0266iobyxmoadg) zoijcleaowVar.f15546yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f15547zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        a82.iobyxmoadg iobyxmoadgVar2 = this.f15541zoijcleaow;
        String strIobyxmoadg = c0266iobyxmoadg.iobyxmoadg();
        zoijcleaowVar.f15547zdlpuopuiu = this;
        zoijcleaowVar.f15546yggfygwlhe = c0266iobyxmoadg;
        zoijcleaowVar.f15543cqumvgiudr = 1;
        objNufgyqmvbu = iobyxmoadgVar2.nufgyqmvbu(strIobyxmoadg, zoijcleaowVar);
        if (objNufgyqmvbu == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        LocalDateTime localDateTime = (LocalDateTime) objNufgyqmvbu;
        if (localDateTime != null && LocalDateTime.now().compareTo((ChronoLocalDateTime<?>) localDateTime) < 0) {
            return null;
        }
        a82.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f15541zoijcleaow;
        String strIobyxmoadg2 = c0266iobyxmoadg.iobyxmoadg();
        zoijcleaowVar.f15547zdlpuopuiu = null;
        zoijcleaowVar.f15546yggfygwlhe = null;
        zoijcleaowVar.f15543cqumvgiudr = 2;
        objNufgyqmvbu = iobyxmoadgVar3.eablkybsjg(strIobyxmoadg2, zoijcleaowVar);
        return objNufgyqmvbu == objGxszxtbevo ? objGxszxtbevo : objNufgyqmvbu;
    }
}
