package hd0;

import dt.zoijcleaow;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pm.dxjokdxxww;
import qb0.eablkybsjg;
import qb0.gxszxtbevo;
import qb0.ppxfxbqfkf;
import qb0.wkgbmnqykc;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.domain.feature.review.store.State;
import ru.myspar.rate.review.api.model.ReviewHeaderItem;
import ru.myspar.rate.review.api.model.ReviewItem;
import ru.myspar.rate.review.api.model.ReviewSumItem;
import s40.gtknphoqwx;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ob0.iobyxmoadg f40092jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final d60.iobyxmoadg f40093yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final zoijcleaow f40094zdlpuopuiu;

    public iobyxmoadg(zoijcleaow dateUtils, d60.iobyxmoadg resourcesManager, ob0.iobyxmoadg colorsUiModelMapper) {
        zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        this.f40094zdlpuopuiu = dateUtils;
        this.f40093yggfygwlhe = resourcesManager;
        this.f40092jyumaefscl = colorsUiModelMapper;
    }

    private final ppxfxbqfkf btonecajqb(ReviewItem reviewItem, ColorsUiModel colorsUiModel) {
        return new ppxfxbqfkf(reviewItem.getId(), reviewItem.getUser(), this.f40094zdlpuopuiu.eablkybsjg(reviewItem.getDate(), "dd MMMM yyyy"), reviewItem.getRating(), reviewItem.getComment(), reviewItem.getAnswer(), reviewItem.getIsCollapsed(), reviewItem.getFromDegrees(), reviewItem.getToDegrees(), reviewItem.getAnswerTitleRes(), reviewItem.getIsNeedToAnimate(), colorsUiModel);
    }

    private final String eablkybsjg(int i13) {
        return this.f40093yggfygwlhe.nufgyqmvbu(gtknphoqwx.plural_reviews, i13, Integer.valueOf(i13));
    }

    private final eablkybsjg gtknphoqwx(ReviewSumItem reviewSumItem, int i13) {
        return new eablkybsjg(reviewSumItem.getReviewRating(), (int) iobyxmoadg(reviewSumItem.getReviewCount(), i13));
    }

    private final double iobyxmoadg(int i13, int i14) {
        if (i13 == 0 || i14 == 0) {
            return 0.0d;
        }
        return qs.eablkybsjg.gxszxtbevo(((double) i13) / ((double) i14), 100.0d, null, 2, null);
    }

    private final qb0.iobyxmoadg lqeggnwhkg(ReviewHeaderItem reviewHeaderItem, double d13) {
        Iterator it = reviewHeaderItem.getReviewsByRating().iterator();
        int reviewCount = 0;
        while (it.hasNext()) {
            reviewCount += ((ReviewSumItem) it.next()).getReviewCount();
        }
        if (reviewCount >= 1 && d13 != 0.0d) {
            String strBtonecajqb = n30.iobyxmoadg.f68492iobyxmoadg.btonecajqb(Double.valueOf(d13));
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
            return new qb0.iobyxmoadg(true, strBtonecajqb, strEablkybsjg, arrayList);
        }
        return qb0.iobyxmoadg.f78390eablkybsjg.iobyxmoadg();
    }

    private final wkgbmnqykc ppxfxbqfkf(Boolean bool, List list) {
        boolean z13 = false;
        boolean z14 = (list.isEmpty() || bool == null) ? false : true;
        int i13 = s40.draadjrbmk.no_reviews_yet;
        int i14 = s40.draadjrbmk.first_to_tell_about_product;
        if (list.isEmpty() && zdlpuopuiu.eablkybsjg(bool, Boolean.TRUE)) {
            z13 = true;
        }
        return new wkgbmnqykc(list, z14, new gxszxtbevo(i13, i14, z13));
    }

    private final qb0.zoijcleaow zoijcleaow(Boolean bool, boolean z13, boolean z14, int i13) {
        return new qb0.zoijcleaow(s40.draadjrbmk.waiting_for_evaluation, s40.draadjrbmk.first_to_tell_about_product, z14, i13, zdlpuopuiu.eablkybsjg(bool, Boolean.FALSE) && !z13);
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public fd0.zdlpuopuiu invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        ColorsUiModel colorsUiModelIobyxmoadg = this.f40092jyumaefscl.iobyxmoadg(state.getColorsModel());
        List items = state.getItems();
        List arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(btonecajqb((ReviewItem) it.next(), colorsUiModelIobyxmoadg));
        }
        if (state.getIsLoading() && !state.getIsInitLoad()) {
            arrayList = jyumaefscl.jrbgnlbqoe(arrayList, pu.iobyxmoadg.f77322zdlpuopuiu);
        }
        ReviewHeaderItem sumHeaderItem = state.getSumHeaderItem();
        qb0.iobyxmoadg iobyxmoadgVarLqeggnwhkg = sumHeaderItem != null ? lqeggnwhkg(sumHeaderItem, state.getRatingReview()) : null;
        wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = ppxfxbqfkf(iobyxmoadgVarLqeggnwhkg != null ? Boolean.valueOf(iobyxmoadgVarLqeggnwhkg.wkgbmnqykc()) : null, arrayList);
        boolean z13 = state.getIsCanAddReview() || state.getIsCanEditReview();
        int i13 = state.getIsCanEditReview() ? dxjokdxxww.reviews_edit : dxjokdxxww.reviews_add_new;
        qb0.zoijcleaow zoijcleaowVarZoijcleaow = zoijcleaow(iobyxmoadgVarLqeggnwhkg != null ? Boolean.valueOf(iobyxmoadgVarLqeggnwhkg.wkgbmnqykc()) : null, wkgbmnqykcVarPpxfxbqfkf.ppxfxbqfkf(), z13, i13);
        boolean z14 = state.getIsLoading() && state.getIsInitLoad();
        if (iobyxmoadgVarLqeggnwhkg == null) {
            iobyxmoadgVarLqeggnwhkg = qb0.iobyxmoadg.f78390eablkybsjg.iobyxmoadg();
        }
        return new fd0.zdlpuopuiu(iobyxmoadgVarLqeggnwhkg, wkgbmnqykcVarPpxfxbqfkf, zoijcleaowVarZoijcleaow, dxjokdxxww.title_all_review, z14, z13 && !zoijcleaowVarZoijcleaow.eablkybsjg(), i13, state.getIsNeedScrollToTop(), colorsUiModelIobyxmoadg);
    }
}
