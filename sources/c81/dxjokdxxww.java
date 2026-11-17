package c81;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TextView f19211iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final TextView f19212zoijcleaow;

    private dxjokdxxww(TextView textView, TextView textView2) {
        this.f19211iobyxmoadg = textView;
        this.f19212zoijcleaow = textView2;
    }

    public static dxjokdxxww iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new dxjokdxxww(textView, textView);
    }

    public static dxjokdxxww ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(u71.eablkybsjg.item_evropolis_dialog_terms_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public TextView getRoot() {
        return this.f19211iobyxmoadg;
    }
}
