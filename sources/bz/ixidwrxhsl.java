package bz;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ixidwrxhsl extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Set f17478eablkybsjg;

    ixidwrxhsl(Set set) {
        super(kc2.lqeggnwhkg.FileSystemInfo);
        this.f17478eablkybsjg = set;
    }

    private String yadqdtsiqt(File file) {
        return String.valueOf(new StatFs(file.getPath()).getTotalBytes());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg lereixgezr() {
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        if (this.f17478eablkybsjg.contains(kc2.lqeggnwhkg.RootBytes)) {
            iobyxmoadgVar.put("RootBytes", yadqdtsiqt(Environment.getRootDirectory()));
        }
        if (this.f17478eablkybsjg.contains(kc2.lqeggnwhkg.DataBytes)) {
            iobyxmoadgVar.put("DataBytes", yadqdtsiqt(Environment.getDataDirectory()));
        }
        if (this.f17478eablkybsjg.contains(kc2.lqeggnwhkg.ExStorageBytes)) {
            iobyxmoadgVar.put("ExStorageBytes", yadqdtsiqt(Environment.getExternalStorageDirectory()));
        }
        return iobyxmoadgVar;
    }
}
