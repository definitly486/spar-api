package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.proloyalty.common.view.bonus_card.CardWidget;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CardWidget f128099iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final CardWidget f128100zoijcleaow;

    private iobyxmoadg(CardWidget cardWidget, CardWidget cardWidget2) {
        this.f128099iobyxmoadg = cardWidget;
        this.f128100zoijcleaow = cardWidget2;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CardWidget cardWidget = (CardWidget) view;
        return new iobyxmoadg(cardWidget, cardWidget);
    }

    public static iobyxmoadg ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.banner_bonus_card_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public CardWidget getRoot() {
        return this.f128099iobyxmoadg;
    }
}
