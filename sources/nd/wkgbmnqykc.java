package nd;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum wkgbmnqykc implements Internal.EnumLite {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);


    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final Internal.EnumLiteMap f69744esjtqupxsv = new Internal.EnumLiteMap() { // from class: nd.wkgbmnqykc.iobyxmoadg
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wkgbmnqykc findValueByNumber(int i13) {
            return wkgbmnqykc.wkgbmnqykc(i13);
        }
    };

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f69749zdlpuopuiu;

    private static final class zoijcleaow implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final Internal.EnumVerifier f69750iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i13) {
            return wkgbmnqykc.wkgbmnqykc(i13) != null;
        }
    }

    wkgbmnqykc(int i13) {
        this.f69749zdlpuopuiu = i13;
    }

    public static Internal.EnumVerifier lqeggnwhkg() {
        return zoijcleaow.f69750iobyxmoadg;
    }

    public static wkgbmnqykc wkgbmnqykc(int i13) {
        if (i13 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i13 == 1) {
            return FOREGROUND;
        }
        if (i13 == 2) {
            return BACKGROUND;
        }
        if (i13 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f69749zdlpuopuiu;
    }
}
