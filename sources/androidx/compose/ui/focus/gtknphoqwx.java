package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx {

    static final class iobyxmoadg implements f.wflxmlrfwp, kotlin.jvm.internal.agtfadlqog {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final /* synthetic */ tg.draadjrbmk f6238zdlpuopuiu;

        iobyxmoadg(tg.draadjrbmk draadjrbmkVar) {
            this.f6238zdlpuopuiu = draadjrbmkVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof f.wflxmlrfwp) && (obj instanceof kotlin.jvm.internal.agtfadlqog)) {
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ((kotlin.jvm.internal.agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // f.wflxmlrfwp
        public final /* synthetic */ void iobyxmoadg(dxjokdxxww dxjokdxxwwVar) {
            this.f6238zdlpuopuiu.invoke(dxjokdxxwwVar);
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return this.f6238zdlpuopuiu;
        }
    }

    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar) {
        return wkgbmnqykcVar.eablkybsjg(new FocusPropertiesElement(new iobyxmoadg(draadjrbmkVar)));
    }
}
