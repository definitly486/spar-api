package ci;

import bi.cqumvgiudr;
import ii.gxszxtbevo;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jh.xrmfcynszj;
import sh.ylkuphrtab;

/* JADX INFO: loaded from: classes3.dex */
public class zoijcleaow implements cqumvgiudr.ppxfxbqfkf {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static boolean f19884btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final Map f19885gtknphoqwx;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int[] f19889iobyxmoadg = null;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f19894zoijcleaow = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f19892ppxfxbqfkf = 0;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private String f19893wkgbmnqykc = null;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private String[] f19887eablkybsjg = null;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private String[] f19888gxszxtbevo = null;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private String[] f19890lqeggnwhkg = null;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private ci.iobyxmoadg.EnumC0363iobyxmoadg f19891nufgyqmvbu = null;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private String[] f19886dxjokdxxww = null;

    private class eablkybsjg implements cqumvgiudr.iobyxmoadg {

        class iobyxmoadg extends AbstractC0367zoijcleaow {
            iobyxmoadg() {
            }

            private static /* synthetic */ void gxszxtbevo(int i13) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // ci.zoijcleaow.AbstractC0367zoijcleaow
            protected void lqeggnwhkg(String[] strArr) {
                if (strArr == null) {
                    gxszxtbevo(0);
                }
                zoijcleaow.this.f19887eablkybsjg = strArr;
            }
        }

        /* JADX INFO: renamed from: ci.zoijcleaow$eablkybsjg$zoijcleaow, reason: collision with other inner class name */
        class C0365zoijcleaow extends AbstractC0367zoijcleaow {
            C0365zoijcleaow() {
            }

            private static /* synthetic */ void gxszxtbevo(int i13) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // ci.zoijcleaow.AbstractC0367zoijcleaow
            protected void lqeggnwhkg(String[] strArr) {
                if (strArr == null) {
                    gxszxtbevo(0);
                }
                zoijcleaow.this.f19888gxszxtbevo = strArr;
            }
        }

        private eablkybsjg() {
        }

        private cqumvgiudr.zoijcleaow dxjokdxxww() {
            return new C0365zoijcleaow();
        }

