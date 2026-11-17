package di;

/* JADX INFO: loaded from: classes3.dex */
public enum cqumvgiudr implements kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);


    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow f28482pmvmpeiblj = new kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow() { // from class: di.cqumvgiudr.iobyxmoadg
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public cqumvgiudr findValueByNumber(int i13) {
            return cqumvgiudr.iobyxmoadg(i13);
        }
    };

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f28485zdlpuopuiu;

    cqumvgiudr(int i13, int i14) {
        this.f28485zdlpuopuiu = i14;
    }

    public static cqumvgiudr iobyxmoadg(int i13) {
        if (i13 == 0) {
            return INTERNAL;
        }
        if (i13 == 1) {
            return PRIVATE;
        }
        if (i13 == 2) {
            return PROTECTED;
        }
        if (i13 == 3) {
            return PUBLIC;
        }
        if (i13 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i13 != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg
    public final int getNumber() {
        return this.f28485zdlpuopuiu;
    }
}
