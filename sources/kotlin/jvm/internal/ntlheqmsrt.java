package kotlin.jvm.internal;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ntlheqmsrt implements ah.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final iobyxmoadg f60028zdlpuopuiu = new iobyxmoadg(null);

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: kotlin.jvm.internal.ntlheqmsrt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public /* synthetic */ class C1195iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f60029iobyxmoadg;

            static {
                int[] iArr = new int[ah.oxmwwwfdhm.values().length];
                try {
                    iArr[ah.oxmwwwfdhm.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ah.oxmwwwfdhm.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ah.oxmwwwfdhm.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f60029iobyxmoadg = iArr;
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final String iobyxmoadg(ah.rgvfuqvkyq typeParameter) {
            zdlpuopuiu.btonecajqb(typeParameter, "typeParameter");
            StringBuilder sb3 = new StringBuilder();
            int i13 = C1195iobyxmoadg.f60029iobyxmoadg[typeParameter.draadjrbmk().ordinal()];
            if (i13 == 1) {
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } else if (i13 == 2) {
                sb3.append("in ");
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sb3.append("out ");
            }
            sb3.append(typeParameter.getName());
            return sb3.toString();
        }

        private iobyxmoadg() {
        }
    }
}
