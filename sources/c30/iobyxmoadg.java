package c30;

import ft.ppxfxbqfkf;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.promo.Promotion;
import ru.myspar.core.error_handler.exceptions.DomainException;
import w10.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final draadjrbmk f18646zoijcleaow;

    /* JADX INFO: renamed from: c30.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0340iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18647iobyxmoadg;

        public C0340iobyxmoadg(String qrCode) {
            zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            this.f18647iobyxmoadg = qrCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0340iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f18647iobyxmoadg, ((C0340iobyxmoadg) obj).f18647iobyxmoadg);
        }

        public int hashCode() {
            return this.f18647iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18647iobyxmoadg;
        }

        public String toString() {
            return "Params(qrCode=" + this.f18647iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f18648cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f18650jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f18651yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18652zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18650jyumaefscl = obj;
            this.f18648cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(draadjrbmk remoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18646zoijcleaow = remoteSource;
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
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0340iobyxmoadg c0340iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f18648cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f18648cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f18650jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f18648cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            draadjrbmk draadjrbmkVar = this.f18646zoijcleaow;
            zoijcleaowVar.f18652zdlpuopuiu = this;
            zoijcleaowVar.f18651yggfygwlhe = c0340iobyxmoadg;
            zoijcleaowVar.f18648cqumvgiudr = 1;
            objIobyxmoadg = draadjrbmkVar.iobyxmoadg(false, null, zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0340iobyxmoadg = (C0340iobyxmoadg) zoijcleaowVar.f18651yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f18652zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return iobyxmoadgVar.wkgbmnqykc(((Promotion) objIobyxmoadg).getItems(), c0340iobyxmoadg.iobyxmoadg());
    }
}
