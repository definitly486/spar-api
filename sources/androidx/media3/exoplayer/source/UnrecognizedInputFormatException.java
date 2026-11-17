package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UnrecognizedInputFormatException extends ParserException {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final com.google.common.collect.zdlpuopuiu f11098iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final Uri f11099jyumaefscl;

    public UnrecognizedInputFormatException(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.f11099jyumaefscl = uri;
        this.f11098iwizpuwonk = com.google.common.collect.zdlpuopuiu.jyumaefscl(list);
    }
}
