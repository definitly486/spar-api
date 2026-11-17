package i3;

import android.os.Build;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk implements e3.zoijcleaow {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final boolean f41821wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final UUID f41822iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final boolean f41823ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final byte[] f41824zoijcleaow;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z13;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        f41821wkgbmnqykc = z13;
    }

    public draadjrbmk(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    public draadjrbmk(UUID uuid, byte[] bArr, boolean z13) {
        this.f41822iobyxmoadg = uuid;
        this.f41824zoijcleaow = bArr;
        this.f41823ppxfxbqfkf = z13;
    }
}
