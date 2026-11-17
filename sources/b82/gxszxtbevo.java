package b82;

import gg.wwaezpbzkn;
import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a82.iobyxmoadg f15535zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15536iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f15537zoijcleaow;

        public iobyxmoadg(String storyId, int i13) {
            zdlpuopuiu.btonecajqb(storyId, "storyId");
            this.f15536iobyxmoadg = storyId;
            this.f15537zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f15536iobyxmoadg, iobyxmoadgVar.f15536iobyxmoadg) && this.f15537zoijcleaow == iobyxmoadgVar.f15537zoijcleaow;
        }

        public int hashCode() {
            return (this.f15536iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f15537zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f15537zoijcleaow;
        }

        public String toString() {
            return "Params(storyId=" + this.f15536iobyxmoadg + ", onboardingTime=" + this.f15537zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f15536iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f15538jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f15540zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f15540zdlpuopuiu = obj;
            this.f15538jyumaefscl |= Integer.MIN_VALUE;
            return gxszxtbevo.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(a82.iobyxmoadg storyRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(storyRepository, "storyRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f15535zoijcleaow = storyRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f15538jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f15538jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f15540zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f15538jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            LocalDateTime localDateTimePlusHours = LocalDateTime.now().plusHours(iobyxmoadgVar.iobyxmoadg());
            a82.iobyxmoadg iobyxmoadgVar2 = this.f15535zoijcleaow;
            String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
            zdlpuopuiu.lqeggnwhkg(localDateTimePlusHours);
            zoijcleaowVar.f15538jyumaefscl = 1;
            if (iobyxmoadgVar2.lqeggnwhkg(strZoijcleaow, localDateTimePlusHours, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
