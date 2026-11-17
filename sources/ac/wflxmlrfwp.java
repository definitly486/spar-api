package ac;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gc.lqeggnwhkg f1461iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final FilenameFilter f1460wkgbmnqykc = new FilenameFilter() { // from class: ac.gtknphoqwx
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return wflxmlrfwp.wkgbmnqykc(file, str);
        }
    };

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final Comparator f1459eablkybsjg = new Comparator() { // from class: ac.draadjrbmk
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return wflxmlrfwp.eablkybsjg((File) obj, (File) obj2);
        }
    };

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f1463zoijcleaow = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f1462ppxfxbqfkf = null;

    wflxmlrfwp(gc.lqeggnwhkg lqeggnwhkgVar) {
        this.f1461iobyxmoadg = lqeggnwhkgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int eablkybsjg(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void gxszxtbevo(gc.lqeggnwhkg lqeggnwhkgVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            lqeggnwhkgVar.vdvldrhtss(str, "aqs." + str2).createNewFile();
        } catch (IOException e13) {
            xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Failed to persist App Quality Sessions session id.", e13);
        }
    }

    static String lqeggnwhkg(gc.lqeggnwhkg lqeggnwhkgVar, String str) {
        List listOxmwwwfdhm = lqeggnwhkgVar.oxmwwwfdhm(str, f1460wkgbmnqykc);
        if (!listOxmwwwfdhm.isEmpty()) {
            return ((File) Collections.min(listOxmwwwfdhm, f1459eablkybsjg)).getName().substring(4);
        }
        xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Unable to read App Quality Sessions session id.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean wkgbmnqykc(File file, String str) {
        return str.startsWith("aqs.");
    }

    public synchronized void dxjokdxxww(String str) {
        if (!Objects.equals(this.f1463zoijcleaow, str)) {
            gxszxtbevo(this.f1461iobyxmoadg, str, this.f1462ppxfxbqfkf);
            this.f1463zoijcleaow = str;
        }
    }

    public synchronized void nufgyqmvbu(String str) {
        if (!Objects.equals(this.f1462ppxfxbqfkf, str)) {
            gxszxtbevo(this.f1461iobyxmoadg, this.f1463zoijcleaow, str);
            this.f1462ppxfxbqfkf = str;
        }
    }

    public synchronized String ppxfxbqfkf(String str) {
        if (Objects.equals(this.f1463zoijcleaow, str)) {
            return this.f1462ppxfxbqfkf;
        }
        return lqeggnwhkg(this.f1461iobyxmoadg, str);
    }
}
