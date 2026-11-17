package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
class jyumaefscl implements jpowsppfya {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final jyumaefscl f23948iobyxmoadg = new jyumaefscl();

    private jyumaefscl() {
    }

    public static jyumaefscl iobyxmoadg() {
        return f23948iobyxmoadg;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jpowsppfya
    public boolean isSupported(Class cls) {
        return iwizpuwonk.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jpowsppfya
    public hcddaimhww messageInfoFor(Class cls) {
        if (!iwizpuwonk.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (hcddaimhww) iwizpuwonk.rgvfuqvkyq(cls.asSubclass(iwizpuwonk.class)).eablkybsjg();
        } catch (Exception e13) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e13);
        }
    }
}
