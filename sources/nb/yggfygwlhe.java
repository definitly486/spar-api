package nb;

/* JADX INFO: loaded from: classes2.dex */
public enum yggfygwlhe implements com.google.crypto.tink.shaded.protobuf.esjtqupxsv.iobyxmoadg {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final com.google.crypto.tink.shaded.protobuf.esjtqupxsv.zoijcleaow f69481zynmafqrjb = new com.google.crypto.tink.shaded.protobuf.esjtqupxsv.zoijcleaow() { // from class: nb.yggfygwlhe.iobyxmoadg
    };

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f69482zdlpuopuiu;

    yggfygwlhe(int i13) {
        this.f69482zdlpuopuiu = i13;
    }

    public static yggfygwlhe iobyxmoadg(int i13) {
        if (i13 == 0) {
            return UNKNOWN_HASH;
        }
        if (i13 == 1) {
            return SHA1;
        }
        if (i13 == 2) {
            return SHA384;
        }
        if (i13 == 3) {
            return SHA256;
        }
        if (i13 == 4) {
            return SHA512;
        }
        if (i13 != 5) {
            return null;
        }
        return SHA224;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f69482zdlpuopuiu;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
