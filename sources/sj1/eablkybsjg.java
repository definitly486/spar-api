package sj1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: sj1.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2629eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f107151iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2629eablkybsjg(String listId) {
            super(null);
            zdlpuopuiu.btonecajqb(listId, "listId");
            this.f107151iobyxmoadg = listId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2629eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f107151iobyxmoadg, ((C2629eablkybsjg) obj).f107151iobyxmoadg);
        }

        public int hashCode() {
            return this.f107151iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f107151iobyxmoadg;
        }

        public String toString() {
            return "ShowConfirmDeletePurchaseList(listId=" + this.f107151iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f107152iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1961429482;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f107153iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1690232292;
        }

        public String toString() {
            return "NewPurchaseList";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f107154iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f107154iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f107154iobyxmoadg, ((wkgbmnqykc) obj).f107154iobyxmoadg);
        }

        public int hashCode() {
            return this.f107154iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f107154iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f107154iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f107155iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f107156zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String listId, String listName) {
            super(null);
            zdlpuopuiu.btonecajqb(listId, "listId");
            zdlpuopuiu.btonecajqb(listName, "listName");
            this.f107155iobyxmoadg = listId;
            this.f107156zoijcleaow = listName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f107155iobyxmoadg, zoijcleaowVar.f107155iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f107156zoijcleaow, zoijcleaowVar.f107156zoijcleaow);
        }

        public int hashCode() {
            return (this.f107155iobyxmoadg.hashCode() * 31) + this.f107156zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f107155iobyxmoadg;
        }

        public String toString() {
            return "NavigateToPurchasesListDetailsScreen(listId=" + this.f107155iobyxmoadg + ", listName=" + this.f107156zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f107156zoijcleaow;
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
