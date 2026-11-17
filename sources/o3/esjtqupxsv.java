package o3;

/* JADX INFO: loaded from: classes.dex */
public interface esjtqupxsv extends zynmafqrjb {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final v2.yadqdtsiqt f71846iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f71847ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int[] f71848zoijcleaow;

        public iobyxmoadg(v2.yadqdtsiqt yadqdtsiqtVar, int... iArr) {
            this(yadqdtsiqtVar, iArr, 0);
        }

        public iobyxmoadg(v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr, int i13) {
            if (iArr.length == 0) {
                y2.kcexrzcfyt.wkgbmnqykc("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f71846iobyxmoadg = yadqdtsiqtVar;
            this.f71848zoijcleaow = iArr;
            this.f71847ppxfxbqfkf = i13;
        }
    }

    public interface zoijcleaow {
        esjtqupxsv[] iobyxmoadg(iobyxmoadg[] iobyxmoadgVarArr, p3.wkgbmnqykc wkgbmnqykcVar, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, v2.cdpycssgdh cdpycssgdhVar);
    }

    void btonecajqb();

    androidx.media3.common.iobyxmoadg draadjrbmk();

    void dxjokdxxww(boolean z13);

    default void eablkybsjg() {
    }

    int gtknphoqwx();

    void gxszxtbevo();

    int iobyxmoadg();

    default void wflxmlrfwp() {
    }

    void wkgbmnqykc(float f13);
}
