package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;

/* JADX INFO: loaded from: classes.dex */
public final class fiwbwshyhd {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final fiwbwshyhd f6888iobyxmoadg = new fiwbwshyhd();

    private fiwbwshyhd() {
    }

    public final boolean iobyxmoadg(Context context) {
        return Build.VERSION.SDK_INT >= 31 && ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
    }
}
