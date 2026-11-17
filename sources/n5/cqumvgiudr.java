package n5;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class cqumvgiudr implements u5.nufgyqmvbu, nufgyqmvbu {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int f68790cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final u5.nufgyqmvbu f68791esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Callable f68792iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final File f68793jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private lqeggnwhkg f68794lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f68795pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f68796yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f68797zdlpuopuiu;

    public cqumvgiudr(Context context, String str, File file, Callable callable, int i13, u5.nufgyqmvbu delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f68797zdlpuopuiu = context;
        this.f68796yggfygwlhe = str;
        this.f68793jyumaefscl = file;
        this.f68792iwizpuwonk = callable;
        this.f68790cqumvgiudr = i13;
        this.f68791esjtqupxsv = delegate;
    }

    private final void dxjokdxxww(boolean z13) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.f68797zdlpuopuiu.getDatabasePath(databaseName);
        lqeggnwhkg lqeggnwhkgVar = this.f68794lereixgezr;
        lqeggnwhkg lqeggnwhkgVar2 = null;
        if (lqeggnwhkgVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("databaseConfiguration");
            lqeggnwhkgVar = null;
        }
        w5.iobyxmoadg iobyxmoadgVar = new w5.iobyxmoadg(databaseName, this.f68797zdlpuopuiu.getFilesDir(), lqeggnwhkgVar.f68825kcexrzcfyt);
        try {
            w5.iobyxmoadg.ppxfxbqfkf(iobyxmoadgVar, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(databaseFile, "databaseFile");
                    wkgbmnqykc(databaseFile, z13);
                    iobyxmoadgVar.wkgbmnqykc();
                    return;
                } catch (IOException e13) {
                    throw new RuntimeException("Unable to copy database file.", e13);
                }
            }
            try {
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(databaseFile, "databaseFile");
                int iWkgbmnqykc = p5.zoijcleaow.wkgbmnqykc(databaseFile);
                if (iWkgbmnqykc == this.f68790cqumvgiudr) {
                    iobyxmoadgVar.wkgbmnqykc();
                    return;
                }
                lqeggnwhkg lqeggnwhkgVar3 = this.f68794lereixgezr;
                if (lqeggnwhkgVar3 == null) {
                    kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("databaseConfiguration");
                } else {
                    lqeggnwhkgVar2 = lqeggnwhkgVar3;
                }
                if (lqeggnwhkgVar2.iobyxmoadg(iWkgbmnqykc, this.f68790cqumvgiudr)) {
                    iobyxmoadgVar.wkgbmnqykc();
                    return;
                }
                if (this.f68797zdlpuopuiu.deleteDatabase(databaseName)) {
                    try {
                        wkgbmnqykc(databaseFile, z13);
                    } catch (IOException e14) {
                        Log.w("ROOM", "Unable to copy database file.", e14);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                iobyxmoadgVar.wkgbmnqykc();
                return;
            } catch (IOException e15) {
                Log.w("ROOM", "Unable to read database version.", e15);
                iobyxmoadgVar.wkgbmnqykc();
                return;
            }
        } catch (Throwable th2) {
            iobyxmoadgVar.wkgbmnqykc();
            throw th2;
        }
        iobyxmoadgVar.wkgbmnqykc();
        throw th2;
    }

    private final void lqeggnwhkg(File file, boolean z13) {
        lqeggnwhkg lqeggnwhkgVar = this.f68794lereixgezr;
        if (lqeggnwhkgVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("databaseConfiguration");
            lqeggnwhkgVar = null;
        }
        lqeggnwhkgVar.getClass();
    }

    private final void wkgbmnqykc(File file, boolean z13) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f68796yggfygwlhe != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f68797zdlpuopuiu.getAssets().open(this.f68796yggfygwlhe));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f68793jyumaefscl != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f68793jyumaefscl).getChannel();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f68792iwizpuwonk;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel((InputStream) callable.call());
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e13) {
                throw new IOException("inputStreamCallable exception on call", e13);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f68797zdlpuopuiu.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(output, "output");
        p5.ppxfxbqfkf.iobyxmoadg(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(intermediateFile, "intermediateFile");
        lqeggnwhkg(intermediateFile, z13);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    @Override // u5.nufgyqmvbu, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        iobyxmoadg().close();
        this.f68795pmvmpeiblj = false;
    }

    @Override // u5.nufgyqmvbu
    public String getDatabaseName() {
        return iobyxmoadg().getDatabaseName();
    }

    @Override // u5.nufgyqmvbu
    public u5.lqeggnwhkg getWritableDatabase() {
        if (!this.f68795pmvmpeiblj) {
            dxjokdxxww(true);
            this.f68795pmvmpeiblj = true;
        }
        return iobyxmoadg().getWritableDatabase();
    }

    @Override // n5.nufgyqmvbu
    public u5.nufgyqmvbu iobyxmoadg() {
        return this.f68791esjtqupxsv;
    }

    public final void nufgyqmvbu(lqeggnwhkg databaseConfiguration) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(databaseConfiguration, "databaseConfiguration");
        this.f68794lereixgezr = databaseConfiguration;
    }

    @Override // u5.nufgyqmvbu
    public void setWriteAheadLoggingEnabled(boolean z13) {
        iobyxmoadg().setWriteAheadLoggingEnabled(z13);
    }
}
