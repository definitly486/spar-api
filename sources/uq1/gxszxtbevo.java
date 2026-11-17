package uq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.SpecialBannerDocumentLayoutView;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SpecialBannerDocumentLayoutView f114166iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final SpecialBannerDocumentLayoutView f114167zoijcleaow;

    private gxszxtbevo(SpecialBannerDocumentLayoutView specialBannerDocumentLayoutView, SpecialBannerDocumentLayoutView specialBannerDocumentLayoutView2) {
        this.f114166iobyxmoadg = specialBannerDocumentLayoutView;
        this.f114167zoijcleaow = specialBannerDocumentLayoutView2;
    }

    public static gxszxtbevo iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SpecialBannerDocumentLayoutView specialBannerDocumentLayoutView = (SpecialBannerDocumentLayoutView) view;
        return new gxszxtbevo(specialBannerDocumentLayoutView, specialBannerDocumentLayoutView);
    }

    public static gxszxtbevo ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(mq1.zoijcleaow.item_special_banner_documents_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public SpecialBannerDocumentLayoutView getRoot() {
        return this.f114166iobyxmoadg;
    }
}
