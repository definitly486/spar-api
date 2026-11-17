package modern.payments.tracker.util.logging;

import android.content.Context;
import androidx.core.content.iobyxmoadg;
import hg.agtfadlqog;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tJ\f\u0010\n\u001a\u00020\u0006*\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lmodern/payments/tracker/util/logging/ExternalLogFileStorage;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getExternalFileStorage", "Ljava/io/File;", "getFileStorageDirectory", "directory", "", "prepareDirectory", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExternalLogFileStorage {
    private static final String DEFAULT_LOG_FILE_DIR = "SDK_logs";
    private static final String FILE_NAME = "SDK_logs";
    private static final String MIME_TYPE_TXT = "text/plain";
    private final Context context;

    public ExternalLogFileStorage(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.context = context;
    }

    private final File getExternalFileStorage() {
        File[] externalFilesDirs = iobyxmoadg.getExternalFilesDirs(this.context, null);
        zdlpuopuiu.dxjokdxxww(externalFilesDirs, "getExternalFilesDirs(...)");
        return (File) agtfadlqog.ydmasvzmpa(externalFilesDirs);
    }

    public static /* synthetic */ File getFileStorageDirectory$default(ExternalLogFileStorage externalLogFileStorage, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "SDK_logs";
        }
        return externalLogFileStorage.getFileStorageDirectory(str);
    }

    private final File prepareDirectory(File file) {
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final File getFileStorageDirectory(String directory) {
        zdlpuopuiu.btonecajqb(directory, "directory");
        return prepareDirectory(new File(getExternalFileStorage(), directory));
    }
}
