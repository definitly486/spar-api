package kh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow implements iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final nufgyqmvbu f55493zdlpuopuiu;

    public zoijcleaow(nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(0);
        }
        this.f55493zdlpuopuiu = nufgyqmvbuVar;
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str = i13 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 1 ? 3 : 2];
        if (i13 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i13 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i13 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kh.iobyxmoadg
    public nufgyqmvbu getAnnotations() {
        nufgyqmvbu nufgyqmvbuVar = this.f55493zdlpuopuiu;
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(1);
        }
        return nufgyqmvbuVar;
    }
}
