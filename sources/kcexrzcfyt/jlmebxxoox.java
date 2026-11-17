package kcexrzcfyt;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class jlmebxxoox implements istkbnxepw.pkzmftpjix {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final istkbnxepw.jztzpxfvev f54721eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f54722iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f54723ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f54724wkgbmnqykc = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f54725zoijcleaow;

    public jlmebxxoox(String str, istkbnxepw.jztzpxfvev jztzpxfvevVar) {
        boolean z13;
        int i13;
        this.f54725zoijcleaow = str;
        try {
            i13 = Integer.parseInt(str);
            z13 = true;
        } catch (NumberFormatException unused) {
            lereixgezr.sopmlzcsov.draadjrbmk("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z13 = false;
            i13 = -1;
        }
        this.f54722iobyxmoadg = z13;
        this.f54723ppxfxbqfkf = i13;
        this.f54721eablkybsjg = jztzpxfvevVar;
    }
}
