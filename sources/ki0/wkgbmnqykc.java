package ki0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f55704iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Long f55705ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f55706zoijcleaow;

        public iobyxmoadg(String itemId, String url, Long l13) {
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            zdlpuopuiu.btonecajqb(url, "url");
            this.f55704iobyxmoadg = itemId;
            this.f55706zoijcleaow = url;
            this.f55705ppxfxbqfkf = l13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f55704iobyxmoadg, iobyxmoadgVar.f55704iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f55706zoijcleaow, iobyxmoadgVar.f55706zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f55705ppxfxbqfkf, iobyxmoadgVar.f55705ppxfxbqfkf);
        }

        @Override // ki0.wkgbmnqykc
        public String getItemId() {
            return this.f55704iobyxmoadg;
        }

        public int hashCode() {
            int iHashCode = ((this.f55704iobyxmoadg.hashCode() * 31) + this.f55706zoijcleaow.hashCode()) * 31;
            Long l13 = this.f55705ppxfxbqfkf;
            return iHashCode + (l13 == null ? 0 : l13.hashCode());
        }

        public final Long iobyxmoadg() {
            return this.f55705ppxfxbqfkf;
        }

        public String toString() {
            return "Single(itemId=" + this.f55704iobyxmoadg + ", url=" + this.f55706zoijcleaow + ", duration=" + this.f55705ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f55706zoijcleaow;
        }
    }

    String getItemId();
}
