package nd;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum draadjrbmk implements Internal.EnumLite {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);


    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final Internal.EnumLiteMap f69705iwizpuwonk = new Internal.EnumLiteMap() { // from class: nd.draadjrbmk.iobyxmoadg
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public draadjrbmk findValueByNumber(int i13) {
            return draadjrbmk.wkgbmnqykc(i13);
        }
    };

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f69708zdlpuopuiu;

    private static final class zoijcleaow implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final Internal.EnumVerifier f69709iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i13) {
            return draadjrbmk.wkgbmnqykc(i13) != null;
        }
    }

    draadjrbmk(int i13) {
        this.f69708zdlpuopuiu = i13;
    }

    public static Internal.EnumVerifier lqeggnwhkg() {
        return zoijcleaow.f69709iobyxmoadg;
    }

    public static draadjrbmk wkgbmnqykc(int i13) {
        if (i13 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i13 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f69708zdlpuopuiu;
    }
}
