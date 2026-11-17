package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public final String f10029cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public final androidx.media3.common.iobyxmoadg f10030iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public final int f10031istkbnxepw;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public final int f10032lmojexxdyd;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow f10033wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public final int f10034yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    final boolean f10035ylkuphrtab;

    private ExoPlaybackException(int i13, Throwable th2, int i14) {
        this(i13, th2, null, i14, null, -1, null, 4, false);
    }

    private static String dxjokdxxww(int i13, String str, String str2, int i14, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i15) {
        String str3;
        if (i13 == 0) {
            str3 = "Source error";
        } else if (i13 != 1) {
            str3 = i13 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i14 + ", format=" + iobyxmoadgVar + ", format_supported=" + y2.stevsuqkhv.ribwqtqdhb(i15);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    public static ExoPlaybackException lqeggnwhkg(IOException iOException, int i13) {
        return new ExoPlaybackException(0, iOException, i13);
    }

    public static ExoPlaybackException nufgyqmvbu(RuntimeException runtimeException, int i13) {
        return new ExoPlaybackException(2, runtimeException, i13);
    }

    public static ExoPlaybackException wkgbmnqykc(Throwable th2, String str, int i13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i14, boolean z13, int i15) {
        return new ExoPlaybackException(1, th2, null, i15, str, i13, iobyxmoadgVar, iobyxmoadgVar == null ? 4 : i14, z13);
    }

    ExoPlaybackException iobyxmoadg(androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        return new ExoPlaybackException((String) y2.stevsuqkhv.nufgyqmvbu(getMessage()), getCause(), this.f9641zdlpuopuiu, this.f10031istkbnxepw, this.f10029cdpycssgdh, this.f10034yadqdtsiqt, this.f10030iozdgvuglv, this.f10032lmojexxdyd, zoijcleaowVar, this.f9640yggfygwlhe, this.f10035ylkuphrtab);
    }

    private ExoPlaybackException(int i13, Throwable th2, String str, int i14, String str2, int i15, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i16, boolean z13) {
        this(dxjokdxxww(i13, str, str2, i15, iobyxmoadgVar, i16), th2, i14, i13, str2, i15, iobyxmoadgVar, i16, null, SystemClock.elapsedRealtime(), z13);
    }

    private ExoPlaybackException(String str, Throwable th2, int i13, int i14, String str2, int i15, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i16, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, long j13, boolean z13) {
        super(str, th2, i13, Bundle.EMPTY, j13);
        y2.iobyxmoadg.iobyxmoadg(!z13 || i14 == 1);
        y2.iobyxmoadg.iobyxmoadg(th2 != null || i14 == 3);
        this.f10031istkbnxepw = i14;
        this.f10029cdpycssgdh = str2;
        this.f10034yadqdtsiqt = i15;
        this.f10030iozdgvuglv = iobyxmoadgVar;
        this.f10032lmojexxdyd = i16;
        this.f10033wwaezpbzkn = zoijcleaowVar;
        this.f10035ylkuphrtab = z13;
    }
}
