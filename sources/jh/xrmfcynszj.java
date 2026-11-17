package jh;

/* JADX INFO: loaded from: classes3.dex */
public interface xrmfcynszj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final xrmfcynszj f51348iobyxmoadg = new iobyxmoadg();

    static class iobyxmoadg implements xrmfcynszj {
        iobyxmoadg() {
        }

        private static /* synthetic */ void wkgbmnqykc(int i13) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        public String toString() {
            return "NO_SOURCE";
        }

        @Override // jh.xrmfcynszj
        public metgxyhuhe zoijcleaow() {
            metgxyhuhe metgxyhuheVar = metgxyhuhe.f51324iobyxmoadg;
            if (metgxyhuheVar == null) {
                wkgbmnqykc(0);
            }
            return metgxyhuheVar;
        }
    }

    metgxyhuhe zoijcleaow();
}
