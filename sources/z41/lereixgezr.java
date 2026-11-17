package z41;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import ru.myspar.proloyalty.legacy.presentation.view.promotion.PromotionTimelineView;

/* JADX INFO: loaded from: classes5.dex */
public final class lereixgezr implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128229iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ViewPager2 f128230ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final PromotionTimelineView f128231zoijcleaow;

    private lereixgezr(ConstraintLayout constraintLayout, PromotionTimelineView promotionTimelineView, ViewPager2 viewPager2) {
        this.f128229iobyxmoadg = constraintLayout;
        this.f128231zoijcleaow = promotionTimelineView;
        this.f128230ppxfxbqfkf = viewPager2;
    }

    public static lereixgezr iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.promoTimeline;
        PromotionTimelineView promotionTimelineView = (PromotionTimelineView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (promotionTimelineView != null) {
            i13 = vk0.wkgbmnqykc.viewPager;
            ViewPager2 viewPager2 = (ViewPager2) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (viewPager2 != null) {
                return new lereixgezr((ConstraintLayout) view, promotionTimelineView, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128229iobyxmoadg;
    }
}
