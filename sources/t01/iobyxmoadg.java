package t01;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import k01.eablkybsjg;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.coupons.CouponCategoryDomain;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f109245zoijcleaow;

    /* JADX INFO: renamed from: t01.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2681iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f109246jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f109248zdlpuopuiu;

        C2681iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f109248zdlpuopuiu = obj;
            this.f109246jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(eablkybsjg couponSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(couponSource, "couponSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f109245zoijcleaow = couponSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        C2681iobyxmoadg c2681iobyxmoadg;
        if (gxszxtbevoVar instanceof C2681iobyxmoadg) {
            c2681iobyxmoadg = (C2681iobyxmoadg) gxszxtbevoVar;
            int i13 = c2681iobyxmoadg.f109246jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2681iobyxmoadg.f109246jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2681iobyxmoadg = new C2681iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2681iobyxmoadg = new C2681iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c2681iobyxmoadg.f109248zdlpuopuiu;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c2681iobyxmoadg.f109246jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            eablkybsjg eablkybsjgVar = this.f109245zoijcleaow;
            c2681iobyxmoadg.f109246jyumaefscl = 1;
            objIobyxmoadg = eablkybsjgVar.iobyxmoadg(c2681iobyxmoadg);
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
