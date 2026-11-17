package rj;

import java.util.concurrent.CancellationException;
import pj.zfvoamnweg;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class rgvfuqvkyq {
    public static final void iobyxmoadg(jyumaefscl jyumaefsclVar, Throwable th2) {
        CancellationException cancellationExceptionIobyxmoadg = null;
        if (th2 != null) {
            cancellationExceptionIobyxmoadg = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionIobyxmoadg == null) {
                cancellationExceptionIobyxmoadg = zfvoamnweg.iobyxmoadg("Channel was consumed, consumer had failed", th2);
            }
        }
        jyumaefsclVar.nufgyqmvbu(cancellationExceptionIobyxmoadg);
    }
}
