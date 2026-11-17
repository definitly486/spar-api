package m60;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import ru.myspar.legacy.presentation.view.promotion.PromotionTimelineView;

/* JADX INFO: loaded from: classes4.dex */
public final class wwaezpbzkn implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f66079iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ViewPager2 f66080ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final PromotionTimelineView f66081zoijcleaow;

    private wwaezpbzkn(ConstraintLayout constraintLayout, PromotionTimelineView promotionTimelineView, ViewPager2 viewPager2) {
        this.f66079iobyxmoadg = constraintLayout;
        this.f66081zoijcleaow = promotionTimelineView;
        this.f66080ppxfxbqfkf = viewPager2;
    }

    public static wwaezpbzkn iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.promoTimeline;
        PromotionTimelineView promotionTimelineView = (PromotionTimelineView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (promotionTimelineView != null) {
            i13 = pm.eablkybsjg.viewPager;
            ViewPager2 viewPager2 = (ViewPager2) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (viewPager2 != null) {
                return new wwaezpbzkn((ConstraintLayout) view, promotionTimelineView, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f66079iobyxmoadg;
    }
}
