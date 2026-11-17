package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.specialbanner.impl.presentation.views.SpecialBannerDocumentLayoutView;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SpecialBannerDocumentLayoutView f15304iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final SpecialBannerDocumentLayoutView f15305zoijcleaow;

    private gxszxtbevo(SpecialBannerDocumentLayoutView specialBannerDocumentLayoutView, SpecialBannerDocumentLayoutView specialBannerDocumentLayoutView2) {
        this.f15304iobyxmoadg = specialBannerDocumentLayoutView;
        this.f15305zoijcleaow = specialBannerDocumentLayoutView2;
    }

    public static gxszxtbevo iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SpecialBannerDocumentLayoutView specialBannerDocumentLayoutView = (SpecialBannerDocumentLayoutView) view;
        return new gxszxtbevo(specialBannerDocumentLayoutView, specialBannerDocumentLayoutView);
    }

    public static gxszxtbevo ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_documents, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public SpecialBannerDocumentLayoutView getRoot() {
        return this.f15304iobyxmoadg;
    }
}
