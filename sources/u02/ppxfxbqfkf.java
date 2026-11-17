package u02;

import gg.kcexrzcfyt;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.core.error_handler.exceptions.DomainException;
import ru.myspar.rate.rate_product.impl.domain.exception.CompletedReviewException;
import ru.myspar.rate.rate_product.impl.domain.exception.GetNextReviewException;
import ru.myspar.rate.rate_product.impl.domain.exception.SaveReviewException;
import ru.myspar.rate.rate_product.impl.domain.model.RateProductItem;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pkzmftpjix f112448ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final t02.iobyxmoadg f112449zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final s02.zoijcleaow f112450iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f112451zoijcleaow;

        public iobyxmoadg(s02.zoijcleaow reviewParams, boolean z13) {
            zdlpuopuiu.btonecajqb(reviewParams, "reviewParams");
            this.f112450iobyxmoadg = reviewParams;
            this.f112451zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f112450iobyxmoadg, iobyxmoadgVar.f112450iobyxmoadg) && this.f112451zoijcleaow == iobyxmoadgVar.f112451zoijcleaow;
        }

        public int hashCode() {
            return (this.f112450iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f112451zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f112451zoijcleaow;
        }

        public String toString() {
            return "Params(reviewParams=" + this.f112450iobyxmoadg + ", getNext=" + this.f112451zoijcleaow + ")";
        }

        public final s02.zoijcleaow zoijcleaow() {
            return this.f112450iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: u02.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C2768ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f112452jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f112454zdlpuopuiu;

        C2768ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112454zdlpuopuiu = obj;
            this.f112452jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    public interface zoijcleaow {

        public static final class iobyxmoadg implements zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f112455iobyxmoadg;

            public iobyxmoadg(String message) {
                zdlpuopuiu.btonecajqb(message, "message");
                this.f112455iobyxmoadg = message;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f112455iobyxmoadg, ((iobyxmoadg) obj).f112455iobyxmoadg);
            }

            public int hashCode() {
                return this.f112455iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f112455iobyxmoadg;
            }

            public String toString() {
                return "Completed(message=" + this.f112455iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: u02.ppxfxbqfkf$zoijcleaow$ppxfxbqfkf, reason: collision with other inner class name */
        public static final class C2769ppxfxbqfkf implements zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final RateProductItem f112456iobyxmoadg;

            public C2769ppxfxbqfkf(RateProductItem item) {
                zdlpuopuiu.btonecajqb(item, "item");
                this.f112456iobyxmoadg = item;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2769ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f112456iobyxmoadg, ((C2769ppxfxbqfkf) obj).f112456iobyxmoadg);
            }

            public int hashCode() {
                return this.f112456iobyxmoadg.hashCode();
            }

            public final RateProductItem iobyxmoadg() {
                return this.f112456iobyxmoadg;
            }

            public String toString() {
                return "NextItem(item=" + this.f112456iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: u02.ppxfxbqfkf$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public interface InterfaceC2770zoijcleaow extends zoijcleaow {

            /* JADX INFO: renamed from: u02.ppxfxbqfkf$zoijcleaow$zoijcleaow$eablkybsjg */
            public static final class eablkybsjg implements InterfaceC2770zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                public static final eablkybsjg f112457iobyxmoadg = new eablkybsjg();

                private eablkybsjg() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof eablkybsjg);
                }

                public int hashCode() {
                    return -244618419;
                }

                public String toString() {
                    return "Unknown";
                }
            }

            /* JADX INFO: renamed from: u02.ppxfxbqfkf$zoijcleaow$zoijcleaow$iobyxmoadg */
            public static final class iobyxmoadg implements InterfaceC2770zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                private final String f112458iobyxmoadg;

                public iobyxmoadg(String message) {
                    zdlpuopuiu.btonecajqb(message, "message");
                    this.f112458iobyxmoadg = message;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f112458iobyxmoadg, ((iobyxmoadg) obj).f112458iobyxmoadg);
                }

                public int hashCode() {
                    return this.f112458iobyxmoadg.hashCode();
                }

                public final String iobyxmoadg() {
                    return this.f112458iobyxmoadg;
                }

                public String toString() {
                    return "Backend(message=" + this.f112458iobyxmoadg + ")";
                }
            }

            /* JADX INFO: renamed from: u02.ppxfxbqfkf$zoijcleaow$zoijcleaow$ppxfxbqfkf, reason: collision with other inner class name */
            public static final class C2771ppxfxbqfkf implements InterfaceC2770zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                private final String f112459iobyxmoadg;

                public C2771ppxfxbqfkf(String message) {
                    zdlpuopuiu.btonecajqb(message, "message");
                    this.f112459iobyxmoadg = message;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2771ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f112459iobyxmoadg, ((C2771ppxfxbqfkf) obj).f112459iobyxmoadg);
                }

                public int hashCode() {
                    return this.f112459iobyxmoadg.hashCode();
                }

                public final String iobyxmoadg() {
                    return this.f112459iobyxmoadg;
                }

                public String toString() {
                    return "RetrieveNextReview(message=" + this.f112459iobyxmoadg + ")";
                }
            }

            /* JADX INFO: renamed from: u02.ppxfxbqfkf$zoijcleaow$zoijcleaow$wkgbmnqykc */
            public static final class wkgbmnqykc implements InterfaceC2770zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                private final String f112460iobyxmoadg;

                public wkgbmnqykc(String message) {
                    zdlpuopuiu.btonecajqb(message, "message");
                    this.f112460iobyxmoadg = message;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f112460iobyxmoadg, ((wkgbmnqykc) obj).f112460iobyxmoadg);
                }

                public int hashCode() {
                    return this.f112460iobyxmoadg.hashCode();
                }

                public final String iobyxmoadg() {
                    return this.f112460iobyxmoadg;
                }

                public String toString() {
                    return "SaveReview(message=" + this.f112460iobyxmoadg + ")";
                }
            }

            /* JADX INFO: renamed from: u02.ppxfxbqfkf$zoijcleaow$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
            public static final class C2772zoijcleaow implements InterfaceC2770zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                public static final C2772zoijcleaow f112461iobyxmoadg = new C2772zoijcleaow();

                private C2772zoijcleaow() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2772zoijcleaow);
                }

                public int hashCode() {
                    return 1104824199;
                }

                public String toString() {
                    return "Data";
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(t02.iobyxmoadg rateProductsRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(rateProductsRepository, "rateProductsRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f112449zoijcleaow = rateProductsRepository;
        this.f112448ppxfxbqfkf = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        C2768ppxfxbqfkf c2768ppxfxbqfkf;
        Object objWkgbmnqykc;
        Object c2769ppxfxbqfkf;
        if (gxszxtbevoVar instanceof C2768ppxfxbqfkf) {
            c2768ppxfxbqfkf = (C2768ppxfxbqfkf) gxszxtbevoVar;
            int i13 = c2768ppxfxbqfkf.f112452jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2768ppxfxbqfkf.f112452jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2768ppxfxbqfkf = new C2768ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            c2768ppxfxbqfkf = new C2768ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = c2768ppxfxbqfkf.f112454zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2768ppxfxbqfkf.f112452jyumaefscl;
        boolean z13 = true;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
                s02.zoijcleaow zoijcleaowVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
                if (zoijcleaowVarZoijcleaow.zoijcleaow().getRating() == 0) {
                    return zoijcleaow.InterfaceC2770zoijcleaow.C2772zoijcleaow.f112461iobyxmoadg;
                }
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                if (iobyxmoadgVar.iobyxmoadg()) {
                    t02.iobyxmoadg iobyxmoadgVar3 = this.f112449zoijcleaow;
                    c2768ppxfxbqfkf.f112452jyumaefscl = 1;
                    objPpxfxbqfkf = iobyxmoadgVar3.ppxfxbqfkf(zoijcleaowVarZoijcleaow, c2768ppxfxbqfkf);
                    if (objPpxfxbqfkf == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    c2769ppxfxbqfkf = new zoijcleaow.C2769ppxfxbqfkf((RateProductItem) objPpxfxbqfkf);
                } else {
                    t02.iobyxmoadg iobyxmoadgVar4 = this.f112449zoijcleaow;
                    c2768ppxfxbqfkf.f112452jyumaefscl = 2;
                    if (iobyxmoadgVar4.wkgbmnqykc(zoijcleaowVarZoijcleaow, c2768ppxfxbqfkf) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    c2769ppxfxbqfkf = zoijcleaow.InterfaceC2770zoijcleaow.eablkybsjg.f112457iobyxmoadg;
                }
            } else if (i14 == 1) {
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
                c2769ppxfxbqfkf = new zoijcleaow.C2769ppxfxbqfkf((RateProductItem) objPpxfxbqfkf);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
                c2769ppxfxbqfkf = zoijcleaow.InterfaceC2770zoijcleaow.eablkybsjg.f112457iobyxmoadg;
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(c2769ppxfxbqfkf);
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
            return new zoijcleaow.InterfaceC2770zoijcleaow.C2771ppxfxbqfkf(((GetNextReviewException) thDxjokdxxww).getMessage());
        }
        if (thDxjokdxxww instanceof SaveReviewException) {
            return new zoijcleaow.InterfaceC2770zoijcleaow.wkgbmnqykc(((SaveReviewException) thDxjokdxxww).getMessage());
        }
        if (!(thDxjokdxxww instanceof DomainException)) {
            return zoijcleaow.InterfaceC2770zoijcleaow.eablkybsjg.f112457iobyxmoadg;
        }
        String message = thDxjokdxxww.getMessage();
        if (message != null && !mj.kcexrzcfyt.zfvoamnweg(message)) {
            z13 = false;
        }
        if (z13) {
            message = null;
        }
        return message != null ? new zoijcleaow.InterfaceC2770zoijcleaow.iobyxmoadg(message) : zoijcleaow.InterfaceC2770zoijcleaow.eablkybsjg.f112457iobyxmoadg;
    }
}
