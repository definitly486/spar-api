package jh;

/* JADX INFO: loaded from: classes3.dex */
public enum cdpycssgdh {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;


    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f51293lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final iobyxmoadg f51295zdlpuopuiu = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final cdpycssgdh iobyxmoadg(boolean z13, boolean z14, boolean z15) {
            if (z13) {
                return cdpycssgdh.SEALED;
            }
            if (z14) {
                return cdpycssgdh.ABSTRACT;
            }
            return z15 ? cdpycssgdh.OPEN : cdpycssgdh.FINAL;
        }

        private iobyxmoadg() {
        }
    }
}
