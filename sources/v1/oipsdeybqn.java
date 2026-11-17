package v1;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public abstract class oipsdeybqn {

    static class iobyxmoadg {
        static void iobyxmoadg(Window window, boolean z13) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z13 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    static class ppxfxbqfkf {
        static void iobyxmoadg(Window window, boolean z13) {
            window.setDecorFitsSystemWindows(z13);
        }
    }

    static class zoijcleaow {
        static void iobyxmoadg(Window window, boolean z13) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z13 ? systemUiVisibility & (-257) : systemUiVisibility | UserVerificationMethods.USER_VERIFY_HANDPRINT);
            window.setDecorFitsSystemWindows(z13);
        }
    }

    public static g iobyxmoadg(Window window, View view) {
        return new g(window, view);
    }

    public static void zoijcleaow(Window window, boolean z13) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 35) {
            ppxfxbqfkf.iobyxmoadg(window, z13);
        } else if (i13 >= 30) {
            zoijcleaow.iobyxmoadg(window, z13);
        } else {
            iobyxmoadg.iobyxmoadg(window, z13);
        }
    }
}
