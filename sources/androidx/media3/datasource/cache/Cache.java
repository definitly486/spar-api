package androidx.media3.datasource.cache;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface Cache {

    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th2) {
            super(th2);
        }

        public CacheException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public interface iobyxmoadg {
        void gxszxtbevo(Cache cache, c3.ppxfxbqfkf ppxfxbqfkfVar);

        void ppxfxbqfkf(Cache cache, c3.ppxfxbqfkf ppxfxbqfkfVar, c3.ppxfxbqfkf ppxfxbqfkfVar2);

        void zoijcleaow(Cache cache, c3.ppxfxbqfkf ppxfxbqfkfVar);
    }

    void eablkybsjg(String str, c3.eablkybsjg eablkybsjgVar);

    void gxszxtbevo(c3.ppxfxbqfkf ppxfxbqfkfVar);

    File iobyxmoadg(String str, long j13, long j14);

    c3.ppxfxbqfkf lqeggnwhkg(String str, long j13, long j14);

    void nufgyqmvbu(File file, long j13);

    void ppxfxbqfkf(c3.ppxfxbqfkf ppxfxbqfkfVar);

    c3.ppxfxbqfkf wkgbmnqykc(String str, long j13, long j14);

    c3.wkgbmnqykc zoijcleaow(String str);
}
