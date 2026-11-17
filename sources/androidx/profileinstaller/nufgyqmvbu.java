package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final androidx.concurrent.futures.gxszxtbevo f12550iobyxmoadg = androidx.concurrent.futures.gxszxtbevo.kcexrzcfyt();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Object f12552zoijcleaow = new Object();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static ppxfxbqfkf f12551ppxfxbqfkf = null;

    private static class iobyxmoadg {
        static PackageInfo iobyxmoadg(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final int f12553iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f12554ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f12555wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f12556zoijcleaow;

        ppxfxbqfkf(int i13, boolean z13, boolean z14, boolean z15) {
            this.f12553iobyxmoadg = i13;
            this.f12554ppxfxbqfkf = z14;
            this.f12556zoijcleaow = z13;
            this.f12555wkgbmnqykc = z15;
        }
    }

    static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final int f12557iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final long f12558ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final long f12559wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final int f12560zoijcleaow;

        zoijcleaow(int i13, int i14, long j13, long j14) {
            this.f12557iobyxmoadg = i13;
            this.f12560zoijcleaow = i14;
            this.f12558ppxfxbqfkf = j13;
            this.f12559wkgbmnqykc = j14;
        }

        static zoijcleaow iobyxmoadg(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                zoijcleaow zoijcleaowVar = new zoijcleaow(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return zoijcleaowVar;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f12560zoijcleaow == zoijcleaowVar.f12560zoijcleaow && this.f12558ppxfxbqfkf == zoijcleaowVar.f12558ppxfxbqfkf && this.f12557iobyxmoadg == zoijcleaowVar.f12557iobyxmoadg && this.f12559wkgbmnqykc == zoijcleaowVar.f12559wkgbmnqykc;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f12560zoijcleaow), Long.valueOf(this.f12558ppxfxbqfkf), Integer.valueOf(this.f12557iobyxmoadg), Long.valueOf(this.f12559wkgbmnqykc));
        }

        void zoijcleaow(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f12557iobyxmoadg);
                dataOutputStream.writeInt(this.f12560zoijcleaow);
                dataOutputStream.writeLong(this.f12558ppxfxbqfkf);
                dataOutputStream.writeLong(this.f12559wkgbmnqykc);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private static long iobyxmoadg(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? iobyxmoadg.iobyxmoadg(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:44:0x006f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    static ppxfxbqfkf ppxfxbqfkf(Context context, boolean z13) {
        int i13;
        boolean z14;
        int i14;
        File file;
        boolean z15;
        File file2;
        long length;
        boolean z16;
        File file3;
        zoijcleaow zoijcleaowVarIobyxmoadg;
        zoijcleaow zoijcleaowVar;
        int i15;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        ppxfxbqfkf ppxfxbqfkfVar;
        if (!z13 && (ppxfxbqfkfVar = f12551ppxfxbqfkf) != null) {
            return ppxfxbqfkfVar;
        }
        synchronized (f12552zoijcleaow) {
            if (z13) {
                i13 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                assetFileDescriptorOpenFd.close();
                i14 = Build.VERSION.SDK_INT;
                if (i14 >= 28) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    long jIobyxmoadg = iobyxmoadg(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        zoijcleaowVarIobyxmoadg = zoijcleaow.iobyxmoadg(file3);
                    } else {
                        zoijcleaowVarIobyxmoadg = null;
                    }
                    if (zoijcleaowVarIobyxmoadg == null) {
                        if (!z14) {
                            i13 = 327680;
                        } else if (z15) {
                            i13 = 1;
                        } else if (z16) {
                            i13 = 2;
                        }
                    } else if (!z14) {
                        i13 = 327680;
                    } else if (z15) {
                        i13 = 1;
                    } else if (z16) {
                        i13 = 2;
                    }
                    if (z13) {
                        i13 = 2;
                    }
                    if (zoijcleaowVarIobyxmoadg != null) {
                        i13 = 3;
                    }
                    zoijcleaowVar = new zoijcleaow(1, i13, jIobyxmoadg, length);
                    if (zoijcleaowVarIobyxmoadg != null) {
                        zoijcleaowVar.zoijcleaow(file3);
                    } else {
                        zoijcleaowVar.zoijcleaow(file3);
                    }
                    return zoijcleaow(i13, z15, z16, z14);
                }
                return zoijcleaow(262144, false, false, z14);
            }
            ppxfxbqfkf ppxfxbqfkfVar2 = f12551ppxfxbqfkf;
            if (ppxfxbqfkfVar2 != null) {
                return ppxfxbqfkfVar2;
            }
            i13 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th2) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th2;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                z14 = false;
            }
            i14 = Build.VERSION.SDK_INT;
            if (i14 >= 28 && i14 != 30) {
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                try {
                    long jIobyxmoadg2 = iobyxmoadg(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            zoijcleaowVarIobyxmoadg = zoijcleaow.iobyxmoadg(file3);
                        } catch (IOException unused2) {
                            return zoijcleaow(131072, z15, z16, z14);
                        }
                    } else {
                        zoijcleaowVarIobyxmoadg = null;
                    }
                    if (zoijcleaowVarIobyxmoadg == null && zoijcleaowVarIobyxmoadg.f12558ppxfxbqfkf == jIobyxmoadg2 && (i15 = zoijcleaowVarIobyxmoadg.f12560zoijcleaow) != 2) {
                        i13 = i15;
                    } else if (!z14) {
                        i13 = 327680;
                    } else if (z15) {
                        i13 = 1;
                    } else if (z16) {
                        i13 = 2;
                    }
                    if (z13 && z16 && i13 != 1) {
                        i13 = 2;
                    }
                    if (zoijcleaowVarIobyxmoadg != null && zoijcleaowVarIobyxmoadg.f12560zoijcleaow == 2 && i13 == 1 && length3 < zoijcleaowVarIobyxmoadg.f12559wkgbmnqykc) {
                        i13 = 3;
                    }
                    zoijcleaowVar = new zoijcleaow(1, i13, jIobyxmoadg2, length);
                    if (zoijcleaowVarIobyxmoadg != null || !zoijcleaowVarIobyxmoadg.equals(zoijcleaowVar)) {
                        try {
                            zoijcleaowVar.zoijcleaow(file3);
                        } catch (IOException unused3) {
                            i13 = 196608;
                        }
                    }
                    return zoijcleaow(i13, z15, z16, z14);
                } catch (PackageManager.NameNotFoundException unused4) {
                    return zoijcleaow(65536, z15, z16, z14);
                }
            }
            return zoijcleaow(262144, false, false, z14);
            throw th;
        }
    }

    private static ppxfxbqfkf zoijcleaow(int i13, boolean z13, boolean z14, boolean z15) {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(i13, z13, z14, z15);
        f12551ppxfxbqfkf = ppxfxbqfkfVar;
        f12550iobyxmoadg.ojitshcjhn(ppxfxbqfkfVar);
        return f12551ppxfxbqfkf;
    }
}
