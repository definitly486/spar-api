package eb1;

import b31.gtknphoqwx;
import b31.wflxmlrfwp;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr0.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import p91.eablkybsjg;
import p91.gxszxtbevo;
import p91.ppxfxbqfkf;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.domain.feature.review.store.State;
import ru.myspar.proloyalty.rate.review.api.model.ReviewHeaderItem;
import ru.myspar.proloyalty.rate.review.api.model.ReviewItem;
import ru.myspar.proloyalty.rate.review.api.model.ReviewSumItem;
import tg.draadjrbmk;
import vk0.lqeggnwhkg;
import xr0.zoijcleaow;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final n91.iobyxmoadg f31077jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final q41.iobyxmoadg f31078yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final zoijcleaow f31079zdlpuopuiu;

    public iobyxmoadg(zoijcleaow dateUtils, q41.iobyxmoadg resourcesManager, n91.iobyxmoadg colorsUiModelMapper) {
        zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        this.f31079zdlpuopuiu = dateUtils;
        this.f31078yggfygwlhe = resourcesManager;
        this.f31077jyumaefscl = colorsUiModelMapper;
    }

    private final ppxfxbqfkf btonecajqb(ReviewItem reviewItem, ColorsUiModel colorsUiModel) {
        return new ppxfxbqfkf(reviewItem.getId(), reviewItem.getUser(), this.f31079zdlpuopuiu.eablkybsjg(reviewItem.getDate(), "dd MMMM yyyy"), reviewItem.getRating(), reviewItem.getComment(), reviewItem.getAnswer(), reviewItem.getIsCollapsed(), reviewItem.getFromDegrees(), reviewItem.getToDegrees(), reviewItem.getAnswerTitleRes(), reviewItem.getIsNeedToAnimate(), colorsUiModel);
    }

    private final String eablkybsjg(int i13) {
        return this.f31078yggfygwlhe.nufgyqmvbu(gtknphoqwx.plural_reviews, i13, Integer.valueOf(i13));
    }

    private final eablkybsjg gtknphoqwx(ReviewSumItem reviewSumItem, int i13) {
        return new eablkybsjg(reviewSumItem.getReviewRating(), (int) iobyxmoadg(reviewSumItem.getReviewCount(), i13));
    }

    private final double iobyxmoadg(int i13, int i14) {
        if (i13 == 0 || i14 == 0) {
            return 0.0d;
        }
        return wkgbmnqykc.gxszxtbevo(((double) i13) / ((double) i14), 100.0d, null, 2, null);
    }

    private final p91.iobyxmoadg lqeggnwhkg(ReviewHeaderItem reviewHeaderItem, double d13) {
        Iterator it = reviewHeaderItem.getReviewsByRating().iterator();
        int reviewCount = 0;
        while (it.hasNext()) {
            reviewCount += ((ReviewSumItem) it.next()).getReviewCount();
        }
        if (reviewCount >= 1 && d13 != 0.0d) {
            String strBtonecajqb = t11.iobyxmoadg.f109303iobyxmoadg.btonecajqb(Double.valueOf(d13));
            Integer reviewsCount = reviewHeaderItem.getReviewsCount();
            String strEablkybsjg = reviewsCount != null ? eablkybsjg(reviewsCount.intValue()) : null;
            if (strEablkybsjg == null) {
                strEablkybsjg = "";
            }
            List reviewsByRating = reviewHeaderItem.getReviewsByRating();
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(reviewsByRating, 10));
            Iterator it2 = reviewsByRating.iterator();
            while (it2.hasNext()) {
                arrayList.add(gtknphoqwx((ReviewSumItem) it2.next(), reviewCount));
            }
            return new p91.iobyxmoadg(true, strBtonecajqb, strEablkybsjg, arrayList);
        }
        return p91.iobyxmoadg.f76224eablkybsjg.iobyxmoadg();
    }

    private final p91.wkgbmnqykc ppxfxbqfkf(Boolean bool, List list) {
        boolean z13 = false;
        boolean z14 = (list.isEmpty() || bool == null) ? false : true;
        int i13 = wflxmlrfwp.proloyalty_no_reviews_yet;
        int i14 = wflxmlrfwp.proloyalty_first_to_tell_about_product;
        if (list.isEmpty() && zdlpuopuiu.eablkybsjg(bool, Boolean.TRUE)) {
            z13 = true;
        }
        return new p91.wkgbmnqykc(list, z14, new gxszxtbevo(i13, i14, z13));
    }

    private final p91.zoijcleaow zoijcleaow(Boolean bool, boolean z13, boolean z14, int i13) {
        return new p91.zoijcleaow(wflxmlrfwp.proloyalty_waiting_for_evaluation, wflxmlrfwp.proloyalty_first_to_tell_about_product, z14, i13, zdlpuopuiu.eablkybsjg(bool, Boolean.FALSE) && !z13);
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public cb1.zdlpuopuiu invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        ColorsUiModel colorsUiModelIobyxmoadg = this.f31077jyumaefscl.iobyxmoadg(state.getColorsModel());
        List items = state.getItems();
        List arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(btonecajqb((ReviewItem) it.next(), colorsUiModelIobyxmoadg));
        }
        if (state.getIsLoading() && !state.getIsInitLoad()) {
            arrayList = jyumaefscl.jrbgnlbqoe(arrayList, jt0.iobyxmoadg.f52316zdlpuopuiu);
        }
        ReviewHeaderItem sumHeaderItem = state.getSumHeaderItem();
        p91.iobyxmoadg iobyxmoadgVarLqeggnwhkg = sumHeaderItem != null ? lqeggnwhkg(sumHeaderItem, state.getRatingReview()) : null;
        p91.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = ppxfxbqfkf(iobyxmoadgVarLqeggnwhkg != null ? Boolean.valueOf(iobyxmoadgVarLqeggnwhkg.wkgbmnqykc()) : null, arrayList);
        boolean z13 = state.getIsCanAddReview() || state.getIsCanEditReview();
        int i13 = state.getIsCanEditReview() ? lqeggnwhkg.proloyalty_reviews_edit : lqeggnwhkg.proloyalty_reviews_add_new;
        p91.zoijcleaow zoijcleaowVarZoijcleaow = zoijcleaow(iobyxmoadgVarLqeggnwhkg != null ? Boolean.valueOf(iobyxmoadgVarLqeggnwhkg.wkgbmnqykc()) : null, wkgbmnqykcVarPpxfxbqfkf.ppxfxbqfkf(), z13, i13);
        boolean z14 = state.getIsLoading() && state.getIsInitLoad();
        if (iobyxmoadgVarLqeggnwhkg == null) {
            iobyxmoadgVarLqeggnwhkg = p91.iobyxmoadg.f76224eablkybsjg.iobyxmoadg();
        }
        return new cb1.zdlpuopuiu(iobyxmoadgVarLqeggnwhkg, wkgbmnqykcVarPpxfxbqfkf, zoijcleaowVarZoijcleaow, lqeggnwhkg.proloyalty_title_all_review, z14, z13 && !zoijcleaowVarZoijcleaow.eablkybsjg(), i13, state.getIsNeedScrollToTop(), colorsUiModelIobyxmoadg);
    }
}
