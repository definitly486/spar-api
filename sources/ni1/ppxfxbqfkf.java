package ni1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f70166iobyxmoadg;

        public iobyxmoadg(String promoCollectionInfoId) {
            zdlpuopuiu.btonecajqb(promoCollectionInfoId, "promoCollectionInfoId");
            this.f70166iobyxmoadg = promoCollectionInfoId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f70166iobyxmoadg, ((iobyxmoadg) obj).f70166iobyxmoadg);
        }

        public int hashCode() {
            return this.f70166iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f70166iobyxmoadg;
        }

        public String toString() {
            return "Init(promoCollectionInfoId=" + this.f70166iobyxmoadg + ")";
        }
    }
}
