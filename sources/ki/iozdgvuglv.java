package ki;

/* JADX INFO: loaded from: classes3.dex */
public enum iozdgvuglv {
    PLAIN { // from class: ki.iozdgvuglv.zoijcleaow
        @Override // ki.iozdgvuglv
        public String wkgbmnqykc(String string) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(string, "string");
            return string;
        }
    },
    HTML { // from class: ki.iozdgvuglv.iobyxmoadg
        @Override // ki.iozdgvuglv
        public String wkgbmnqykc(String string) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(string, "string");
            return mj.kcexrzcfyt.hcddaimhww(mj.kcexrzcfyt.hcddaimhww(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };


    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f55562iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* synthetic */ iozdgvuglv(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public abstract String wkgbmnqykc(String str);
}
