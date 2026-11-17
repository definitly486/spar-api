package wn;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: wn.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3020iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f120256eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final List f120257gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f120258iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f120259ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f120260wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f120261zoijcleaow;

        public C3020iobyxmoadg(String id2, boolean z13, String typeImageUrl, String address, String workingHours, List tags) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(typeImageUrl, "typeImageUrl");
            zdlpuopuiu.btonecajqb(address, "address");
            zdlpuopuiu.btonecajqb(workingHours, "workingHours");
            zdlpuopuiu.btonecajqb(tags, "tags");
            this.f120258iobyxmoadg = id2;
            this.f120261zoijcleaow = z13;
            this.f120259ppxfxbqfkf = typeImageUrl;
            this.f120260wkgbmnqykc = address;
            this.f120256eablkybsjg = workingHours;
            this.f120257gxszxtbevo = tags;
        }

        public final String eablkybsjg() {
            return this.f120259ppxfxbqfkf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3020iobyxmoadg)) {
                return false;
            }
            C3020iobyxmoadg c3020iobyxmoadg = (C3020iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f120258iobyxmoadg, c3020iobyxmoadg.f120258iobyxmoadg) && this.f120261zoijcleaow == c3020iobyxmoadg.f120261zoijcleaow && zdlpuopuiu.eablkybsjg(this.f120259ppxfxbqfkf, c3020iobyxmoadg.f120259ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f120260wkgbmnqykc, c3020iobyxmoadg.f120260wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f120256eablkybsjg, c3020iobyxmoadg.f120256eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f120257gxszxtbevo, c3020iobyxmoadg.f120257gxszxtbevo);
        }

        @Override // wn.iobyxmoadg
        public String getKey() {
            return this.f120258iobyxmoadg;
        }

        public final String gxszxtbevo() {
            return this.f120256eablkybsjg;
        }

        public int hashCode() {
            return (((((((((this.f120258iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f120261zoijcleaow)) * 31) + this.f120259ppxfxbqfkf.hashCode()) * 31) + this.f120260wkgbmnqykc.hashCode()) * 31) + this.f120256eablkybsjg.hashCode()) * 31) + this.f120257gxszxtbevo.hashCode();
        }

        @Override // wn.iobyxmoadg
        public String iobyxmoadg() {
            String name = C3020iobyxmoadg.class.getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            return name;
        }

        public final boolean lqeggnwhkg() {
            return this.f120261zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f120258iobyxmoadg;
        }

        public String toString() {
            return "SearchUiModelShop(id=" + this.f120258iobyxmoadg + ", isSelected=" + this.f120261zoijcleaow + ", typeImageUrl=" + this.f120259ppxfxbqfkf + ", address=" + this.f120260wkgbmnqykc + ", workingHours=" + this.f120256eablkybsjg + ", tags=" + this.f120257gxszxtbevo + ")";
        }

        public final List wkgbmnqykc() {
            return this.f120257gxszxtbevo;
        }

        public final String zoijcleaow() {
            return this.f120260wkgbmnqykc;
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f120262iobyxmoadg;

        public zoijcleaow(String title) {
            zdlpuopuiu.btonecajqb(title, "title");
            this.f120262iobyxmoadg = title;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f120262iobyxmoadg, ((zoijcleaow) obj).f120262iobyxmoadg);
        }

        @Override // wn.iobyxmoadg
        public String getKey() {
            return this.f120262iobyxmoadg;
        }

        public int hashCode() {
            return this.f120262iobyxmoadg.hashCode();
        }

        @Override // wn.iobyxmoadg
        public String iobyxmoadg() {
            String name = zoijcleaow.class.getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            return name;
        }

        public String toString() {
            return "Title(title=" + this.f120262iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f120262iobyxmoadg;
        }
    }

    String getKey();

    String iobyxmoadg();
}
