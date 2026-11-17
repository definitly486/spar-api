package th;

import jh.crxdokpmqz;
import jh.jztzpxfvev;
import zh.vdvldrhtss;

/* JADX INFO: loaded from: classes3.dex */
public interface btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final btonecajqb f110485iobyxmoadg = new iobyxmoadg();

    static class iobyxmoadg implements btonecajqb {
        iobyxmoadg() {
        }

        private static /* synthetic */ void gxszxtbevo(int i13) {
            Object[] objArr = new Object[3];
            switch (i13) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i13) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // th.btonecajqb
        public void eablkybsjg(zh.draadjrbmk draadjrbmkVar, jh.draadjrbmk draadjrbmkVar2) {
            if (draadjrbmkVar == null) {
                gxszxtbevo(3);
            }
            if (draadjrbmkVar2 == null) {
                gxszxtbevo(4);
            }
        }

        @Override // th.btonecajqb
        public jh.eablkybsjg iobyxmoadg(ii.ppxfxbqfkf ppxfxbqfkfVar) {
            if (ppxfxbqfkfVar != null) {
                return null;
            }
            gxszxtbevo(0);
            return null;
        }

        @Override // th.btonecajqb
        public void ppxfxbqfkf(zh.lqeggnwhkg lqeggnwhkgVar, jh.eablkybsjg eablkybsjgVar) {
            if (lqeggnwhkgVar == null) {
                gxszxtbevo(7);
            }
            if (eablkybsjgVar == null) {
                gxszxtbevo(8);
            }
        }

        @Override // th.btonecajqb
        public void wkgbmnqykc(vdvldrhtss vdvldrhtssVar, jztzpxfvev jztzpxfvevVar) {
            if (vdvldrhtssVar == null) {
                gxszxtbevo(1);
            }
            if (jztzpxfvevVar == null) {
                gxszxtbevo(2);
            }
        }

        @Override // th.btonecajqb
        public void zoijcleaow(zh.agtfadlqog agtfadlqogVar, crxdokpmqz crxdokpmqzVar) {
            if (agtfadlqogVar == null) {
                gxszxtbevo(5);
            }
            if (crxdokpmqzVar == null) {
                gxszxtbevo(6);
            }
        }
    }

    void eablkybsjg(zh.draadjrbmk draadjrbmkVar, jh.draadjrbmk draadjrbmkVar2);

    jh.eablkybsjg iobyxmoadg(ii.ppxfxbqfkf ppxfxbqfkfVar);

    void ppxfxbqfkf(zh.lqeggnwhkg lqeggnwhkgVar, jh.eablkybsjg eablkybsjgVar);

    void wkgbmnqykc(vdvldrhtss vdvldrhtssVar, jztzpxfvev jztzpxfvevVar);

    void zoijcleaow(zh.agtfadlqog agtfadlqogVar, crxdokpmqz crxdokpmqzVar);
}
