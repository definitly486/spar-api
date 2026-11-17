package androidx.fragment.app;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
final class kegysxyocb extends Writer {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private StringBuilder f9279yggfygwlhe = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f9280zdlpuopuiu;

    kegysxyocb(String str) {
        this.f9280zdlpuopuiu = str;
    }

    private void iobyxmoadg() {
        if (this.f9279yggfygwlhe.length() > 0) {
            Log.d(this.f9280zdlpuopuiu, this.f9279yggfygwlhe.toString());
            StringBuilder sb3 = this.f9279yggfygwlhe;
            sb3.delete(0, sb3.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        iobyxmoadg();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        iobyxmoadg();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i13, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            char c13 = cArr[i13 + i15];
            if (c13 == '\n') {
                iobyxmoadg();
            } else {
                this.f9279yggfygwlhe.append(c13);
            }
        }
    }
}
