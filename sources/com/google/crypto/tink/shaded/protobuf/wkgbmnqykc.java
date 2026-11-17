package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static boolean f24056iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final boolean f24057ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Class f24058zoijcleaow = iobyxmoadg("libcore.io.Memory");

    static {
        f24057ppxfxbqfkf = (f24056iobyxmoadg || iobyxmoadg("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class iobyxmoadg(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean ppxfxbqfkf() {
        return f24056iobyxmoadg || !(f24058zoijcleaow == null || f24057ppxfxbqfkf);
    }

    static Class zoijcleaow() {
        return f24058zoijcleaow;
    }
}
