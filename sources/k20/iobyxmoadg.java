package k20;

import ft.ppxfxbqfkf;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.coupons.CouponCategoryDomain;
import w10.eablkybsjg;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f53462zoijcleaow;

    /* JADX INFO: renamed from: k20.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1143iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f53463jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f53465zdlpuopuiu;

        C1143iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53465zdlpuopuiu = obj;
            this.f53463jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(eablkybsjg couponSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(couponSource, "couponSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f53462zoijcleaow = couponSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        C1143iobyxmoadg c1143iobyxmoadg;
        if (gxszxtbevoVar instanceof C1143iobyxmoadg) {
            c1143iobyxmoadg = (C1143iobyxmoadg) gxszxtbevoVar;
            int i13 = c1143iobyxmoadg.f53463jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1143iobyxmoadg.f53463jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1143iobyxmoadg = new C1143iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1143iobyxmoadg = new C1143iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c1143iobyxmoadg.f53465zdlpuopuiu;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c1143iobyxmoadg.f53463jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            eablkybsjg eablkybsjgVar = this.f53462zoijcleaow;
            c1143iobyxmoadg.f53463jyumaefscl = 1;
            objIobyxmoadg = eablkybsjgVar.iobyxmoadg(c1143iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        Iterable<CouponCategoryDomain> iterable = (Iterable) objIobyxmoadg;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(iterable, 10));
        for (CouponCategoryDomain couponCategoryDomain : iterable) {
            arrayList.add(CouponCategoryDomain.ppxfxbqfkf(couponCategoryDomain, null, couponCategoryDomain.getCoupons(), 1, null));
        }
        return arrayList;
    }
}
