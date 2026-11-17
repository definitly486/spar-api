package sm1;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rm1.iobyxmoadg f107707zoijcleaow;

    /* JADX INFO: renamed from: sm1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2646iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f107708iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f107709ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f107710zoijcleaow;

        public C2646iobyxmoadg(String article, int i13, String str) {
            zdlpuopuiu.btonecajqb(article, "article");
            this.f107708iobyxmoadg = article;
            this.f107710zoijcleaow = i13;
            this.f107709ppxfxbqfkf = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2646iobyxmoadg)) {
                return false;
            }
            C2646iobyxmoadg c2646iobyxmoadg = (C2646iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f107708iobyxmoadg, c2646iobyxmoadg.f107708iobyxmoadg) && this.f107710zoijcleaow == c2646iobyxmoadg.f107710zoijcleaow && zdlpuopuiu.eablkybsjg(this.f107709ppxfxbqfkf, c2646iobyxmoadg.f107709ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f107708iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f107710zoijcleaow)) * 31;
            String str = this.f107709ppxfxbqfkf;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f107708iobyxmoadg;
        }

        public final int ppxfxbqfkf() {
            return this.f107710zoijcleaow;
        }

        public String toString() {
            return "Params(article=" + this.f107708iobyxmoadg + ", rating=" + this.f107710zoijcleaow + ", comment=" + this.f107709ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f107709ppxfxbqfkf;
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f107711jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f107713zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107713zdlpuopuiu = obj;
            this.f107711jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(rm1.iobyxmoadg reviewRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(reviewRemoteSource, "reviewRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f107707zoijcleaow = reviewRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C2646iobyxmoadg c2646iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f107711jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f107711jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f107713zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f107711jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            rm1.iobyxmoadg iobyxmoadgVar = this.f107707zoijcleaow;
            String strIobyxmoadg = c2646iobyxmoadg.iobyxmoadg();
            int iPpxfxbqfkf = c2646iobyxmoadg.ppxfxbqfkf();
            String strZoijcleaow = c2646iobyxmoadg.zoijcleaow();
            zoijcleaowVar.f107711jyumaefscl = 1;
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
