package bb;

import nb.pmvmpeiblj;
import nb.ylkuphrtab;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pmvmpeiblj f15631iobyxmoadg;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f15632iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f15633zoijcleaow;

        static {
            int[] iArr = new int[zoijcleaow.values().length];
            f15633zoijcleaow = iArr;
            try {
                iArr[zoijcleaow.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15633zoijcleaow[zoijcleaow.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15633zoijcleaow[zoijcleaow.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15633zoijcleaow[zoijcleaow.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ylkuphrtab.values().length];
            f15632iobyxmoadg = iArr2;
            try {
                iArr2[ylkuphrtab.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15632iobyxmoadg[ylkuphrtab.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15632iobyxmoadg[ylkuphrtab.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15632iobyxmoadg[ylkuphrtab.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum zoijcleaow {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private draadjrbmk(pmvmpeiblj pmvmpeibljVar) {
        this.f15631iobyxmoadg = pmvmpeibljVar;
    }

    public static draadjrbmk iobyxmoadg(String str, byte[] bArr, zoijcleaow zoijcleaowVar) {
        return new draadjrbmk((pmvmpeiblj) pmvmpeiblj.sopmlzcsov().ojitshcjhn(str).rgvfuqvkyq(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.draadjrbmk(bArr)).agtfadlqog(ppxfxbqfkf(zoijcleaowVar)).ppxfxbqfkf());
    }

    static ylkuphrtab ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
        int i13 = iobyxmoadg.f15633zoijcleaow[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            return ylkuphrtab.TINK;
        }
        if (i13 == 2) {
            return ylkuphrtab.LEGACY;
        }
        if (i13 == 3) {
            return ylkuphrtab.RAW;
        }
        if (i13 == 4) {
            return ylkuphrtab.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    pmvmpeiblj zoijcleaow() {
        return this.f15631iobyxmoadg;
    }
}
