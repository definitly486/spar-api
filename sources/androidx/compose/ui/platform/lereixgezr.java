package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
final class lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final lereixgezr f7001iobyxmoadg = new lereixgezr();

    private lereixgezr() {
    }

    public final void iobyxmoadg(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
