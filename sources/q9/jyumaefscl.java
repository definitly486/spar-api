package q9;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
abstract class jyumaefscl implements Closeable {

    interface iobyxmoadg {
        jyumaefscl build();

        iobyxmoadg iobyxmoadg(Context context);
    }

    jyumaefscl() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        iobyxmoadg().close();
    }

    abstract y9.wkgbmnqykc iobyxmoadg();

    abstract yggfygwlhe wkgbmnqykc();
}
