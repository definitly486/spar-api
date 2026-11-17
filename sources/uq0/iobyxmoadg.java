package uq0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: uq0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2830iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f114137iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f114138zoijcleaow;

        public C2830iobyxmoadg(List banners) {
            zdlpuopuiu.btonecajqb(banners, "banners");
            this.f114137iobyxmoadg = banners;
            String name = C2830iobyxmoadg.class.getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            this.f114138zoijcleaow = name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2830iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f114137iobyxmoadg, ((C2830iobyxmoadg) obj).f114137iobyxmoadg);
        }

        @Override // uq0.iobyxmoadg
        public String getId() {
            return this.f114138zoijcleaow;
        }

        public int hashCode() {
            return this.f114137iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f114137iobyxmoadg;
        }

        public String toString() {
            return "Banners(banners=" + this.f114137iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f114139eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f114140iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f114141ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f114142wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f114143zoijcleaow;

        public zoijcleaow(String id2, String title, String image, String adv, mz0.ppxfxbqfkf ppxfxbqfkfVar) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(image, "image");
            zdlpuopuiu.btonecajqb(adv, "adv");
            this.f114140iobyxmoadg = id2;
            this.f114143zoijcleaow = title;
            this.f114141ppxfxbqfkf = image;
            this.f114142wkgbmnqykc = adv;
            this.f114139eablkybsjg = ppxfxbqfkfVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f114140iobyxmoadg, zoijcleaowVar.f114140iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f114143zoijcleaow, zoijcleaowVar.f114143zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f114141ppxfxbqfkf, zoijcleaowVar.f114141ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f114142wkgbmnqykc, zoijcleaowVar.f114142wkgbmnqykc) && this.f114139eablkybsjg == zoijcleaowVar.f114139eablkybsjg;
        }

        @Override // uq0.iobyxmoadg
        public String getId() {
            return this.f114140iobyxmoadg;
        }

        public int hashCode() {
            int iHashCode = ((((((this.f114140iobyxmoadg.hashCode() * 31) + this.f114143zoijcleaow.hashCode()) * 31) + this.f114141ppxfxbqfkf.hashCode()) * 31) + this.f114142wkgbmnqykc.hashCode()) * 31;
            mz0.ppxfxbqfkf ppxfxbqfkfVar = this.f114139eablkybsjg;
            return iHashCode + (ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f114142wkgbmnqykc;
        }

        public final mz0.ppxfxbqfkf ppxfxbqfkf() {
            return this.f114139eablkybsjg;
        }

        public String toString() {
            return "Section(id=" + this.f114140iobyxmoadg + ", title=" + this.f114143zoijcleaow + ", image=" + this.f114141ppxfxbqfkf + ", adv=" + this.f114142wkgbmnqykc + ", sortType=" + this.f114139eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f114143zoijcleaow;
        }

        public final String zoijcleaow() {
            return this.f114141ppxfxbqfkf;
        }
    }

    String getId();
}
