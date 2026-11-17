package tk;

/* JADX INFO: loaded from: classes3.dex */
public enum iobyxmoadg {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final C2732iobyxmoadg f110871yggfygwlhe = new C2732iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f110874zdlpuopuiu;

    /* JADX INFO: renamed from: tk.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2732iobyxmoadg {
        public /* synthetic */ C2732iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final iobyxmoadg iobyxmoadg(int i13) {
            for (iobyxmoadg iobyxmoadgVar : iobyxmoadg.values()) {
                if (iobyxmoadgVar.wkgbmnqykc() == i13) {
                    return iobyxmoadgVar;
                }
            }
            return null;
        }

        private C2732iobyxmoadg() {
        }
    }

    iobyxmoadg(int i13) {
        this.f110874zdlpuopuiu = i13;
    }

    public final int wkgbmnqykc() {
        return this.f110874zdlpuopuiu;
    }
}
