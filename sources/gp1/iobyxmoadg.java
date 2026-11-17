package gp1;

import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.scango.impl.component.domain.model.cart.ScanGoCartModel;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoProductModel;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final do1.iobyxmoadg f38175zoijcleaow;

    /* JADX INFO: renamed from: gp1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0869iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f38176iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f38177zoijcleaow;

        public C0869iobyxmoadg(String barcode, String markCode) {
            zdlpuopuiu.btonecajqb(barcode, "barcode");
            zdlpuopuiu.btonecajqb(markCode, "markCode");
            this.f38176iobyxmoadg = barcode;
            this.f38177zoijcleaow = markCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0869iobyxmoadg)) {
                return false;
            }
            C0869iobyxmoadg c0869iobyxmoadg = (C0869iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f38176iobyxmoadg, c0869iobyxmoadg.f38176iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f38177zoijcleaow, c0869iobyxmoadg.f38177zoijcleaow);
        }

        public int hashCode() {
            return (this.f38176iobyxmoadg.hashCode() * 31) + this.f38177zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f38176iobyxmoadg;
        }

        public String toString() {
            return "Params(barcode=" + this.f38176iobyxmoadg + ", markCode=" + this.f38177zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f38177zoijcleaow;
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f38178iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f38180yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f38181zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f38180yggfygwlhe = obj;
            this.f38178iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(do1.iobyxmoadg scanGoRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f38175zoijcleaow = scanGoRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0869iobyxmoadg c0869iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f38178iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f38178iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f38180yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f38178iwizpuwonk;
        boolean z13 = false;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            if (c0869iobyxmoadg.iobyxmoadg().length() == 0 || c0869iobyxmoadg.zoijcleaow().length() == 0) {
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
            }
            do1.iobyxmoadg iobyxmoadgVar = this.f38175zoijcleaow;
            zoijcleaowVar.f38181zdlpuopuiu = c0869iobyxmoadg;
            zoijcleaowVar.f38178iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0869iobyxmoadg = (C0869iobyxmoadg) zoijcleaowVar.f38181zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List<ScanGoProductModel> products = ((ScanGoCartModel) objIobyxmoadg).getProducts();
        if (products == null || !products.isEmpty()) {
            for (ScanGoProductModel scanGoProductModel : products) {
                if (zdlpuopuiu.eablkybsjg(scanGoProductModel.getArticle(), c0869iobyxmoadg.iobyxmoadg()) && scanGoProductModel.getMarkCodes().contains(c0869iobyxmoadg.zoijcleaow())) {
                    z13 = true;
                    break;
                }
            }
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }
}
