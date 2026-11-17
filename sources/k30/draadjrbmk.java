package k30;

import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class draadjrbmk {
    public static final String eablkybsjg(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static final String iobyxmoadg(String first, String second, String divider) {
        zdlpuopuiu.btonecajqb(first, "first");
        zdlpuopuiu.btonecajqb(second, "second");
        zdlpuopuiu.btonecajqb(divider, "divider");
        StringBuilder sb3 = new StringBuilder();
        if (!kcexrzcfyt.zfvoamnweg(first)) {
            sb3.append(first);
        }
        if (!kcexrzcfyt.zfvoamnweg(first) && !kcexrzcfyt.zfvoamnweg(second)) {
            sb3.append(divider);
        }
        if (!kcexrzcfyt.zfvoamnweg(second)) {
            sb3.append(second);
        }
        return sb3.toString();
    }

    public static final String ppxfxbqfkf() {
        return "";
    }

    public static final String wkgbmnqykc(String str) {
        if (str == null || kcexrzcfyt.zfvoamnweg(str)) {
            return null;
        }
        return str;
    }

    public static /* synthetic */ String zoijcleaow(String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str3 = ", ";
        }
        return iobyxmoadg(str, str2, str3);
    }
}
