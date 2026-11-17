package k32;

import ft.ppxfxbqfkf;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.scango.impl.component.domain.model.cart.ScanGoCartModel;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoProductModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final h22.iobyxmoadg f53758zoijcleaow;

    /* JADX INFO: renamed from: k32.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1147iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f53759iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f53760zoijcleaow;

        public C1147iobyxmoadg(String barcode, String markCode) {
            zdlpuopuiu.btonecajqb(barcode, "barcode");
            zdlpuopuiu.btonecajqb(markCode, "markCode");
            this.f53759iobyxmoadg = barcode;
            this.f53760zoijcleaow = markCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1147iobyxmoadg)) {
                return false;
            }
            C1147iobyxmoadg c1147iobyxmoadg = (C1147iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f53759iobyxmoadg, c1147iobyxmoadg.f53759iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f53760zoijcleaow, c1147iobyxmoadg.f53760zoijcleaow);
        }

        public int hashCode() {
            return (this.f53759iobyxmoadg.hashCode() * 31) + this.f53760zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f53759iobyxmoadg;
        }

        public String toString() {
            return "Params(barcode=" + this.f53759iobyxmoadg + ", markCode=" + this.f53760zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f53760zoijcleaow;
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f53761iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f53763yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53764zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53763yggfygwlhe = obj;
            this.f53761iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(h22.iobyxmoadg scanGoRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f53758zoijcleaow = scanGoRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C1147iobyxmoadg c1147iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f53761iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f53761iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f53763yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f53761iwizpuwonk;
        boolean z13 = false;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            if (c1147iobyxmoadg.iobyxmoadg().length() == 0 || c1147iobyxmoadg.zoijcleaow().length() == 0) {
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
            }
            h22.iobyxmoadg iobyxmoadgVar = this.f53758zoijcleaow;
            zoijcleaowVar.f53764zdlpuopuiu = c1147iobyxmoadg;
            zoijcleaowVar.f53761iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1147iobyxmoadg = (C1147iobyxmoadg) zoijcleaowVar.f53764zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List<ScanGoProductModel> products = ((ScanGoCartModel) objIobyxmoadg).getProducts();
        if (products == null || !products.isEmpty()) {
            for (ScanGoProductModel scanGoProductModel : products) {
                if (zdlpuopuiu.eablkybsjg(scanGoProductModel.getArticle(), c1147iobyxmoadg.iobyxmoadg()) && scanGoProductModel.getMarkCodes().contains(c1147iobyxmoadg.zoijcleaow())) {
                    z13 = true;
                    break;
                }
            }
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }
}
