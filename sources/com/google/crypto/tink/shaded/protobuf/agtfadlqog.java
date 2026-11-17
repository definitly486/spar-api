package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
abstract class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final Class f23887iobyxmoadg = ppxfxbqfkf();

    public static ojitshcjhn iobyxmoadg() {
        ojitshcjhn ojitshcjhnVarZoijcleaow = zoijcleaow("getEmptyRegistry");
        return ojitshcjhnVarZoijcleaow != null ? ojitshcjhnVarZoijcleaow : ojitshcjhn.f23980wkgbmnqykc;
    }

    static Class ppxfxbqfkf() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static final ojitshcjhn zoijcleaow(String str) {
        Class cls = f23887iobyxmoadg;
        if (cls == null) {
            return null;
        }
        try {
            return (ojitshcjhn) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }
}
