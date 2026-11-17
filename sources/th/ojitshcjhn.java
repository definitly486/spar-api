package th;

import java.util.Collections;
import java.util.List;
import zh.oxmwwwfdhm;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public interface ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ojitshcjhn f110501iobyxmoadg = new iobyxmoadg();

    static class iobyxmoadg implements ojitshcjhn {
        iobyxmoadg() {
        }

        private static /* synthetic */ void ppxfxbqfkf(int i13) {
            Object[] objArr = new Object[3];
            switch (i13) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i13 == 5 || i13 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // th.ojitshcjhn
        public zoijcleaow iobyxmoadg(oxmwwwfdhm oxmwwwfdhmVar, jh.eablkybsjg eablkybsjgVar, kegysxyocb kegysxyocbVar, kegysxyocb kegysxyocbVar2, List list, List list2) {
            if (oxmwwwfdhmVar == null) {
                ppxfxbqfkf(0);
            }
            if (eablkybsjgVar == null) {
                ppxfxbqfkf(1);
            }
            if (kegysxyocbVar == null) {
                ppxfxbqfkf(2);
            }
            if (list == null) {
                ppxfxbqfkf(3);
            }
            if (list2 == null) {
                ppxfxbqfkf(4);
            }
            return new zoijcleaow(kegysxyocbVar, kegysxyocbVar2, list, list2, Collections.emptyList(), false);
        }

        @Override // th.ojitshcjhn
        public void zoijcleaow(jh.zoijcleaow zoijcleaowVar, List list) {
            if (zoijcleaowVar == null) {
                ppxfxbqfkf(5);
            }
            if (list == null) {
                ppxfxbqfkf(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f110502eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final boolean f110503gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final kegysxyocb f110504iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f110505ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f110506wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final kegysxyocb f110507zoijcleaow;

        public zoijcleaow(kegysxyocb kegysxyocbVar, kegysxyocb kegysxyocbVar2, List list, List list2, List list3, boolean z13) {
            if (kegysxyocbVar == null) {
                iobyxmoadg(0);
            }
            if (list == null) {
                iobyxmoadg(1);
            }
            if (list2 == null) {
                iobyxmoadg(2);
            }
            if (list3 == null) {
                iobyxmoadg(3);
            }
            this.f110504iobyxmoadg = kegysxyocbVar;
            this.f110507zoijcleaow = kegysxyocbVar2;
            this.f110505ppxfxbqfkf = list;
            this.f110506wkgbmnqykc = list2;
            this.f110502eablkybsjg = list3;
            this.f110503gxszxtbevo = z13;
        }

        private static /* synthetic */ void iobyxmoadg(int i13) {
            String str = (i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? 2 : 3];
            switch (i13) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i13 == 4) {
                objArr[1] = "getReturnType";
            } else if (i13 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i13 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i13 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i13 != 4 && i13 != 5 && i13 != 6 && i13 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i13 != 4 && i13 != 5 && i13 != 6 && i13 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public List eablkybsjg() {
            List list = this.f110506wkgbmnqykc;
            if (list == null) {
                iobyxmoadg(6);
            }
            return list;
        }

        public List gxszxtbevo() {
            List list = this.f110505ppxfxbqfkf;
            if (list == null) {
                iobyxmoadg(5);
            }
            return list;
        }

        public boolean lqeggnwhkg() {
            return this.f110503gxszxtbevo;
        }

        public kegysxyocb ppxfxbqfkf() {
            return this.f110507zoijcleaow;
        }

        public kegysxyocb wkgbmnqykc() {
            kegysxyocb kegysxyocbVar = this.f110504iobyxmoadg;
            if (kegysxyocbVar == null) {
                iobyxmoadg(4);
            }
            return kegysxyocbVar;
        }

        public List zoijcleaow() {
            List list = this.f110502eablkybsjg;
            if (list == null) {
                iobyxmoadg(7);
            }
            return list;
        }
    }

    zoijcleaow iobyxmoadg(oxmwwwfdhm oxmwwwfdhmVar, jh.eablkybsjg eablkybsjgVar, kegysxyocb kegysxyocbVar, kegysxyocb kegysxyocbVar2, List list, List list2);

    void zoijcleaow(jh.zoijcleaow zoijcleaowVar, List list);
}
