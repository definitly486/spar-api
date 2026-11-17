package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk implements weqkydbzbr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ClipboardManager f6846iobyxmoadg;

    public draadjrbmk(ClipboardManager clipboardManager) {
        this.f6846iobyxmoadg = clipboardManager;
    }

    public opjhrmiecq iobyxmoadg() {
        ClipData primaryClip = this.f6846iobyxmoadg.getPrimaryClip();
        if (primaryClip != null) {
            return new opjhrmiecq(primaryClip);
        }
        return null;
    }

    public void ppxfxbqfkf(opjhrmiecq opjhrmiecqVar) {
        if (opjhrmiecqVar != null) {
            this.f6846iobyxmoadg.setPrimaryClip(opjhrmiecqVar.iobyxmoadg());
        } else if (Build.VERSION.SDK_INT >= 28) {
            jhduphickx.iobyxmoadg(this.f6846iobyxmoadg);
        } else {
            this.f6846iobyxmoadg.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }

    public boolean zoijcleaow() {
        ClipDescription primaryClipDescription = this.f6846iobyxmoadg.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public draadjrbmk(Context context) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }
}
