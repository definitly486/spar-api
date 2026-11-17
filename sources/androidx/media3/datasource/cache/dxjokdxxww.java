package androidx.media3.datasource.cache;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class dxjokdxxww extends c3.ppxfxbqfkf {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final Pattern f9901lereixgezr = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final Pattern f9902pmvmpeiblj = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final Pattern f9903zynmafqrjb = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private dxjokdxxww(String str, long j13, long j14, long j15, File file) {
        super(str, j13, j14, j15, file);
    }

    private static File btonecajqb(File file, gxszxtbevo gxszxtbevoVar) {
        String strS;
        String name = file.getName();
        Matcher matcher = f9902pmvmpeiblj.matcher(name);
        if (matcher.matches()) {
            strS = stevsuqkhv.s((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1)));
        } else {
            matcher = f9901lereixgezr.matcher(name);
            strS = matcher.matches() ? (String) y2.iobyxmoadg.eablkybsjg(matcher.group(1)) : null;
        }
        if (strS == null) {
            return null;
        }
        File fileDxjokdxxww = dxjokdxxww((File) y2.iobyxmoadg.dxjokdxxww(file.getParentFile()), gxszxtbevoVar.eablkybsjg(strS), Long.parseLong((String) y2.iobyxmoadg.eablkybsjg(matcher.group(2))), Long.parseLong((String) y2.iobyxmoadg.eablkybsjg(matcher.group(3))));
        if (file.renameTo(fileDxjokdxxww)) {
            return fileDxjokdxxww;
        }
        return null;
    }

    public static File dxjokdxxww(File file, int i13, long j13, long j14) {
        return new File(file, i13 + "." + j13 + "." + j14 + ".v3.exo");
    }

    public static dxjokdxxww eablkybsjg(File file, long j13, long j14, gxszxtbevo gxszxtbevoVar) {
        File file2;
        String strDxjokdxxww;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            File fileBtonecajqb = btonecajqb(file, gxszxtbevoVar);
            if (fileBtonecajqb == null) {
                return null;
            }
            file2 = fileBtonecajqb;
            name = fileBtonecajqb.getName();
        }
        Matcher matcher = f9903zynmafqrjb.matcher(name);
        if (!matcher.matches() || (strDxjokdxxww = gxszxtbevoVar.dxjokdxxww(Integer.parseInt((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1))))) == null) {
            return null;
        }
        long length = j13 == -1 ? file2.length() : j13;
        if (length == 0) {
            return null;
        }
        return new dxjokdxxww(strDxjokdxxww, Long.parseLong((String) y2.iobyxmoadg.eablkybsjg(matcher.group(2))), length, j14 == -9223372036854775807L ? Long.parseLong((String) y2.iobyxmoadg.eablkybsjg(matcher.group(3))) : j14, file2);
    }

    public static dxjokdxxww gxszxtbevo(File file, long j13, gxszxtbevo gxszxtbevoVar) {
        return eablkybsjg(file, j13, -9223372036854775807L, gxszxtbevoVar);
    }

    public static dxjokdxxww lqeggnwhkg(String str, long j13, long j14) {
        return new dxjokdxxww(str, j13, j14, -9223372036854775807L, null);
    }

    public static dxjokdxxww nufgyqmvbu(String str, long j13) {
        return new dxjokdxxww(str, j13, -1L, -9223372036854775807L, null);
    }

    public dxjokdxxww wkgbmnqykc(File file, long j13) {
        y2.iobyxmoadg.lqeggnwhkg(this.f18641iwizpuwonk);
        return new dxjokdxxww(this.f18644zdlpuopuiu, this.f18643yggfygwlhe, this.f18642jyumaefscl, j13, file);
    }
}
