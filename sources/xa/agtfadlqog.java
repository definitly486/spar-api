package xa;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class agtfadlqog {

    private static class zoijcleaow implements wflxmlrfwp, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final List f121845zdlpuopuiu;

        @Override // xa.wflxmlrfwp
        public boolean apply(Object obj) {
            for (int i13 = 0; i13 < this.f121845zdlpuopuiu.size(); i13++) {
                if (!((wflxmlrfwp) this.f121845zdlpuopuiu.get(i13)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof zoijcleaow) {
                return this.f121845zdlpuopuiu.equals(((zoijcleaow) obj).f121845zdlpuopuiu);
            }
            return false;
        }

        public int hashCode() {
            return this.f121845zdlpuopuiu.hashCode() + 306654252;
        }

        public String toString() {
            return agtfadlqog.wkgbmnqykc("and", this.f121845zdlpuopuiu);
        }

        private zoijcleaow(List list) {
            this.f121845zdlpuopuiu = list;
        }
    }

    private static List ppxfxbqfkf(wflxmlrfwp wflxmlrfwpVar, wflxmlrfwp wflxmlrfwpVar2) {
        return Arrays.asList(wflxmlrfwpVar, wflxmlrfwpVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String wkgbmnqykc(String str, Iterable iterable) {
        StringBuilder sb3 = new StringBuilder("Predicates.");
        sb3.append(str);
        sb3.append('(');
        boolean z13 = true;
        for (Object obj : iterable) {
            if (!z13) {
                sb3.append(',');
            }
            sb3.append(obj);
            z13 = false;
        }
        sb3.append(')');
        return sb3.toString();
    }

    public static wflxmlrfwp zoijcleaow(wflxmlrfwp wflxmlrfwpVar, wflxmlrfwp wflxmlrfwpVar2) {
        return new zoijcleaow(ppxfxbqfkf((wflxmlrfwp) draadjrbmk.btonecajqb(wflxmlrfwpVar), (wflxmlrfwp) draadjrbmk.btonecajqb(wflxmlrfwpVar2)));
    }
}
