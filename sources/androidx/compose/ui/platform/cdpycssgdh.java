package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: loaded from: classes.dex */
final class cdpycssgdh implements ViewTranslationCallback {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final cdpycssgdh f6774iobyxmoadg = new cdpycssgdh();

    private cdpycssgdh() {
    }

    public boolean onClearTranslation(View view) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().zdlpuopuiu();
        return true;
    }

    public boolean onHideTranslation(View view) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().jyumaefscl();
        return true;
    }

    public boolean onShowTranslation(View view) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().esjtqupxsv();
        return true;
    }
}
