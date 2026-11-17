package g0;

/* JADX INFO: loaded from: classes.dex */
public final class cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f35606iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f35607ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private String f35608wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.rgvfuqvkyq f35609zoijcleaow;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f35610zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(2);
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public cdpycssgdh(String str, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f35606iobyxmoadg = str;
        this.f35609zoijcleaow = rgvfuqvkyqVar;
    }

    public final void eablkybsjg(yadqdtsiqt yadqdtsiqtVar, ah.gtknphoqwx gtknphoqwxVar, Object obj) {
        yadqdtsiqtVar.iobyxmoadg(this, obj);
    }

    public final String iobyxmoadg() {
        return this.f35608wkgbmnqykc;
    }

    public final boolean ppxfxbqfkf() {
        return this.f35607ppxfxbqfkf;
    }

    public String toString() {
        return "AccessibilityKey: " + this.f35606iobyxmoadg;
    }

    public final Object wkgbmnqykc(Object obj, Object obj2) {
        return this.f35609zoijcleaow.invoke(obj, obj2);
    }

    public final String zoijcleaow() {
        return this.f35606iobyxmoadg;
    }

    public /* synthetic */ cdpycssgdh(String str, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? iobyxmoadg.f35610zdlpuopuiu : rgvfuqvkyqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cdpycssgdh(String str, boolean z13) {
        this(str, (tg.rgvfuqvkyq) null, 2, (kotlin.jvm.internal.gtknphoqwx) (0 == true ? 1 : 0));
        this.f35607ppxfxbqfkf = z13;
    }

    public /* synthetic */ cdpycssgdh(String str, boolean z13, tg.rgvfuqvkyq rgvfuqvkyqVar, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, z13, rgvfuqvkyqVar, (i13 & 8) != 0 ? null : str2);
    }

    public cdpycssgdh(String str, boolean z13, tg.rgvfuqvkyq rgvfuqvkyqVar, String str2) {
        this(str, rgvfuqvkyqVar);
        this.f35607ppxfxbqfkf = z13;
        this.f35608wkgbmnqykc = str2;
    }
}
