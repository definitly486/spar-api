package di;

/* JADX INFO: loaded from: classes3.dex */
public enum gtknphoqwx implements kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);


    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow f28548esjtqupxsv = new kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow() { // from class: di.gtknphoqwx.iobyxmoadg
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public gtknphoqwx findValueByNumber(int i13) {
            return gtknphoqwx.iobyxmoadg(i13);
        }
    };

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f28553zdlpuopuiu;

    gtknphoqwx(int i13, int i14) {
        this.f28553zdlpuopuiu = i14;
    }

    public static gtknphoqwx iobyxmoadg(int i13) {
        if (i13 == 0) {
            return FINAL;
        }
        if (i13 == 1) {
            return OPEN;
        }
        if (i13 == 2) {
            return ABSTRACT;
        }
        if (i13 != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg
    public final int getNumber() {
        return this.f28553zdlpuopuiu;
    }
}
