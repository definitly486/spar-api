package czzsidtyhn;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class lmojexxdyd {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final tg.draadjrbmk f26412eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f26413iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f26414ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tg.draadjrbmk f26415wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f26416zoijcleaow;

    public enum iobyxmoadg {
        Visible,
        Clip,
        ExpandIndicator,
        ExpandOrCollapseIndicator;


        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f26418esjtqupxsv = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f26423iobyxmoadg;

        static {
            int[] iArr = new int[iobyxmoadg.values().length];
            try {
                iArr[iobyxmoadg.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iobyxmoadg.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26423iobyxmoadg = iArr;
        }
    }

    public /* synthetic */ lmojexxdyd(iobyxmoadg iobyxmoadgVar, int i13, int i14, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(iobyxmoadgVar, i13, i14, draadjrbmkVar, draadjrbmkVar2);
    }

    public final void iobyxmoadg(pkzmftpjix pkzmftpjixVar, List list) {
        tg.draadjrbmk draadjrbmkVar = this.f26415wkgbmnqykc;
        tg.rgvfuqvkyq rgvfuqvkyqVar = draadjrbmkVar != null ? (tg.rgvfuqvkyq) draadjrbmkVar.invoke(pkzmftpjixVar) : null;
        tg.draadjrbmk draadjrbmkVar2 = this.f26412eablkybsjg;
        tg.rgvfuqvkyq rgvfuqvkyqVar2 = draadjrbmkVar2 != null ? (tg.rgvfuqvkyq) draadjrbmkVar2.invoke(pkzmftpjixVar) : null;
        int i13 = zoijcleaow.f26423iobyxmoadg[this.f26413iobyxmoadg.ordinal()];
        if (i13 == 1) {
            if (rgvfuqvkyqVar != null) {
                list.add(rgvfuqvkyqVar);
            }
        } else {
            if (i13 != 2) {
                return;
            }
            if (rgvfuqvkyqVar != null) {
                list.add(rgvfuqvkyqVar);
            }
            if (rgvfuqvkyqVar2 != null) {
                list.add(rgvfuqvkyqVar2);
            }
        }
    }

    public final pkzmftpjix zoijcleaow() {
        return new pkzmftpjix(this.f26413iobyxmoadg, this.f26416zoijcleaow, this.f26414ppxfxbqfkf);
    }

    private lmojexxdyd(iobyxmoadg iobyxmoadgVar, int i13, int i14, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        this.f26413iobyxmoadg = iobyxmoadgVar;
        this.f26416zoijcleaow = i13;
        this.f26414ppxfxbqfkf = i14;
        this.f26415wkgbmnqykc = draadjrbmkVar;
        this.f26412eablkybsjg = draadjrbmkVar2;
    }
}
