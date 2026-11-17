package m60;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.myspar.legacy.presentation.view.ComboSetCardItemView;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f65499iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final TextView f65500ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComboSetCardItemView f65501zoijcleaow;

    private f(LinearLayout linearLayout, ComboSetCardItemView comboSetCardItemView, TextView textView) {
        this.f65499iobyxmoadg = linearLayout;
        this.f65501zoijcleaow = comboSetCardItemView;
        this.f65500ppxfxbqfkf = textView;
    }

    public static f iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.comboSetContainer;
        ComboSetCardItemView comboSetCardItemView = (ComboSetCardItemView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (comboSetCardItemView != null) {
            i13 = pm.eablkybsjg.tvCaption;
            TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (textView != null) {
                return new f((LinearLayout) view, comboSetCardItemView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f65499iobyxmoadg;
    }
}
