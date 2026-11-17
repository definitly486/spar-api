package di;

/* JADX INFO: loaded from: classes3.dex */
public enum btonecajqb implements kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);


    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow f28471esjtqupxsv = new kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow() { // from class: di.btonecajqb.iobyxmoadg
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public btonecajqb findValueByNumber(int i13) {
            return btonecajqb.iobyxmoadg(i13);
        }
    };

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f28476zdlpuopuiu;

    btonecajqb(int i13, int i14) {
        this.f28476zdlpuopuiu = i14;
    }

    public static btonecajqb iobyxmoadg(int i13) {
        if (i13 == 0) {
            return DECLARATION;
        }
        if (i13 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i13 == 2) {
            return DELEGATION;
        }
        if (i13 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg
    public final int getNumber() {
        return this.f28476zdlpuopuiu;
    }
}
