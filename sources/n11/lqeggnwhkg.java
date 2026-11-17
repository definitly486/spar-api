package n11;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.shop.Shop;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends zr0.ppxfxbqfkf {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f68422iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f68423zoijcleaow;

        public iobyxmoadg(List shops, List selectedServices) {
            zdlpuopuiu.btonecajqb(shops, "shops");
            zdlpuopuiu.btonecajqb(selectedServices, "selectedServices");
            this.f68422iobyxmoadg = shops;
            this.f68423zoijcleaow = selectedServices;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f68422iobyxmoadg, iobyxmoadgVar.f68422iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f68423zoijcleaow, iobyxmoadgVar.f68423zoijcleaow);
        }

        public int hashCode() {
            return (this.f68422iobyxmoadg.hashCode() * 31) + this.f68423zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f68423zoijcleaow;
        }

        public String toString() {
            return "Params(shops=" + this.f68422iobyxmoadg + ", selectedServices=" + this.f68423zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f68422iobyxmoadg;
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
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return eablkybsjg(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
    }
}
