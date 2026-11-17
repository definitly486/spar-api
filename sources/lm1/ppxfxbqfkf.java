package lm1;

import gg.kcexrzcfyt;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainException;
import ru.myspar.proloyalty.rate.rate_product.impl.domain.exception.CompletedReviewException;
import ru.myspar.proloyalty.rate.rate_product.impl.domain.exception.GetNextReviewException;
import ru.myspar.proloyalty.rate.rate_product.impl.domain.exception.SaveReviewException;
import ru.myspar.proloyalty.rate.rate_product.impl.domain.model.RateProductItem;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pkzmftpjix f63614ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final km1.iobyxmoadg f63615zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final jm1.zoijcleaow f63616iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f63617zoijcleaow;

        public iobyxmoadg(jm1.zoijcleaow reviewParams, boolean z13) {
            zdlpuopuiu.btonecajqb(reviewParams, "reviewParams");
            this.f63616iobyxmoadg = reviewParams;
            this.f63617zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f63616iobyxmoadg, iobyxmoadgVar.f63616iobyxmoadg) && this.f63617zoijcleaow == iobyxmoadgVar.f63617zoijcleaow;
        }

        public int hashCode() {
            return (this.f63616iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f63617zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f63617zoijcleaow;
        }

        public String toString() {
            return "Params(reviewParams=" + this.f63616iobyxmoadg + ", getNext=" + this.f63617zoijcleaow + ")";
        }

        public final jm1.zoijcleaow zoijcleaow() {
            return this.f63616iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: lm1.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C1298ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f63618jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f63620zdlpuopuiu;

        C1298ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f63620zdlpuopuiu = obj;
            this.f63618jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    public interface zoijcleaow {

        public static final class iobyxmoadg implements zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f63621iobyxmoadg;

            public iobyxmoadg(String message) {
                zdlpuopuiu.btonecajqb(message, "message");
                this.f63621iobyxmoadg = message;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f63621iobyxmoadg, ((iobyxmoadg) obj).f63621iobyxmoadg);
            }

            public int hashCode() {
                return this.f63621iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f63621iobyxmoadg;
            }

            public String toString() {
                return "Completed(message=" + this.f63621iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: lm1.ppxfxbqfkf$zoijcleaow$ppxfxbqfkf, reason: collision with other inner class name */
        public static final class C1299ppxfxbqfkf implements zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final RateProductItem f63622iobyxmoadg;

            public C1299ppxfxbqfkf(RateProductItem item) {
                zdlpuopuiu.btonecajqb(item, "item");
                this.f63622iobyxmoadg = item;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1299ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f63622iobyxmoadg, ((C1299ppxfxbqfkf) obj).f63622iobyxmoadg);
            }

            public int hashCode() {
                return this.f63622iobyxmoadg.hashCode();
            }

            public final RateProductItem iobyxmoadg() {
                return this.f63622iobyxmoadg;
            }

            public String toString() {
                return "NextItem(item=" + this.f63622iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: lm1.ppxfxbqfkf$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public interface InterfaceC1300zoijcleaow extends zoijcleaow {

            /* JADX INFO: renamed from: lm1.ppxfxbqfkf$zoijcleaow$zoijcleaow$eablkybsjg */
            public static final class eablkybsjg implements InterfaceC1300zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                public static final eablkybsjg f63623iobyxmoadg = new eablkybsjg();

                private eablkybsjg() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof eablkybsjg);
                }

                public int hashCode() {
                    return -31734390;
                }

                public String toString() {
                    return "Unknown";
                }
            }

            /* JADX INFO: renamed from: lm1.ppxfxbqfkf$zoijcleaow$zoijcleaow$iobyxmoadg */
            public static final class iobyxmoadg implements InterfaceC1300zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                private final String f63624iobyxmoadg;

                public iobyxmoadg(String message) {
                    zdlpuopuiu.btonecajqb(message, "message");
                    this.f63624iobyxmoadg = message;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f63624iobyxmoadg, ((iobyxmoadg) obj).f63624iobyxmoadg);
                }

                public int hashCode() {
                    return this.f63624iobyxmoadg.hashCode();
                }

                public final String iobyxmoadg() {
                    return this.f63624iobyxmoadg;
                }

                public String toString() {
                    return "Backend(message=" + this.f63624iobyxmoadg + ")";
                }
            }

            /* JADX INFO: renamed from: lm1.ppxfxbqfkf$zoijcleaow$zoijcleaow$ppxfxbqfkf, reason: collision with other inner class name */
            public static final class C1301ppxfxbqfkf implements InterfaceC1300zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                private final String f63625iobyxmoadg;

                public C1301ppxfxbqfkf(String message) {
                    zdlpuopuiu.btonecajqb(message, "message");
                    this.f63625iobyxmoadg = message;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1301ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f63625iobyxmoadg, ((C1301ppxfxbqfkf) obj).f63625iobyxmoadg);
                }

                public int hashCode() {
                    return this.f63625iobyxmoadg.hashCode();
                }

                public final String iobyxmoadg() {
                    return this.f63625iobyxmoadg;
                }

                public String toString() {
                    return "RetrieveNextReview(message=" + this.f63625iobyxmoadg + ")";
                }
            }

            /* JADX INFO: renamed from: lm1.ppxfxbqfkf$zoijcleaow$zoijcleaow$wkgbmnqykc */
            public static final class wkgbmnqykc implements InterfaceC1300zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                private final String f63626iobyxmoadg;

                public wkgbmnqykc(String message) {
                    zdlpuopuiu.btonecajqb(message, "message");
                    this.f63626iobyxmoadg = message;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f63626iobyxmoadg, ((wkgbmnqykc) obj).f63626iobyxmoadg);
                }

                public int hashCode() {
                    return this.f63626iobyxmoadg.hashCode();
                }

                public final String iobyxmoadg() {
                    return this.f63626iobyxmoadg;
                }

                public String toString() {
                    return "SaveReview(message=" + this.f63626iobyxmoadg + ")";
                }
            }

            /* JADX INFO: renamed from: lm1.ppxfxbqfkf$zoijcleaow$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
            public static final class C1302zoijcleaow implements InterfaceC1300zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                public static final C1302zoijcleaow f63627iobyxmoadg = new C1302zoijcleaow();

                private C1302zoijcleaow() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1302zoijcleaow);
                }

                public int hashCode() {
                    return -1942921622;
                }

                public String toString() {
                    return "Data";
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(km1.iobyxmoadg rateProductsRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(rateProductsRepository, "rateProductsRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f63615zoijcleaow = rateProductsRepository;
        this.f63614ppxfxbqfkf = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        C1298ppxfxbqfkf c1298ppxfxbqfkf;
        Object objWkgbmnqykc;
        Object c1299ppxfxbqfkf;
        if (gxszxtbevoVar instanceof C1298ppxfxbqfkf) {
            c1298ppxfxbqfkf = (C1298ppxfxbqfkf) gxszxtbevoVar;
            int i13 = c1298ppxfxbqfkf.f63618jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1298ppxfxbqfkf.f63618jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1298ppxfxbqfkf = new C1298ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            c1298ppxfxbqfkf = new C1298ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = c1298ppxfxbqfkf.f63620zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1298ppxfxbqfkf.f63618jyumaefscl;
        boolean z13 = true;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
                jm1.zoijcleaow zoijcleaowVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
                if (zoijcleaowVarZoijcleaow.zoijcleaow().getRating() == 0) {
                    return zoijcleaow.InterfaceC1300zoijcleaow.C1302zoijcleaow.f63627iobyxmoadg;
                }
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                if (iobyxmoadgVar.iobyxmoadg()) {
                    km1.iobyxmoadg iobyxmoadgVar3 = this.f63615zoijcleaow;
                    c1298ppxfxbqfkf.f63618jyumaefscl = 1;
                    objPpxfxbqfkf = iobyxmoadgVar3.ppxfxbqfkf(zoijcleaowVarZoijcleaow, c1298ppxfxbqfkf);
                    if (objPpxfxbqfkf == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    c1299ppxfxbqfkf = new zoijcleaow.C1299ppxfxbqfkf((RateProductItem) objPpxfxbqfkf);
                } else {
                    km1.iobyxmoadg iobyxmoadgVar4 = this.f63615zoijcleaow;
                    c1298ppxfxbqfkf.f63618jyumaefscl = 2;
                    if (iobyxmoadgVar4.wkgbmnqykc(zoijcleaowVarZoijcleaow, c1298ppxfxbqfkf) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    c1299ppxfxbqfkf = zoijcleaow.InterfaceC1300zoijcleaow.eablkybsjg.f63623iobyxmoadg;
                }
            } else if (i14 == 1) {
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
                c1299ppxfxbqfkf = new zoijcleaow.C1299ppxfxbqfkf((RateProductItem) objPpxfxbqfkf);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
                c1299ppxfxbqfkf = zoijcleaow.InterfaceC1300zoijcleaow.eablkybsjg.f63623iobyxmoadg;
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(c1299ppxfxbqfkf);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww == null) {
            return objWkgbmnqykc;
        }
        if (thDxjokdxxww instanceof CompletedReviewException) {
            return new zoijcleaow.iobyxmoadg(((CompletedReviewException) thDxjokdxxww).getMessage());
        }
        if (thDxjokdxxww instanceof GetNextReviewException) {
            return new zoijcleaow.InterfaceC1300zoijcleaow.C1301ppxfxbqfkf(((GetNextReviewException) thDxjokdxxww).getMessage());
        }
        if (thDxjokdxxww instanceof SaveReviewException) {
            return new zoijcleaow.InterfaceC1300zoijcleaow.wkgbmnqykc(((SaveReviewException) thDxjokdxxww).getMessage());
        }
        if (!(thDxjokdxxww instanceof DomainException)) {
            return zoijcleaow.InterfaceC1300zoijcleaow.eablkybsjg.f63623iobyxmoadg;
        }
        String message = thDxjokdxxww.getMessage();
        if (message != null && !mj.kcexrzcfyt.zfvoamnweg(message)) {
            z13 = false;
        }
        if (z13) {
            message = null;
        }
        return message != null ? new zoijcleaow.InterfaceC1300zoijcleaow.iobyxmoadg(message) : zoijcleaow.InterfaceC1300zoijcleaow.eablkybsjg.f63623iobyxmoadg;
    }
}
