package hm0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: hm0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0945iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f40802eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final List f40803gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f40804iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f40805ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f40806wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f40807zoijcleaow;

        public C0945iobyxmoadg(String id2, boolean z13, String typeImageUrl, String address, String workingHours, List tags) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(typeImageUrl, "typeImageUrl");
            zdlpuopuiu.btonecajqb(address, "address");
            zdlpuopuiu.btonecajqb(workingHours, "workingHours");
            zdlpuopuiu.btonecajqb(tags, "tags");
            this.f40804iobyxmoadg = id2;
            this.f40807zoijcleaow = z13;
            this.f40805ppxfxbqfkf = typeImageUrl;
            this.f40806wkgbmnqykc = address;
            this.f40802eablkybsjg = workingHours;
            this.f40803gxszxtbevo = tags;
        }

        public final String eablkybsjg() {
            return this.f40805ppxfxbqfkf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0945iobyxmoadg)) {
                return false;
            }
            C0945iobyxmoadg c0945iobyxmoadg = (C0945iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f40804iobyxmoadg, c0945iobyxmoadg.f40804iobyxmoadg) && this.f40807zoijcleaow == c0945iobyxmoadg.f40807zoijcleaow && zdlpuopuiu.eablkybsjg(this.f40805ppxfxbqfkf, c0945iobyxmoadg.f40805ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f40806wkgbmnqykc, c0945iobyxmoadg.f40806wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f40802eablkybsjg, c0945iobyxmoadg.f40802eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f40803gxszxtbevo, c0945iobyxmoadg.f40803gxszxtbevo);
        }

        @Override // hm0.iobyxmoadg
        public String getKey() {
            return this.f40804iobyxmoadg;
        }

        public final String gxszxtbevo() {
            return this.f40802eablkybsjg;
        }

        public int hashCode() {
            return (((((((((this.f40804iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f40807zoijcleaow)) * 31) + this.f40805ppxfxbqfkf.hashCode()) * 31) + this.f40806wkgbmnqykc.hashCode()) * 31) + this.f40802eablkybsjg.hashCode()) * 31) + this.f40803gxszxtbevo.hashCode();
        }

        @Override // hm0.iobyxmoadg
        public String iobyxmoadg() {
            String name = C0945iobyxmoadg.class.getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            return name;
        }

        public final boolean lqeggnwhkg() {
            return this.f40807zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f40804iobyxmoadg;
        }

        public String toString() {
            return "SearchUiModelShop(id=" + this.f40804iobyxmoadg + ", isSelected=" + this.f40807zoijcleaow + ", typeImageUrl=" + this.f40805ppxfxbqfkf + ", address=" + this.f40806wkgbmnqykc + ", workingHours=" + this.f40802eablkybsjg + ", tags=" + this.f40803gxszxtbevo + ")";
        }

        public final List wkgbmnqykc() {
            return this.f40803gxszxtbevo;
        }

        public final String zoijcleaow() {
            return this.f40806wkgbmnqykc;
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f40808iobyxmoadg;

        public zoijcleaow(String title) {
            zdlpuopuiu.btonecajqb(title, "title");
            this.f40808iobyxmoadg = title;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f40808iobyxmoadg, ((zoijcleaow) obj).f40808iobyxmoadg);
        }

        @Override // hm0.iobyxmoadg
        public String getKey() {
            return this.f40808iobyxmoadg;
        }

        public int hashCode() {
            return this.f40808iobyxmoadg.hashCode();
        }

        @Override // hm0.iobyxmoadg
        public String iobyxmoadg() {
            String name = zoijcleaow.class.getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            return name;
        }

        public String toString() {
            return "Title(title=" + this.f40808iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f40808iobyxmoadg;
        }
    }

    String getKey();

    String iobyxmoadg();
}
