package h6;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ylkuphrtab f39663iobyxmoadg = new ylkuphrtab();

    private ylkuphrtab() {
    }

    private final File ppxfxbqfkf(Context context) {
        return new File(iobyxmoadg.f39553iobyxmoadg.iobyxmoadg(context), "androidx.work.workdb");
    }

    public static final void wkgbmnqykc(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        ylkuphrtab ylkuphrtabVar = f39663iobyxmoadg;
        if (ylkuphrtabVar.zoijcleaow(context).exists()) {
            g6.yggfygwlhe.eablkybsjg().iobyxmoadg(pkzmftpjix.f39637iobyxmoadg, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : ylkuphrtabVar.eablkybsjg(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        g6.yggfygwlhe.eablkybsjg().gtknphoqwx(pkzmftpjix.f39637iobyxmoadg, "Over-writing contents of " + file2);
                    }
                    g6.yggfygwlhe.eablkybsjg().iobyxmoadg(pkzmftpjix.f39637iobyxmoadg, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public final Map eablkybsjg(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        File fileZoijcleaow = zoijcleaow(context);
        File fileIobyxmoadg = iobyxmoadg(context);
        String[] strArr = pkzmftpjix.f39638zoijcleaow;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(strArr.length), 16));
        for (String str : strArr) {
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(new File(fileZoijcleaow.getPath() + str), new File(fileIobyxmoadg.getPath() + str));
            linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        return hg.tzroggbefp.ojitshcjhn(linkedHashMap, gg.cqumvgiudr.iobyxmoadg(fileZoijcleaow, fileIobyxmoadg));
    }

    public final File iobyxmoadg(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        return ppxfxbqfkf(context);
    }

    public final File zoijcleaow(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }
}
