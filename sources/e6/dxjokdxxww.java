package e6;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Set f30525ppxfxbqfkf = new HashSet();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f30526iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f30527zoijcleaow;

    public static class iobyxmoadg extends dxjokdxxww {
        iobyxmoadg(String str, String str2) {
            super(str, str2);
        }
    }

    public static class zoijcleaow extends dxjokdxxww {
        zoijcleaow(String str, String str2) {
            super(str, str2);
        }
    }

    dxjokdxxww(String str, String str2) {
        this.f30526iobyxmoadg = str;
        this.f30527zoijcleaow = str2;
        f30525ppxfxbqfkf.add(this);
    }
}
