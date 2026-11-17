package m7;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public interface wflxmlrfwp {

    public static final class iobyxmoadg implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f66440iobyxmoadg;

        private /* synthetic */ iobyxmoadg(String str) {
            this.f66440iobyxmoadg = str;
        }

        public static String eablkybsjg(String str) {
            return "File(fileName=" + str + ")";
        }

        public static final /* synthetic */ iobyxmoadg iobyxmoadg(String str) {
            return new iobyxmoadg(str);
        }

        public static boolean ppxfxbqfkf(String str, Object obj) {
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(str, ((iobyxmoadg) obj).gxszxtbevo());
        }

        public static int wkgbmnqykc(String str) {
            return str.hashCode();
        }

        public static String zoijcleaow(String fileName) {
            zdlpuopuiu.btonecajqb(fileName, "fileName");
            return fileName;
        }

        public boolean equals(Object obj) {
            return ppxfxbqfkf(this.f66440iobyxmoadg, obj);
        }

        public final /* synthetic */ String gxszxtbevo() {
            return this.f66440iobyxmoadg;
        }

        public int hashCode() {
            return wkgbmnqykc(this.f66440iobyxmoadg);
        }

        public String toString() {
            return eablkybsjg(this.f66440iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f66441iobyxmoadg;

        private /* synthetic */ zoijcleaow(int i13) {
            this.f66441iobyxmoadg = i13;
        }

        public static String eablkybsjg(int i13) {
            return "RawRes(resId=" + i13 + ")";
        }

        public static final /* synthetic */ zoijcleaow iobyxmoadg(int i13) {
            return new zoijcleaow(i13);
        }

        public static boolean ppxfxbqfkf(int i13, Object obj) {
            return (obj instanceof zoijcleaow) && i13 == ((zoijcleaow) obj).gxszxtbevo();
        }

        public static int wkgbmnqykc(int i13) {
            return Integer.hashCode(i13);
        }

        public static int zoijcleaow(int i13) {
            return i13;
        }

        public boolean equals(Object obj) {
            return ppxfxbqfkf(this.f66441iobyxmoadg, obj);
        }

        public final /* synthetic */ int gxszxtbevo() {
            return this.f66441iobyxmoadg;
        }

        public int hashCode() {
            return wkgbmnqykc(this.f66441iobyxmoadg);
        }

        public String toString() {
            return eablkybsjg(this.f66441iobyxmoadg);
        }
    }
}
