package v2;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final HashSet f115813iobyxmoadg = new HashSet();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static String f115814zoijcleaow = "media3.common";

    public static synchronized void iobyxmoadg(String str) {
        if (f115813iobyxmoadg.add(str)) {
            f115814zoijcleaow += ", " + str;
        }
    }

    public static synchronized String zoijcleaow() {
        return f115814zoijcleaow;
    }
}
