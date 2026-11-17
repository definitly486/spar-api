package my1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: my1.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1464eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f68140iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1464eablkybsjg(String listId) {
            super(null);
            zdlpuopuiu.btonecajqb(listId, "listId");
            this.f68140iobyxmoadg = listId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1464eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f68140iobyxmoadg, ((C1464eablkybsjg) obj).f68140iobyxmoadg);
        }

        public int hashCode() {
            return this.f68140iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f68140iobyxmoadg;
        }

        public String toString() {
            return "ShowConfirmDeletePurchaseList(listId=" + this.f68140iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f68141iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1060035949;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f68142iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 2131822265;
        }

        public String toString() {
            return "NewPurchaseList";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f68143iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f68143iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f68143iobyxmoadg, ((wkgbmnqykc) obj).f68143iobyxmoadg);
        }

        public int hashCode() {
            return this.f68143iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f68143iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f68143iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f68144iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f68145zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String listId, String listName) {
            super(null);
            zdlpuopuiu.btonecajqb(listId, "listId");
            zdlpuopuiu.btonecajqb(listName, "listName");
            this.f68144iobyxmoadg = listId;
            this.f68145zoijcleaow = listName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f68144iobyxmoadg, zoijcleaowVar.f68144iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f68145zoijcleaow, zoijcleaowVar.f68145zoijcleaow);
        }

        public int hashCode() {
            return (this.f68144iobyxmoadg.hashCode() * 31) + this.f68145zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f68144iobyxmoadg;
        }

        public String toString() {
            return "NavigateToPurchasesListDetailsScreen(listId=" + this.f68144iobyxmoadg + ", listName=" + this.f68145zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f68145zoijcleaow;
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
