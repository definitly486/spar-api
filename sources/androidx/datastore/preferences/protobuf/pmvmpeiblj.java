package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class pmvmpeiblj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f8768iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f8769ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f8770zoijcleaow;

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final czzsidtyhn.zoijcleaow f8771iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final czzsidtyhn.zoijcleaow f8772ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final Object f8773wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final Object f8774zoijcleaow;

        public iobyxmoadg(czzsidtyhn.zoijcleaow zoijcleaowVar, Object obj, czzsidtyhn.zoijcleaow zoijcleaowVar2, Object obj2) {
            this.f8771iobyxmoadg = zoijcleaowVar;
            this.f8774zoijcleaow = obj;
            this.f8772ppxfxbqfkf = zoijcleaowVar2;
            this.f8773wkgbmnqykc = obj2;
        }
    }

    private pmvmpeiblj(czzsidtyhn.zoijcleaow zoijcleaowVar, Object obj, czzsidtyhn.zoijcleaow zoijcleaowVar2, Object obj2) {
        this.f8768iobyxmoadg = new iobyxmoadg(zoijcleaowVar, obj, zoijcleaowVar2, obj2);
        this.f8770zoijcleaow = obj;
        this.f8769ppxfxbqfkf = obj2;
    }

    static void eablkybsjg(CodedOutputStream codedOutputStream, iobyxmoadg iobyxmoadgVar, Object obj, Object obj2) {
        rgvfuqvkyq.yggfygwlhe(codedOutputStream, iobyxmoadgVar.f8771iobyxmoadg, 1, obj);
        rgvfuqvkyq.yggfygwlhe(codedOutputStream, iobyxmoadgVar.f8772ppxfxbqfkf, 2, obj2);
    }

    public static pmvmpeiblj wkgbmnqykc(czzsidtyhn.zoijcleaow zoijcleaowVar, Object obj, czzsidtyhn.zoijcleaow zoijcleaowVar2, Object obj2) {
        return new pmvmpeiblj(zoijcleaowVar, obj, zoijcleaowVar2, obj2);
    }

    static int zoijcleaow(iobyxmoadg iobyxmoadgVar, Object obj, Object obj2) {
        return rgvfuqvkyq.zoijcleaow(iobyxmoadgVar.f8771iobyxmoadg, 1, obj) + rgvfuqvkyq.zoijcleaow(iobyxmoadgVar.f8772ppxfxbqfkf, 2, obj2);
    }

    public int iobyxmoadg(int i13, Object obj, Object obj2) {
        return CodedOutputStream.wypolnanlu(i13) + CodedOutputStream.esjtqupxsv(zoijcleaow(this.f8768iobyxmoadg, obj, obj2));
    }

    iobyxmoadg ppxfxbqfkf() {
        return this.f8768iobyxmoadg;
    }
}
