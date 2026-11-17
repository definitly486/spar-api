package ty0;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements k01.iobyxmoadg {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f112172iobyxmoadg;

        static {
            int[] iArr = new int[gz0.nufgyqmvbu.values().length];
            try {
                iArr[gz0.nufgyqmvbu.VK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gz0.nufgyqmvbu.YOUTUBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gz0.nufgyqmvbu.TELEGRAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gz0.nufgyqmvbu.YANDEX_DZEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f112172iobyxmoadg = iArr;
        }
    }

    @Override // k01.iobyxmoadg
    public String iobyxmoadg(gz0.nufgyqmvbu type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        int i13 = iobyxmoadg.f112172iobyxmoadg[type.ordinal()];
        if (i13 == 1) {
            return uw0.ppxfxbqfkf.f114521iobyxmoadg.ntlheqmsrt();
        }
        if (i13 == 2) {
            return uw0.ppxfxbqfkf.f114521iobyxmoadg.jlmebxxoox();
        }
        if (i13 == 3) {
            return uw0.ppxfxbqfkf.f114521iobyxmoadg.dsvhmnatus();
        }
        if (i13 == 4) {
            return uw0.ppxfxbqfkf.f114521iobyxmoadg.ulzqkzuiru();
        }
        throw new NoWhenBranchMatchedException();
    }
}
