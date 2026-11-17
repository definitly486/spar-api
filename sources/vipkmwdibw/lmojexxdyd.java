package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public abstract class lmojexxdyd {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final yadqdtsiqt f117177iobyxmoadg = new esjtqupxsv(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final yadqdtsiqt f117180zoijcleaow = new esjtqupxsv(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final yadqdtsiqt f117178ppxfxbqfkf = new esjtqupxsv(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final yadqdtsiqt f117179wkgbmnqykc = new yadqdtsiqt() { // from class: vipkmwdibw.iozdgvuglv
        @Override // vipkmwdibw.yadqdtsiqt
        public final float iobyxmoadg(float f13) {
            return lmojexxdyd.zoijcleaow(f13);
        }
    };

    public static final yadqdtsiqt eablkybsjg() {
        return f117180zoijcleaow;
    }

    public static final yadqdtsiqt ppxfxbqfkf() {
        return f117177iobyxmoadg;
    }

    public static final yadqdtsiqt wkgbmnqykc() {
        return f117179wkgbmnqykc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float zoijcleaow(float f13) {
        return f13;
    }
}
