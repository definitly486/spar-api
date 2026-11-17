package y90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TextView f124179iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final TextView f124180zoijcleaow;

    private btonecajqb(TextView textView, TextView textView2) {
        this.f124179iobyxmoadg = textView;
        this.f124180zoijcleaow = textView2;
    }

    public static btonecajqb iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new btonecajqb(textView, textView);
    }

    public static btonecajqb ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(q90.eablkybsjg.item_evropolis_dialog_title, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public TextView getRoot() {
        return this.f124179iobyxmoadg;
    }
}
