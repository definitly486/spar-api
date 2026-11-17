package bz;

import android.content.Context;
import android.os.Debug;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes2.dex */
final class ageimvtcrz extends metgxyhuhe {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final String f17376gxszxtbevo = t6.iwizpuwonk.iobyxmoadg(new byte[]{44, -23, -19, 115, -86, 9, -62, 107, 106, 64, -105, -113, -124, -65, -95, 44, -38, 21, 68, -63, -25, -78, 107, -4, -48, 19, -21, -47, 31, 71, 107, 62});

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final String f17377lqeggnwhkg = t6.iwizpuwonk.iobyxmoadg(new byte[]{39, -59, 107, 94, -10, -51, -74, -37, -60, -76, 59, -79, -95, 87, 87, 63});

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17378eablkybsjg;

    ageimvtcrz(Context context) {
        super(kc2.lqeggnwhkg.Debugger);
        this.f17378eablkybsjg = context;
    }

    private boolean iozdgvuglv() {
        boolean z13 = false;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(f17376gxszxtbevo)), UserVerificationMethods.USER_VERIFY_ALL);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    int length = line.length();
                    String str = f17377lqeggnwhkg;
                    if (length > str.length() && line.substring(0, str.length()).equalsIgnoreCase(str)) {
                        if (Integer.decode(line.substring(str.length() + 1).trim()).intValue() <= 0) {
                            break;
                        }
                        z13 = true;
                        break;
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
        } catch (IOException | NumberFormatException unused) {
        }
        return z13;
    }

    private static boolean lmojexxdyd(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static boolean yadqdtsiqt() {
        return Debug.isDebuggerConnected();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public Integer lereixgezr() {
        boolean zLmojexxdyd = lmojexxdyd(this.f17378eablkybsjg);
        ?? r13 = zLmojexxdyd;
        if (yadqdtsiqt()) {
            r13 = (zLmojexxdyd ? 1 : 0) | 2;
        }
        int i13 = r13;
        if (iozdgvuglv()) {
            i13 = (r13 == true ? 1 : 0) | 4;
        }
        return Integer.valueOf(i13);
    }
}
