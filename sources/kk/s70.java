package kk;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class s70 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final FrameLayout f58527iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final WebView f58528ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f58529zoijcleaow;

    public s70(FrameLayout frameLayout, AppCompatTextView appCompatTextView, WebView webView) {
        this.f58527iobyxmoadg = frameLayout;
        this.f58529zoijcleaow = appCompatTextView;
        this.f58528ppxfxbqfkf = webView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f58527iobyxmoadg;
    }
}
