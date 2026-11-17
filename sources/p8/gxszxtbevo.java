package p8;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo extends wkgbmnqykc {

    class iobyxmoadg implements wkgbmnqykc.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Context f75999iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ String f76000zoijcleaow;

        iobyxmoadg(Context context, String str) {
            this.f75999iobyxmoadg = context;
            this.f76000zoijcleaow = str;
        }

        @Override // p8.wkgbmnqykc.iobyxmoadg
        public File iobyxmoadg() {
            File cacheDir = this.f75999iobyxmoadg.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f76000zoijcleaow != null ? new File(cacheDir, this.f76000zoijcleaow) : cacheDir;
        }
    }

    public gxszxtbevo(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public gxszxtbevo(Context context, String str, long j13) {
        super(new iobyxmoadg(context, str), j13);
    }
}