        private static /* synthetic */ void lqeggnwhkg(int i13) {
            Object[] objArr = new Object[3];
            if (i13 == 1) {
                objArr[0] = "enumClassId";
            } else if (i13 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i13 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i13 == 1 || i13 == 2) {
                objArr[2] = "visitEnum";
            } else if (i13 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private cqumvgiudr.zoijcleaow nufgyqmvbu() {
            return new iobyxmoadg();
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public cqumvgiudr.iobyxmoadg eablkybsjg(gxszxtbevo gxszxtbevoVar, ii.zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar != null) {
                return null;
            }
            lqeggnwhkg(3);
            return null;
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void gxszxtbevo(gxszxtbevo gxszxtbevoVar, Object obj) {
            if (gxszxtbevoVar == null) {
                return;
            }
            String strZoijcleaow = gxszxtbevoVar.zoijcleaow();
            if ("version".equals(strZoijcleaow)) {
                if (obj instanceof int[]) {
                    zoijcleaow.this.f19889iobyxmoadg = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strZoijcleaow)) {
                zoijcleaow.this.f19894zoijcleaow = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void iobyxmoadg() {
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void ppxfxbqfkf(gxszxtbevo gxszxtbevoVar, ni.gxszxtbevo gxszxtbevoVar2) {
            if (gxszxtbevoVar2 == null) {
                lqeggnwhkg(0);
            }
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void wkgbmnqykc(gxszxtbevo gxszxtbevoVar, ii.zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar2) {
            if (zoijcleaowVar == null) {
                lqeggnwhkg(1);
            }
            if (gxszxtbevoVar2 == null) {
                lqeggnwhkg(2);
            }
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public cqumvgiudr.zoijcleaow zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            String strZoijcleaow = gxszxtbevoVar != null ? gxszxtbevoVar.zoijcleaow() : null;
            if ("data".equals(strZoijcleaow) || "filePartClassNames".equals(strZoijcleaow)) {
                return nufgyqmvbu();
            }
            if ("strings".equals(strZoijcleaow)) {
                return dxjokdxxww();
            }
            return null;
        }
    }

    private class ppxfxbqfkf implements cqumvgiudr.iobyxmoadg {

        class iobyxmoadg extends AbstractC0367zoijcleaow {
            iobyxmoadg() {
            }

            private static /* synthetic */ void gxszxtbevo(int i13) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // ci.zoijcleaow.AbstractC0367zoijcleaow
            protected void lqeggnwhkg(String[] strArr) {
                if (strArr == null) {
                    gxszxtbevo(0);
                }
                zoijcleaow.this.f19887eablkybsjg = strArr;
            }
        }

        /* JADX INFO: renamed from: ci.zoijcleaow$ppxfxbqfkf$zoijcleaow, reason: collision with other inner class name */
        class C0366zoijcleaow extends AbstractC0367zoijcleaow {
            C0366zoijcleaow() {
            }

            private static /* synthetic */ void gxszxtbevo(int i13) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // ci.zoijcleaow.AbstractC0367zoijcleaow
            protected void lqeggnwhkg(String[] strArr) {
                if (strArr == null) {
                    gxszxtbevo(0);
                }
                zoijcleaow.this.f19888gxszxtbevo = strArr;
            }
        }

        private ppxfxbqfkf() {
        }

        private cqumvgiudr.zoijcleaow dxjokdxxww() {
            return new C0366zoijcleaow();
        }

        private static /* synthetic */ void lqeggnwhkg(int i13) {
            Object[] objArr = new Object[3];
            if (i13 == 1) {
                objArr[0] = "enumClassId";
            } else if (i13 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i13 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i13 == 1 || i13 == 2) {
                objArr[2] = "visitEnum";
            } else if (i13 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private cqumvgiudr.zoijcleaow nufgyqmvbu() {
            return new iobyxmoadg();
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public cqumvgiudr.iobyxmoadg eablkybsjg(gxszxtbevo gxszxtbevoVar, ii.zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar != null) {
                return null;
            }
            lqeggnwhkg(3);
            return null;
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void gxszxtbevo(gxszxtbevo gxszxtbevoVar, Object obj) {
            if (gxszxtbevoVar == null) {
                return;
            }
            String strZoijcleaow = gxszxtbevoVar.zoijcleaow();
            if ("k".equals(strZoijcleaow)) {
                if (obj instanceof Integer) {
                    zoijcleaow.this.f19891nufgyqmvbu = ci.iobyxmoadg.EnumC0363iobyxmoadg.lqeggnwhkg(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strZoijcleaow)) {
                if (obj instanceof int[]) {
                    zoijcleaow.this.f19889iobyxmoadg = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strZoijcleaow)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    zoijcleaow.this.f19894zoijcleaow = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strZoijcleaow)) {
                if (obj instanceof Integer) {
                    zoijcleaow.this.f19892ppxfxbqfkf = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strZoijcleaow) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                zoijcleaow.this.f19893wkgbmnqykc = str2;
            }
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void iobyxmoadg() {
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void ppxfxbqfkf(gxszxtbevo gxszxtbevoVar, ni.gxszxtbevo gxszxtbevoVar2) {
            if (gxszxtbevoVar2 == null) {
                lqeggnwhkg(0);
            }
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void wkgbmnqykc(gxszxtbevo gxszxtbevoVar, ii.zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar2) {
            if (zoijcleaowVar == null) {
                lqeggnwhkg(1);
            }
            if (gxszxtbevoVar2 == null) {
                lqeggnwhkg(2);
            }
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public cqumvgiudr.zoijcleaow zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            String strZoijcleaow = gxszxtbevoVar != null ? gxszxtbevoVar.zoijcleaow() : null;
            if ("d1".equals(strZoijcleaow)) {
                return nufgyqmvbu();
            }
            if ("d2".equals(strZoijcleaow)) {
                return dxjokdxxww();
            }
            return null;
        }
    }

    private class wkgbmnqykc implements cqumvgiudr.iobyxmoadg {

        class iobyxmoadg extends AbstractC0367zoijcleaow {
            iobyxmoadg() {
            }

            private static /* synthetic */ void gxszxtbevo(int i13) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // ci.zoijcleaow.AbstractC0367zoijcleaow
            protected void lqeggnwhkg(String[] strArr) {
                if (strArr == null) {
                    gxszxtbevo(0);
                }
                zoijcleaow.this.f19886dxjokdxxww = strArr;
            }
        }

        private wkgbmnqykc() {
        }

        private static /* synthetic */ void lqeggnwhkg(int i13) {
            Object[] objArr = new Object[3];
            if (i13 == 1) {
                objArr[0] = "enumClassId";
            } else if (i13 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i13 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i13 == 1 || i13 == 2) {
                objArr[2] = "visitEnum";
            } else if (i13 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private cqumvgiudr.zoijcleaow nufgyqmvbu() {
            return new iobyxmoadg();
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public cqumvgiudr.iobyxmoadg eablkybsjg(gxszxtbevo gxszxtbevoVar, ii.zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar != null) {
                return null;
            }
            lqeggnwhkg(3);
            return null;
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void gxszxtbevo(gxszxtbevo gxszxtbevoVar, Object obj) {
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void iobyxmoadg() {
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void ppxfxbqfkf(gxszxtbevo gxszxtbevoVar, ni.gxszxtbevo gxszxtbevoVar2) {
            if (gxszxtbevoVar2 == null) {
                lqeggnwhkg(0);
            }
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void wkgbmnqykc(gxszxtbevo gxszxtbevoVar, ii.zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar2) {
            if (zoijcleaowVar == null) {
                lqeggnwhkg(1);
            }
            if (gxszxtbevoVar2 == null) {
                lqeggnwhkg(2);
            }
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public cqumvgiudr.zoijcleaow zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            if ("b".equals(gxszxtbevoVar != null ? gxszxtbevoVar.zoijcleaow() : null)) {
                return nufgyqmvbu();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ci.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private static abstract class AbstractC0367zoijcleaow implements cqumvgiudr.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f19903iobyxmoadg = new ArrayList();

        private static /* synthetic */ void gxszxtbevo(int i13) {
            Object[] objArr = new Object[3];
            if (i13 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i13 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i13 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i13 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i13 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // bi.cqumvgiudr.zoijcleaow
        public void eablkybsjg(Object obj) {
            if (obj instanceof String) {
                this.f19903iobyxmoadg.add((String) obj);
            }
        }

        @Override // bi.cqumvgiudr.zoijcleaow
        public void iobyxmoadg() {
            lqeggnwhkg((String[]) this.f19903iobyxmoadg.toArray(new String[0]));
        }

        protected abstract void lqeggnwhkg(String[] strArr);

        @Override // bi.cqumvgiudr.zoijcleaow
        public cqumvgiudr.iobyxmoadg ppxfxbqfkf(ii.zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar != null) {
                return null;
            }
            gxszxtbevo(3);
            return null;
        }

        @Override // bi.cqumvgiudr.zoijcleaow
        public void wkgbmnqykc(ii.zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
            if (zoijcleaowVar == null) {
                gxszxtbevo(0);
            }
            if (gxszxtbevoVar == null) {
                gxszxtbevo(1);
            }
        }

        @Override // bi.cqumvgiudr.zoijcleaow
        public void zoijcleaow(ni.gxszxtbevo gxszxtbevoVar) {
            if (gxszxtbevoVar == null) {
                gxszxtbevo(2);
            }
        }
    }

    static {
        try {
            f19884btonecajqb = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f19884btonecajqb = false;
        }
        HashMap map = new HashMap();
        f19885gtknphoqwx = map;
        map.put(ii.zoijcleaow.gtknphoqwx(new ii.ppxfxbqfkf("kotlin.jvm.internal.KotlinClass")), ci.iobyxmoadg.EnumC0363iobyxmoadg.CLASS);
        map.put(ii.zoijcleaow.gtknphoqwx(new ii.ppxfxbqfkf("kotlin.jvm.internal.KotlinFileFacade")), ci.iobyxmoadg.EnumC0363iobyxmoadg.FILE_FACADE);
        map.put(ii.zoijcleaow.gtknphoqwx(new ii.ppxfxbqfkf("kotlin.jvm.internal.KotlinMultifileClass")), ci.iobyxmoadg.EnumC0363iobyxmoadg.MULTIFILE_CLASS);
        map.put(ii.zoijcleaow.gtknphoqwx(new ii.ppxfxbqfkf("kotlin.jvm.internal.KotlinMultifileClassPart")), ci.iobyxmoadg.EnumC0363iobyxmoadg.MULTIFILE_CLASS_PART);
        map.put(ii.zoijcleaow.gtknphoqwx(new ii.ppxfxbqfkf("kotlin.jvm.internal.KotlinSyntheticClass")), ci.iobyxmoadg.EnumC0363iobyxmoadg.SYNTHETIC_CLASS);
    }

    private boolean ojitshcjhn() {
        ci.iobyxmoadg.EnumC0363iobyxmoadg enumC0363iobyxmoadg = this.f19891nufgyqmvbu;
        return enumC0363iobyxmoadg == ci.iobyxmoadg.EnumC0363iobyxmoadg.CLASS || enumC0363iobyxmoadg == ci.iobyxmoadg.EnumC0363iobyxmoadg.FILE_FACADE || enumC0363iobyxmoadg == ci.iobyxmoadg.EnumC0363iobyxmoadg.MULTIFILE_CLASS_PART;
    }

    private static /* synthetic */ void wkgbmnqykc(int i13) {
        Object[] objArr = new Object[3];
        if (i13 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = AdRevenueConstants.SOURCE_KEY;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public ci.iobyxmoadg agtfadlqog() {
        return wflxmlrfwp(hi.eablkybsjg.f40416dxjokdxxww);
    }

    @Override // bi.cqumvgiudr.ppxfxbqfkf
    public void iobyxmoadg() {
    }

    public ci.iobyxmoadg wflxmlrfwp(hi.eablkybsjg eablkybsjgVar) {
        if (this.f19891nufgyqmvbu == null || this.f19889iobyxmoadg == null) {
            return null;
        }
        hi.eablkybsjg eablkybsjgVar2 = new hi.eablkybsjg(this.f19889iobyxmoadg, (this.f19892ppxfxbqfkf & 8) != 0);
        if (!eablkybsjgVar2.nufgyqmvbu(eablkybsjgVar)) {
            this.f19890lqeggnwhkg = this.f19887eablkybsjg;
            this.f19887eablkybsjg = null;
        } else if (ojitshcjhn() && this.f19887eablkybsjg == null) {
            return null;
        }
        String[] strArr = this.f19886dxjokdxxww;
        return new ci.iobyxmoadg(this.f19891nufgyqmvbu, eablkybsjgVar2, this.f19887eablkybsjg, this.f19890lqeggnwhkg, this.f19888gxszxtbevo, this.f19894zoijcleaow, this.f19892ppxfxbqfkf, this.f19893wkgbmnqykc, strArr != null ? hi.iobyxmoadg.eablkybsjg(strArr) : null);
    }

    @Override // bi.cqumvgiudr.ppxfxbqfkf
    public cqumvgiudr.iobyxmoadg zoijcleaow(ii.zoijcleaow zoijcleaowVar, xrmfcynszj xrmfcynszjVar) {
        ci.iobyxmoadg.EnumC0363iobyxmoadg enumC0363iobyxmoadg;
        if (zoijcleaowVar == null) {
            wkgbmnqykc(0);
        }
        if (xrmfcynszjVar == null) {
            wkgbmnqykc(1);
        }
        ii.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        if (ppxfxbqfkfVarIobyxmoadg.equals(ylkuphrtab.f106652iobyxmoadg)) {
            return new ppxfxbqfkf();
        }
        if (ppxfxbqfkfVarIobyxmoadg.equals(ylkuphrtab.f106666zdlpuopuiu)) {
            return new wkgbmnqykc();
        }
        if (f19884btonecajqb || this.f19891nufgyqmvbu != null || (enumC0363iobyxmoadg = (ci.iobyxmoadg.EnumC0363iobyxmoadg) f19885gtknphoqwx.get(zoijcleaowVar)) == null) {
            return null;
        }
        this.f19891nufgyqmvbu = enumC0363iobyxmoadg;
        return new eablkybsjg();
    }
}
