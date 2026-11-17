package xq1;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import vq1.esjtqupxsv;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wq1.iobyxmoadg f123076zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final esjtqupxsv f123077iobyxmoadg;

        public iobyxmoadg(esjtqupxsv formFilled) {
            zdlpuopuiu.btonecajqb(formFilled, "formFilled");
            this.f123077iobyxmoadg = formFilled;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f123077iobyxmoadg, ((iobyxmoadg) obj).f123077iobyxmoadg);
        }

        public int hashCode() {
            return this.f123077iobyxmoadg.hashCode();
        }

        public final esjtqupxsv iobyxmoadg() {
            return this.f123077iobyxmoadg;
        }

        public String toString() {
            return "Params(formFilled=" + this.f123077iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f123078jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f123080zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f123080zdlpuopuiu = obj;
            this.f123078jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(wq1.iobyxmoadg specialBannerRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(specialBannerRepository, "specialBannerRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f123076zoijcleaow = specialBannerRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f123078jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f123078jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f123080zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f123078jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            wq1.iobyxmoadg iobyxmoadgVar2 = this.f123076zoijcleaow;
            esjtqupxsv esjtqupxsvVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            zoijcleaowVar.f123078jyumaefscl = 1;
            if (iobyxmoadgVar2.wkgbmnqykc(esjtqupxsvVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
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
