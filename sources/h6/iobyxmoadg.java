package h6;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f39553iobyxmoadg = new iobyxmoadg();

    private iobyxmoadg() {
    }

    public final File iobyxmoadg(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
