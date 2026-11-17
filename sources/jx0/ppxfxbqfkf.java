package jx0;

import hg.jyumaefscl;
import hy0.CouponColorsDto;
import hy0.CouponDto;
import hy0.CouponGroupsDto;
import hy0.CouponHintDto;
import hy0.CouponsDto;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.coupons.CouponCategoryDomain;
import ru.myspar.proloyalty.core.domain.models.coupons.CouponColorsDomain;
import ru.myspar.proloyalty.core.domain.models.coupons.CouponDomain;
import ru.myspar.proloyalty.core.domain.models.coupons.CouponHintDomain;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final xr0.zoijcleaow f52488iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final DateTimeFormatter f52489zoijcleaow;

    public ppxfxbqfkf(xr0.zoijcleaow dateUtils) {
        zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        this.f52488iobyxmoadg = dateUtils;
        this.f52489zoijcleaow = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    }

    private final CouponDomain eablkybsjg(CouponDto couponDto) {
        xr0.zoijcleaow zoijcleaowVar = this.f52488iobyxmoadg;
        String dateTo = couponDto.getDateTo();
        DateTimeFormatter couponDateFormatter = this.f52489zoijcleaow;
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
