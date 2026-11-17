package nb;

/* JADX INFO: loaded from: classes2.dex */
public enum lereixgezr implements com.google.crypto.tink.shaded.protobuf.esjtqupxsv.iobyxmoadg {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final com.google.crypto.tink.shaded.protobuf.esjtqupxsv.zoijcleaow f69455lereixgezr = new com.google.crypto.tink.shaded.protobuf.esjtqupxsv.zoijcleaow() { // from class: nb.lereixgezr.iobyxmoadg
    };

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f69458zdlpuopuiu;

    lereixgezr(int i13) {
        this.f69458zdlpuopuiu = i13;
    }

    public static lereixgezr iobyxmoadg(int i13) {
        if (i13 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i13 == 1) {
            return ENABLED;
        }
        if (i13 == 2) {
            return DISABLED;
        }
        if (i13 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f69458zdlpuopuiu;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
