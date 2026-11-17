package b12;

import ft.ppxfxbqfkf;
import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a12.iobyxmoadg f14955zoijcleaow;

    /* JADX INFO: renamed from: b12.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0249iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14956iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f14957ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f14958zoijcleaow;

        public C0249iobyxmoadg(String article, int i13, String str) {
            zdlpuopuiu.btonecajqb(article, "article");
            this.f14956iobyxmoadg = article;
            this.f14958zoijcleaow = i13;
            this.f14957ppxfxbqfkf = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0249iobyxmoadg)) {
                return false;
            }
            C0249iobyxmoadg c0249iobyxmoadg = (C0249iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f14956iobyxmoadg, c0249iobyxmoadg.f14956iobyxmoadg) && this.f14958zoijcleaow == c0249iobyxmoadg.f14958zoijcleaow && zdlpuopuiu.eablkybsjg(this.f14957ppxfxbqfkf, c0249iobyxmoadg.f14957ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f14956iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f14958zoijcleaow)) * 31;
            String str = this.f14957ppxfxbqfkf;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f14956iobyxmoadg;
        }

        public final int ppxfxbqfkf() {
            return this.f14958zoijcleaow;
        }

        public String toString() {
            return "Params(article=" + this.f14956iobyxmoadg + ", rating=" + this.f14958zoijcleaow + ", comment=" + this.f14957ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f14957ppxfxbqfkf;
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f14959jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f14961zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f14961zdlpuopuiu = obj;
            this.f14959jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(a12.iobyxmoadg reviewRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(reviewRemoteSource, "reviewRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f14955zoijcleaow = reviewRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0249iobyxmoadg c0249iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f14959jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f14959jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f14961zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f14959jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            a12.iobyxmoadg iobyxmoadgVar = this.f14955zoijcleaow;
            String strIobyxmoadg = c0249iobyxmoadg.iobyxmoadg();
            int iPpxfxbqfkf = c0249iobyxmoadg.ppxfxbqfkf();
            String strZoijcleaow = c0249iobyxmoadg.zoijcleaow();
            zoijcleaowVar.f14959jyumaefscl = 1;
            if (iobyxmoadgVar.iobyxmoadg(strIobyxmoadg, iPpxfxbqfkf, strZoijcleaow, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
