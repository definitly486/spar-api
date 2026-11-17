package rg;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc implements lj.btonecajqb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final rgvfuqvkyq f82578eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f82579gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final File f82580iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final draadjrbmk f82581ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final draadjrbmk f82582wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f82583zoijcleaow;

    private static abstract class iobyxmoadg extends ppxfxbqfkf {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(File rootDir) {
            super(rootDir);
            zdlpuopuiu.btonecajqb(rootDir, "rootDir");
        }
    }

    private static abstract class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final File f82584iobyxmoadg;

        public ppxfxbqfkf(File root) {
            zdlpuopuiu.btonecajqb(root, "root");
            this.f82584iobyxmoadg = root;
        }

        public final File iobyxmoadg() {
            return this.f82584iobyxmoadg;
        }

        public abstract File zoijcleaow();
    }

    private final class zoijcleaow extends hg.ppxfxbqfkf {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final ArrayDeque f82586jyumaefscl;

        private final class iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private boolean f82587eablkybsjg;

            /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f82588gxszxtbevo;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private File[] f82589ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private int f82590wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private boolean f82591zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(zoijcleaow zoijcleaowVar, File rootDir) {
                super(rootDir);
                zdlpuopuiu.btonecajqb(rootDir, "rootDir");
                this.f82588gxszxtbevo = zoijcleaowVar;
            }

            @Override // rg.wkgbmnqykc.ppxfxbqfkf
            public File zoijcleaow() {
                if (!this.f82587eablkybsjg && this.f82589ppxfxbqfkf == null) {
                    draadjrbmk draadjrbmkVar = wkgbmnqykc.this.f82581ppxfxbqfkf;
                    if (draadjrbmkVar != null && !((Boolean) draadjrbmkVar.invoke(iobyxmoadg())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = iobyxmoadg().listFiles();
                    this.f82589ppxfxbqfkf = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        rgvfuqvkyq rgvfuqvkyqVar = wkgbmnqykc.this.f82578eablkybsjg;
                        if (rgvfuqvkyqVar != null) {
                            rgvfuqvkyqVar.invoke(iobyxmoadg(), new AccessDeniedException(iobyxmoadg(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f82587eablkybsjg = true;
                    }
                }
                File[] fileArr = this.f82589ppxfxbqfkf;
                if (fileArr != null) {
                    int i13 = this.f82590wkgbmnqykc;
                    zdlpuopuiu.lqeggnwhkg(fileArr);
                    if (i13 < fileArr.length) {
                        File[] fileArr2 = this.f82589ppxfxbqfkf;
                        zdlpuopuiu.lqeggnwhkg(fileArr2);
                        int i14 = this.f82590wkgbmnqykc;
                        this.f82590wkgbmnqykc = i14 + 1;
                        return fileArr2[i14];
                    }
                }
                if (!this.f82591zoijcleaow) {
                    this.f82591zoijcleaow = true;
                    return iobyxmoadg();
                }
                draadjrbmk draadjrbmkVar2 = wkgbmnqykc.this.f82582wkgbmnqykc;
                if (draadjrbmkVar2 != null) {
                    draadjrbmkVar2.invoke(iobyxmoadg());
                }
                return null;
            }
        }

        private final class ppxfxbqfkf extends iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f82592eablkybsjg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private File[] f82593ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private int f82594wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private boolean f82595zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ppxfxbqfkf(zoijcleaow zoijcleaowVar, File rootDir) {
                super(rootDir);
                zdlpuopuiu.btonecajqb(rootDir, "rootDir");
                this.f82592eablkybsjg = zoijcleaowVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // rg.wkgbmnqykc.ppxfxbqfkf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File zoijcleaow() {
                /*
                    r10 = this;
                    boolean r0 = r10.f82595zoijcleaow
                    r1 = 0
                    if (r0 != 0) goto L28
                    rg.wkgbmnqykc$zoijcleaow r0 = r10.f82592eablkybsjg
                    rg.wkgbmnqykc r0 = rg.wkgbmnqykc.this
                    tg.draadjrbmk r0 = rg.wkgbmnqykc.ppxfxbqfkf(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.iobyxmoadg()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r10.f82595zoijcleaow = r0
                    java.io.File r0 = r10.iobyxmoadg()
                    return r0
                L28:
                    java.io.File[] r0 = r10.f82593ppxfxbqfkf
                    if (r0 == 0) goto L47
                    int r2 = r10.f82594wkgbmnqykc
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    rg.wkgbmnqykc$zoijcleaow r0 = r10.f82592eablkybsjg
                    rg.wkgbmnqykc r0 = rg.wkgbmnqykc.this
                    tg.draadjrbmk r0 = rg.wkgbmnqykc.eablkybsjg(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r10.iobyxmoadg()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r10.f82593ppxfxbqfkf
                    if (r0 != 0) goto L93
                    java.io.File r0 = r10.iobyxmoadg()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f82593ppxfxbqfkf = r0
                    if (r0 != 0) goto L77
                    rg.wkgbmnqykc$zoijcleaow r0 = r10.f82592eablkybsjg
                    rg.wkgbmnqykc r0 = rg.wkgbmnqykc.this
                    tg.rgvfuqvkyq r0 = rg.wkgbmnqykc.wkgbmnqykc(r0)
                    if (r0 == 0) goto L77
                    java.io.File r2 = r10.iobyxmoadg()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.iobyxmoadg()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L77:
                    java.io.File[] r0 = r10.f82593ppxfxbqfkf
                    if (r0 == 0) goto L81
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L93
                L81:
                    rg.wkgbmnqykc$zoijcleaow r0 = r10.f82592eablkybsjg
                    rg.wkgbmnqykc r0 = rg.wkgbmnqykc.this
                    tg.draadjrbmk r0 = rg.wkgbmnqykc.eablkybsjg(r0)
                    if (r0 == 0) goto L92
                    java.io.File r2 = r10.iobyxmoadg()
                    r0.invoke(r2)
                L92:
                    return r1
                L93:
                    java.io.File[] r0 = r10.f82593ppxfxbqfkf
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(r0)
                    int r1 = r10.f82594wkgbmnqykc
                    int r2 = r1 + 1
                    r10.f82594wkgbmnqykc = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: rg.wkgbmnqykc.zoijcleaow.ppxfxbqfkf.zoijcleaow():java.io.File");
            }
        }

        /* JADX INFO: renamed from: rg.wkgbmnqykc$zoijcleaow$wkgbmnqykc, reason: collision with other inner class name */
        public /* synthetic */ class C1849wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f82596iobyxmoadg;

            static {
                int[] iArr = new int[eablkybsjg.values().length];
                try {
                    iArr[eablkybsjg.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[eablkybsjg.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f82596iobyxmoadg = iArr;
            }
        }

        /* JADX INFO: renamed from: rg.wkgbmnqykc$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        private final class C1850zoijcleaow extends ppxfxbqfkf {

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f82597ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private boolean f82598zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1850zoijcleaow(zoijcleaow zoijcleaowVar, File rootFile) {
                super(rootFile);
                zdlpuopuiu.btonecajqb(rootFile, "rootFile");
                this.f82597ppxfxbqfkf = zoijcleaowVar;
            }

            @Override // rg.wkgbmnqykc.ppxfxbqfkf
            public File zoijcleaow() {
                if (this.f82598zoijcleaow) {
                    return null;
                }
                this.f82598zoijcleaow = true;
                return iobyxmoadg();
            }
        }

        public zoijcleaow() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f82586jyumaefscl = arrayDeque;
            if (wkgbmnqykc.this.f82580iobyxmoadg.isDirectory()) {
                arrayDeque.push(eablkybsjg(wkgbmnqykc.this.f82580iobyxmoadg));
            } else if (wkgbmnqykc.this.f82580iobyxmoadg.isFile()) {
                arrayDeque.push(new C1850zoijcleaow(this, wkgbmnqykc.this.f82580iobyxmoadg));
            } else {
                zoijcleaow();
            }
        }

        private final iobyxmoadg eablkybsjg(File file) {
            int i13 = C1849wkgbmnqykc.f82596iobyxmoadg[wkgbmnqykc.this.f82583zoijcleaow.ordinal()];
            if (i13 == 1) {
                return new ppxfxbqfkf(this, file);
            }
            if (i13 == 2) {
                return new iobyxmoadg(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File gxszxtbevo() {
            while (true) {
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f82586jyumaefscl.peek();
                if (ppxfxbqfkfVar == null) {
                    return null;
                }
                File fileZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
                if (fileZoijcleaow == null) {
                    this.f82586jyumaefscl.pop();
                } else {
                    if (zdlpuopuiu.eablkybsjg(fileZoijcleaow, ppxfxbqfkfVar.iobyxmoadg()) || !fileZoijcleaow.isDirectory() || this.f82586jyumaefscl.size() >= wkgbmnqykc.this.f82579gxszxtbevo) {
                        return fileZoijcleaow;
                    }
                    this.f82586jyumaefscl.push(eablkybsjg(fileZoijcleaow));
                }
            }
        }

        @Override // hg.ppxfxbqfkf
        protected void iobyxmoadg() {
            File fileGxszxtbevo = gxszxtbevo();
            if (fileGxszxtbevo != null) {
                ppxfxbqfkf(fileGxszxtbevo);
            } else {
                zoijcleaow();
            }
        }
    }

    private wkgbmnqykc(File file, eablkybsjg eablkybsjgVar, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        this.f82580iobyxmoadg = file;
        this.f82583zoijcleaow = eablkybsjgVar;
        this.f82581ppxfxbqfkf = draadjrbmkVar;
        this.f82582wkgbmnqykc = draadjrbmkVar2;
        this.f82578eablkybsjg = rgvfuqvkyqVar;
        this.f82579gxszxtbevo = i13;
    }

    @Override // lj.btonecajqb
    public Iterator iterator() {
        return new zoijcleaow();
    }

    /* synthetic */ wkgbmnqykc(File file, eablkybsjg eablkybsjgVar, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(file, (i14 & 2) != 0 ? eablkybsjg.TOP_DOWN : eablkybsjgVar, draadjrbmkVar, draadjrbmkVar2, rgvfuqvkyqVar, (i14 & 32) != 0 ? Integer.MAX_VALUE : i13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(File start, eablkybsjg direction) {
        this(start, direction, null, null, null, 0, 32, null);
        zdlpuopuiu.btonecajqb(start, "start");
        zdlpuopuiu.btonecajqb(direction, "direction");
    }
}
