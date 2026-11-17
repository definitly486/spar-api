package vi;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iwizpuwonk f116930iobyxmoadg = new iobyxmoadg();

    static class iobyxmoadg implements iwizpuwonk {
        iobyxmoadg() {
        }

        private static /* synthetic */ void ppxfxbqfkf(int i13) {
            Object[] objArr = new Object[3];
            if (i13 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i13 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // vi.iwizpuwonk
        public void iobyxmoadg(jh.zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar == null) {
                ppxfxbqfkf(2);
            }
        }

        @Override // vi.iwizpuwonk
        public void zoijcleaow(jh.eablkybsjg eablkybsjgVar, List list) {
            if (eablkybsjgVar == null) {
                ppxfxbqfkf(0);
            }
            if (list == null) {
                ppxfxbqfkf(1);
            }
        }
    }

    void iobyxmoadg(jh.zoijcleaow zoijcleaowVar);

    void zoijcleaow(jh.eablkybsjg eablkybsjgVar, List list);
}
