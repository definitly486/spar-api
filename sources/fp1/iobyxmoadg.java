package fp1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ArrayList f34506iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: fp1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC0763iobyxmoadg {
        static /* synthetic */ void btonecajqb(InterfaceC0763iobyxmoadg interfaceC0763iobyxmoadg, String str, co1.iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processByBarcodeCart");
            }
            if ((i13 & 4) != 0) {
                z13 = false;
            }
            interfaceC0763iobyxmoadg.nufgyqmvbu(str, iobyxmoadgVar, z13);
        }

        void nufgyqmvbu(String str, co1.iobyxmoadg iobyxmoadgVar, boolean z13);
    }

    public final void iobyxmoadg(String barcode, co1.iobyxmoadg model, boolean z13) {
        zdlpuopuiu.btonecajqb(barcode, "barcode");
        zdlpuopuiu.btonecajqb(model, "model");
        Iterator it = this.f34506iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((InterfaceC0763iobyxmoadg) it.next()).nufgyqmvbu(barcode, model, z13);
        }
    }

    public final boolean ppxfxbqfkf(InterfaceC0763iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        return this.f34506iobyxmoadg.remove(listener);
    }

    public final boolean zoijcleaow(InterfaceC0763iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        return this.f34506iobyxmoadg.add(listener);
    }
}
