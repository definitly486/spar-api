package rj;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public interface jyumaefscl {

    public static final class iobyxmoadg {
        public static /* synthetic */ void iobyxmoadg(jyumaefscl jyumaefsclVar, CancellationException cancellationException, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i13 & 1) != 0) {
                cancellationException = null;
            }
            jyumaefsclVar.nufgyqmvbu(cancellationException);
        }
    }

    xj.gxszxtbevo dxjokdxxww();

    Object gtknphoqwx();

    dxjokdxxww iterator();

    void nufgyqmvbu(CancellationException cancellationException);

    Object ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar);

    Object wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar);
}
