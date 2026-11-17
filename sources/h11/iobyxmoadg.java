package h11;

import java.util.Iterator;
import java.util.List;
import k01.draadjrbmk;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainException;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final draadjrbmk f39077zoijcleaow;

    /* JADX INFO: renamed from: h11.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0897iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f39078iobyxmoadg;

        public C0897iobyxmoadg(String qrCode) {
            zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            this.f39078iobyxmoadg = qrCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0897iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39078iobyxmoadg, ((C0897iobyxmoadg) obj).f39078iobyxmoadg);
        }

        public int hashCode() {
            return this.f39078iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f39078iobyxmoadg;
        }

        public String toString() {
            return "Params(qrCode=" + this.f39078iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f39079cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f39081jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f39082yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f39083zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f39081jyumaefscl = obj;
            this.f39079cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(draadjrbmk remoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f39077zoijcleaow = remoteSource;
    }

    private final Promotion.PromotionItem wkgbmnqykc(List list, String str) throws DomainException {
        Object next;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!zdlpuopuiu.eablkybsjg(((Promotion.PromotionItem) next).getQrCode(), str));
            Promotion.PromotionItem promotionItem = (Promotion.PromotionItem) next;
            if (promotionItem != null) {
                return promotionItem;
            }
        }
        throw new DomainException(null, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0897iobyxmoadg c0897iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f39079cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f39079cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f39081jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f39079cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            draadjrbmk draadjrbmkVar = this.f39077zoijcleaow;
            zoijcleaowVar.f39083zdlpuopuiu = this;
            zoijcleaowVar.f39082yggfygwlhe = c0897iobyxmoadg;
            zoijcleaowVar.f39079cqumvgiudr = 1;
            objIobyxmoadg = draadjrbmkVar.iobyxmoadg(false, null, zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0897iobyxmoadg = (C0897iobyxmoadg) zoijcleaowVar.f39082yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f39083zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return iobyxmoadgVar.wkgbmnqykc(((Promotion) objIobyxmoadg).getItems(), c0897iobyxmoadg.iobyxmoadg());
    }
}
