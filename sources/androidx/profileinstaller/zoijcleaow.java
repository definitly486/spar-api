package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import io.appmetrica.analytics.impl.C4007z9;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private ppxfxbqfkf[] f12570btonecajqb;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final File f12572eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private byte[] f12573gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f12574gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AssetManager f12575iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f12576lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f12577nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gxszxtbevo.ppxfxbqfkf f12578ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Executor f12580zoijcleaow;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f12571dxjokdxxww = false;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final byte[] f12579wkgbmnqykc = wkgbmnqykc();

    public zoijcleaow(AssetManager assetManager, Executor executor, gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar, String str, String str2, String str3, File file) {
        this.f12575iobyxmoadg = assetManager;
        this.f12580zoijcleaow = executor;
        this.f12578ppxfxbqfkf = ppxfxbqfkfVar;
        this.f12574gxszxtbevo = str;
        this.f12576lqeggnwhkg = str2;
        this.f12577nufgyqmvbu = str3;
        this.f12572eablkybsjg = file;
    }

    private ppxfxbqfkf[] btonecajqb(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        ppxfxbqfkf[] ppxfxbqfkfVarArrCqumvgiudr = lqeggnwhkg.cqumvgiudr(inputStream, lqeggnwhkg.rgvfuqvkyq(inputStream, lqeggnwhkg.f12548iobyxmoadg), this.f12574gxszxtbevo);
                        try {
                            return ppxfxbqfkfVarArrCqumvgiudr;
                        } catch (IOException e13) {
                            return ppxfxbqfkfVarArrCqumvgiudr;
                        }
                    } catch (IOException e14) {
                        this.f12578ppxfxbqfkf.iobyxmoadg(7, e14);
                        return null;
                    }
                } catch (IllegalStateException e15) {
                    this.f12578ppxfxbqfkf.iobyxmoadg(8, e15);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e16) {
                this.f12578ppxfxbqfkf.iobyxmoadg(7, e16);
                inputStream.close();
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e17) {
                this.f12578ppxfxbqfkf.iobyxmoadg(7, e17);
            }
        }
    }

    private void draadjrbmk(final int i13, final Object obj) {
        this.f12580zoijcleaow.execute(new Runnable() { // from class: l5.iobyxmoadg
            @Override // java.lang.Runnable
            public final void run() {
                this.f61598zdlpuopuiu.lqeggnwhkg(i13, obj);
            }
        });
    }

    private static boolean gtknphoqwx() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private InputStream gxszxtbevo(AssetManager assetManager) {
        try {
            return nufgyqmvbu(assetManager, this.f12576lqeggnwhkg);
        } catch (FileNotFoundException e13) {
            this.f12578ppxfxbqfkf.iobyxmoadg(6, e13);
            return null;
        } catch (IOException e14) {
            this.f12578ppxfxbqfkf.iobyxmoadg(7, e14);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lqeggnwhkg(int i13, Object obj) {
        this.f12578ppxfxbqfkf.iobyxmoadg(i13, obj);
    }

    private InputStream nufgyqmvbu(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e13) {
            String message = e13.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f12578ppxfxbqfkf.zoijcleaow(5, null);
            }
            return null;
        }
    }

    private void ppxfxbqfkf() {
        if (!this.f12571dxjokdxxww) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] wkgbmnqykc() {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 31) {
            return dxjokdxxww.f12534iobyxmoadg;
        }
        switch (i13) {
            case C4007z9.G /* 26 */:
                return dxjokdxxww.f12537wkgbmnqykc;
            case 27:
                return dxjokdxxww.f12536ppxfxbqfkf;
            case 28:
            case C4007z9.I /* 29 */:
            case 30:
                return dxjokdxxww.f12538zoijcleaow;
            default:
                return null;
        }
    }

    private zoijcleaow zoijcleaow(ppxfxbqfkf[] ppxfxbqfkfVarArr, byte[] bArr) {
        try {
            InputStream inputStreamNufgyqmvbu = nufgyqmvbu(this.f12575iobyxmoadg, this.f12577nufgyqmvbu);
            if (inputStreamNufgyqmvbu == null) {
                if (inputStreamNufgyqmvbu != null) {
                    inputStreamNufgyqmvbu.close();
                }
                return null;
            }
            try {
                this.f12570btonecajqb = lqeggnwhkg.oxmwwwfdhm(inputStreamNufgyqmvbu, lqeggnwhkg.rgvfuqvkyq(inputStreamNufgyqmvbu, lqeggnwhkg.f12549zoijcleaow), bArr, ppxfxbqfkfVarArr);
                inputStreamNufgyqmvbu.close();
                return this;
            } catch (Throwable th2) {
                try {
                    inputStreamNufgyqmvbu.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e13) {
            this.f12578ppxfxbqfkf.iobyxmoadg(9, e13);
        } catch (IOException e14) {
            this.f12578ppxfxbqfkf.iobyxmoadg(7, e14);
        } catch (IllegalStateException e15) {
            this.f12570btonecajqb = null;
            this.f12578ppxfxbqfkf.iobyxmoadg(8, e15);
        }
    }

    public boolean agtfadlqog() {
        byte[] bArr = this.f12573gtknphoqwx;
        if (bArr == null) {
            return false;
        }
        ppxfxbqfkf();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f12572eablkybsjg);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                wkgbmnqykc.draadjrbmk(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                draadjrbmk(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                this.f12573gtknphoqwx = null;
                                this.f12570btonecajqb = null;
                                return true;
                            } catch (Throwable th2) {
                                if (fileLockTryLock != null) {
                                    try {
                                        fileLockTryLock.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                    throw th8;
                }
            } catch (FileNotFoundException e13) {
                draadjrbmk(6, e13);
                this.f12573gtknphoqwx = null;
                this.f12570btonecajqb = null;
                return false;
            } catch (IOException e14) {
                draadjrbmk(7, e14);
                this.f12573gtknphoqwx = null;
                this.f12570btonecajqb = null;
                return false;
            }
        } catch (Throwable th10) {
            this.f12573gtknphoqwx = null;
            this.f12570btonecajqb = null;
            throw th10;
        }
    }

    public zoijcleaow dxjokdxxww() {
        zoijcleaow zoijcleaowVarZoijcleaow;
        ppxfxbqfkf();
        if (this.f12579wkgbmnqykc == null) {
            return this;
        }
        InputStream inputStreamGxszxtbevo = gxszxtbevo(this.f12575iobyxmoadg);
        if (inputStreamGxszxtbevo != null) {
            this.f12570btonecajqb = btonecajqb(inputStreamGxszxtbevo);
        }
        ppxfxbqfkf[] ppxfxbqfkfVarArr = this.f12570btonecajqb;
        return (ppxfxbqfkfVarArr == null || !gtknphoqwx() || (zoijcleaowVarZoijcleaow = zoijcleaow(ppxfxbqfkfVarArr, this.f12579wkgbmnqykc)) == null) ? this : zoijcleaowVarZoijcleaow;
    }

    public boolean eablkybsjg() {
        if (this.f12579wkgbmnqykc == null) {
            draadjrbmk(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f12572eablkybsjg.exists()) {
            try {
                if (!this.f12572eablkybsjg.createNewFile()) {
                    draadjrbmk(4, null);
                    return false;
                }
            } catch (IOException unused) {
                draadjrbmk(4, null);
                return false;
            }
        } else if (!this.f12572eablkybsjg.canWrite()) {
            draadjrbmk(4, null);
            return false;
        }
        this.f12571dxjokdxxww = true;
        return true;
    }

    public zoijcleaow wflxmlrfwp() {
        ppxfxbqfkf[] ppxfxbqfkfVarArr = this.f12570btonecajqb;
        byte[] bArr = this.f12579wkgbmnqykc;
        if (ppxfxbqfkfVarArr != null && bArr != null) {
            ppxfxbqfkf();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    lqeggnwhkg.iozdgvuglv(byteArrayOutputStream, bArr);
                    if (!lqeggnwhkg.istkbnxepw(byteArrayOutputStream, bArr, ppxfxbqfkfVarArr)) {
                        this.f12578ppxfxbqfkf.iobyxmoadg(5, null);
                        this.f12570btonecajqb = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f12573gtknphoqwx = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f12570btonecajqb = null;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e13) {
                this.f12578ppxfxbqfkf.iobyxmoadg(7, e13);
            } catch (IllegalStateException e14) {
                this.f12578ppxfxbqfkf.iobyxmoadg(8, e14);
            }
        }
        return this;
    }
}
