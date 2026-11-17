package dc0;

import android.content.Context;
import ec0.eablkybsjg;
import ec0.ppxfxbqfkf;
import ec0.zoijcleaow;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pm.dxjokdxxww;
import ru.myspar.core.domain.models.coupons.CouponCategoryDomain;
import ru.myspar.core.domain.models.coupons.CouponColorsDomain;
import ru.myspar.core.domain.models.coupons.CouponDomain;
import ru.myspar.core.domain.models.coupons.CouponHintDomain;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f27837zdlpuopuiu;

    public iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f27837zdlpuopuiu = context;
    }

    private final ppxfxbqfkf eablkybsjg(CouponHintDomain couponHintDomain) {
        String title = couponHintDomain.getTitle();
        if (title == null) {
            title = "";
        }
        return new ppxfxbqfkf(title, couponHintDomain.getColor());
    }

    private final ec0.iobyxmoadg ppxfxbqfkf(CouponColorsDomain couponColorsDomain) {
        return new ec0.iobyxmoadg(couponColorsDomain.getLight(), couponColorsDomain.getDark());
    }

    public final eablkybsjg iobyxmoadg(CouponDomain couponDomain) {
        String string;
        zdlpuopuiu.btonecajqb(couponDomain, "couponDomain");
        String id2 = couponDomain.getId();
        String title = couponDomain.getTitle();
        String description = couponDomain.getDescription();
        if (couponDomain.getExpiredDate() == null || (string = this.f27837zdlpuopuiu.getString(dxjokdxxww.coupon_expired_date_template, couponDomain.getUntil())) == null) {
            string = this.f27837zdlpuopuiu.getString(dxjokdxxww.with_no_restrictions);
            zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        }
        String str = string;
        boolean isHot = couponDomain.getIsHot();
        String backgroundColor = couponDomain.getBackgroundColor();
        ec0.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf(couponDomain.getPromocodeBackgroundColors());
        String promoCode = couponDomain.getPromoCode();
        String image = couponDomain.getImage();
        List hints = couponDomain.getHints();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(hints, 10));
        Iterator it = hints.iterator();
        while (it.hasNext()) {
            arrayList.add(eablkybsjg((CouponHintDomain) it.next()));
        }
        return new eablkybsjg(id2, title, description, str, isHot, promoCode, backgroundColor, iobyxmoadgVarPpxfxbqfkf, image, arrayList, couponDomain.getButtonText(), couponDomain.getAction(), couponDomain.getReference(), couponDomain.getDisabled(), couponDomain.getQrButton());
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public List invoke(List categories) {
        zdlpuopuiu.btonecajqb(categories, "categories");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(categories, 10));
        Iterator it = categories.iterator();
        while (it.hasNext()) {
            CouponCategoryDomain couponCategoryDomain = (CouponCategoryDomain) it.next();
            String name = couponCategoryDomain.getName();
            List coupons = couponCategoryDomain.getCoupons();
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : coupons) {
                if (hashSet.add(((CouponDomain) obj).getId())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(iobyxmoadg((CouponDomain) it2.next()));
            }
            arrayList.add(new zoijcleaow(name, arrayList3));
        }
        return arrayList;
    }
}
