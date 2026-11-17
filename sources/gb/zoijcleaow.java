package gb;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Logger f36731iobyxmoadg = Logger.getLogger(zoijcleaow.class.getName());

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final AtomicBoolean f36732zoijcleaow = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gb.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static abstract class EnumC0829zoijcleaow {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private static final /* synthetic */ EnumC0829zoijcleaow[] f36733jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public static final EnumC0829zoijcleaow f36734yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final EnumC0829zoijcleaow f36735zdlpuopuiu;

        /* JADX INFO: renamed from: gb.zoijcleaow$zoijcleaow$iobyxmoadg */
        final enum iobyxmoadg extends EnumC0829zoijcleaow {
            iobyxmoadg(String str, int i13) {
                super(str, i13);
            }

            @Override // gb.zoijcleaow.EnumC0829zoijcleaow
            public boolean iobyxmoadg() {
                return !zoijcleaow.ppxfxbqfkf();
            }
        }

        /* JADX INFO: renamed from: gb.zoijcleaow$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        final enum C0830zoijcleaow extends EnumC0829zoijcleaow {
            C0830zoijcleaow(String str, int i13) {
                super(str, i13);
            }

            @Override // gb.zoijcleaow.EnumC0829zoijcleaow
            public boolean iobyxmoadg() {
                return !zoijcleaow.ppxfxbqfkf() || zoijcleaow.zoijcleaow();
            }
        }

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg("ALGORITHM_NOT_FIPS", 0);
            f36735zdlpuopuiu = iobyxmoadgVar;
            C0830zoijcleaow c0830zoijcleaow = new C0830zoijcleaow("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f36734yggfygwlhe = c0830zoijcleaow;
            f36733jyumaefscl = new EnumC0829zoijcleaow[]{iobyxmoadgVar, c0830zoijcleaow};
        }

        private EnumC0829zoijcleaow(String str, int i13) {
            super(str, i13);
        }

        public static EnumC0829zoijcleaow valueOf(String str) {
            return (EnumC0829zoijcleaow) Enum.valueOf(EnumC0829zoijcleaow.class, str);
        }

        public static EnumC0829zoijcleaow[] values() {
            return (EnumC0829zoijcleaow[]) f36733jyumaefscl.clone();
        }

        public abstract boolean iobyxmoadg();
    }

    static Boolean iobyxmoadg() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f36731iobyxmoadg.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean ppxfxbqfkf() {
        return gb.iobyxmoadg.iobyxmoadg() || f36732zoijcleaow.get();
    }

    public static boolean zoijcleaow() {
        return iobyxmoadg().booleanValue();
    }
}
