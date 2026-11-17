package i2;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import u1.nufgyqmvbu;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Object f41705iobyxmoadg = new Object();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Object f41706zoijcleaow = new Object();

    /* JADX INFO: renamed from: i2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static abstract class AbstractC0977iobyxmoadg {
    }

    public static iobyxmoadg iobyxmoadg() {
        synchronized (f41705iobyxmoadg) {
            nufgyqmvbu.dxjokdxxww(false, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return null;
    }

    public static boolean ppxfxbqfkf(Editable editable, int i13, KeyEvent keyEvent) {
        return zoijcleaow.ppxfxbqfkf(editable, i13, keyEvent);
    }

    public static boolean wkgbmnqykc() {
        return false;
    }

    public static boolean zoijcleaow(InputConnection inputConnection, Editable editable, int i13, int i14, boolean z13) {
        return zoijcleaow.zoijcleaow(inputConnection, editable, i13, i14, z13);
    }
}
