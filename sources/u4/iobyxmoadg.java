package u4;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int f112600eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f112601iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f112602ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f112603wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f112604zoijcleaow;

    private iobyxmoadg(int i13, int i14, int i15, int i16, int i17) {
        this.f112601iobyxmoadg = i13;
        this.f112604zoijcleaow = i14;
        this.f112602ppxfxbqfkf = i15;
        this.f112603wkgbmnqykc = i16;
        this.f112600eablkybsjg = i17;
    }

    public static iobyxmoadg iobyxmoadg(String str) {
        y2.iobyxmoadg.iobyxmoadg(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < strArrSplit.length; i17++) {
            String strEablkybsjg = xa.zoijcleaow.eablkybsjg(strArrSplit[i17].trim());
            strEablkybsjg.hashCode();
            switch (strEablkybsjg) {
                case "end":
                    i14 = i17;
                    break;
                case "text":
                    i16 = i17;
                    break;
                case "start":
                    i13 = i17;
                    break;
                case "style":
                    i15 = i17;
                    break;
            }
        }
        if (i13 == -1 || i14 == -1 || i16 == -1) {
            return null;
        }
        return new iobyxmoadg(i13, i14, i15, i16, strArrSplit.length);
    }
}
