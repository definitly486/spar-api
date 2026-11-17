package r6;

import java.util.concurrent.Executor;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes2.dex */
public interface zoijcleaow {
    Executor iobyxmoadg();

    iobyxmoadg ppxfxbqfkf();

    default void wkgbmnqykc(Runnable runnable) {
        ppxfxbqfkf().execute(runnable);
    }

    pkzmftpjix zoijcleaow();
}
