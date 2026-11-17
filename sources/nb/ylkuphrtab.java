package nb;

/* JADX INFO: loaded from: classes2.dex */
public enum ylkuphrtab implements com.google.crypto.tink.shaded.protobuf.esjtqupxsv.iobyxmoadg {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final com.google.crypto.tink.shaded.protobuf.esjtqupxsv.zoijcleaow f69488pmvmpeiblj = new com.google.crypto.tink.shaded.protobuf.esjtqupxsv.zoijcleaow() { // from class: nb.ylkuphrtab.iobyxmoadg
    };

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f69491zdlpuopuiu;

    ylkuphrtab(int i13) {
        this.f69491zdlpuopuiu = i13;
    }

    public static ylkuphrtab iobyxmoadg(int i13) {
        if (i13 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i13 == 1) {
            return TINK;
        }
        if (i13 == 2) {
            return LEGACY;
        }
        if (i13 == 3) {
            return RAW;
        }
        if (i13 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f69491zdlpuopuiu;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
