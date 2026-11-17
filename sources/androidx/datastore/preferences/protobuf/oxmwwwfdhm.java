package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
class oxmwwwfdhm implements lmojexxdyd {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final oxmwwwfdhm f8767iobyxmoadg = new oxmwwwfdhm();

    private oxmwwwfdhm() {
    }

    public static oxmwwwfdhm iobyxmoadg() {
        return f8767iobyxmoadg;
    }

    @Override // androidx.datastore.preferences.protobuf.lmojexxdyd
    public boolean isSupported(Class cls) {
        return kcexrzcfyt.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.lmojexxdyd
    public iozdgvuglv messageInfoFor(Class cls) {
        if (!kcexrzcfyt.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (iozdgvuglv) kcexrzcfyt.ojitshcjhn(cls.asSubclass(kcexrzcfyt.class)).nufgyqmvbu();
        } catch (Exception e13) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e13);
        }
    }
}
