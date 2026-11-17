package org.xbill.DNS;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public interface f {
    CompletionStage eablkybsjg(zfvoamnweg zfvoamnwegVar);

    void iobyxmoadg(Duration duration);

    default zfvoamnweg ppxfxbqfkf(zfvoamnweg zfvoamnwegVar) {
        try {
            return (zfvoamnweg) eablkybsjg(zfvoamnwegVar).toCompletableFuture().get(zoijcleaow().toMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e13) {
            Thread.currentThread().interrupt();
            throw new IOException(e13);
        } catch (ExecutionException e14) {
            if (e14.getCause() instanceof IOException) {
                throw ((IOException) e14.getCause());
            }
            throw new IOException(e14.getCause());
        } catch (TimeoutException e15) {
            throw new IOException("Timed out while trying to resolve " + zfvoamnwegVar.eablkybsjg().cqumvgiudr() + CardDateFormatTextWatcher.DIVIDER_CHARACTER + x2.wkgbmnqykc(zfvoamnwegVar.eablkybsjg().f74322yggfygwlhe) + ", id=" + zfvoamnwegVar.ppxfxbqfkf().gxszxtbevo(), e15);
        }
    }

    CompletionStage wkgbmnqykc(zfvoamnweg zfvoamnwegVar, Executor executor);

    Duration zoijcleaow();
}
