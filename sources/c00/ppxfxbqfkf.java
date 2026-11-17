package c00;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements w10.iobyxmoadg {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f18167iobyxmoadg;

        static {
            int[] iArr = new int[o00.nufgyqmvbu.values().length];
            try {
                iArr[o00.nufgyqmvbu.VK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o00.nufgyqmvbu.YOUTUBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o00.nufgyqmvbu.TELEGRAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o00.nufgyqmvbu.YANDEX_DZEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f18167iobyxmoadg = iArr;
        }
    }

    @Override // w10.iobyxmoadg
    public String iobyxmoadg(o00.nufgyqmvbu type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        int i13 = iobyxmoadg.f18167iobyxmoadg[type.ordinal()];
        if (i13 == 1) {
            return xx.iobyxmoadg.f123319iobyxmoadg.lxfrhoxuzk();
        }
        if (i13 == 2) {
            return xx.iobyxmoadg.f123319iobyxmoadg.fyldjkxazc();
        }
        if (i13 == 3) {
            return xx.iobyxmoadg.f123319iobyxmoadg.tbqsvytpvh();
        }
        if (i13 == 4) {
            return xx.iobyxmoadg.f123319iobyxmoadg.hszhottldk();
        }
        throw new NoWhenBranchMatchedException();
    }
}
