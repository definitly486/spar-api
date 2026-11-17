package n0;

import androidx.compose.runtime.i1;

/* JADX INFO: loaded from: classes.dex */
public interface ikoacuggdj extends i1 {

    public static final class iobyxmoadg implements ikoacuggdj, i1 {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final nufgyqmvbu f68263zdlpuopuiu;

        public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
            this.f68263zdlpuopuiu = nufgyqmvbuVar;
        }

        @Override // n0.ikoacuggdj
        public boolean dxjokdxxww() {
            return this.f68263zdlpuopuiu.wkgbmnqykc();
        }

        @Override // androidx.compose.runtime.i1
        public Object getValue() {
            return this.f68263zdlpuopuiu.getValue();
        }
    }

    public static final class zoijcleaow implements ikoacuggdj {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final boolean f68264yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Object f68265zdlpuopuiu;

        public zoijcleaow(Object obj, boolean z13) {
            this.f68265zdlpuopuiu = obj;
            this.f68264yggfygwlhe = z13;
        }

        @Override // n0.ikoacuggdj
        public boolean dxjokdxxww() {
            return this.f68264yggfygwlhe;
        }

        @Override // androidx.compose.runtime.i1
        public Object getValue() {
            return this.f68265zdlpuopuiu;
        }

        public /* synthetic */ zoijcleaow(Object obj, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(obj, (i13 & 2) != 0 ? true : z13);
        }
    }

    boolean dxjokdxxww();
}
