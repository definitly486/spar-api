package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
abstract class oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final rgvfuqvkyq f23989iobyxmoadg = new vdvldrhtss();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final rgvfuqvkyq f23990zoijcleaow = ppxfxbqfkf();

    static rgvfuqvkyq iobyxmoadg() {
        rgvfuqvkyq rgvfuqvkyqVar = f23990zoijcleaow;
        if (rgvfuqvkyqVar != null) {
            return rgvfuqvkyqVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static rgvfuqvkyq ppxfxbqfkf() {
        try {
            return (rgvfuqvkyq) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static rgvfuqvkyq zoijcleaow() {
        return f23989iobyxmoadg;
    }
}
