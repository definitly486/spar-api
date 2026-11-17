package do0;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bo0.iobyxmoadg f29259zoijcleaow;

    /* JADX INFO: renamed from: do0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0593iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f29260iobyxmoadg;

        public C0593iobyxmoadg(String newCardNumber) {
            zdlpuopuiu.btonecajqb(newCardNumber, "newCardNumber");
            this.f29260iobyxmoadg = newCardNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0593iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f29260iobyxmoadg, ((C0593iobyxmoadg) obj).f29260iobyxmoadg);
        }

        public int hashCode() {
            return this.f29260iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f29260iobyxmoadg;
        }

        public String toString() {
            return "Params(newCardNumber=" + this.f29260iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f29261jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f29263zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f29263zdlpuopuiu = obj;
            this.f29261jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(bo0.iobyxmoadg cardRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cardRepository, "cardRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f29259zoijcleaow = cardRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0593iobyxmoadg c0593iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f29261jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f29261jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f29263zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f29261jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            bo0.iobyxmoadg iobyxmoadgVar = this.f29259zoijcleaow;
            String strIobyxmoadg = c0593iobyxmoadg.iobyxmoadg();
            zoijcleaowVar.f29261jyumaefscl = 1;
            if (iobyxmoadgVar.eablkybsjg(strIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
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
