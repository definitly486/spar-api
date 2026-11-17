package w5;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final C2954iobyxmoadg f118766eablkybsjg = new C2954iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final Map f118767gxszxtbevo = new HashMap();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f118768iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Lock f118769ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private FileChannel f118770wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final File f118771zoijcleaow;

    /* JADX INFO: renamed from: w5.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2954iobyxmoadg {
        public /* synthetic */ C2954iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock zoijcleaow(String str) {
            Lock lock;
            synchronized (iobyxmoadg.f118767gxszxtbevo) {
                try {
                    Map map = iobyxmoadg.f118767gxszxtbevo;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lock;
        }

        private C2954iobyxmoadg() {
        }
    }

    public iobyxmoadg(String name, File file, boolean z13) {
        File file2;
        zdlpuopuiu.btonecajqb(name, "name");
        this.f118768iobyxmoadg = z13;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f118771zoijcleaow = file2;
        this.f118769ppxfxbqfkf = f118766eablkybsjg.zoijcleaow(name);
    }

    public static /* synthetic */ void ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = iobyxmoadgVar.f118768iobyxmoadg;
        }
        iobyxmoadgVar.zoijcleaow(z13);
    }

    public final void wkgbmnqykc() {
        try {
            FileChannel fileChannel = this.f118770wkgbmnqykc;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f118769ppxfxbqfkf.unlock();
    }

    public final void zoijcleaow(boolean z13) {
        this.f118769ppxfxbqfkf.lock();
        if (z13) {
            try {
                File file = this.f118771zoijcleaow;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f118771zoijcleaow).getChannel();
                channel.lock();
                this.f118770wkgbmnqykc = channel;
            } catch (IOException e13) {
                this.f118770wkgbmnqykc = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e13);
            }
        }
    }
}
