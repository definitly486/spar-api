package h30;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.shop.Shop;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends ft.ppxfxbqfkf {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f39295iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f39296zoijcleaow;

        public iobyxmoadg(List shops, List selectedServices) {
            zdlpuopuiu.btonecajqb(shops, "shops");
            zdlpuopuiu.btonecajqb(selectedServices, "selectedServices");
            this.f39295iobyxmoadg = shops;
            this.f39296zoijcleaow = selectedServices;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f39295iobyxmoadg, iobyxmoadgVar.f39295iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39296zoijcleaow, iobyxmoadgVar.f39296zoijcleaow);
        }

        public int hashCode() {
            return (this.f39295iobyxmoadg.hashCode() * 31) + this.f39296zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f39296zoijcleaow;
        }

        public String toString() {
            return "Params(shops=" + this.f39295iobyxmoadg + ", selectedServices=" + this.f39296zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f39295iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
    }

    private final List eablkybsjg(List list, List list2) {
        return wkgbmnqykc(list2, list);
    }

    private final List wkgbmnqykc(List list, List list2) {
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((Shop) obj).getServices().containsAll(list)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return eablkybsjg(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
    }
}
