package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class lereixgezr implements crxdokpmqz {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final lmojexxdyd f8697zoijcleaow = new iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lmojexxdyd f8698iobyxmoadg;

    static class iobyxmoadg implements lmojexxdyd {
        iobyxmoadg() {
        }

        @Override // androidx.datastore.preferences.protobuf.lmojexxdyd
        public boolean isSupported(Class cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.lmojexxdyd
        public iozdgvuglv messageInfoFor(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    private static class zoijcleaow implements lmojexxdyd {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private lmojexxdyd[] f8699iobyxmoadg;

        zoijcleaow(lmojexxdyd... lmojexxdydVarArr) {
            this.f8699iobyxmoadg = lmojexxdydVarArr;
        }

        @Override // androidx.datastore.preferences.protobuf.lmojexxdyd
        public boolean isSupported(Class cls) {
            for (lmojexxdyd lmojexxdydVar : this.f8699iobyxmoadg) {
                if (lmojexxdydVar.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.lmojexxdyd
        public iozdgvuglv messageInfoFor(Class cls) {
            for (lmojexxdyd lmojexxdydVar : this.f8699iobyxmoadg) {
                if (lmojexxdydVar.isSupported(cls)) {
                    return lmojexxdydVar.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public lereixgezr() {
        this(iobyxmoadg());
    }

    private static lmojexxdyd iobyxmoadg() {
        return new zoijcleaow(oxmwwwfdhm.iobyxmoadg(), zoijcleaow());
    }

    private static boolean ppxfxbqfkf(iozdgvuglv iozdgvuglvVar) {
        return iozdgvuglvVar.getSyntax() == kegysxyocb.PROTO2;
    }

    private static sopmlzcsov wkgbmnqykc(Class cls, iozdgvuglv iozdgvuglvVar) {
        if (kcexrzcfyt.class.isAssignableFrom(cls)) {
            return ppxfxbqfkf(iozdgvuglvVar) ? hcddaimhww.iozdgvuglv(cls, iozdgvuglvVar, dsvhmnatus.zoijcleaow(), esjtqupxsv.zoijcleaow(), jlmebxxoox.jpowsppfya(), ojitshcjhn.zoijcleaow(), yadqdtsiqt.zoijcleaow()) : hcddaimhww.iozdgvuglv(cls, iozdgvuglvVar, dsvhmnatus.zoijcleaow(), esjtqupxsv.zoijcleaow(), jlmebxxoox.jpowsppfya(), null, yadqdtsiqt.zoijcleaow());
        }
        return ppxfxbqfkf(iozdgvuglvVar) ? hcddaimhww.iozdgvuglv(cls, iozdgvuglvVar, dsvhmnatus.iobyxmoadg(), esjtqupxsv.iobyxmoadg(), jlmebxxoox.lmojexxdyd(), ojitshcjhn.iobyxmoadg(), yadqdtsiqt.iobyxmoadg()) : hcddaimhww.iozdgvuglv(cls, iozdgvuglvVar, dsvhmnatus.iobyxmoadg(), esjtqupxsv.iobyxmoadg(), jlmebxxoox.wwaezpbzkn(), null, yadqdtsiqt.iobyxmoadg());
    }

    private static lmojexxdyd zoijcleaow() {
        try {
            return (lmojexxdyd) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f8697zoijcleaow;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.crxdokpmqz
    public sopmlzcsov createSchema(Class cls) {
        jlmebxxoox.ylkuphrtab(cls);
        iozdgvuglv iozdgvuglvVarMessageInfoFor = this.f8698iobyxmoadg.messageInfoFor(cls);
        if (iozdgvuglvVarMessageInfoFor.isMessageSetWireFormat()) {
            return kcexrzcfyt.class.isAssignableFrom(cls) ? jpowsppfya.eablkybsjg(jlmebxxoox.jpowsppfya(), ojitshcjhn.zoijcleaow(), iozdgvuglvVarMessageInfoFor.getDefaultInstance()) : jpowsppfya.eablkybsjg(jlmebxxoox.lmojexxdyd(), ojitshcjhn.iobyxmoadg(), iozdgvuglvVarMessageInfoFor.getDefaultInstance());
        }
        return wkgbmnqykc(cls, iozdgvuglvVarMessageInfoFor);
    }

    private lereixgezr(lmojexxdyd lmojexxdydVar) {
        this.f8698iobyxmoadg = (lmojexxdyd) zdlpuopuiu.zoijcleaow(lmojexxdydVar, "messageInfoFactory");
    }
}
