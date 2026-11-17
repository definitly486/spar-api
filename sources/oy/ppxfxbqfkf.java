package oy;

import hg.jyumaefscl;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pz.CouponColorsDto;
import pz.CouponDto;
import pz.CouponGroupsDto;
import pz.CouponHintDto;
import pz.CouponsDto;
import ru.myspar.core.domain.models.coupons.CouponCategoryDomain;
import ru.myspar.core.domain.models.coupons.CouponColorsDomain;
import ru.myspar.core.domain.models.coupons.CouponDomain;
import ru.myspar.core.domain.models.coupons.CouponHintDomain;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dt.zoijcleaow f75087iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final DateTimeFormatter f75088zoijcleaow;

    public ppxfxbqfkf(dt.zoijcleaow dateUtils) {
        zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        this.f75087iobyxmoadg = dateUtils;
        this.f75088zoijcleaow = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    }

    private final CouponDomain eablkybsjg(CouponDto couponDto) {
        dt.zoijcleaow zoijcleaowVar = this.f75087iobyxmoadg;
        String dateTo = couponDto.getDateTo();
        DateTimeFormatter couponDateFormatter = this.f75088zoijcleaow;
        zdlpuopuiu.dxjokdxxww(couponDateFormatter, "couponDateFormatter");
        LocalDateTime localDateTimePpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(dateTo, couponDateFormatter);
        LocalDate localDate = localDateTimePpxfxbqfkf != null ? localDateTimePpxfxbqfkf.toLocalDate() : null;
        String id2 = couponDto.getId();
        String title = couponDto.getTitle();
        String desc = couponDto.getDesc();
        String image = couponDto.getImage();
        String backgroundColor = couponDto.getBackgroundColor();
        CouponColorsDomain couponColorsDomainWkgbmnqykc = wkgbmnqykc(couponDto.getPromocodeBackgroundColors());
        String coupon = couponDto.getCoupon();
        String expiredDate = couponDto.getExpiredDate();
        boolean isHot = couponDto.getIsHot();
        List hints = couponDto.getHints();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(hints, 10));
        Iterator it = hints.iterator();
        while (it.hasNext()) {
            arrayList.add(gxszxtbevo((CouponHintDto) it.next()));
        }
        return new CouponDomain(id2, title, desc, image, backgroundColor, couponColorsDomainWkgbmnqykc, coupon, localDate, expiredDate, isHot, arrayList, couponDto.getButton(), couponDto.getAction(), couponDto.getReference(), couponDto.getDisabled(), couponDto.getQrButton());
    }

    private final CouponHintDomain gxszxtbevo(CouponHintDto couponHintDto) {
        return new CouponHintDomain(couponHintDto.getTitle(), couponHintDto.getColor());
    }

    private final CouponCategoryDomain ppxfxbqfkf(CouponsDto couponsDto) {
        String title = couponsDto.getTitle();
        List coupons = couponsDto.getCoupons();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(coupons, 10));
        Iterator it = coupons.iterator();
        while (it.hasNext()) {
            arrayList.add(eablkybsjg((CouponDto) it.next()));
        }
        return new CouponCategoryDomain(title, arrayList);
    }

    private final CouponColorsDomain wkgbmnqykc(CouponColorsDto couponColorsDto) {
        return new CouponColorsDomain(couponColorsDto.getLight(), couponColorsDto.getDark());
    }

    private final List zoijcleaow(CouponGroupsDto couponGroupsDto) {
        List groups = couponGroupsDto.getGroups();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(groups, 10));
        Iterator it = groups.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf((CouponsDto) it.next()));
        }
        return arrayList;
    }

    public final List iobyxmoadg(CouponGroupsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return zoijcleaow(dto);
    }
}
