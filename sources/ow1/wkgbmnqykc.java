package ow1;

import ru.myspar.proloyalty.core.error_handler.exceptions.RequireAuthException;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final vm0.zoijcleaow f74974ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74975zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74976iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final xm0.zoijcleaow.C3095zoijcleaow f74977ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f74978zoijcleaow;

        public iobyxmoadg(String str, boolean z13, xm0.zoijcleaow.C3095zoijcleaow c3095zoijcleaow) {
            this.f74976iobyxmoadg = str;
            this.f74978zoijcleaow = z13;
            this.f74977ppxfxbqfkf = c3095zoijcleaow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f74976iobyxmoadg, iobyxmoadgVar.f74976iobyxmoadg) && this.f74978zoijcleaow == iobyxmoadgVar.f74978zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f74977ppxfxbqfkf, iobyxmoadgVar.f74977ppxfxbqfkf);
        }

        public int hashCode() {
            String str = this.f74976iobyxmoadg;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f74978zoijcleaow)) * 31;
            xm0.zoijcleaow.C3095zoijcleaow c3095zoijcleaow = this.f74977ppxfxbqfkf;
            return iHashCode + (c3095zoijcleaow != null ? c3095zoijcleaow.hashCode() : 0);
        }

        public final xm0.zoijcleaow.C3095zoijcleaow iobyxmoadg() {
            return this.f74977ppxfxbqfkf;
        }

        public final boolean ppxfxbqfkf() {
            return this.f74978zoijcleaow;
        }

        public String toString() {
            return "Params(id=" + this.f74976iobyxmoadg + ", isFavorite=" + this.f74978zoijcleaow + ", analyticParams=" + this.f74977ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f74976iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f74979cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f74981jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f74982yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f74983zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74981jyumaefscl = obj;
            this.f74979cqumvgiudr |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(iw1.iobyxmoadg userRepository, vm0.zoijcleaow analyticsTracker, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74975zoijcleaow = userRepository;
        this.f74974ppxfxbqfkf = analyticsTracker;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) throws RequireAuthException {
        zoijcleaow zoijcleaowVar;
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f74979cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f74979cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f74981jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f74979cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            iw1.iobyxmoadg iobyxmoadgVar2 = this.f74975zoijcleaow;
            if (!iobyxmoadgVar2.rgvfuqvkyq()) {
                throw new RequireAuthException();
            }
            String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (strZoijcleaow == null) {
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            boolean zPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
            zoijcleaowVar.f74983zdlpuopuiu = this;
            zoijcleaowVar.f74982yggfygwlhe = iobyxmoadgVar;
            zoijcleaowVar.f74979cqumvgiudr = 1;
            if (iobyxmoadgVar2.istkbnxepw(strZoijcleaow, zPpxfxbqfkf, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykcVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f74982yggfygwlhe;
            wkgbmnqykcVar = (wkgbmnqykc) zoijcleaowVar.f74983zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        if (iobyxmoadgVar.iobyxmoadg() != null) {
            wkgbmnqykcVar.f74974ppxfxbqfkf.wkgbmnqykc(!iobyxmoadgVar.ppxfxbqfkf() ? new xm0.zoijcleaow.iobyxmoadg(iobyxmoadgVar.iobyxmoadg()) : new xm0.zoijcleaow.ppxfxbqfkf(iobyxmoadgVar.iobyxmoadg()));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
