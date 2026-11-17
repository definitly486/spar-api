package gc;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xb.btonecajqb;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final File f36801eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final File f36802gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final String f36803iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final File f36804lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final File f36805ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final File f36806wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final File f36807zoijcleaow;

    public lqeggnwhkg(Context context) {
        String str;
        String strWkgbmnqykc = btonecajqb.f121951iobyxmoadg.eablkybsjg(context).wkgbmnqykc();
        this.f36803iobyxmoadg = strWkgbmnqykc;
        File filesDir = context.getFilesDir();
        this.f36807zoijcleaow = filesDir;
        if (esjtqupxsv()) {
            str = ".crashlytics.v3" + File.separator + cqumvgiudr(strWkgbmnqykc);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileZdlpuopuiu = zdlpuopuiu(new File(filesDir, str));
        this.f36805ppxfxbqfkf = fileZdlpuopuiu;
        this.f36806wkgbmnqykc = zdlpuopuiu(new File(fileZdlpuopuiu, "open-sessions"));
        this.f36801eablkybsjg = zdlpuopuiu(new File(fileZdlpuopuiu, "reports"));
        this.f36802gxszxtbevo = zdlpuopuiu(new File(fileZdlpuopuiu, "priority-reports"));
        this.f36804lqeggnwhkg = zdlpuopuiu(new File(fileZdlpuopuiu, "native-reports"));
    }

    static String cqumvgiudr(String str) {
        return str.length() > 40 ? ac.btonecajqb.lereixgezr(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean esjtqupxsv() {
        return !this.f36803iobyxmoadg.isEmpty();
    }

    private static List iwizpuwonk(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    static boolean jyumaefscl(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jyumaefscl(file2);
            }
        }
        return file.delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean kcexrzcfyt(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    private void ppxfxbqfkf(final String str) {
        String[] list;
        if (!this.f36807zoijcleaow.exists() || (list = this.f36807zoijcleaow.list(new FilenameFilter() { // from class: gc.gxszxtbevo
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return lqeggnwhkg.kcexrzcfyt(str, file, str2);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            zoijcleaow(str2);
        }
    }

    private File rgvfuqvkyq(String str) {
        return yggfygwlhe(new File(this.f36806wkgbmnqykc, str));
    }

    private static File yggfygwlhe(File file) {
        file.mkdirs();
        return file;
    }

    private static synchronized File zdlpuopuiu(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                xb.lqeggnwhkg.gxszxtbevo().wkgbmnqykc("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void zoijcleaow(String str) {
        File file = new File(this.f36807zoijcleaow, str);
        if (file.exists() && jyumaefscl(file)) {
            xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    public File agtfadlqog(String str) {
        return new File(this.f36801eablkybsjg, str);
    }

    public List btonecajqb() {
        return iwizpuwonk(this.f36804lqeggnwhkg.listFiles());
    }

    public File draadjrbmk(String str) {
        return new File(this.f36802gxszxtbevo, str);
    }

    public File dxjokdxxww(String str) {
        return new File(this.f36804lqeggnwhkg, str);
    }

    public boolean eablkybsjg(String str) {
        return jyumaefscl(new File(this.f36806wkgbmnqykc, str));
    }

    public File gtknphoqwx(String str) {
        return yggfygwlhe(new File(rgvfuqvkyq(str), "native"));
    }

    public List gxszxtbevo() {
        return iwizpuwonk(this.f36806wkgbmnqykc.list());
    }

    public File lqeggnwhkg(String str) {
        return new File(this.f36805ppxfxbqfkf, str);
    }

    public List nufgyqmvbu(FilenameFilter filenameFilter) {
        return iwizpuwonk(this.f36805ppxfxbqfkf.listFiles(filenameFilter));
    }

    public List ojitshcjhn() {
        return iwizpuwonk(this.f36801eablkybsjg.listFiles());
    }

    public List oxmwwwfdhm(String str, FilenameFilter filenameFilter) {
        return iwizpuwonk(rgvfuqvkyq(str).listFiles(filenameFilter));
    }

    public File vdvldrhtss(String str, String str2) {
        return new File(rgvfuqvkyq(str), str2);
    }

    public List wflxmlrfwp() {
        return iwizpuwonk(this.f36802gxszxtbevo.listFiles());
    }

    public void wkgbmnqykc() {
        zoijcleaow(".com.google.firebase.crashlytics");
        zoijcleaow(".com.google.firebase.crashlytics-ndk");
        if (esjtqupxsv()) {
            zoijcleaow(".com.google.firebase.crashlytics.files.v1");
            ppxfxbqfkf(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }
}
