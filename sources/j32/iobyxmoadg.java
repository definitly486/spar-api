package j32;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ArrayList f50641iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: j32.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC1088iobyxmoadg {
        static /* synthetic */ void iobyxmoadg(InterfaceC1088iobyxmoadg interfaceC1088iobyxmoadg, String str, g22.iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processByBarcodeCart");
            }
            if ((i13 & 4) != 0) {
                z13 = false;
            }
            interfaceC1088iobyxmoadg.dxjokdxxww(str, iobyxmoadgVar, z13);
        }

        void dxjokdxxww(String str, g22.iobyxmoadg iobyxmoadgVar, boolean z13);
    }

    public final void iobyxmoadg(String barcode, g22.iobyxmoadg model, boolean z13) {
        zdlpuopuiu.btonecajqb(barcode, "barcode");
        zdlpuopuiu.btonecajqb(model, "model");
        Iterator it = this.f50641iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((InterfaceC1088iobyxmoadg) it.next()).dxjokdxxww(barcode, model, z13);
        }
    }

    public final boolean ppxfxbqfkf(InterfaceC1088iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        return this.f50641iobyxmoadg.remove(listener);
    }

    public final boolean zoijcleaow(InterfaceC1088iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        return this.f50641iobyxmoadg.add(listener);
    }
}
