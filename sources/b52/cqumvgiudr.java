package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.specialbanner.impl.presentation.views.QuestionSpecialBannerLayoutView;

/* JADX INFO: loaded from: classes6.dex */
public final class cqumvgiudr implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final QuestionSpecialBannerLayoutView f15290iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final QuestionSpecialBannerLayoutView f15291zoijcleaow;

    private cqumvgiudr(QuestionSpecialBannerLayoutView questionSpecialBannerLayoutView, QuestionSpecialBannerLayoutView questionSpecialBannerLayoutView2) {
        this.f15290iobyxmoadg = questionSpecialBannerLayoutView;
        this.f15291zoijcleaow = questionSpecialBannerLayoutView2;
    }

    public static cqumvgiudr iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        QuestionSpecialBannerLayoutView questionSpecialBannerLayoutView = (QuestionSpecialBannerLayoutView) view;
        return new cqumvgiudr(questionSpecialBannerLayoutView, questionSpecialBannerLayoutView);
    }

    public static cqumvgiudr ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_questions, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public QuestionSpecialBannerLayoutView getRoot() {
        return this.f15290iobyxmoadg;
    }
}
