package bx1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f17337iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f17338zoijcleaow;

        public iobyxmoadg(String url, String str) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f17337iobyxmoadg = url;
            this.f17338zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f17337iobyxmoadg, iobyxmoadgVar.f17337iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f17338zoijcleaow, iobyxmoadgVar.f17338zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f17337iobyxmoadg.hashCode() * 31;
            String str = this.f17338zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f17337iobyxmoadg;
        }

        public String toString() {
            return "ChangeWebViewData(url=" + this.f17337iobyxmoadg + ", webViewToken=" + this.f17338zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f17338zoijcleaow;
        }
    }
}
