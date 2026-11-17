package t3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zynmafqrjb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Pattern f109585ppxfxbqfkf = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public int f109586iobyxmoadg = -1;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public int f109587zoijcleaow = -1;

    private boolean zoijcleaow(String str) {
        Matcher matcher = f109585ppxfxbqfkf.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i13 = Integer.parseInt((String) y2.stevsuqkhv.nufgyqmvbu(matcher.group(1)), 16);
            int i14 = Integer.parseInt((String) y2.stevsuqkhv.nufgyqmvbu(matcher.group(2)), 16);
            if (i13 <= 0 && i14 <= 0) {
                return false;
            }
            this.f109586iobyxmoadg = i13;
            this.f109587zoijcleaow = i14;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean iobyxmoadg() {
        return (this.f109586iobyxmoadg == -1 || this.f109587zoijcleaow == -1) ? false : true;
    }

    public boolean ppxfxbqfkf(v2.jyumaefscl jyumaefsclVar) {
        for (int i13 = 0; i13 < jyumaefsclVar.eablkybsjg(); i13++) {
            v2.jyumaefscl.iobyxmoadg iobyxmoadgVarWkgbmnqykc = jyumaefsclVar.wkgbmnqykc(i13);
            if (iobyxmoadgVarWkgbmnqykc instanceof h4.eablkybsjg) {
                h4.eablkybsjg eablkybsjgVar = (h4.eablkybsjg) iobyxmoadgVarWkgbmnqykc;
                if ("iTunSMPB".equals(eablkybsjgVar.f39347ppxfxbqfkf) && zoijcleaow(eablkybsjgVar.f39348wkgbmnqykc)) {
                    return true;
                }
            } else if (iobyxmoadgVarWkgbmnqykc instanceof h4.gtknphoqwx) {
                h4.gtknphoqwx gtknphoqwxVar = (h4.gtknphoqwx) iobyxmoadgVarWkgbmnqykc;
                if ("com.apple.iTunes".equals(gtknphoqwxVar.f39352zoijcleaow) && "iTunSMPB".equals(gtknphoqwxVar.f39350ppxfxbqfkf) && zoijcleaow(gtknphoqwxVar.f39351wkgbmnqykc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
