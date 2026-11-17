package wa;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f119114iobyxmoadg;

    public agtfadlqog(String str) {
        this.f119114iobyxmoadg = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    private static String gxszxtbevo(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e13) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e13);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int eablkybsjg(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", gxszxtbevo(this.f119114iobyxmoadg, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }

    public final int iobyxmoadg(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", gxszxtbevo(this.f119114iobyxmoadg, "Already connected to the service.", objArr));
        }
        return 0;
    }

    public final int ppxfxbqfkf(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", gxszxtbevo(this.f119114iobyxmoadg, str, objArr), th2);
        }
        return 0;
    }

    public final int wkgbmnqykc(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", gxszxtbevo(this.f119114iobyxmoadg, str, objArr));
        }
        return 0;
    }

    public final int zoijcleaow(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", gxszxtbevo(this.f119114iobyxmoadg, "Phonesky is not installed.", objArr));
        }
        return 0;
    }
}
